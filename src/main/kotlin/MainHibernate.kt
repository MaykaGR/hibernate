/*import jakarta.persistence.EntityManager
import jakarta.persistence.EntityManagerFactory
import jakarta.persistence.Persistence

fun main() {

    //Crear un SessionFactory
    //Inicializar la unidad de persistencia indicada en el persistence.xml
    val emf: EntityManagerFactory = Persistence.createEntityManagerFactory("PersistenciaAlumno")

    //Conectarnos a la BDD --> crear la Session(o conexión)
    //Inicializamos un objeto de tipo Session
    val manager: EntityManager = emf.createEntityManager()

    //En este punto ya estaríamos conectados a la base de datos
    val julia: Alumno = Alumno("3523425U", "Julia", 35, "Mojacar")
    //Julia es un objeto transient en este punto
    //Quiere decir que aún no está ligada o linkeada a la BDD

    //Iniciamos una transacción
    manager.transaction.begin()

    manager.persist(julia) //Con esto se transforma en un objeto persist (persistido), ahora all lo que le hagamos a Julia
    //quedará reflejada en la base de datos

    julia.nombre="Julio"

    manager.transaction.commit()

    var listaAlumnos = manager.createQuery("FROM Alumno").resultList as List<Alumno>
    listaAlumnos.forEach{
        println(it.nombre)
    }

    var alumno: Alumno = manager.find(Alumno::class.java, "12345678Z")
    println(alumno.nombre)
    manager.transaction.begin()
    alumno.nombre = "Menganito"
    manager.transaction.commit()

    //Para desvincular un objeto de la base de datos
    manager.detach(alumno)
    manager.transaction.begin()
    alumno.nombre = "jib"
    alumno.ciudad = "ads"
    manager.transaction.commit()

    //Para volver a enlazar un objeto de la app con un registro de la BDD - .merge()
    alumno = manager.merge(alumno) //Aquí pasa a voler a ser un objeto "managed" o "persisted"
    manager.transaction.begin()
    manager.transaction.commit()

    //Para borrar un registro de la base de datos
    manager.transaction.begin()
    var julio = Alumno("3523425U","Julia",35,"Mojacar")
    julio = manager.merge(julio)
    manager.remove(julio)
    manager.transaction.commit()

    manager.transaction.begin()
    var diego = manager.find(Alumno::class.java,"76716745B")
    manager.remove(diego)
    manager.transaction.commit()


    manager.close()
}*/