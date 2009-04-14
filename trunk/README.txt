*********************************************************
* T�cnicas de dise�o (75.10)				*
* Grupo N� 1						*
* TP: �rdenes M�dicas con Reglas y Asignacion de Tareas	*
*********************************************************

INSTALACI�N DE JAVA SDK Y CONFIGURACI�N DE LA VARIABLE DE ENTORNO "PATH"
------------------------------------------------------------------------

1) Instalar Java SDK (http://java.sun.com). Los instaladores tambi�n se encuentran en la carpeta 'jdk' del CD.
2) Bot�n derecho sobre Mi PC y seleccionar "Propiedades". Ir a la pesta�a "Opciones avanzadas" y seleccionar "Variables de entorno". Luego en "Variables del Sistema" buscar la variable PATH y si no existe crearla. Editar la variable y agregar un ";" al final de la cadena, seguido del path de la carpeta bin del SDK, por ej.: c:\archivos de programa\Java\jdk1.6.0_10\bin. Finalmente aceptar todos los cuadros de di�logo.

EJECUCI�N DE LOS TESTS
----------------------

	Desde la unidad de CD
	---------------------
	1) Ingresar a la carpeta 'tecnicas_tp3' dentro del CD.
	2) Ejecutar el archivo test.bat (en windows) o test.sh (en linux).
	3) Ingresar el directorio (con el path completo) donde desee que se guarden los resultados de los tests.
	
	En pantalla se mostrar� el resultado de la ejecuci�n.
	Para acceder a un informe m�s detallado, abra el archivo 'index.html', que se encuentra dentro de la carpeta indicada en el paso 3.
	
	Desde el disco duro
	-------------------
	1) Instalar Apache ANT (http://ant.apache.org). Los instaladores tambi�n se encuentran en la carpeta 'ant' del CD.
	2) Bot�n derecho sobre Mi PC y seleccionar "Propiedades". Ir a la pesta�a "Opciones avanzadas" y seleccionar "Variables de entorno". Luego en "Variables del Sistema" buscar la variable PATH y si no existe crearla. Editar la variable y agregar un ";" al final de la cadena, seguido del path de la carpeta bin de ANT, por ej.: c:\archivos de programa\Java\apache-ant-1.7.1\bin. Finalmente aceptar todos los cuadros de di�logo.
	3) Copiar la carpeta 'tecnicas_tp3' al disco duro.
	4) Ingresar a la carpeta 'tecnicas_tp3'.
	5) Settear la variable de entorno TEST_DIR con el directorio donde desee que se guarden los resultados de los tests:
		i) En Windows: set TEST_DIR="testdir"
		ii) En Linux: export TEST_DIR="testdir"
		Donde "testdir" es el nombre del directorio. Puede ser un path completo, por ej.: "C:\testdir".
	6) Ejecutar: ant tests junitreport

EJECUCI�N DE LA APLICACI�N
--------------------------

	1) Instalar Apache ANT (http://ant.apache.org). Los instaladores tambi�n se encuentran en la carpeta 'ant' del CD.
	2) Bot�n derecho sobre Mi PC y seleccionar "Propiedades". Ir a la pesta�a "Opciones avanzadas" y seleccionar "Variables de entorno". Luego en "Variables del Sistema" buscar la variable PATH y si no existe crearla. Editar la variable y agregar un ";" al final de la cadena, seguido del path de la carpeta bin de ANT, por ej.: c:\archivos de programa\Java\apache-ant-1.7.1\bin. Finalmente aceptar todos los cuadros de di�logo.
	3) Instalar el servidor MySQL (Los instaladores tambi�n se encuentran en la carpeta 'MySQL' del CD)
	4) Configurar user = root
	5) Crear la base de datos 'tecnicas_tp3'
	6) Copiar la carpeta 'tecnicas_tp3' al disco duro.
	7) Ingresar a la carpeta 'tecnicas_tp3'.
	8) Ejecutar: ant Clinica
	