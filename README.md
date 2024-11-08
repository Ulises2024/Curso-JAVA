# CURSO JAVA
Curso de java para principiantes
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

<pre><code>int numero;</code></pre>
