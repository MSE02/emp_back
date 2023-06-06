package ma.sir.rh.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "type_contrat")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="type_contrat_seq",sequenceName="type_contrat_seq",allocationSize=1, initialValue = 1)
public class TypeContratHistory extends HistBusinessObject  {


    public TypeContratHistory() {
    super();
    }

    public TypeContratHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="type_contrat_seq")
    public Long getId() {
    return id;
    }
}

