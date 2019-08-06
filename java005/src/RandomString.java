import java.util.Scanner;

public class RandomString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] s = str.split("\\s+");
        int index = (int) (Math.random() * s.length);
        System.out.println(s[index]);
    }
}
