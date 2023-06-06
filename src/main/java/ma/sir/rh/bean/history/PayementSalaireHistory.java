package ma.sir.rh.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "payement_salaire")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="payement_salaire_seq",sequenceName="payement_salaire_seq",allocationSize=1, initialValue = 1)
public class PayementSalaireHistory extends HistBusinessObject  {


    public PayementSalaireHistory() {
    super();
    }

    public PayementSalaireHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="payement_salaire_seq")
    public Long getId() {
    return id;
    }
}

