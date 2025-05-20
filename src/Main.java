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

        /*
         * The reason we would use a linked list over an array
         * is because Arrays are great at searching, but
         * Inserting or Deleting an element takes a ton of time,
         * since you have to shift items around and keep the
         * memory contiguous.
         *
         * Though contiguous memory makes arrays great for
         * searching, if we need to do a lot of deletion or
         * insertion, a LinkedList is going to be faster since
         * it only takes a few steps to accomplish either
         */

        /*
         * LinkedList = stores Nodes in 2 parts (data + address)
         * Nodes are in non-consevutive memory locations
         * Elements are linked using pointers
         *
         * |||||||Singly Linked List
         * Node             ->  Node            ->  Node
         * [data | address]     [data | address]    [data | address]
         * |||||||Doubly Linked List
         * Node                     ->    Node                      ->     Node
         * [address | data | address]     [address | data | address]       [address | data | address]
         *
         * advantages:
         *  1. Dynamic Data Stucture (allocates needed memeory while running)
         *  2. Insertion and Deletion of Nodes is easy. O(1)
         *  3. No/Low memory waste
         *
         * disadvantages:
         *  1. Greater memory usage (additional pointer)
         *  2. No random access of elements (no index[i])
         *  3. Accessing/searching elements is more time consuming. O(n)
         *
         * uses:
         *  1. implement Stacks/Queues
         *  2. GPS navigation
         *  3. music playlist
         */

        // Hover over LinkedList to see that it's a doubly-linked list
        LinkedList<String> linkedList = new LinkedList<String>();

        // Because of 'Deque' being used in the implementation
        // we have a lot of methods to chose from:
        /*
         * addFirst(), offerFirst(), addLast(), offerLast()
         * removeFirst(), pollFirst(), removeLast(), pollLast()
         * getFirst(), peekFirst, getLast(), peekLast()
         */

        // LinkedList as a Stack
        /*
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        linkedList.pop();
         */

        // LinkedList as a Queue
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        // linkedList.poll();

        // insertion and deletion
        linkedList.add(4, "E");
        linkedList.remove("E");

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("0");
        linkedList.addLast("G");
        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();

        System.out.println(linkedList.indexOf("F"));

        System.out.println(linkedList);

    }

}