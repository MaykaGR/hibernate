import jakarta.persistence.*

@Entity
@Table(name="direcciones")
class Direccion(
    @Column(name  = "calle")
    var calle: String,
    @Column(name  = "numero")
    var numero: Int,
    @Column(name  = "cp")
    var cp: String,
    @Column(name="ciudad")
    var ciudad: String,
    //@OneToOne(mappedBy = "direccion", fetch =FetchType.LAZY)
    //,
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name  = "id")
    var id: Long? = null){
}