import javax.persistence.*;

@Entity
@Table(name = "Ofisas")
public class Ofisas {
    @Id
    @Column(name = "ofiso_id", nullable = true)
    private Long ofiso_id;
    @Column(name = "pavadinimas", nullable = false)
    String pavadinimas;

    public Long getOfiso_id() {
        return ofiso_id;
    }

    public void setOfiso_id(Long ofiso_id) {
        this.ofiso_id = ofiso_id;
    }

    public String test(String test) {
        return test;
    }
}
