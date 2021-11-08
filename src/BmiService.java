public class BmiService {
    double calculate(int height, int mass) {
        double heightInMeters= height/100.0;
        return mass / (heightInMeters*heightInMeters);
    }
}
