/*
 * The program is a class.
 *
 * By:      Sydney Kuhn
 * Version: 1.0
 * Since:   2020-10-26
 */

import java.util.ArrayList;

/**
 * This is a class for my program.
 */
public class SydneyStack {

    /**
     * Private array (only accessible within this class).
     */
    private ArrayList<Integer> stackClass= new ArrayList<Integer>();

    /**
    * This is getter
    * getStack().
    *
    * @return stackClass this is the list of numbers.
    */
    public ArrayList<Integer> getStack() {
        return stackClass;
    }

    /**
     * This is a function for the pushed item.
     *
     * @param userInt the number thats added to the array.
     *
     */
    public void push(final int userInt) {
        stackClass.add(userInt);
    }

    /**
    * This is the pop stack.
    *
    * @return stackNum this is the new popped number.
    */
    public int pop() {
        final int quantity = stackClass.size();
        final int poppedItem;
        if (stackClass.isEmpty()) {
            poppedItem = -1;
        } else {
            poppedItem = (int) stackClass.get(quantity - 1);
            stackClass.remove(quantity - 1);
        }
        return poppedItem;
    }

    /**
     * Finalizing the stack.
     */
    public void finishedStack() {
        System.out.println(stackClass);
    }
}
