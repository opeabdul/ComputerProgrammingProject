public class BooleanVar {
    public static void main(String[] args) {
        boolean isRaining = true;
        boolean isSunny = false;
        boolean isRainingAndSunny = isRaining || isSunny;

        System.out.println("It is raining and sunny at the same time: " + !isRainingAndSunny);

    }
}
