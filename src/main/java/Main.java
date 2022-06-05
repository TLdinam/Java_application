
public class Main {
    public static Planet p;

    public static void main(String[] args, Planet planet) {
        if (planet == Planet.MERCURY){
            p = Planet.PLUTO;
        }
        if (planet.radius > 50) {
            System.out.println();
        }
    }
}
