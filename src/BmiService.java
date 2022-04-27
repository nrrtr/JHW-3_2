public class BmiService {
    public double calculate(int weight, int height) {
        double h = height / 100.0;
        double sqH = h * h;
        double bmi = weight / sqH;
        return bmi;
    }
}
