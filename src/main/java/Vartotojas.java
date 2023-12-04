import javax.persistence.*;

@Entity
@Table(name = "Vartotojas")
public class Vartotojas {
    @Id
    @Column(name = "vartotojo_id", nullable = false)
    private Long vartotojo_id;

    @Column(name = "vardas", nullable = false)
    String vardas;
    @Column(name = "pavarde", nullable = false)
    String pavarde;
    @Column(name = "slaptazodis", nullable = false)
    String slaptazodis;
    @Column(name = "el_pastas", nullable = false)
    String el_pastas;
    @JoinColumn(foreignKey = @ForeignKey(name = "ofiso_id"))
    @OneToOne(fetch = FetchType.LAZY)
    Ofisas ofiso_id;
    @Column(name = "aktyvumas", nullable = false)
    boolean aktyvumas;
    @Column(name = "roles_id", nullable = false)
    Long roles_id;

    public Long getVartotojo_id() {
        return vartotojo_id;
    }

    public void setVartotojo_id(Long vartotojoId) {
        this.vartotojo_id = vartotojoId;
    }
}
