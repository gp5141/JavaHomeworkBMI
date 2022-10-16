public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
                double weight = 80.0;
                double height = 1.8;

                double result = service.calculate(weight, height);

        System.out.println("Ваш индекс массы тела: " + result);
    }
}