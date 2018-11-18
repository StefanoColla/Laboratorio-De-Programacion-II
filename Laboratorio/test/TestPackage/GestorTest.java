
package TestPackage;

import asistencia.Afiliado;
import asistencia.Doctor;
import asistencia.Gestionar;
import asistencia.GestionarEmpresa;
import asistencia.Movil;
import asistencia.Persona;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.Test;


public class GestorTest {
    
    public GestorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

     @Test
     public void testeoGestorBuscar(){
         Gestionar gest = new GestionarEmpresa();
         Persona d = new Doctor(1000,"Pediatra","Pedro","3",30,"Av Falsa 123");
         Persona p = new Afiliado("Pedro","1",19,"Av Falsa 123");
         gest.añadir(p);
         gest.añadir(d);
         assertEquals(p,gest.buscar(p.getDni()));
     }
     @Test
     public void testeoGestorBuscarMonil(){
         Gestionar gest = new GestionarEmpresa();
         Movil mov = new Movil("Fiat","600",1998,"kjg 123");
         gest.añadirMovil(mov);
         assertEquals(mov,gest.buscarMovil(mov.getPatente()));
     }
     @Test
     public void testeoGestorEliminarPersona(){
         Gestionar gest = new GestionarEmpresa();
         Persona p = new Afiliado("Pedro","1",19,"Av Falsa 123");
         gest.añadir(p);
         Persona d = new Doctor(1000,"Pediatra","Pedro","3",30,"Av Falsa 123");
         gest.añadir(d);
         gest.eliminar(p.getDni());
         assertEquals(null,gest.buscar("1"));
     }
     @Test
     public void testeogestorEliminarMovil(){
         Gestionar gest = new GestionarEmpresa();
         Movil mov = new Movil("Fiat","600",1998,"kjg 123");
         Movil mov1 = new Movil("Fiat","600",1998,"hgd 123");
         gest.añadirMovil(mov);
         gest.añadirMovil(mov1);
         gest.eliminarMovil(mov.getPatente());
         assertEquals(null,gest.buscarMovil("kjg 123"));
     }
}
