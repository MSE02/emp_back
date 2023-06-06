package ma.sir.rh.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "contrat")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="contrat_seq",sequenceName="contrat_seq",allocationSize=1, initialValue = 1)
public class ContratHistory extends HistBusinessObject  {


    public ContratHistory() {
    super();
    }

    public ContratHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="contrat_seq")
    public Long getId() {
    return id;
    }
}

