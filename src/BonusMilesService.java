public class BonusMilesService {

    public long calculate(int price) {
        int mile = price / 20;

        return mile;
    }
}