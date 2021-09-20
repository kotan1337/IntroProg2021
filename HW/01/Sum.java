import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] terms = args[0].split("\\s+");
        
        int sum = 0;
        
        for (int i = 0; i < terms.length; i++) {
            sum += Integer.parseInt(terms[i]);
        }

        System.out.println(sum);
    }
}