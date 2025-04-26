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


---

Okay, responderé las preguntas de la tutoría de MATLAB basándome en la imagen que proporcionaste. Asumiré que cada pregunta se basa en las matrices definidas en pasos anteriores, a menos que se indique lo contrario.
1. De las siguientes matrices de dos maneras diferentes.
(La pregunta está incompleta, pero parece pedir definir las matrices A y b de dos formas en MATLAB)
 * Matriz A:
   A = [ 2  2  3  4  5; 
     -6 -1  2  0  7; 
      1  2 -1  3  4 ]; 

 * Vector b: (Es un vector columna)
   b = [1; 2; 5]; 

 * Manera 1 (Entrada directa): Es la forma como las escribí arriba, usando [], espacios/comas para separar elementos en una fila, y ; para separar filas.
 * Manera 2 (Concatenación de filas/columnas):
   % Para A (concatenando vectores fila)
fila1 = [2 2 3 4 5];
fila2 = [-6 -1 2 0 7];
fila3 = [1 2 -1 3 4];
A_concat_filas = [fila1; fila2; fila3];

% Para b (concatenando elementos)
b_concat = [1; 2; 5]; 

2. Forme C como la matriz aumentada (A|b), es decir, C = (A|b) para las matrices A y b anteriores.
 * Se combinan las columnas de A y b horizontalmente.
 * Comando MATLAB:
   C = [A b]; 

   Esto crea la matriz C de 3x6.
3. Forme D, una matriz aleatoria de 3x4 con elementos entre -2 y 2.
 * Usamos la función rand (que genera números entre 0 y 1) y la escalamos al rango deseado [-2, 2]. El rango tiene una longitud de 2 - (-2) = 4.
 * Comando MATLAB:
   D = -2 + 4 * rand(3, 4); 

4. Forme D, una matriz aleatoria de 4x4 con elementos enteros entre -10 y 10.
 * (Nota: Esta pregunta vuelve a usar 'D'. Asumiré que se sobrescribe la matriz D anterior).
 * Usamos la función randi para generar enteros aleatorios en un rango.
 * Comando MATLAB:
   D = randi([-10, 10], 4, 4); 

5. Forme K, la matriz obtenida a partir de B intercambiando los renglones 1 y 4. No cambie B (primero haga K=B). Después cambie K.
 * (Nota: La matriz 'B' no fue definida en las preguntas anteriores. Asumiré que se refiere a la matriz 'D' creada en la pregunta 4, ya que es 4x4 y permite intercambiar las filas 1 y 4).
 * Comandos MATLAB:
   % Asumiendo B = D de la pregunta 4
B = D; % Suponiendo que D existe de la Q4
K = B;     % Copiar B a K para no modificar B
% Intercambiar filas 1 y 4 de K
K([1 4], :) = K([4 1], :); 

6. Realice la operación por renglones R2 <-> R5 + (-4)R1 sobre la matriz C.
 * Problema: La matriz C (formada en la pregunta 2) es de tamaño 3x6 (3 filas, 6 columnas). No tiene una Fila 5 (R5). Por lo tanto, la operación tal como está escrita (R2 <-> R5 o cualquier cosa con R5) no se puede realizar sobre C.
 * Posible Interpretación (Si fuera un error tipográfico): Si la intención fuera, por ejemplo, reemplazar la Fila 2 con Fila 2 menos 4 veces la Fila 1 (R2 <- R2 - 4*R1), el comando sería:
   % Esto es suponiendo que la operación deseada era R2 = R2 - 4*R1
% C(2, :) = C(2, :) - 4 * C(1, :); 

 * Respuesta directa: La operación no se puede realizar porque C no tiene 5 filas.
7. Dé el comando B([2 4], [1 3]). Use una linea de comentario para describir la sub-matriz de B que se produce.
 * (Nuevamente, asumiendo que B = D de la pregunta 4).
 * El comando extrae una submatriz de B usando las filas 2 y 4, y las columnas 1 y 3.
 * Comando MATLAB y comentario:
   % Asumiendo B = D de la pregunta 4
% B = randi([-10, 10], 4, 4); % Si necesitas crear B primero
SubB = B([2 4], [1 3]) % Extrae elementos de B: filas 2 y 4, columnas 1 y 3. Forma una submatriz 2x2.

8. Forme U, la matriz que consiste sólo en la tercera y cuarta columnas de D.
 * (Asumiré que se refiere a la matriz D de la pregunta 3 (3x4), ya que tiene 4 columnas. También funcionaría con la D de la pregunta 4).
 * Seleccionamos todas las filas (:) y las columnas 3 y 4 ([3 4] o 3:4).
 * Comando MATLAB:
   % Asumiendo D de la pregunta 3
% D = -2 + 4 * rand(3, 4); % Si necesitas crear D primero
U = D(:, 3:4); % U contiene las columnas 3 y 4 de D

9. (Ventana de comandos) Use la flecha hacia arriba para localizar el comando que utilizó para realizar la operación por renglones en 6. Modifique la linea para realizar la operación con renglones R2 <-> R3; 3R1; y despues ejecútela.
 * No puedo ejecutar esto por ti, pero te explico los pasos y el comando resultante.
   * En la Ventana de Comandos de MATLAB, presiona la tecla "Flecha Arriba" repetidamente hasta que encuentres el comando que intentaste usar para la pregunta 6 (incluso si dio error o usaste la versión corregida).
   * Borra esa línea.
   * Escribe los nuevos comandos para las operaciones solicitadas:
     * R2 <-> R3: Intercambiar Fila 2 y Fila 3 de C. Comando: C([2 3], :) = C([3 2], :);
     * 3R1: Multiplicar la Fila 1 de C por 3. Comando: C(1, :) = 3 * C(1, :);
   * Puedes escribir ambos comandos en una línea separados por punto y coma para ejecutarlos secuencialmente:
     C([2 3], :) = C([3 2], :); C(1, :) = 3 * C(1, :); 

   * Presiona Enter para ejecutar. (Recuerda que C debe existir de la Pregunta 2).
10. Forme T, una matriz aleatoria de 8x7 con elementos entre 0 y 1. Dé el comando ... determine el uso de la notación ":" para formar, tan eficientemente como sea posible, la matriz S que consiste en los renglones 3 al 8 de la matriz T.
 * (El texto de la pregunta está un poco cortado, pero la idea principal es clara).
 * Formar T: Matriz 8x7 con números aleatorios entre 0 y 1.
   T = rand(8, 7); 

 * Formar S (Renglones 3 al 8 de T):
   * Necesitamos seleccionar las filas desde la 3 hasta la 8, y todas las columnas.
   * La notación : se usa para indicar "todas" las filas o columnas.
   * La notación inicio:fin (ej. 3:8) crea un vector de índices [3, 4, 5, 6, 7, 8].
   * Comando MATLAB eficiente:
     S = T(3:8, :); 

 * Uso de la notación ":": El comando T(3:8, :) usa el dos puntos : dos veces:
   * 3:8: Define el rango de filas a seleccionar (de la 3 a la 8, inclusive).
   * : (solo): Indica que se deben seleccionar todas las columnas para las filas elegidas.
     Esta es la forma vectorial y eficiente en MATLAB para extraer submatrices.
