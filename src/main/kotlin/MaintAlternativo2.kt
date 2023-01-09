import jakarta.persistence.EntityManager
import jakarta.persistence.EntityManagerFactory
import jakarta.persistence.Persistence

fun main(){
    val emf: EntityManagerFactory = Persistence.createEntityManagerFactory("PersistenciaAlumno")
    val manager: EntityManager = emf.createEntityManager()
    var julio: Alumno = Alumno("ioahdui","adsada",53,"adaffa")
    manager.transaction.begin()
    manager.persist(julio) 
    julio.nombre = "Julia"
    manager.transaction.commit()
}

fun insertAlumno(alumno: Alumno) {
    val emf: EntityManagerFactory = Persistence.createEntityManagerFactory("PersistenciaAlumno")
    val manager: EntityManager = emf.createEntityManager()

    try {
        manager.transaction.begin()
        manager.persist(alumno)
        manager.transaction.commit()
    } catch (e: Exception) {
        manager.transaction.rollback()
        println("Se ha producido un error, rollback aplicado")

    } finally {
        manager.close()
    }
}