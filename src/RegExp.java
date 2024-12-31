public class RegExp {

    public static void main(String[] args) {
        String numbers = "[0-9]";
        String pass="2";

        System.out.println(pass.matches(numbers));
    }
}
