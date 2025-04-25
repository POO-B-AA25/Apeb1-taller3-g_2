[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/MfsP3cLC)
# Taller 3 - Creación de programas usando los conceptos iniciales de POO

## Implementación de Diseños Orientados a Objetos (DOO) en el lenguaje de alto nivel Java.

* Leer detenidamente cada problemática propuesta.
* Usar el programa **DIA-UML** _(Open source)_, o **StarUML**, para generar la representación de su solución _(modelado)_, vía diagramas de clases.
* Para cada diagrama/solución _(modelado de su solución)_, genere/agregue 2 archivos _(fuente e imagen: \*.dia \*.mdj y \*.png \*.jpeg, etc)_. No olvide titular a cada clase, con el nombre representativo del análisis/solución. Para el nombrado de cada archivo use el formato: _Problema-NroProbl_NombClase_. Ejemplo **Problema-1_Trabajador**. Todos estos archivos agréguelos en el subDirectorio: **Modelos_UML**
* En el subDirectorio **Solucion_Codigo** cree un único proyecto NetBeans - _Java Aplication_ (o con el IDE de su preferencia) y en él, agregue todas las clases necesarias para la solución de cada problema _(no use paquetes aun)_. Y para facilitar la revisión, utilice para la clase base el formato _Problema-NroProbl_NombClaseBase_, y para la clase de prueba/ejecutor use _Problema-NroProbl_NombClaseEjecutor_ (Ésta última es la clase de prueba que genera/instancia con objetos cada entidad/clase y verifica su funcionalidad). 
* Respete la arquitectura **MVC**, es decir, no implemente entradas/salidas desde/hacia teclado-consola directamente en la clase base. Los datos de entrada y resultados deben ser ingresados/mostrados desde/hacia teclado-consola, en la clase de prueba/ejecutor.
* Para retornar los datos del objeto, usar el método _**toString()**_, vía cadena con formato legible. 
* Recuerde, según el problema, puede existir método establecer que no requieren argumentos, pero si un procesamiento. 

___

## Problema 1

Elaborar una solución que calcule e imprima el costo de un terreno rectangular; se tiene como datos el ancho y el largo en metros; el valor del metro cuadrado. El area del terreno es igual a largo por ancho. El costo del terreno es igual al valor del metro cuadrado por el área del terreno. Luego del análisis se decide usar las siguientes entidades:

* Entidades o Clases
	* Terreno 
	* Ejecutor
* Terreno, tiene los siguientes atributos
	* costo_terreno
	* ancho
	* largo
	* area
	* valorMetroCuadrado
* Ejecutor (clase de prueba)
	* Tiene el método main

> [!Note]
> - Para interactuar en el test/verificación/ejecución (clases base vs ejecutor), use los métodos **set()** generando valores aleatorios para el ingreso de datos, y **get()** _(unificandos/invocados en el **toString()**)_.

## Problema 2

Elaborar una solución que lea una cantidad de horas e imprima su equivalente en minutos, segundos, días.

* Entididades o Clases
	* EquivalenteHora
	* Ejecutor (clase de prueba)
* EquivalenteHora
	* horas
	* minutos
	* segundos
	* dias	
* Ejecutor (clase de prueba) 
	* Tiene el método main

> [!Note]
> - Para interactuar en el test/verificación/ejecución (clases base vs ejecutor), no use _**get()**_ o _**set()**_, en su lugar use sobrecarga de constructores, así como el _**toString()**_.

## Problema 3

Se necesita representar una entidad que permite administrar Instituciones Educativas. Cada institución tiene como características: nombre, tipo de institución, número de alumnos, número de docentes, número de sedes, gastos proyectados por estudiante, presupuesto. El presupuesto es igual a la cantidad de alumnos de la institución por el gato proyectado por estudiante.

> [!Note]
> - Luego del análisis, modele y codifique su solución con las clases necesarias. Interactúe en la prueba, respetando el _MVC_. Use libremente _**set()**_, _**get()**_, _**constructores**_ y/o _**toString()**_.

## Problema 4

Para un sistema, es necesario abstraer las características de dispositivos electrónicos _Equipo celulares_. Cada Equipo Celular tienen como características: sistema operativo, tamaño de pantalla, costo inicial, iva en porcentaje, iva del costo inicial costo final, dirección mac, información IMEI. El costo final del equipo es igual costo inicial más el iva del costo inicial. 

> [!Note]
> - Luego del análisis, modele y codifique su solución con las clases necesarias. Interactúe en la prueba, respetando el _MVC_. Use directamente los constructores y _**toString()**_. 

## Problema 5

* Se requiere representar una entidad que permita crear objetos con características como:  nombre de estudiante, calificación de materia 1, calificación de materia 2, calificación de materia 3 y promedio de calificaciones. Adicional, esta entidad/clase, debe procesar un estado de "Aprobado" si el promedio es mayor o igual a 6.5pts., caso contrario "Reprobado".

> [!Note]
> - Luego del análisis, modele y codifique su solución con las clases necesarias. Interactúe en la prueba, respetando el _MVC_. Use directamente los constructores y _**toString()**_, no olvide usar generación de números aleatorios para el ingreso de datos. 

## Problema 6

* Los profesores de un instituto tienen algunas características: nombre, apellido, sueldo básico, sueldo total y cédula. El sueldo total es igual al sueldo básico más el 20% del sueldo básico.

> [!Note]
> - Luego del análisis, modele y codifique su solución con las clases necesarias. Interactúe en la prueba, respetando el _MVC_. Use directamente los constructores y _**toString()**_. 

## Problema 7

* Un automotor tiene entre sus características, cédula del dueño, marca de vehículo, año de fabricación, valor de vehículo y valor de la matricula. El valor de la matricula es igual al 0.002% del valor de vehículo por el número de años de antigüedad del vehículo.

> [!Note]
> - Luego del análisis, modele y codifique su solución con las clases necesarias. Interactúe en la prueba, respetando el _MVC_. Use directamente los constructores y _**toString()**_. 

## Problema 8

* En una entidad financiera se requiere manejar los cheques. Cada cheque tiene las siguientes propiedades: nombre del cliente, nombre del banco, valor del cheque y comisión que cobra el banco. La comisión del banco es igual al valor del cheque por el 0.003%.

> [!Note]
> - Luego del análisis, modele y codifique su solución con las clases necesarias. Interactúe en la prueba, respetando el _MVC_. Use directamente los constructores y _**toString()**_. No olvide usar generación de datos/números aleatorios para el ingreso de datos.

## Problema 9

Diseñe una clase en UML y posteriormente codifíquela, en la cual se represente un emprendimiento en la ciudad de Loja, considerando que cada emprendimiento posee un nombre comercial, RUC, sector económico (gastronomía, tecnología, moda, etc.), propietario, y ubicación. Además, debe contar con atributos que permitan registrar su fecha de inicio de actividades y capital inicial. La clase debe incluir métodos para actualizar información del emprendimiento, calcular su antigüedad en años y determinar si es un micro, pequeño o mediano negocio en función de su capital.

> [!Note]
> - Como resultado de su análisis, determinar los niveles de acceso para los datos de los objetos involucrados (atributos, constructores y métodos).

## Problema 10

Diseñe una clase en UML denominada CandidatoPresidencial para modelar a los aspirantes a la presidencia de Ecuador en las elecciones de 2025. La clase debe incluir atributos esenciales como nombre, edad, partido político, plan de gobierno y número de propuestas clave. Implemente métodos para modificar y obtener esta información, además de un método que permita validar si el candidato cumple con los requisitos de edad mínima según la legislación electoral. Sobrecargue los constructores para permitir la creación de objetos con diferentes niveles de detalle: por ejemplo, uno que solo reciba el nombre y el partido, y otro que incluya todos los atributos.

> [!Note]
> - No olvide validar el funcionamiento de su solución con la base de prueba, que invoque los constructores sobre cargados y se constate las diferencias entre objetos. 
