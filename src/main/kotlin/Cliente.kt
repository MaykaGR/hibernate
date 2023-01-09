import jakarta.persistence.*

@Entity
@Table(name="cliente")
class Cliente(
    @Id
    @Column(name="dni")
    var dni: String,
    @Column(name="Nombre")
    var nombre: String,
    @Column(name="Ciudad")
    var ciudad: String,
    @Column(name="edad")
    var edad: Int,
    @OneToOne(cascade =[CascadeType.ALL])
    @JoinColumn(name="id_direccion")
    var direccion: Direccion
    ) {
}