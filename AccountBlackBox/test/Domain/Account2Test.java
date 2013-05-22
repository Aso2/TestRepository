/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

/**
 *
 * @author anri
 */
public class Account2Test {

    public Account2Test() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of reDraw method, of class Account2 - black box.
     */
  @Test
    public void testWithdraw1() {
        System.out.println("test1: withdraw 15000, balance 16000");
        double amount = 15000.0;
        Account2 instance = new Account2(16000.0,123457,1);
        double expResult = 1000.0;
        double result = instance.withdraw(amount);
        assertEquals(expResult, result, 0.0);
        System.out.println("test1: new balance 1000");
        expResult = 1000.0;
        result = instance.getBalance();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testWithdraw2() {
        System.out.println("test2: withdraw 0, balance 16000");
        double amount = 0.0;
        Account2 instance = new Account2(16000.0,123456,1);
        double expResult = 16000.0;
        double result = instance.withdraw(amount);
        assertEquals(expResult, result, 0.0);
        System.out.println("test2: new balance 16000");
        expResult = 16000.0;
        result = instance.getBalance();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testWithdraw3() {
        System.out.println("test3: withdraw 9999, balance 10000");
        double amount = 9999.0;
        Account2 instance = new Account2(10000.0,123123,1);
        double expResult = 1.0;
        double result = instance.withdraw(amount);
        assertEquals(expResult, result, 0.0);
        System.out.println("test3: new balance 16000");
        expResult = 1.0;
        result = instance.getBalance();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testWithdraw4() {
        System.out.println("test4: withdraw 10000, balance 10000");
        double amount = 10000.0;
        Account2 instance = new Account2(10000.0,123123,1);
        double expResult = 0.0;
        double result = instance.withdraw(amount);
        assertEquals(expResult, result, 0.0);
        System.out.println("test4: new balance 16000");
        expResult = 0.0;
        result = instance.getBalance();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testWithdraw5() {
        System.out.println("test5: withdraw 15001, balance 16000");
        double amount = 15001.0;
        Account2 instance = new Account2(16000.0,123123,1);
        double expResult = 0.0;
        double result = instance.withdraw(amount);
        assertEquals(expResult, result, 0.0);
        System.out.println("test5: new balance 16000");
        expResult = 16000.0;
        result = instance.getBalance();
        System.out.println(result);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testWithdraw6() {
        System.out.println("test6: withdraw -1, balance 16000");
        double amount = -1.0;
        Account2 instance = new Account2(16000.0,123123,1);
        double expResult = 0.0;
        double result = instance.withdraw(amount);
        assertEquals(expResult, result, 0.0);
        System.out.println("test6: new balance 16000");
        expResult = 16000.0;
        result = instance.getBalance();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testWithdraw7() {
        System.out.println("test7: withdraw 10001, balance 10000");
        double amount = 10001.0;
        Account2 instance = new Account2(10000.0,123123,1);
        double expResult = 0.0;
        double result = instance.withdraw(amount);
        assertEquals(expResult, result, 0.0);
        System.out.println("test7: new balance 10000");
        expResult = 10000.0;
        result = instance.getBalance();
        assertEquals(expResult, result, 0.0);
    }


    /**
     * Test of calculateAnnualInterest method, of class Account2.
     */
    @Ignore @Test
    public void testCalculateAnnualInterest() {
        System.out.println("calculateAnnualInterest");
        double adding = 0.0;
        double interest = 0.0;
        double fee = 0.0;
        Account2 instance = null;
        double expResult = 0.0;
        double result = instance.calculateAnnualInterest(adding, interest, fee);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
