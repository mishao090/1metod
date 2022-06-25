public class BonusMilesService {
    public int calculate(int cost) {

        int rub = 20; // Бонусные рубли

        int miles = cost / rub;

        return miles;
    }
}
