public class Main {

    public static void main(String[] args) {

        // Instanziierung des Arrays (Erzeugen eines Arrays)
        // neues Objekt "arr" der Klasse "ArrayClass" wird erstellt
        // bekommt als parameter die Länge des neuen Objektes "arr", da in constructor methode definiert
        ArrayClass arr = new ArrayClass(10);

        // Elemente werden hinzugefügt
       arr.addElement(8);
       arr.addElement(2);
       arr.addElement(1);
       arr.addElement(8);
       arr.addElement(2);
       arr.addElement(1);

       int arrLength = arr.getArraySize();

       int arrElements = arr.getElementCount();
       int i = 2;
       int indexedElement = arr.getElement(i);
       


        System.out.println();
        System.out.println("Array: " + arr);
        System.out.println("Length of Array: " + arrLength);
        System.out.println("Total number of elements in Array: " + arrElements);
        System.out.println("Element in position " + i + " : " + indexedElement);
    }
}

/*
- mit "new..." wird neues Objekt erstellt;
- statisch heißt dass man kein Objekt erstellt;
- statische Methoden/Variablen werden durch die direkte Annotation des Namens aufgerufen;
- nicht statische werden durch die Annotation "class.method" z.B. aufgerufen.
 */