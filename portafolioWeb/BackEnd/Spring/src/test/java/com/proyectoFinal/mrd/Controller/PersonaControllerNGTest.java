/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.proyectoFinal.mrd.Controller;

import com.proyectoFinal.mrd.Entity.Persona;
import java.util.List;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author PETER Y YO
 */
public class PersonaControllerNGTest {
    
    public PersonaControllerNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getPersona method, of class PersonaController.
     */
    @Test
    public void testGetPersona() {
        System.out.println("getPersona");
        PersonaController instance = new PersonaController();
        List expResult = null;
        List result = instance.getPersona();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createPersona method, of class PersonaController.
     */
    @Test
    public void testCreatePersona() {
        System.out.println("createPersona");
        Persona persona = null;
        PersonaController instance = new PersonaController();
        String expResult = "";
        String result = instance.createPersona(persona);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePersona method, of class PersonaController.
     */
    @Test
    public void testDeletePersona() {
        System.out.println("deletePersona");
        Long id = null;
        PersonaController instance = new PersonaController();
        String expResult = "";
        String result = instance.deletePersona(id);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editPersona method, of class PersonaController.
     */
    @Test
    public void testEditPersona() {
        System.out.println("editPersona");
        Long id = null;
        String nuevoNombre = "";
        String nuevoApellido = "";
        String nuevoImg = "";
        PersonaController instance = new PersonaController();
        Persona expResult = null;
        Persona result = instance.editPersona(id, nuevoNombre, nuevoApellido, nuevoImg);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
