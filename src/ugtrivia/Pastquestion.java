package ugtrivia;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "PASTQUESTION")
@NamedQueries({
    @NamedQuery(name = "Pastquestion.findAll", query = "SELECT p FROM Pastquestion p"),
    @NamedQuery(name = "Pastquestion.findByIdnumber", query = "SELECT p FROM Pastquestion p WHERE p.idnumber = :idnumber"),
    @NamedQuery(name = "Pastquestion.findByCoursecode", query = "SELECT p FROM Pastquestion p WHERE p.coursecode = :coursecode"),
    @NamedQuery(name = "Pastquestion.findByCoursename", query = "SELECT p FROM Pastquestion p WHERE p.coursename = :coursename"),
    @NamedQuery(name = "Pastquestion.findByQuestionyear", query = "SELECT p FROM Pastquestion p WHERE p.questionyear = :questionyear"),
    @NamedQuery(name = "Pastquestion.findByQuestionsemester", query = "SELECT p FROM Pastquestion p WHERE p.questionsemester = :questionsemester"),
    @NamedQuery(name = "Pastquestion.findByExamtype", query = "SELECT p FROM Pastquestion p WHERE p.examtype = :examtype")})
public class Pastquestion implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDNUMBER")
    private BigDecimal idnumber;
    @Column(name = "COURSECODE")
    private String coursecode;
    @Column(name = "COURSENAME")
    private String coursename;
    @Column(name = "QUESTIONYEAR")
    private Short questionyear;
    @Column(name = "QUESTIONSEMESTER")
    private Short questionsemester;
    @Column(name = "EXAMTYPE")
    private String examtype;

    public Pastquestion() {
    }

    public Pastquestion(BigDecimal idnumber) {
        this.idnumber = idnumber;
    }

    public BigDecimal getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(BigDecimal idnumber) {
        this.idnumber = idnumber;
    }

    public String getCoursecode() {
        return coursecode;
    }

    public void setCoursecode(String coursecode) {
        this.coursecode = coursecode;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public Short getQuestionyear() {
        return questionyear;
    }

    public void setQuestionyear(Short questionyear) {
        this.questionyear = questionyear;
    }

    public Short getQuestionsemester() {
        return questionsemester;
    }

    public void setQuestionsemester(Short questionsemester) {
        this.questionsemester = questionsemester;
    }

    public String getExamtype() {
        return examtype;
    }

    public void setExamtype(String examtype) {
        this.examtype = examtype;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idnumber != null ? idnumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pastquestion)) {
            return false;
        }
        Pastquestion other = (Pastquestion) object;
        if ((this.idnumber == null && other.idnumber != null) || (this.idnumber != null && !this.idnumber.equals(other.idnumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ugtrivia.Pastquestion[ idnumber=" + idnumber + " ]";
    }
    
}
