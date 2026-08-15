public class testRegex {
    public static void main(String[] args) {
        try {
            java.util.regex.Pattern.compile("[^\\x00-\\x2f\\x3a-\\x40\\x5b-\\x60\\x7b-\\x7f]+");
            System.out.println("OK ASCII");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
