import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name="cliente")
class Cliente(
    @Id
    @Column(name="dni")
    var dni: String,
    @Column(name="Nombre")
    var nombre: String,
    @Column(name="Direccion")
    var dir: String,
    ) {
}