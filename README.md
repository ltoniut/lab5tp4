mvn clean: Limpia los archivos de maven compilados para prepararlos para una futura instalaci�n
mvn install: Instala las dependencias de maven para referenciarlas y usarlas en el proyecto
mvn package: Toma el c�digo compilado y lo transforma en un paquete distribuible, como un formato JAR
mvn compile: Compila el c�digo de un proyecto


Scopes:

compile: Scope que se usa por default
provided: Usado para instancias espec�ficas de una compilaci�n. Por ejemplo, si las versiones mobiles o de escritorio de una aplicaci�n
requiriesen dependencias diferentes
runtime: La dependencia no se necesita para la compilaci�n pero s� para la ejecuci�n
test: La dependencia no es utilizada para usos normales de una aplicaci�n pero s� para la ejecuci�n de pruebas
system: Similar a provided, pero se debe proveer la librer�a que contiene la depencencia de forma expl�cita en formato JAR
import: Indica que las dependencias son reemplazadas por una lista efectiva de dependencia en una secci�n espec�fica del POM

Un arquetipo es una herramienta que puede ser usada para crear un entorno de desarrollo de Maven que incorpora determinadas practicas para una aplicaci�n

Un proyecto Maven tiene por lo menos un punto de entrada main, una carpeta de recursos y una de testing. Tiene una librer�a de sistema y
otra de dependencias a ser usadas. Posee un archivo POM.xml de configuraci�n y un archivo mvnw.cmd para la ejecuci�n de comandos.

El arquetipo es un artefacto sencillo que contiene un prototipo del proyecto a crear. El artefacto es el resultado de la ejecuci�n de un build

@Repository se asigna a cualquier clase que cumpla un rol de repositorio. Se asignan t�picamente a clases dedicadas al acceso a datos o DAO
@Service se implementa en clases dedicadas a la l�gica de negocios de una aplicaci�n
@Controller se usa en clases que cumplen la funci�n de capa intermedia entre el frontend y el backend, llamando funciones y dando respuestas.
@Entity se usa en clases con funci�n de modelo o entidad. Lo que normalmente se asociar�a con el t�rmino "objeto".

Verbos REST:
POST: Guardar informaci�n a partir de un input
GET: Devolver informaci�n pedida
PUT: Modificar datos existentes en una base de datos/otro instrumento de persistencia
DELETE: Eliminar datos de la base