public class TestStudent {
    public static void main(String[] args) {
        Staff staff = new Staff();
        System.out.println(staff);
        staff = new Staff("Ken", "England", "No", 5);
        System.out.println(staff);
    }
}
