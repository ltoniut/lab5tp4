mvn clean: Limpia los archivos de maven compilados para prepararlos para una futura instalación
mvn install: Instala las dependencias de maven para referenciarlas y usarlas en el proyecto
mvn package: Toma el código compilado y lo transforma en un paquete distribuible, como un formato JAR
mvn compile: Compila el código de un proyecto


Scopes:

compile: Scope que se usa por default
provided: Usado para instancias específicas de una compilación. Por ejemplo, si las versiones mobiles o de escritorio de una aplicación
requiriesen dependencias diferentes
runtime: La dependencia no se necesita para la compilación pero sí para la ejecución
test: La dependencia no es utilizada para usos normales de una aplicación pero sí para la ejecución de pruebas
system: Similar a provided, pero se debe proveer la librería que contiene la depencencia de forma explícita en formato JAR
import: Indica que las dependencias son reemplazadas por una lista efectiva de dependencia en una sección específica del POM

Un arquetipo es una herramienta que puede ser usada para crear un entorno de desarrollo de Maven que incorpora determinadas practicas para una aplicación

Un proyecto Maven tiene por lo menos un punto de entrada main, una carpeta de recursos y una de testing. Tiene una librería de sistema y
otra de dependencias a ser usadas. Posee un archivo POM.xml de configuración y un archivo mvnw.cmd para la ejecución de comandos.

El arquetipo es un artefacto sencillo que contiene un prototipo del proyecto a crear. El artefacto es el resultado de la ejecución de un build

@Repository se asigna a cualquier clase que cumpla un rol de repositorio. Se asignan típicamente a clases dedicadas al acceso a datos o DAO
@Service se implementa en clases dedicadas a la lógica de negocios de una aplicación
@Controller se usa en clases que cumplen la función de capa intermedia entre el frontend y el backend, llamando funciones y dando respuestas.
@Entity se usa en clases con función de modelo o entidad. Lo que normalmente se asociaría con el término "objeto".

Verbos REST:
POST: Guardar información a partir de un input
GET: Devolver información pedida
PUT: Modificar datos existentes en una base de datos/otro instrumento de persistencia
DELETE: Eliminar datos de la base