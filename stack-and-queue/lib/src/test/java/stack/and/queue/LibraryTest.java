package stack.and.queue;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

    @Test void  pushOntoAStack() {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        String expected ="Stack: top=[5]-->NULL";
        assertEquals(expected,stack.toString());
    }

    @Test void  pushMultipleValues() {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        String expected ="Stack: top=[3]-->[4]-->[5]-->NULL";
        assertEquals(expected,stack.toString());
    }

    @Test void  popValue() {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.pop();
        int expected =5;
        assertEquals(expected,stack.pop());

    }

    @Test void  emptyStackAfterMultiplePops() {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.pop();
        stack.pop();
        stack.pop();
        assertNull(stack.toString());
    }
    @Test void  peekTheNextItemOnTheStack() {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        int expected = 4;
        assertEquals(expected,stack.peek());
    }

    @Test void  CanSuccessfullyInstantiateAnEmptyStack() {
        Stack<Integer> stack = new Stack<>();
        assertNull(stack.toString());
    }

    @Test void  popOrPeekOnEmptyStackRaisesException() {
        Stack<Integer> stack = new Stack<>();
        stack.pop();
        stack.peek();
        assertNull(stack.toString());
    }

    @Test void  enqueueIntoAQueue() {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(5);
        String expected ="Queue: front=[5]=back";
        assertEquals(expected,queue.toString());
    }
    @Test void  enqueueMultipleValuesIntoAQueue() {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);
        String expected ="Queue: front=[5]-->[4]-->[3]=back";
        assertEquals(expected,queue.toString());
    }
    @Test void  dequeueOutOfAQueueTheExpectedValue() {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);
        queue.dequeue();
        String expected ="Queue: front=[4]-->[3]=back";
        assertEquals(expected,queue.toString());
    }
    @Test void  peekIntoAQueueSeeingTheExpectedValue() {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);
        int expected = 5;
        assertEquals(expected,queue.peek());
    }

    @Test void  emptyAQueueAfterMultipleDequeues() {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        assertNull(queue.toString());
    }

    @Test void  instantiateAnEmptyQueue() {
        Queue<Integer> queue = new Queue<>();
        assertNull(queue.toString());
    }

    @Test void  CallingDequeueOrPeekOnEmptyQueueRaisesException() {
        Queue<Integer> queue = new Queue<>();
        assertNull(queue.toString());
        queue.peek();
        assertNull(queue.toString());
    }

    @Test void stackQueuePseudo() {
        PseudoQueue<Integer> test = new PseudoQueue<>();
        assertNull(test.dequeue());
        test.enqueue(5);
        test.enqueue(3);
        test.enqueue(2);
        test.enqueue(4);
        test.enqueue(6);

        assertEquals(5, test.dequeue());
        test.dequeue();
        test.dequeue();

        assertEquals(4, test.dequeue());
    }

    @Test
    public void animalShelterTest(){
        AnimalShelter animalShelter=new AnimalShelter();
        System.out.println(animalShelter.toString());
        Dog roni=new Dog("roni");
        Cat flora=new Cat("flora");
        Dog jad = new Dog("jad");
        Cat losi=new Cat("losi");

        assertNull(animalShelter.toString());
        animalShelter.enqueue(roni);
        animalShelter.enqueue(flora);
        animalShelter.enqueue(losi);
        animalShelter.enqueue(jad);
        System.out.println(animalShelter);
        String expectedStr="AnimalShelter[catGroup=Queue: front=[Cat{name= flora}]-->[Cat{name= losi}]=back, dogGroup=Queue: front=[Dog{name= roni}]-->[Dog{name= jad}]=back]";
        assertEquals(expectedStr,animalShelter.toString());
        assertEquals(flora,animalShelter.dequeue("cat"));
        assertEquals(roni,animalShelter.dequeue("dog"));
        assertNull(animalShelter.dequeue("none"));


    }

    @Test
    public void validatorBracetsTest(){
        StackQueueBrackets testValidator=new StackQueueBrackets();
        assertTrue(testValidator.validateBrackets("{}"));
        assertTrue(testValidator.validateBrackets("{}(){}"));
        assertFalse(testValidator.validateBrackets("{"));
        assertFalse(testValidator.validateBrackets(")"));
    }

}