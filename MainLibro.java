package practica_unidad_7;

public class MainLibro {

	public static void main(String[] args) {
	//hay que crear los objetos de la clase libro
		
		Libro libro1 = new Libro("El Quijote de la Mancha","Miguel de Cervantes",2,0);
		Libro libro2 = new Libro("El Capitan Alatriste","Perez Reverte",1,0);
		
		System.out.println(libro1.toString());
		
		//se realiza un préstamo de libro1. El método devuelve true si se ha podido e incrementa los prestados
        
        if (libro1.prestamo()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
        }
      
        if (libro1.prestamo()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
        }
      
        if (libro1.prestamo()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
        }
		
        System.out.println(libro1.toString());
        
        //se realiza una devolución de libro1. El método devuelve true si se ha podido y disminuye uno los prestados
        
        if (libro1.devolucion()) {
            System.out.println("Se ha devuelto el libro " + libro1.getTitulo());
        } else {
            System.out.println("No hay ejemplares del libro " + libro1.getTitulo() + " prestados");
        }
	 
	
	System.out.println(libro1.toString());
	}
}
	
