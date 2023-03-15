import java.util.Arrays;

public class ArrayClass {

    // Attribute definieren
    // can use a Java array as a field, static field, a local variable, or parameter, just like any other variable.
    // An array is simply a variation of the data type. Instead of being a single variable of that type,
    // it is a collection of variables of that type
    private int[] array; // array as a field
    private int elementCount = 0;

    // constructor methode mit Angabe der Anzahl der Elemente (Länge des Arrays)
    // constructor method used to initialize objects. It is called when an object of a class is created.
    public ArrayClass(int length) {
        this.array = new int[length]; // beim Erstellen des Arrays soll die Länge angegeben werden
                                    // "int[] array = new int[length]" : Erstellen des Arrays
    }

    // add-Methode; Elemente hinzufügen
    public void addElement(int newElement) {
        if ( elementCount < array.length) {
            array[elementCount++] = newElement;
        } else {                                        // wenn Länge nicht ausreicht, soll Länge verdoppelt werden
            int[] tempArray = new int[array.length*2]; // neues Array erstellen mit doppelter Länge
            for (int i = 0; i < array.length; i++) {    // alle Elemente des ersten Arrays in das neue Array einfügen
                tempArray[i] = array[i];
            }
            tempArray[elementCount++] = newElement;     // das neue Element in das neue Array hinzufügen
            array = tempArray;                          // das erste Array mit den Daten des neuen Arrays überschreiben
        }

        // array = Arrays.copyOf(array, elementCount*2); macht copy von ersten Array in ein neues Array mit neue Länge
    }

    // get-Methode; liefert das Element an bestimmten Stelle (index: Stelle)
    public int getElement(int index) {
        return array[index];
    }

    // getArraySize-Methode; Länge des Arrays zurückliefern
    public int getArraySize() {
        return array.length;
    }

    // getElementCount-Methode; Anzahl der Elemente zurückliefert
    public int getElementCount() {
        return elementCount;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }


}
