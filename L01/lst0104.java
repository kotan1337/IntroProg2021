public class lst0104 {
    static String firstUpper(String name) {
        if (name.isEmpty()) {
            return "";
        } else {
            char first = Character.toUpperCase(name.charAt(0));
            // [a, b)
            String rest = name.substring(1, name.length());

            return first + rest;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Hello, " + firstUpper(args[i]));
        }
    }
}