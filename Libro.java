package practica_unidad_7;

public class Libro {
	private String titulo;
	private String autor;
	private int ejemplares;
	private int prestados;
	private boolean tepresto;
	private boolean tedevuelvo;
public Libro() {//constructor por defecto
	
}
	
public Libro(String titulo,String autor, int ejemplares, int prestados) {//constructor con parametros
	
	this.titulo = titulo;
	this.autor = autor;
	this.ejemplares = ejemplares;
	this.prestados = prestados;
}

/**
 * @return the titulo
 */
public String getTitulo() {
	return titulo;
}

/**
 * @param titulo the titulo to set
 */
public void setTitulo(String titulo) {
	this.titulo = titulo;
}

/**
 * @return the autor
 */
public String getAutor() {
	return autor;
}

/**
 * @param autor the autor to set
 */
public void setAutor(String autor) {
	this.autor = autor;
}

/**
 * @return the ejemplares
 */
public int getEjemplares() {
	return ejemplares;
}

/**
 * @param ejemplares the ejemplares to set
 */
public void setEjemplares(int ejemplares) {
	this.ejemplares = ejemplares;
}

/**
 * @return the prestados
 */
public int getPrestados() {
	return prestados;
}

/**
 * @param prestados the prestados to set
 */
public void setPrestados(int prestados) {
	this.prestados = prestados;
}
	
public boolean prestamo() {
	
	if(prestados<ejemplares) {
		tepresto = true;
		prestados++;
		
	}else {
		tepresto = false;
		
	}
	return tepresto;
	
}

public boolean devolucion() {
	
	if(prestados ==0) {
		tedevuelvo = false;
		
	}else {
		tedevuelvo = true;
		prestados--;
	}
	
	return tedevuelvo;
}

public String toString() {
	
	return "El titulo: "+titulo+ " de, "+autor+ " tiene " + ejemplares+ " ejemplares, de los cuales "+prestados+ " prestados";
	
	
}

}
