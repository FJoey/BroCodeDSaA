import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //stack_lesson();
        //queues_lesson();
        //priorityQueues_lesson();
        linkedLists_lesson();
    }

    static void stack_lesson(){
        // stack = LIFO: Last In; First Out
        //      Stores objects into a 'Vertical Tower'
        //      push() to add to the top
        //      pop() to remove from the top

        // uses of stacks
        /*
         * 1. undo/redo features in text editors
         * 2. moving back/forward through the browser history
         * 3. backtracking algorithms (maz, file directories)
         * 4. Calling functions
         */

        Stack<String> stack = new Stack<String>();

        // Available methods: push(), pop(), peek(), empty(), search()

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Doom");
        stack.push("Borderlands");
        stack.push("FFVII");

        System.out.println(stack);

        /* // Pop an item from the stack, assign it to a string variable, view stack to see item missing
        System.out.println(stack);
        String myFavGame = stack.pop();

        System.out.println(stack);
        System.out.println(myFavGame);
         */

        // View the top item in the stack without removing it from the stack
        // System.out.println(stack.peek());

        // Find placement (not index, thus not 0 indexed) of item in the Stack. -1 if item not in the stack
        /*
        System.out.println(stack.search("FFVII"));
        System.out.println(stack.search("Borderlands"));
        System.out.println(stack.search("Minecraft"));
        System.out.println(stack.search("Fallout"));
         */

        // How to run out of memeory with a stack
        /*
        for(int i = 0; i < 1000000000 ; i++){
            stack.push("Fallout76");
        }
         */
    }

    static void queues_lesson(){
        // Queue = FIFO: First In; First Out. ex: Line of People
        //      A collection designed for holding elements prior to processing
        //      Linear Data Structure
        //
        //      add     = enqueue, offer()
        //      remove  = dequeue, poll()

        // Uses of queues
        /*
         * 1. Keyboard buffer (letters should appear on the screen in the order they are pressed)
         * 2. Printer Queue (Print jobs should be completed in order)
         * 3. Used in LinkedLists, PriorityQueues and Breadth-first-Search
         */

        // Cannot instantiate a Queue, as it is an interface
        // Queue<String> queue = new Queue<String>();
        Queue<String> queue = new LinkedList<String>();

        System.out.println(queue.isEmpty());

        // Available Methods: add(), remove(), element()
        // Best to actually use: offer(), poll(), peek()
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        // No longer empty queue
        System.out.println(queue.isEmpty());

        // Check size of queue
        System.out.println(queue.size());

        // Check if queue contains a thing. Does not return index, only true/false
        System.out.println(queue.contains("Harold"));

        /*
        System.out.println(queue.peek());
        queue.poll();

        System.out.println(queue);

        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();

        System.out.println(queue);

        // element() and peek() do the same thing, however poll() and peek() won't throw and exception when we're out of elements

        queue.poll();
        queue.peek();
        queue.element();

        */


    }

    static void priorityQueues_lesson(){

        // Priority Queue = A FIFO data structure that serves elements
        //                  with the highest priorities first
        //                  before elements with lower priority

        /*
        // Ascending Order:
        // Queue<Double> queue = new PriorityQueue<>();
        // Descending Order:
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        // These are automatically sorted when polling because they are numbers in a Priority Queue
        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

         */

        // Strings in alphabetical order
        // Queue<String> queue = new PriorityQueue<>();
        // Strings in reverse alphabetical order
        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("F");
        queue.offer("D");

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }

    static void linkedLists_lesson(){

    }

}