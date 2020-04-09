public class BonusMilesService {
    public long calculate(int cost) {
        int miles = cost / 20;
        return miles;
    }
}