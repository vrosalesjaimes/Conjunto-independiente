import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Clase principal para la implementacion del teorema:
 * 
 * Sea G = (V,E) una gráfica dirgida. Existe un conjunto 
 * independiente S(G) en G tal que para cada vertice en G
 * puede ser alcanzado a partir de S(G) por una trayectoria
 * de longitud a lo más 2.
 * 
 * @author Victor Rosales Jaimes
 *
 */
public class ConjuntoIndependiente {
	
	/**
	 * Lee el archivo con la información de una gráfica.
	 * @param archivo, el archivo a leer.
	 * @return los vértices de a gráfica.
	 */
	public static HashMap<Integer,Vertice> leeArchivo(String archivo){
		HashMap<Integer,Vertice> vertices = new HashMap<Integer,Vertice>();
		
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(
							new FileInputStream(archivo)));
			String linea = "";
			boolean contador = true;
			while((linea = br.readLine()) != null){
				if (contador) {
					vertices = determinaVertices(linea);
					contador = false;
				}else 
					determinaVecinos(linea,vertices);
			}
			br.close();
		}catch(Exception e) {
			System.out.println("Ha ocurrido un error al leer el archivo");
			System.exit(-1);
		}
		return vertices;
	}
	
	/**
	 * Determina los vecinos de cada vertice.
	 * @param linea, donde se encuentra la arista.
	 * @param vertices, los vertices de la gráfica.
	 */
	private static void determinaVecinos(String linea, HashMap<Integer,Vertice> vertices) {
		String[] v = linea.split(",");
		int inicio = Integer.valueOf(v[0].trim());
		int fin = Integer.valueOf(v[1].trim());
		Vertice verticef = vertices.get(fin);
		vertices.get(inicio).nuevoVecino(fin,verticef);
		verticef.getIncidentes().put(inicio, new Vertice(inicio));
	}
	
	/**
	 * A partir de una cadena se determinan los vértices para construir una grafica
	 * @param linea, la linea donde estan todos los vértices separados por comas.
	 * @return un diccionario con los vértices de un gráfica.
	 */
	private static HashMap<Integer,Vertice> determinaVertices(String linea){
		HashMap<Integer,Vertice> vertices = new HashMap<Integer,Vertice>();
		String[] str = linea.split(",");
		for (String s: str) {
			int valor = Integer.valueOf(s.trim());
			vertices.put(valor,new Vertice(valor));
		}
		return vertices;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre del archivo");
		String nombre = sc.nextLine().trim();
		
		try {
			HashMap<Integer,Vertice> vertices = leeArchivo(nombre);
			Digrafica grafica = new Digrafica(vertices);
			HashMap<Integer,Vertice> conjunto = grafica.conjuntoIndependiente();
			System.out.println(conjunto.keySet());
			sc.close();
		}catch(Exception e) {
			System.exit(-1);
		}

	}

}