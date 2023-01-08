# Conjunto independiente
**Definición**
Sea $V$ un conjunto de vértices, $H$ un conjunto de aristas y $G=(V,E)$ una gráfica, un **conjunto independiente** $S$ de la gráfica $G$ es un subconjunto de $V$, es decir, un conjunto de vértices tal que ninguno de los vértices en $S$ son adyacentes entre sí.

**Teorema**
Sea $G=(V,E)$ una gráfica dirigida. Existe un conjunto independiente $S(G)$ en $G$ tal que para cada vértice en $G$ puede ser alcanzado a partir de $S(G)$ por una trayectoria de longitud a lo más $2$.

# Instrucciones
El programa consiste en implementar un programa que regrese un conjunto que cumpla con el **Teorema** anterior. El programa recibe como entrada en los argumentos de la línea de comandos el nombre de un archivo de texto tal que:

 - En a primer línea tendrá todos los vértices que forman a $G$, separados por una coma,
 - En la siguientes líneas irán pares de vértices, separados por una coma, que indicaran las aristas de $G$

Ejemplo de archivo de entrada:

> 1,2,3,4,5,6,7,8 
> 1,2 
> 5,6 
> 7,8 
> 4,3 
> 6,1 
> 6,7 
> 3,8 
> 5,4 
> 4,2 
> 3,7 
> 2,6 
> 7,5 
> 8,4

La salida de la entrada anterior puede ser:
> [1, 4, 7]

# Repositorio
Se puede clonar el repositorio con el comando

    git clone https://github.com/vrosalesjaimes/Conjunto-independiente.git


# Ejecución
Después de clonar se debe acceder a la carpeta **Conjunto-independiente** o desde línea de comandos

    cd Conjunto-independiente
Luego accedemos a la carpeta *src* o desde línea de comandos

    cd src
Para compilar usamos el comando:

    javac ConjuntoIndependiente.java

Para ejecutar usamos el comando:

    java ConjuntoIndependiente.java

Luego ingresamos el nombre del archivo, el archivo debe estar en la carpeta *src*
#
[![forthebadge](https://forthebadge.com/images/badges/made-with-java.svg)](https://forthebadge.com)