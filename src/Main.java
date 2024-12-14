
public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();
        double weightInkg = 98;
        double heightInMetres = 1.87;
        int index = service.calculate(weightInkg, heightInMetres);
        System.out.println(index);

    }
}