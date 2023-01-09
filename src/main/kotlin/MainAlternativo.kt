import jakarta.persistence.EntityManager
import jakarta.persistence.EntityManagerFactory
import jakarta.persistence.Persistence

fun main(){

    val emf: EntityManagerFactory = Persistence.createEntityManagerFactory("PersistenciaAlumno")
    val manager: EntityManager = emf.createEntityManager()
    val client = Cliente("76986543U","kajjs","jbsad")
    manager.transaction.begin()
    manager.persist(client)
    client.dir="jknknsidnaondiosjdi"
    manager.transaction.commit()
}