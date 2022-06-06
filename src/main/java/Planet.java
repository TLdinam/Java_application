public enum Planet {
    MARS(4,445,155,"EARTH","JUPITER");

    int planetNumber;
    int distanceBetweenPreviousPlanet;
    int distanceToTheSun;
    int radius;
    String prevPlanet;
    String nextPlanet;

    Planet(int planetNumber, int distanceBetweenPreviousPlanet, int radius, String prevPlanet, String nextPlanet) {
        this.planetNumber = planetNumber;
        this.distanceBetweenPreviousPlanet = distanceBetweenPreviousPlanet;
        this.distanceToTheSun = 898;
        this.radius = radius;
        this.prevPlanet = prevPlanet;
        this.nextPlanet = nextPlanet;
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println(Planet.MARS.distanceToTheSun);
    }
}