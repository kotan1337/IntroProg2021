public class While {
    public static void main(String[] args) {
        int i = 0;

        while (i < args.length) {
            System.out.println("Hello, " + args[i]);
            System.out.println(args[i].length());
            System.out.println(args[i].charAt(0));
            i++;
        }
    }
}