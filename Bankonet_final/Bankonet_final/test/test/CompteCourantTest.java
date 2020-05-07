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
    
    private static CompteCourant compteCourant1;
    private static CompteCourant compteCourant2;
    private static CompteCourant compteCourant3;
    
    public CompteCourantTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        compteCourant1 = new CompteCourant("1","Compte1", 0, -300);
        compteCourant2 = new CompteCourant("2","Compte2", 200, -300);
        compteCourant3 = new CompteCourant("3","Compte3", 200, -300);
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
    public void contructeurKo() {
        assertNotEquals(100, compteCourant1.getSolde(), 1);
    }
    
    @Test
    public void totalComptes() {
        assertEquals(3, CompteCourant.getNbComptesCourants(), 1);
    }
    
    @Test
    public void crediterComptesOk() {
        double ancienSolde;
        double montant = 100;
        ancienSolde = compteCourant1.getSolde();
        compteCourant1.crediter(montant);
        
        assertEquals(ancienSolde + montant, compteCourant1.getSolde(), 1);
        compteCourant1.debiter(montant);
    }
    
    @Test
    public void crediterCompteKo() {
        double ancienSolde;
        double montant = -100;
        ancienSolde = compteCourant1.getSolde();
        compteCourant1.crediter(montant);
        
        assertNotEquals(ancienSolde + montant, compteCourant1.getSolde(), 1);
    }
    
    @Test
    public void debiterCompteOk() {
        double ancienSolde;
        double montant = 100;
        ancienSolde = compteCourant1.getSolde();
        compteCourant1.debiter(montant);
        
        assertEquals(ancienSolde - montant, compteCourant1.getSolde(), 1);
        compteCourant1.crediter(montant);
    }
    
    @Test
    public void debiterCompteKo() {
        double ancienSolde;
        double montant = 300;
        ancienSolde = compteCourant1.getSolde();
        compteCourant1.debiter(montant);
        
        assertNotEquals(ancienSolde - montant, compteCourant1.getSolde(), 1);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
