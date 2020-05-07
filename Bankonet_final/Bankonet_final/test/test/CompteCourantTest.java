/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import main.CompteCourant;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author NawakChevelu
 */
public class CompteCourantTest {
    
    public CompteCourantTest() {
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
    public void contructeurNeg() {
        CompteCourant compteCourant1 = new CompteCourant("1","Compte1", 200, -300);
        assertTrue(compteCourant1.getSolde() == 0);
    }
    
    @Test
    public void totalComptes() {
        CompteCourant compteCourant1 = new CompteCourant("1","Compte1", 200, -300);
        CompteCourant compteCourant2 = new CompteCourant("2","Compte2", 200, -300);
        CompteCourant compteCourant3 = new CompteCourant("3","Compte3", 200, -300);
        
        assertTrue(CompteCourant.getNbComptesCourants() == 3);
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
