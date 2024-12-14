public class BmiService {

    public int calculate(double weightInKg, double heightInMetres) {
        double result = weightInKg / (heightInMetres * heightInMetres);
        return (int) result;
    }
}
