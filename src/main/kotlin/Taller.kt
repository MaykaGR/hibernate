import jakarta.persistence.*

@Entity
@Table(name="taller")
class Taller(
    @Id
    @Column(name="CIF")
    var cif: String,
    @Column(name="Nombre")
    var nombre: String,
    @OneToOne(cascade =[CascadeType.ALL])
    @JoinColumn(name="id_direccion")
    var direccion: Direccion) {
}