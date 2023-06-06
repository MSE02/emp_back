package ma.sir.rh.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "pointage")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="pointage_seq",sequenceName="pointage_seq",allocationSize=1, initialValue = 1)
public class PointageHistory extends HistBusinessObject  {


    public PointageHistory() {
    super();
    }

    public PointageHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="pointage_seq")
    public Long getId() {
    return id;
    }
}

