/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.PersonaDAO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pojo.Persona;

/**
 *
 * @author RigoBono
 */
public class TestingPersonaDAO {
    
    public TestingPersonaDAO() {
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
     public void hello() {
         //Testemos los metodos que fueron definidos en la clase DAO (Data Access Object) 
         PersonaDAO personita=new PersonaDAO();
         Persona nueva = new Persona();
         nueva = personita.getPersonaById(5);
         //Persona personaProNuevoPablo=new Persona();
         //personaProNuevoPablo.setNombre("Francisco");
         //personita.updateById(4, personaProNuevoPablo);
         System.out.println(nueva.getNombre());
     }
}
