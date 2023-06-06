package ma.sir.rh.service.impl.admin;

import ma.sir.rh.bean.core.Absence;
import ma.sir.rh.bean.core.Conge;
import ma.sir.rh.bean.core.PayementSalaire;
import ma.sir.rh.bean.history.PayementSalaireHistory;
import ma.sir.rh.dao.criteria.core.PayementSalaireCriteria;
import ma.sir.rh.dao.criteria.history.PayementSalaireHistoryCriteria;
import ma.sir.rh.dao.facade.core.PayementSalaireDao;
import ma.sir.rh.dao.facade.history.PayementSalaireHistoryDao;
import ma.sir.rh.dao.specification.core.PayementSalaireSpecification;
import ma.sir.rh.service.facade.admin.PayementSalaireAdminService;
import ma.sir.rh.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.YearMonth;
import java.util.List;


@Service
public class PayementSalaireAdminServiceImpl extends AbstractServiceImpl<PayementSalaire, PayementSalaireHistory, PayementSalaireCriteria, PayementSalaireHistoryCriteria, PayementSalaireDao,
        PayementSalaireHistoryDao> implements PayementSalaireAdminService {


    public PayementSalaire findByReferenceEntity(PayementSalaire t) {
        return dao.findByCode(t.getCode());
    }

    public List<PayementSalaire> findByEmployeeId(Long id) {
        return dao.findByEmployeeId(id);
    }

    public int deleteByEmployeeId(Long id) {
        return dao.deleteByEmployeeId(id);
    }

    public void updateWithAssociatedLists(PayementSalaire t) {
        if (t.getNombreJoursAbsence() != 0) {
            BigDecimal x = t.getBaisseSalaire();
            BigDecimal y = t.getSalaire();
            BigDecimal z = x.multiply(y);
            BigDecimal w = z.multiply(new BigDecimal(t.getNombreJoursAbsence()));

        }
        if (t.getNombreJoursConge() != 0) {
            BigDecimal x = t.getBaisseSalaire();
            BigDecimal y = t.getSalaire();
            BigDecimal z = x.multiply(y);
            BigDecimal w = z.multiply(new BigDecimal(t.getNombreJoursConge()));
        }

    }


    public void configure() {
        super.configure(PayementSalaire.class, PayementSalaireHistory.class, PayementSalaireHistoryCriteria.class, PayementSalaireSpecification.class);
    }


    public PayementSalaireAdminServiceImpl(PayementSalaireDao dao, PayementSalaireHistoryDao historyDao) {
        super(dao, historyDao);
    }


    public static int nombreJoursAbsenceEnMois(List<Absence> absences, int mois, int annee) {
        int joursAbsence = 0;

        if (absences == null) return 0;

        for (Absence absence : absences) {
            LocalDateTime dateDebut = absence.getDateDebut();
            LocalDateTime dateFin = absence.getDateFinA();

            int moisDebut = dateDebut.getMonthValue();
            int moisFin = dateFin.getMonthValue();

            if (moisDebut == mois && dateDebut.getYear() == annee) {
                joursAbsence += dateDebut.toLocalDate().lengthOfMonth() - dateDebut.getDayOfMonth() + 1;
            } else if (moisFin == mois && dateFin.getYear() == annee) {
                joursAbsence += dateFin.getDayOfMonth();
            } else if (moisDebut < mois && mois < moisFin && dateDebut.getYear() == annee) {
                YearMonth yearMonth = YearMonth.of(annee, mois);
                joursAbsence += yearMonth.lengthOfMonth();
            }


            if (mois == 2 && Year.isLeap(annee)) {
                joursAbsence = Math.min(joursAbsence, 29); // Limite le nombre de jours à 29 pour le mois de février bissextile
            }
        }

        return joursAbsence;
    }


    public static int nombreJoursConge(List<Conge> conges, int mois, int annee) {
        if (conges == null || conges.isEmpty()) {
            return 0;
        }

        int joursConge = 0;
        for (Conge conge : conges) {
            LocalDateTime dateDebutConge = conge.getDateDebut();
            LocalDateTime dateFinConge = conge.getDateFin();

            int moisDebut = dateDebutConge.getMonthValue();
            int moisFin = dateFinConge.getMonthValue();

            if (moisDebut == mois && dateDebutConge.getYear() == annee) {
                joursConge += dateDebutConge.toLocalDate().lengthOfMonth() - dateDebutConge.getDayOfMonth() + 1;
            } else if (moisFin == mois && dateFinConge.getYear() == annee) {
                joursConge += dateFinConge.getDayOfMonth();
            } else if (moisDebut < mois && mois < moisFin && dateDebutConge.getYear() == annee) {
                YearMonth yearMonth = YearMonth.of(annee, mois);
                joursConge += yearMonth.lengthOfMonth();
            }

            if (mois == 2 && Year.isLeap(annee)) {
                joursConge = Math.min(joursConge, 29); // Limite le nombre de jours à 29 pour le mois de février bissextile
            }
        }

        return joursConge;
    }



}