public class EnumDemo {
    public static void main(String[] args) {
        // Season season = new Season(); 자바에서 enum은 static이라 이렇게 안씀! ! !
        Season season =Season.fall;
        // System.out.println(season);
        // System.out.println(season.ordinal());
        System.out.println(season.getValue());
    }
}
