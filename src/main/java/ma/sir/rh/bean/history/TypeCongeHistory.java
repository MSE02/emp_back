package ma.sir.rh.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "type_conge")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="type_conge_seq",sequenceName="type_conge_seq",allocationSize=1, initialValue = 1)
public class TypeCongeHistory extends HistBusinessObject  {


    public TypeCongeHistory() {
    super();
    }

    public TypeCongeHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="type_conge_seq")
    public Long getId() {
    return id;
    }
}

