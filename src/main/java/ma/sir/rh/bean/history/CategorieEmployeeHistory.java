package ma.sir.rh.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.rh.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "categorie_employee")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="categorie_employee_seq",sequenceName="categorie_employee_seq",allocationSize=1, initialValue = 1)
public class CategorieEmployeeHistory extends HistBusinessObject  {


    public CategorieEmployeeHistory() {
    super();
    }

    public CategorieEmployeeHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="categorie_employee_seq")
    public Long getId() {
    return id;
    }
}

