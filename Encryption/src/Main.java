import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text;
        int key;
        Scanner sc = new Scanner(System.in);

        System.out.println("==CAESAR CIPHER==");

        do {
            System.out.print("Type in a lowercase message: ");
            text = sc.nextLine();
        } while(!text.matches("[a-z ]*"));

        System.out.print("Set key shift value (int): ");
        key = sc.nextInt();

        Caesar cs = new Caesar(key);

        System.out.println("Your encrypted message: ");
        System.out.println(cs.cipher(text));

    }
}
