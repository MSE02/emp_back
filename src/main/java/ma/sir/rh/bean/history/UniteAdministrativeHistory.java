package ma.sir.rh.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "unite_administrative")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="unite_administrative_seq",sequenceName="unite_administrative_seq",allocationSize=1, initialValue = 1)
public class UniteAdministrativeHistory extends HistBusinessObject  {


    public UniteAdministrativeHistory() {
    super();
    }

    public UniteAdministrativeHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="unite_administrative_seq")
    public Long getId() {
    return id;
    }
}

