//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String upperCasedString = args[0].toUpperCase();
                int n = Integer.parseInt(args[1]);
                String swapToAn = "AEFHILMNORSX";
                int i = 0;

                // Give me a.. loop
                while (i < upperCasedString.length()) {
                        char current = upperCasedString.charAt(i);
                        String outSpellString = "Give me ";
                        if (swapToAn.indexOf(current) != -1) {
                                outSpellString += "an ";
                        } else {
                                outSpellString += "a  ";
                        }
                        outSpellString += current + ": " + current + "!";
                        System.out.println(outSpellString);
                        i++;
                }
                System.out.println("What does that spell?");
                int j = 0;
                while (j < n) {
                        System.out.println(upperCasedString + "!!!");
                        j++;
                }
                
        }
}
