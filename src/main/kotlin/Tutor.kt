import jakarta.persistence.*

@Entity
@Table(name="tutores")
class Tutor(
    @Id
    @Column(name = "dni_tutor")
    var dni: String,
    @Column(name="nombre")
    var nombre: String,
    @OneToMany(mappedBy = "tutor", cascade = [CascadeType.DETACH])
    var alumnos: Set<Alumno>?=null
) {
}