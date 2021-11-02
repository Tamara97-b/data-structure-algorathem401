/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedList2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void kGreaterThanLength () {
        LinkedList<Integer> testList = new LinkedList<>();
        testList.insert(6);
        testList.insert(7);
        testList.insert(8);
        assertEquals( "error" , testList.kthFromEnd(70) );
    }
    @Test void zipHappyPath () {
        LinkedList<Integer> testList1 = new LinkedList<>();
        testList1.insert(1);
        testList1.insert(2);

        LinkedList<Integer> testList2 = new LinkedList<>();
        testList2.insert(7);
        testList2.insert(8);
        LinkedList newZippedList = testList1.ziplists(testList1,testList2);
        System.out.println(newZippedList.toString());
       String  result = "{2}--->{8}--->{1}--->{7}--->NULL";

        assertEquals( result , newZippedList.toString());
    }
}