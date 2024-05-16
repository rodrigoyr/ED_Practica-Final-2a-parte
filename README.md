# ED_Practica-Final-2a-parte

### Rodrigo Yepes Rubio
**A continuación procedo a documentar el trabajo realizado como dicta el enunciado de esta práctica:**
## Análisis y descripción de la aplicación. Este análisis y descripción dará respuesta a las siguientes preguntas:
### Cómo se han organizado y estructurado las clases y cuál es la responsabilidad de cada una.
Las clases en este proyecto siguen la programacion orientada a objetos, trabajan conjuntamente para hacer un programa complejo como hemos aprendidio en clase. Cada clase tiene una responsabilidad , lo que facilita la comprensión y el mantenimiento del código. Aquí detallo una descripción breve de cada clase:

1. **Main**: Esta es la clase principal del programa. Es responsable de la interfaz de usuario y de la gestión de los eventos de la misma. Contiene un menú con varias opciones para gestionar experimentos y poblaciones de bacterias, así como para realizar y visualizar simulaciones.

2. **Experimento**: gestiona un experimento y como se crea. Contiene una lista de poblaciones de bacterias y métodos para gestionar estas poblaciones.

3. **GestorDeArchivos**: Esta clase es responsable de la carga y el guardado de experimentos en archivos.

4. **Poblacion**: Esta clase representa una población de bacterias. Contiene una lista de bacterias y métodos para gestionar esta lista. También tiene un nombre y una fecha de inicio.

5. **Simulacion**: Esta clase es responsable de realizar una simulación diaria. Contiene laclase Plato y una lista de Bacteria. Durante la simulación, las bacterias se mueven, comen y se reproducen. Aquí he seguido la simulacion de Montecarlo como se datalña hacerlo en el enunciado.

6. **Bacteria**: Esta clase representa una bacteria individual. Tiene métodos para moverse, comer y reproducirse, así como para obtener su posición actual.

7. **Plato**: Esta clase representa el entorno en el que las bacterias viven y se mueven. Contiene una matriz, cada una de las cuales tiene una cantidad de comida. También tiene métodos para distribuir comida en diferentes maneras.
   
### Qué decisiones de diseño se han tomado.
En este proyecto, se han tomado varias decisiones de diseño importantes:
1. **Orientación a objetos**: El proyecto está orientado a objetos como hemos aprendido en clase. Cada clase representa una entidad distinta como Bacteria, Poblacion, Simulacion, etc. y como he dicho antes trabajan conjuntamente para crear un programa complejo.

2. **Interfaz gráfica de usuario**: Se ha decidido utilizar Swing para construir la interfaz gráfica de usuario, ya que como me han explicado y he notado es la mejor manera de realizarla. La clase Main extiende de JFrame y se encarga de la creación y gestión de la interfaz de usuario.

3. **Uso de bibliotecas estándar de Java**: El proyecto hace uso de varias clases y interfaces de las bibliotecas estándar de Java, como ArrayLis, Date y ActionListener entre otras

### Qué comprobaciones de integridad (y excepciones) se han implementado.
En este aspecto mi proyecto está un poco excaso, sobre todo en las clases secuendarias que ayudan a la clase principal Main a actuar correctamente. Lo que he hecho ha sido tratar de implementar correctamente todas las clases en el Main, y los errores y exepciones añadirlas aquí, como puede comprobar cuando ocurre un error se muestra un cuadro de dialogo el usuario donde le permite cerrar dicha pestaña y seguir hacienfo uso del programa sin problema. Todo esto lo he añadido en la clase principal main.

### Qué estructuras de datos ha utilizado y por qué lo ha hecho.

### Qué técnicas de ordenación y búsqueda ha utilizado y por qué lo ha hecho.

### Diagramas de clases UML.


## Listado de fallos conocidos y funcionalidades definidas en el enunciado que no se han implementado en el código entregado.
### Listado de todo el código fuente de la aplicación organizado por paquetes (si aplica) y clases.

### Conclusiones (que incluirán, obligatoriamente, una valoración del tiempo dedicado a la práctica).
