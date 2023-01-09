import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name="pedido")
class Pedido(
    @Id
    @Column(name="id")
    var id: String,
    @Column(name="descripcion")
    var descr: String) {
}