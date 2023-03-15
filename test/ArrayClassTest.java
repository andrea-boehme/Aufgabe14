import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayClassTest {
    private ArrayClass testArray = new ArrayClass(10);; // Erstelle Test-Array

/*
    @BeforeEach
    public void beforeTest() {
        testArray = new ArrayClass(10);
    }
    damit mit gleichem Objekt arbeitet bei jedem Test; alternativ @AfterEach

 */

    @Test
    public void addElementTest() {
        testArray.addElement(2);
        testArray.addElement(5);
        testArray.addElement(4);
        testArray.addElement(6);

        assertEquals(testArray.getElement(0), 2);
        assertEquals(testArray.getElement(1), 5);
        assertEquals(testArray.getElement(2), 4);
        assertEquals(testArray.getElement(3), 6);
        assertEquals(testArray.getElementCount(), 4);

        System.out.println(testArray.getElementCount());
    }

    @Test
    public void getElementTest() {
        assertEquals(testArray.getElement(0), 0);
        testArray.addElement(2);
        testArray.addElement(5);
        testArray.addElement(4);
        testArray.addElement(6);
        assertEquals(testArray.getElement(3), 6);

        System.out.println(testArray.getElementCount());
    }

    @Test
    public void getArraySize() {

        assertEquals(testArray.getArraySize(), 10);
    }

    @Test
    public void getElementCount() {
        assertEquals(testArray.getElementCount(), 0);
        testArray.addElement(2);
        testArray.addElement(5);
        assertEquals(testArray.getElementCount(), 2);

        // assertEquals(2, testArray.getElementCount());
        // Bei assertEquals sollte man erst "expect", dann Methode aufrufen
    }


    // Ergänze methode zum testen ob Länge tatsächlich verdoppelt. Wenn 12 Elemente (> 10 Elemente), dann Länge 20 (10*2)
    @Test
    public void increaseLength() {
        testArray.addElement(2);
        testArray.addElement(5);
        testArray.addElement(4);
        testArray.addElement(6);
        testArray.addElement(2);
        testArray.addElement(5);
        testArray.addElement(4);
        testArray.addElement(6);
        testArray.addElement(2);
        testArray.addElement(5);
        testArray.addElement(4);
        testArray.addElement(6);
        assertEquals(20, testArray.getArraySize());

    }

/*
    @AfterEach
    public void afterTest() {
        testArray = new ArrayClass(10);
    }
    */
}
