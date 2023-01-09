import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name="taller")
class Taller(
    @Id
    @Column(name="CIF")
    var cif: String,
    @Column(name="Nombre")
    var nombre: String,
    @Column(name="Direccion")
    var dir: String) {
}