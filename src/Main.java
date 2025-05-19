import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // stack = LIFO: Last In; First Out
        //      Stores objects into a 'Vertical Tower'
        //      push() to add to the top
        //      pop() to remove from the top

        Stack<String> stack = new Stack<String>();

        // Available methods: push(), pop(), peek(), empty(), search()

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Doom");
        stack.push("Borderlands");
        stack.push("FFVII");

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

        // uses of stacks
        /*
         * 1. undo/redo features in text editors
         * 2. moving back/forward through the browser history
         * 3. backtracking algorithms (maz, file directories)
         * 4. calling functions
         */
    }
}