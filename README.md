<h1>Apuntes CURSO JAVA</h1>
<h3>Curso de java para principiantes de Todo Code.</h3> 
<a href="https://www.youtube.com/watch?v=qxXcI56NfnE&t=22167s">Ver video en YouTube</a>

<hr>
<br>
<h2 style="color:green;">¿Qué es <code>Java</code>?</h2>

<p>
  <code>Java</code> es un lenguaje de programación <code>fuertemente tipado</code>, lo que significa que cada variable debe tener un <code>tipo de dato</code> asignado. Diseñado para el desarrollo de aplicaciones de gran envergadura y alta <code>escalabilidad</code>, Java se destaca por su <code>capacidad de integración</code> con otras tecnologías y su <code>robustez</code>.
</p>

<p>Algunas de las características que hacen de Java una excelente opción como lenguaje de programación:</p>

<ul>
  <li><code>Orientación a objetos</code>: permite la creación de software <code>modular</code> y <code>reutilizable</code>.</li>
  <li><code>Multiplataforma</code>: los programas escritos en Java pueden ejecutarse en diferentes <code>sistemas operativos</code>.</li>
  <li><code>Manejo automático de memoria</code>: el <code>recolector de basura</code> optimiza el uso de la memoria.</li>
  <li><code>Evolución constante</code>: el lenguaje se actualiza regularmente con nuevas <code>funcionalidades</code>.</li>
  <li><code>Alta demanda en el mercado</code>: es ampliamente utilizado en el desarrollo de <code>aplicaciones empresariales</code> y <code>móviles</code>.</li>
</ul>

<br>

<h2 style="color:green;">Versiones de Java</h2>

<h3 style="color:green;">JSE (Java Standard Edition)</h3>
<p>
  Es la base de la plataforma Java y proporciona el entorno necesario para desarrollar aplicaciones de escritorio y de uso general. Incluye las bibliotecas y APIs básicas de Java, como <code>java.lang</code>, <code>java.util</code>, <code>java.io</code>, entre otras.
</p>
<p><strong>Usos comunes:</strong> Aplicaciones de escritorio, herramientas de desarrollo, aplicaciones científicas y cualquier aplicación que no necesite servicios avanzados o consumo de un servidor.</p>

<h3 style="color:green;">JEE (Java Enterprise Edition)</h3>
<p>
  JEE se construye sobre JSE y está diseñado para desarrollar aplicaciones empresariales a gran escala, especialmente aplicaciones web y servicios del lado del servidor. Añade una serie de APIs y servicios adicionales para el desarrollo de aplicaciones distribuidas.
</p>
<p><strong>Usos comunes:</strong> Aplicaciones web, aplicaciones empresariales, sistemas de comercio electrónico, aplicaciones de banca en línea, sistemas de gestión empresarial y cualquier aplicación que requiera transacciones, seguridad y escalabilidad.</p>

<br>
<h2 style="color:green;">¿Qué es un IDE?</h2>

<p>
Un <strong>IDE</strong> (Integrated Development Environment) es un <strong>entorno de desarrollo integrado</strong>. Es una aplicación informática que proporciona servicios integrales para facilitarle al desarrollador o programador el <strong>desarrollo de software</strong>.
</p>

<p>
Un IDE consta, generalmente, de un <strong>editor de código fuente</strong>, herramientas de <strong>construcción automática</strong> y un <strong>depurador</strong>. Algunos IDEs también incluyen un <strong>compilador</strong>, un <strong>intérprete</strong> o ambos, como es el caso de <code>NetBeans</code>, <code>IntelliJ</code> o <code>Eclipse</code> para <code>Java</code>.
</p>

<br>

<h2 style="color:green;">¿Qué necesitamos para programar en Java?</h2>

<p>
<strong>Un IDE</strong>. En este caso utilizaremos el IDE <code>NetBeans</code> en su versión 17 o superior.
</p>

<h3 style="color:green;">JRE (Java Runtime Environment)</h3>
<p>
El <strong>JRE</strong> es un conjunto de utilidades que permite la <strong>ejecución de programas Java</strong>.
</p>

<h3 style="color:green;">JDK (Java Development Kit)</h3>
<p>
El <strong>JDK</strong> es un software que provee <strong>herramientas de desarrollo</strong> para la creación de programas en Java.
</p>


<br>

<h2 style="color:green;">Sintaxis de <code>JAVA</code></h2>

<p>
<code>Java</code> se destaca por ser un lenguaje <strong>fuertemente tipado</strong>, es decir, que es muy exigente tanto con su <strong>sintaxis</strong> como con sus <strong>tipos de datos</strong>. Entre estas <strong>"exigencias"</strong> se destacan:
</p>

<ul>
  <li><strong>Es Case sensitive</strong>: <em>distingue mayúsculas de minúsculas</em>.</li>
  <li><strong>Cada línea de código debe finalizar con</strong>: <code>;</code> (punto y coma).</li>
  <li><strong>El principio y fin de cada estructura</strong>, así como los bloques de código, se delimitan con <code>{}</code> (llaves).</li>
</ul>

<br>

<h2 style="color:green;">Variables y Constantes</h2>

<p>
Una <strong>variable</strong> es un nombre que se asocia con una porción de la memoria de la computadora, en la que se guarda un valor determinado. Un claro ejemplo del uso de variables es en matemática, donde un valor <code>x</code> puede tener una infinita cantidad de valores asignados, por ejemplo <code>x = 5</code>.
</p>

<p>
Las <strong>constantes</strong> son valores que se mantienen siempre de igual manera y que no dependen de una asignación para obtener el mismo valor. Ejemplos de constantes incluyen el valor de la gravedad de la tierra (<code>9.8</code>), el valor de <strong>Pi</strong> (<code>3.1415...</code>), el valor del <strong>IVA</strong> en algunos países, etc.
</p>

<p>
Tanto <strong>Variables</strong> como <strong>Constantes</strong> utilizan <strong>TIPOS DE DATOS</strong>.
</p>

<br>

<h2 style="color:green;">Tipos de DATOS</h2>

<p>
Los <strong>tipos de datos</strong> definen qué puede ser almacenado dentro de una <strong>variable</strong> y los límites de lo que allí se puede asignar. Algunos de los tipos de datos más usados son:
</p>

<ul>
  <li><strong>Entero <code>int</code></strong>: Ejemplo: <code>0</code>, <code>1</code>, <code>35</code>, <code>120</code>, <code>44</code>, etc.</li>
  <li><strong>Decimales <code>double</code></strong>: Ejemplo: <code>1.5</code>, <code>5.8</code>, <code>35.64</code>, etc.</li>
  <li><strong>Booleanos <code>boolean</code></strong>: <code>true</code> o <code>false</code>.</li>
  <li><strong>Caracteres <code>char</code></strong>: Ejemplo: <code>'a'</code>, <code>'b'</code>, <code>'l'</code>, <code>'d'</code>, <code>'e'</code>, <code>'p'</code>.</li>
  <li><strong>Cadena de Caracteres/Texto <code>String</code></strong>: Ejemplo: <code>"Hola mundo, probando 1,2,3"</code>.</li>
  <li><strong>Entero Largo <code>long</code></strong>: Números entre: <code>(-9.223.372.036.854.775.808</code> y <code>9.223.372.036.854.775.807)</code>.</li>
</ul>

<p>
<code>String</code> NO ES CONSIDERADO un tipo de dato <strong>primitivo</strong>, sino que es una <strong>CLASE</strong>. Hay otros "tipos de datos" con esta situación, pero los veremos más adelante.
</p>

<br>

<h2 style="color:green;">Declaración de VARIABLES</h2>

<p>
La declaración de las <strong>variables</strong> consta de dos partes fundamentales:
</p>

<ul>
  <li><strong>Nombre</strong>: Ejemplo: <code>numero</code>.</li>
  <li><strong>Tipo de dato</strong>: Ejemplo: <code>int</code>.</li>
</ul>

<p>

  
Por lo tanto, una declaración de variable en <strong>Java</strong> se ve de la siguiente manera:
</p>


![Descripción de la imagen](https://github.com/Ulises2024/Curso-JAVA/blob/main/SOURCE/tipo_dato.png)

<br>


<h2 style="color:green;">Reglas para nombres de VARIABLES</h2>

<p>Para elegir los nombres de nuestras <strong>variables</strong> debemos seguir un conjunto de reglas:</p>

<ul>
  <li><strong>No puede comenzar con un número</strong>.</li>
  <li><strong>No puede utilizar caracteres</strong> <code>%</code> o <code>*</code>, ni ninguno que esté reservado para otras operaciones.</li>
  <li><strong>No puede incluir el carácter espacio en blanco</strong>.</li>
  <li><strong>Distingue entre letras mayúsculas y minúsculas</strong>.</li>
  <li><strong>No se pueden utilizar las palabras reservadas como identificadores</strong> (por ejemplo: <code>double</code>, <code>int</code>, <code>for</code>, <code>private</code>, entre otras).</li>
</ul>

<p>Como sugerencia y buena práctica, siempre es mejor que las variables lleven nombres <strong>representativos</strong>. Por ejemplo, si tengo que calcular un promedio, puedo llamar a mi variable <code>promedio</code>.</p>

<br>

<h2 style="color:green;">¿Qué son los operadores?</h2>

<p>
Un <strong>operador</strong> es un símbolo especial que indica al compilador que debe efectuar una determinada operación (acción). Estas operaciones pueden ser de asignación, aritméticas, condicionales, relacionales, entre otras.
</p>

<p>Por ejemplo:</p>

<img src="https://github.com/Ulises2024/Curso-JAVA/blob/main/SOURCE/operadores_java.png" alt="Operadores en Java" width="600">

<br>
<hr>

<h2 style="color:green;">Condicionales</h2>

<p>
Las <strong>estructuras condicionales</strong> permiten que un programa ejecute diferentes acciones según ciertas condiciones. Son mecanismos que permiten que el programa siga distintos caminos según ciertos criterios.
</p>

<p>Entre las estructuras condicionales de Java más utilizadas se encuentran:</p>

<ul>
  <li><strong>if + else</strong></li>
  <li><strong>if + else</strong> anidados (o <strong>else if</strong>)</li>
  <li><strong>switch</strong></li>
  <li><strong>Operadores ternarios</strong></li>
</ul>

<br>

<h2 style="color:green;">Condicional IF (Si)</h2>

<p>
La estructura de control <strong>if</strong> permite decidir entre dos opciones resultantes de la evaluación de una sentencia o expresión lógica. Cuando se procesa una declaración <strong>if</strong>, se evalúa la <strong>expresión de condición</strong> y el resultado es interpretado como un valor <strong>booleano</strong>.
</p>

<p>
Si el resultado es <strong>verdadero</strong>, se ejecutan las sentencias contenidas dentro del <strong>if</strong>. En caso contrario, el programa "saltea" lo que se encuentra dentro de este bloque.
</p>
<img src="https://github.com/Ulises2024/Curso-JAVA/blob/main/SOURCE/if.png" alt="Operadores en Java" width="300">
<br>

<h2 style="color:green;">Condicional IF + ELSE (Si + SINO)</h2>

<p>
El <strong>else</strong> es la extensión de la sentencia <strong>if</strong>. Significa "de lo contrario" o "sino" y permite la ejecución de un bloque de código <strong>solamente</strong> si la condición de la sentencia <strong>if</strong> fue <strong>falsa</strong>.
</p>
<img src="https://github.com/Ulises2024/Curso-JAVA/blob/main/SOURCE/else.png" alt="Operadores en Java" width="300">

<br>

<h2 style="color:green;">Estructura Switch</h2>

<p>
La estructura <strong>switch</strong> permite múltiples caminos a partir de la evaluación de una sola <strong>expresión</strong> o <strong>condición</strong>. La expresión puede ser una variable o cualquier otro tipo, siempre y cuando se evalúe un valor simple.
</p>

<p>
La construcción se ejecuta mediante la evaluación de la condición y un conjunto de sentencias <strong>case</strong>. Cada <strong>case</strong> es una posible respuesta a la evaluación de esa condición. Si el valor que se busca coincide con algún <strong>case</strong>, se ejecuta hasta encontrar una sentencia <strong>break</strong> o hasta el final del <strong>switch</strong> (dependiendo del caso).
</p>

<img src="https://github.com/Ulises2024/Curso-JAVA/blob/main/SOURCE/switch.png" alt="Operadores en Java" width="500">
<br>

<h2 style="color:green;">Operador Ternario</h2>

<p>
El <strong>operador ternario</strong> es una herramienta en Java para tomar decisiones simples en una sola línea de código. Permite tomar decisiones basadas en una <strong>condición</strong> y asignar un valor a una variable o expresión en función de si la condición es <strong>verdadera</strong> o <strong>falsa</strong>.
</p>

<p>
La sintaxis básica es:
</p>

<pre><code>variable = (condición) ? valor_si_verdadero : valor_si_falso;</code></pre>


<br>

<h2 style="color:green;">Estructuras Repetitivas</h2>

<ul>
  <li>Permiten ejecutar una cierta porción de código por una <strong>determinada cantidad de veces</strong>.</li>
  <li>Esta ejecución repetitiva se conoce como <strong>bucle</strong>.</li>
  <li>Existen dos tipos de bucles:</li>
  <ul>
    <li><strong>Controlados por un contador</strong></li>
    <details>
      <summary><h2 style="color:green;">Bucles Controlados por un Contador</h2></summary>
      <ul>
        <li>En ellos existe una <strong>variable</strong> que cuenta la cantidad de "vueltas" (ejecuciones) del <strong>bucle</strong>.</li>
        <li>Cuando se llega a la <strong>cantidad máxima</strong> establecida por la variable, el programa sale del bucle.</li>
        <li><strong>Ejemplo</strong>: realizar 10 ejecuciones.</li>
      </ul>
      <img src="https://github.com/Ulises2024/Curso-JAVA/blob/main/SOURCE/Bucles Controlados por un Contador.png" alt="Operadores en Java" width="300">
    </details>
    <li><strong>Controlados por un centinela</strong></li>
    <details>
      <summary><h2 style="color:green;">Bucles Controlados por un Centinela</h2></summary>
      <ul>
        <li>Existe una <strong>variable</strong> (generalmente <strong>booleana</strong>) que establece un <strong>valor o condición de salida</strong> del bucle.</li>
        <li><strong>Ejemplo</strong>: un bucle se puede ejecutar mientras una variable tenga el valor <code>true</code>. Si esta cambia a <code>false</code>, el bucle se detiene.</li>
        <li>No existe una <strong>cantidad numérica</strong> que limite las ejecuciones del bucle.</li>
      </ul>
      <img src="https://github.com/Ulises2024/Curso-JAVA/blob/main/SOURCE/Bucles Controlados por un Centinela.png" alt="Operadores en Java" width="300">
    </details>
  
  </ul>
</ul>

<br>

<h2 style="color:green;">Bucle <code>do-while</code></h2>

<ul>
  <li>Permite llevar a cabo una determinada acción de forma <strong>repetitiva</strong>, de igual manera que el bucle <code>while</code>.</li>
  <li>La <strong>condición</strong> se evalúa <strong>siempre al final</strong> del ciclo/bucle, por lo que la porción de código se ejecuta por lo menos <strong>una vez</strong>.</li>
</ul>
<img src="https://github.com/Ulises2024/Curso-JAVA/blob/main/SOURCE/bucle do while.png" alt="Operadores en Java" width="300">

<br>

<h2 style="color:green;">Bucle <code>while</code></h2>

<ul>
  <li>Permite ejecutar un bloque de código de forma <strong>repetitiva</strong> "<strong>mientras</strong>" (<code>while</code> en inglés) se cumpla una <strong>condición</strong> determinada.</li>
  <li>La <strong>condición</strong> se evalúa <strong>siempre al inicio</strong> del ciclo/bucle.</li>
  <li>Si la <strong>condición</strong> es válida, ingresa al bucle y ejecuta el código.</li>
  <li>Cuando la condición deja de cumplirse, el programa <strong>sale del bucle</strong> y continúa con el resto del código.</li>
</ul>
<img src="https://github.com/Ulises2024/Curso-JAVA/blob/main/SOURCE/bucle while.png" alt="Operadores en Java" width="300">

<br>

<h2 style="color:green;">Bucle <code>for</code></h2>

<p>El bucle <code>for</code> realiza una acción repetitiva una <strong>cantidad determinada de veces</strong>. Se lo considera principalmente un bucle "controlado por contador" porque posee su propia <strong>variable contador</strong>.</p>

<ul>
  <li>El bucle <code>for</code> está compuesto por tres partes:</li>
  <ul>
    <li><strong>Inicialización</strong> de la variable utilizada en la condición (se ejecuta solo una vez al principio del ciclo).</li>
    <li><strong>Condición de fin del ciclo</strong> (se evalúa al comienzo de cada iteración).</li>
    <li><strong>Modificación de la variable</strong> (se ejecuta al final de cada iteración).</li>
  </ul>
</ul>

<br>

<h2 style="color:green;">Bucles Infinitos</h2>

<ul>
  <li>Un <strong>bucle infinito</strong> se produce cuando el programa entra en un bucle que no tiene una <strong>condición de salida</strong>.</li>
  <li>Esto puede suceder tanto en bucles <strong>controlados por contador</strong> como en los <strong>controlados por centinela</strong>.</li>
  <li>Se llama bucle infinito porque, al no haber una condición de salida, el bucle continúa ejecutándose <strong>sin fin</strong>.</li>
</ul>

<br>

<h2 style="color:green;">Otros Operadores</h2>

<ul>
  <li>Como sabemos, <code>String</code> no es un "tipo de dato" como tal, sino una <strong>clase</strong> que funciona <strong>como si fuese un tipo de dato</strong>.</li>
  <li>Dado esto, <code>String</code> tiene sus propios "operadores", que se usan en forma de <strong>métodos</strong> (funciones).</li>
</ul>
<img src="https://github.com/Ulises2024/Curso-JAVA/blob/main/SOURCE/Otros operadores.png" alt="Operadores en Java" width="800">
<details>
      <summary><h2 style="color:green;">Ejercicios propuestos</h2></summary>
      <ul>
        <li>1. Realizar un programa que muestre en pantalla los números del 1 al 35 (unp abajo del otro). Utilizar para esto alguna estructura repetitiva.</li>
        <li>2. Realizar un programa que dado por teclado un límite numérico (por ejemplo 100) muestre en pantalla todos los números hasta ese límite (empezando por 1).</li>
        <li>3. Realizar un programa que muestre por pantalla los números del 200 al 250 saltando de 2 en dos. La secuencia debería ser: 200...202...204...etc.</li>
        <li>4. Realizar un programa que lleve a cabo la cuenta regresiva para el año nuevo. La cuenta debe comenzar en 10 y terminar en 1.</li>
        <li>5. Realizar un programa que muestre en pantalla palabras que sean ingresadas por teclado hasta que se ingrese la palabra "salir".</li>
      </ul>
</details>

<br>

<h2 style="color:green;">Arreglos (Arrays)</h2>

<p>Los <strong>arreglos</strong> (o <strong>arrays</strong>) son un conjunto de datos que se almacenan en memoria de manera <strong>contigua</strong> bajo un mismo nombre, pero con diferentes <strong>índices</strong> para diferenciar cada elemento. Son estructuras <strong>fijas</strong> que se declaran con un tamaño determinado, el cual se mantiene durante toda la ejecución del programa.</p>

<ul>
  <li>Por ejemplo, si declaras un arreglo de 5 posiciones, mantendrá esas 5 posiciones sin cambios.</li>
  <li>Cada arreglo puede ser de un <strong>tipo de dato</strong> específico y solo puede almacenar valores de ese tipo.</li>
</ul>
<img src="https://github.com/Ulises2024/Curso-JAVA/blob/main/SOURCE/arreglos.png" alt="Operadores en Java" width="600">

<br>

<h2 style="color:green;">Arreglos Unidimensionales (Vectores)</h2>

<p>Los <strong>arreglos unidimensionales</strong>, también conocidos como <strong>vectores</strong>, son estructuras que almacenan datos en una sola <strong>dimensión</strong>. Esto significa que los elementos se organizan en una secuencia lineal o en un "renglón". Cada elemento del vector se accede utilizando un <strong>índice</strong>, comenzando desde 0 hasta el tamaño del arreglo menos 1.</p>

<p>Ejemplo de declaración de un arreglo unidimensional en Java:</p>

<pre><code>int[] numeros = {1, 2, 3, 4, 5};</code></pre>

<ul>
  <li><strong>Característica principal</strong>: Los vectores son ideales para almacenar datos de manera secuencial, donde se requiere acceso rápido y fácil a cada elemento.</li>
  <li><strong>Limitación</strong>: Al ser de tamaño fijo, no pueden modificarse para almacenar más elementos una vez definidos.</li>
</ul>
<img src="https://github.com/Ulises2024/Curso-JAVA/blob/main/SOURCE/ejemplo_arreglo_unidimensional.png" alt="Operadores en Java" width="600">
<h2 style="color:green;">Conceptos Clave en Arrays</h2>
  
  <p>Los conceptos más importantes en cualquier <strong>array</strong> son el <strong>recorrido</strong> y la <strong>carga</strong>:</p>
  
  <ul>
    <li><strong>Recorrido</strong>: Se refiere al proceso de iterar o "recorrer" cada elemento del array, permitiendo acceder, analizar o modificar los valores almacenados.</li>
      <p>Ejemplo de iteración a lo largo del array:</p>
      <pre>
        <code>
          for (int i = 0; i &lt; numeros.length; i++) {
              System.out.println("Estoy en el indice: " + i + " y el valor es: " + numeros[i]);
          }
        </code>
      </pre>
    <li><strong>Carga</strong>: Consiste en almacenar datos en el array, es decir, "cargar" valores en las posiciones del array para su uso posterior en el programa.</li>
  </ul>

<br>

<h2>Arreglos Bidimensionales (Matrices)</h2>
<p>Las <strong>matrices</strong> tienen la característica de tener tanto <strong>filas</strong> como <strong>columnas</strong>.</p>
<img src="https://github.com/Ulises2024/Curso-JAVA/blob/main/SOURCE/arreglos bidimensionales.png" alt="Operadores en Java" width="600">

```java
// Declarar variables
int matriz[][] = new int[2][5];
Scanner teclado = new Scanner(System.in);
// Recorrido y carga de matrices
for (int f = 0; f < matriz.length; f++) { // hacer length a una matriz te devuelve el número de filas
    for (int c = 0; c < matriz[0].length; c++) { // hacer length a una fila te devuelve el número de columnas
        System.out.println("Ingrese el valor para la fila " + f + ", columna " + c + ": ");
        matriz[f][c] = teclado.nextInt();
    }
}
// Recorrido y muestra de matrices
for (int f = 0; f < matriz.length; f++) {
    for (int c = 0; c < matriz[0].length; c++) {
        System.out.println("Fila: " + f + " Columna: " + c + " Valor: " + matriz[f][c]);
    }
}
```

<br>

<h1>Error por desbordamiento</h1>
    <p>Un <strong>error por desbordamiento</strong> ocurre cuando queremos acceder a una posición de nuestro <strong>vector</strong> que no está contemplada para el tamaño que tiene.</p>
    <p>Por ejemplo, si el vector tiene <strong>20 posiciones</strong> y queremos acceder a la <strong>posición 21</strong>, esta no existe.</p>
    <img src="https://github.com/Ulises2024/Curso-JAVA/blob/main/SOURCE/ejemplo de error por desbordamiento.png" alt="Operadores en Java" width="600">

<details>
      <summary><h2 style="color:green;">Ejercicios propuestos</h2></summary>
      <ul>
        <li>1.Llevar a cabo un programa que incluya un vector que almacene los nombres: Alejandra, Leonardo, Rosa, Guillermo, Gabriel, Daniel, Luisa y Ludmila. Realizar un recorrido del vector para cargar los datos y otro recorrido para mostrar los mismos por pantalla.</li>
        <li>2. Realizar un programa que permita la carga de 10 números en un vector. Una vez cargados, se necesita que el programa determine cual es el mayor y cual es el menor de ellos.</li>
        <li>3. Realizar un programa que permita la carga de 15 números en un vector. Una vez cargados, se necesita que el programa cuente e informe por pantalla cuántas veces se cargó el número 3.</li>
        <li>4. Un empleado desea almacenar en un vector sus 12 sueldos del año. A partir de esto, necesita un programa que determine y muestre por pantalla la suma total de sus 12 sueldos y el promedio de sueldo que tuvo en el año.</li>
        <li>5. </li>
      </ul>
</details>
<details>
      <summary><h2 style="color:green;">Ejercicios extra</h2></summary>
      <ul>
        <li>1. En una tabla de 4 filas y 3 columnas se guardan las notas de 4 alumnos de secundario. Cada fila corresponde a las notas de cada alumno.</li>
        <li>2. Se necesita un programa que permita a un profesor cargar en las 3 primeras posiciones de cada fila las notas del alumno y que en un vector diferente se calculen los promedios.</li>
        <li>3. Este vector debe tener la misma cantidad de posiciones que alumnos y coincidir en sus índices.</li>
        <li>4. Una vez realizados los cálculos, se desea mostrar las 3 notas de cada alumno y el promedio correspondiente recorriendo la matriz.</li>
        <img src="https://github.com/Ulises2024/Curso-JAVA/blob/main/SOURCE/tabla ejercicio extra matriz.png" alt="Operadores en Java" width="600">
      </ul>
</details>

<br>

<h2>Modelo de Capas</h2>
    <p>A la hora de programar, existen ciertos <strong>patrones de diseño</strong> o <strong>buenas prácticas</strong> que podemos llevar a cabo para que nuestro código sea más <strong>legible</strong>, funcione mejor y tenga mayor <strong>facilidad de mantenimiento</strong>.</p>
    <p>Entre los patrones de diseño más conocidos para lograr un código eficiente, encontramos al patrón <strong>MVC</strong> (modelo, vista, controlador). No es el único que existe, y dada su complejidad, existen otros que se "aproximan" pero que están más simplificados; es el caso del <strong>Modelo de Capas</strong>.</p>
    <p>El Modelo de Capas cuenta con 3 partes principales:</p>
    <ul>
        <li><strong>IGU</strong> o <strong>Interfaz Gráfica</strong></li>
        <li><strong>Lógica de negocio</strong></li>
        <li><strong>Persistencia</strong> (o controladora de BD)</li>
    </ul>
    <img src="https://github.com/Ulises2024/Curso-JAVA/blob/main/SOURCE/modelo de capas.png" alt="Modelo de capas" width="300">
    <details>
      <summary><h2 style="color:green;">Crear estructura desde cero.</h2></summary>
          <ul>
            <li>1. Nuevo proyecto</li>
            <img src="https://github.com/Ulises2024/Curso-JAVA/blob/main/SOURCE/estructura_base.png" alt="Operadores en Java" width="300">
            <li>2. Refactorizar name de archivo java source package(ejemploigu)</li>
            <p>nombre siempre en minuscula y sin caracteres especiales. En este caso "logica".</p>  
            <img src="https://github.com/Ulises2024/Curso-JAVA/blob/main/SOURCE/refactorizar_name.png" alt="Operadores en Java" width="300">
            <li>3. Crear nueva capa de IGU</li>
            <table border="1">
              <tr>
                <td>
                  <h4>Crear nueva capa para IGU y persistencia</h4>
                  <img src="https://github.com/Ulises2024/Curso-JAVA/blob/main/SOURCE/crear_capa_igu.png" alt="Operadores en Java" width="300">
                </td>
                <td>
                  <h4>Nombrar capa</h4>
                  <img src="https://github.com/Ulises2024/Curso-JAVA/blob/main/SOURCE/nombrar_capaigu.png" alt="Operadores en Java" width="300">
                </td>
              </tr>
              <p>Se repiten los pasos anteriores para crear ahora la capa de persistencia y se vera de la siguiente manera.</p> 
              <img src="https://github.com/Ulises2024/Curso-JAVA/blob/main/SOURCE/nombrar_capaigu.png" alt="Operadores en Java" width="300">
            </table>
            <li>4. Refactorizar name de archivo java source package(ejemploigu)</li>
            <img src="https://github.com/Ulises2024/Curso-JAVA/blob/main/SOURCE/ejemplo estructura con las 3 capas.png" alt="Operadores en Java" width="300">
          </ul>
    </details>
<br>
<h2>Interfaz Gráfica de Usuario (IGU)</h2>
    <p>• Es una porción de programa que permite la <strong>interacción</strong> de un <strong>usuario</strong> con un sistema computadora de manera sencilla e interactiva.</p>
    <p>• Su principal uso consiste en proporcionar un <strong>entorno visual</strong>.</p>
    <p>• Para un uso sencillo de las interfaces gráficas de usuario, <strong>Java</strong> implementó una librería conocida como <strong>Swing</strong>. Swing permite que una interfaz gráfica de Java pueda ser ejecutada en cualquier dispositivo con cualquier sistema operativo, siempre y cuando ejecute Java.</p>
  
<br>
<h2>Swing</h2>
    <p><strong>Java Swing</strong> está compuesto por 3 partes:</p>
    <img src="https://github.com/Ulises2024/Curso-JAVA/blob/main/SOURCE/img_swing.png" alt="Swing" width="300">
    <p>Es importante ir de lo general a lo particular, donde los <strong>contenedores</strong> son la primera capa de nuestra interfaz gráfica. Los <strong>componentes</strong> representan cada uno de los elementos dentro de ese contenedor, y los <strong>eventos</strong> son cada una de las acciones que pueden realizar los elementos en ese contenedor.</p>

<br>

<h2>Contenedores Gráficos</h2>
    <p>Su principal función es organizar los <strong>componentes gráficos</strong> (botones, cuadros de texto, etiquetas, etc.). Proporcionan la estructura que necesitan los componentes Swing para el manejo de eventos.</p>
    <p>Los dos contenedores más importantes son:</p>
    <ul>
        <li><strong>JFrame</strong>: Es la ventana primaria. Es de mayor nivel dentro de una aplicación.</li>
        <li><strong>JPanel</strong>: Es un contenedor de nivel intermedio. Su función es simplificar el posicionamiento de los componentes dentro de una ventana principal.</li>
    </ul>
    <img src="https://github.com/Ulises2024/Curso-JAVA/blob/main/SOURCE/img_contenedores_graficos.png" alt="contenedores graficos" width="300">

<h2>Componentes Gráficos</h2>
    <p>A cada contenedor (como un <strong>JFrame</strong> o <strong>JPanel</strong>) se le pueden añadir diversos elementos. Estos elementos se denominan <strong>componentes gráficos</strong>. Algunos de los más conocidos y utilizados son:</p>
    <ul>
        <li><strong>JLabel</strong>: Son etiquetas y se utilizan para presentar textos en pantalla.</li>
        <li><strong>JButton</strong>: Son botones que pueden incorporarse a la interfaz gráfica.</li>
        <li><strong>JTextField</strong>: Son cajas de texto que permiten la entrada de datos.</li>
        <li><strong>JComboBox</strong>: Permite listar una serie de elementos que pueden ser seleccionados.</li>
        <li><strong>JCheckBox</strong>: Es una casilla de verificación que permite hacer selecciones múltiples dentro de un conjunto de opciones en la interfaz gráfica.</li>
    </ul>
    <img src="https://github.com/Ulises2024/Curso-JAVA/blob/main/SOURCE/componentes_graficos.png" alt="componentess graficos" width="300">

<h2>Variables de Swing</h2>
    <p>Cada <strong>componente</strong> o <strong>contenedor</strong> en una aplicación o programa es representado por una <strong>variable</strong>, donde el tipo de dato es el nombre del tipo de elemento que estamos utilizando. Por ejemplo:</p>
    <pre><code class="java">
        // Declaración de variables en Swing
        JFrame ventanaPrincipal = new JFrame("Mi Ventana");
        JButton botonAceptar = new JButton("Aceptar");
        JLabel etiquetaNombre = new JLabel("Nombre:");
        JTextField campoTextoNombre = new JTextField(20);
    </code></pre>
  <img src="https://github.com/Ulises2024/Curso-JAVA/blob/main/SOURCE/img_variable_swing.png" alt="componentess graficos" width="300">
  

<h2>Eventos</h2>
    <p>Los <strong>eventos</strong> permiten la interacción con los usuarios. En <strong>Java</strong>, se representan a través de métodos, donde cada componente o elemento puede tener sus propios eventos.</p>
    <p>Un ejemplo de evento podría ser que al hacer clic sobre un botón, cambie el color de fondo de un panel.</p>
    <img src="https://github.com/Ulises2024/Curso-JAVA/blob/main/SOURCE/img_evento.png" alt="componentess graficos" width="300">

<br>

<h2>Métodos de Swing</h2>
    <p>Los <strong>métodos</strong> (o funciones) más utilizados para interfaces gráficas de usuario son:</p>
    <ul>
        <li><strong>getText()</strong>: Permite obtener el contenido o texto ingresado en un determinado elemento.</li>
        <li><strong>setText()</strong>: Permite establecer (<em>settear</em>) un valor o contenido en un determinado elemento.</li>
    </ul>
    <p><strong>Ejemplo:</strong></p>
    <table border="1">
      <tr>
        <td>
          <pre><code class="java">
              //Ejemplo Text Field 
              cajaTexto.setText("Hola estoy probando");
          </code>
          <code class="java">
              //Ejemplo Text Field 
              String texto cajaTexto.getText();
          </code></pre>
        </td>
        <td>
          <img src="https://github.com/Ulises2024/Curso-JAVA/blob/main/SOURCE/img_metodos_swing.png" alt="Operadores en Java" width="300">
        </td>
      </tr>
    </table>

<br>

<h2>Ejemplo Copiador de frases</h2>
<h4>*** Interfaz Gráfica ***</h4>
 <table border="1">
      <tr>
        <td>
          <p>1.- Crear Panel mas grande que es Jframe (Pantalla principal).</p> 
          <img src="https://github.com/Ulises2024/Curso-JAVA/blob/main/SOURCE/crear_jframe.png" alt="Operadores en Java" width="300">
        </td>
        <td>
         <p>2.- Nombrar como "VentanaPrincipal".</p> 
          <img src="https://github.com/Ulises2024/Curso-JAVA/blob/main/SOURCE/img_jframe_name.png" alt="Operadores en Java" width="300">
        </td>
      </tr>
    </table>
<img src="https://github.com/Ulises2024/Curso-JAVA/blob/main/SOURCE/copiador_de_textos.png" alt="Operadores en Java" width="400">
<br>


<details>
      <summary><h2 style="color:green;">Ejercicios practico SORTEADOR</h2></summary>
      <p>Un supermercado realiza todos los meses sorteos entre sus clientes depositen, en un sobre, al menos 3 tickets de compras realizadas en alguna de sus sucursales en días distintos. En todos los sorteos se pueden elegir distinta cantidad de ganadores.</p>
  <p>Por cada sobre que un cliente deposita, recibe un número de participante que está compuesto por, el día de entrega del sobre, el mes y un número de ticket (4 digitos) de alguno de los 3 que haya depositado, por ejemplo, si hubiese entregado su sobre el 19/09 y su num de ticket sea el 0158 del día, su código sería: 19090158. </p>
      <ul>
        <li>1. Se necesita un programa que sea capaz de llevar a cabo los sorteos donde el encargado del supermercado deba ingresar el número de mes del cual se está sorteando, la cantidad de ganadores (puede variar mes a mes) y luego presionar un botón para ir visualizando cada ganador.</li>
        <li>2. Los números ganadores se deben ir visualizando en una interfaz gráfica dentro de una tabla en el lado derecho del programa de forma acumulativa hasta que se de por cerrado el sorteo.</li>
        <li>3. Para cerrar/finalizar un sorteo, se necesita un botón que haga dicha tarea y vacie todos los campos de la interfaz gráfica.</li>
      </ul>
  <h5>Pistas Importantes:</h5>
      <ul>
        <li> En cada mes el rango de números dentro del cuál se sortea va a ser diferente, ejemplo, en septiembre será desde 01090001 hasta 30099999, pero en octubre desde 01100001 hasta 31109999.</li>
        <li> Se recomienda guardar cada número ganador dentro de la posición de un vector en base al puesto que corresponda al premio.</li>
        <li> La lógica a implementar es SOLO LÓGICA de INTERFAZ GRÁFICA.</li>
      </ul>
</details>

<br>

<details>
      <summary><h2 style="color:green;">Desarrollo</h2></summary>
      <ul>
        <li><a href="https://github.com/Ulises2024/Curso-JAVA/tree/main/Ejemplos/TPIntegrador">Sorteador de supermercado</a></li>
      </ul>
  <img src="https://github.com/Ulises2024/Curso-JAVA/blob/main/SOURCE/sorteador.png" alt="Operadores en Java" width="400">
</details>


