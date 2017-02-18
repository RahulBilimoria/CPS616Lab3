import java.util.Scanner;
public class Representations {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.nextLine();
        sc.close();
        if (s.contains("1")){
            System.out.println("* a b c d e f");
            System.out.println("a 0 0 1 1 0 0");
            System.out.println("b 0 0 1 0 0 1");
            System.out.println("c 1 1 0 0 1 0");
            System.out.println("d 1 0 0 0 1 0");
            System.out.println("e 0 0 1 1 0 1");
            System.out.println("f 0 1 0 0 1 0");
            System.out.println();
            System.out.println("a | c d");
            System.out.println("b | c f");
            System.out.println("c | a b e");
            System.out.println("d | a e");
            System.out.println("e | c d f");
            System.out.println("f | b e");
        }
        else if (s.contains("2")){
            System.out.println("* a b c d e");
            System.out.println("a 0 0 1 0 0");
            System.out.println("b 0 0 1 0 0");
            System.out.println("c 1 1 0 1 1");
            System.out.println("d 0 0 1 0 0");
            System.out.println("e 0 0 1 0 0");
            System.out.println();
            System.out.println("a | c");
            System.out.println("b | c");
            System.out.println("c | a b d e");
            System.out.println("d | c");
            System.out.println("e | c");
        }
        else if (s.contains("3")){
            System.out.println("* a b c d e f g");
            System.out.println("a 0 1 1 1 1 0 0");
            System.out.println("b 1 0 0 1 0 1 0");
            System.out.println("c 1 0 0 0 0 0 1");
            System.out.println("d 1 1 0 0 0 1 0");
            System.out.println("e 1 0 0 0 0 0 1");
            System.out.println("f 0 1 0 1 0 0 0");
            System.out.println("g 0 0 1 0 1 0 0");
            System.out.println();
            System.out.println("a | b c d e");
            System.out.println("b | a d f");
            System.out.println("c | a g");
            System.out.println("d | a b f");
            System.out.println("e | a g");
            System.out.println("f | b d");
            System.out.println("g | c e");
        }
    }
}
