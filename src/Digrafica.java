import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Digrafica {
	
	/* Vértices de una gráfica. */
	private HashMap<Integer,Vertice> vertices;
	
	/* Crea una gráfica. */
	public Digrafica(HashMap<Integer,Vertice> vertices) {
		this.vertices = vertices;
	}
	
	/**
	 * Obtiene un conjunto independiente de una gráfica.
	 * @return un conjunto independiente de una gráfica.
	 */
	public HashMap<Integer,Vertice> conjuntoIndependiente() {
		HashMap<Integer,Vertice> conjuntoIndependiente = new HashMap<Integer,Vertice>();
		HashMap<Integer,Vertice> aux = new HashMap<Integer,Vertice>();
		HashMap<Integer, Vertice>  vertices = this.vertices;
		Integer[] m = ordena(vertices.keySet(),vertices);
		
		for (int i = m.length-1; i>=0;i--) {
			Vertice v = vertices.get(m[i]);
			
			if (!aux.containsKey(m[i])) {
				conjuntoIndependiente.put(m[i],vertices.get(m[i]));
			
			for(Integer l: v.getVecinos().keySet()) 
				aux.put(l,vertices.get(l));
			
			for(Integer j: v.getIncidentes().keySet()) 
				aux.put(j,vertices.get(j));
			}
		}
		return conjuntoIndependiente;
	}
	
	/**
	 * Ordena los elementos  de un arreglo de enteros de forma ascendente.
	 * @param conjunto, el conjunto del cual se obtendrá un arreglo de enteros.
	 * @param diccionario, los vértices de una gráfica.
	 * @return un arreglo de enteros ordenado de forma ascendente.
	 */
	public Integer[]  ordena(Set<Integer> conjunto,HashMap<Integer,Vertice> diccionario) {
		Integer[] i = conjunto.toArray(new Integer[0]); 
		Arrays.sort(i,(a,b) -> Integer.compare((diccionario.get(a).getGrado()),(diccionario.get(b).getGrado())));		
		return i;
	}
	
	
}
