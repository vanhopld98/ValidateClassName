public class ValidateClassTest {
    public static String[] validate = new String[]{"C0318G"};
    public static String[] invalidate = new String[]{"M0318G", "P0323A"};

    public static void main(String[] args) {
        ValidateClass validateClass = new ValidateClass();
        for (String validate : validate) {
            boolean isvalid = validateClass.validate(validate);
            System.out.println("Class name " + validate + " is valid " + isvalid);
        }
        for (String validate : invalidate) {
            boolean isvalid = validateClass.validate(validate);
            System.out.println("Class name " + validate + " is valid " + isvalid);
        }
    }
}