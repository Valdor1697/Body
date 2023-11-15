public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight;
        double height;
        int bmi = (int) service.calculate(61, 1.65);
        System.out.println(bmi);
    }
}