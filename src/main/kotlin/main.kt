import jakarta.persistence.EntityManager
import jakarta.persistence.EntityManagerFactory
import jakarta.persistence.Persistence

fun main() {
    val emf: EntityManagerFactory = Persistence.createEntityManagerFactory("PersistenciaAlumno")
    val manager: EntityManager = emf.createEntityManager()
    val alum1 = Alumno("iahdh","ihdaohd",56,"iuhad")
    val setAlum = setOf<Alumno>(alum1)
    val tutor = Tutor("asjda","dadk",setAlum)
    alum1.tutor = tutor
    manager.transaction.begin()

    manager.persist(tutor)
    manager.transaction.commit()
    val tutor2 = manager.find(Tutor::class.java,"asjda")
    manager.transaction.begin()
    manager.remove(tutor2)
    manager.transaction.commit()
}