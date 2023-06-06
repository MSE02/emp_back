package ma.sir.rh.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "conge")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="conge_seq",sequenceName="conge_seq",allocationSize=1, initialValue = 1)
public class CongeHistory extends HistBusinessObject  {


    public CongeHistory() {
    super();
    }

    public CongeHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="conge_seq")
    public Long getId() {
    return id;
    }
}

