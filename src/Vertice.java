import java.util.HashMap;

/**
 * Clase para representar los vértices de una digráfica.
 * @author Victor Rosales Jaimes.
 *
 */
public class Vertice {
	/* El elemento del vértice*/
	private int elemento;
	/* Diccionario de vecinos*/
	private HashMap<Integer,Vertice> vecinos;
	/* El grado de un vértice. */
	private int grado;
	/* Las aristas que inciden en el vertice*/
	private HashMap<Integer,Vertice> incidentes;
	
	/* Crea un nuevo vértice a partir de un elemento. */
	public Vertice(int elemento) {
		this.elemento = elemento;
		this.grado = 0;
		this.vecinos = new HashMap<Integer,Vertice>();
		this.incidentes = new HashMap<Integer,Vertice>();
	}

	/* Regresa el elemento del vertice */
	public int getElemento() {
		return elemento;
	}
	
	/* Regresa el grado de un vertice*/
	public int getGrado() {
		return grado;
	}

	/* Regresa un iterable para los vecinos*/
	public HashMap<Integer,Vertice> getVecinos() {
		return vecinos;
	}
	
	/* Agrega un vecino a un vertice. */
	public void nuevoVecino(int i, Vertice v) {
		this.vecinos.put(i,v);
		grado++;
	}
	
	/* Regresa los vertices que inciden en el vertice. */
	public HashMap<Integer,Vertice> getIncidentes(){
		return incidentes;
	}
}