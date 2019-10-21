public class Main {
    public static void main (String [] args){
        String word = "Hello";
 
        repl("Hello", 4); // Print Hello 4 times
        System.out.println();
        repl("Goodbye", 1); // Print Goodbye 1 time
        System.out.println();
        repl("Nothing", 0); // Print Nothing 0 times
        System.out.println();
    }
 
    public static String repl(String word, int y) {
        if (y <= 0) {
            return word;
        } else {
            System.out.print(repl(word, y - 1));
        }
 
        return word;
    }
}
