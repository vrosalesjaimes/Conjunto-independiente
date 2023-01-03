# Programa 1 : Análisis de Algoritmos
Encontaremos un conjunto independiente en una digráfica, lo cual siempre es posible debido al siguente teorema:

### Teorema
Sea $G = (V,E)$ una gráfica dirgida. Existe un conjunto  independiente $S(G)$ en $G$ tal que para cada vertice en $G$ puede ser alcanzado a partir 
de $S(G)$ por una trayectoria de longitud a lo más $2$.

En este caso usamos maven para manejar el programa, dado esto, lo compilamos desde la terminal como sigue:
> mvn compile

Para generar el ejecutable desde la terminal como sigue:
> mvn install

Para ejecutar:
> java -jar target/programa1.jar

En caso de contar con maven, lo compilamos y generemos los ejecutables desde linea de comandos como sigue:
> javac src/main/java/programa1/*.java

Para ejecutarlo
> java  src/main/java/programa1/Programa1.java

Al ejecutar el programa nos pedira el nombre del archivo donde estará la información para crear una gráfica dirigida. 
Todo lo anterior se ejecuta por línea de comandos en la carpeta raíz.
