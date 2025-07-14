public class PatternTest {
    public static void main(String[] args) {
        int[] testValues = { 3, 5};

        for (int val : testValues) {
            System.out.println("------ Testing for n = " + val + " ------");
            Pattern_Problems.setN(val);

            System.out.println("Pattern A:");
            Pattern_Problems.patternA();

            System.out.println("\nPattern B:");
            Pattern_Problems.patternB();

            System.out.println("\nPattern C:");
            Pattern_Problems.patternC();

            System.out.println("\nPattern D:");
            Pattern_Problems.patternD();

            System.out.println("\nPattern E:");
            Pattern_Problems.patternE();

            System.out.println("\nPattern F:");
            Pattern_Problems.patternF();

            System.out.println("\nPattern G:");
            Pattern_Problems.patternG();

            System.out.println("\nPattern H:");
            Pattern_Problems.patternH();

            System.out.println("\nPattern I:");
            Pattern_Problems.patternI();

            System.out.println("\nPattern J:");
            Pattern_Problems.patternJ();

            System.out.println("\nPattern K:");
            Pattern_Problems.patternK();

            System.out.println("\nPattern L:");
            Pattern_Problems.patternL();

            System.out.println("\nPattern M:");
            Pattern_Problems.patternM();

            System.out.println("\nPattern N:");
            Pattern_Problems.patternN();

            System.out.println("\nPattern O:");
            Pattern_Problems.patternO();

            System.out.println("----------------------------------------\n");
        }
    }
}
