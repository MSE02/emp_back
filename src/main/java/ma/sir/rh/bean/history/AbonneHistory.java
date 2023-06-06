package ma.sir.rh.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "abonne")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="abonne_seq",sequenceName="abonne_seq",allocationSize=1, initialValue = 1)
public class AbonneHistory extends HistBusinessObject  {


    public AbonneHistory() {
    super();
    }

    public AbonneHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="abonne_seq")
    public Long getId() {
    return id;
    }
}

