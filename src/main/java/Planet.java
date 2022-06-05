public enum Planet {

    PLUTO( "Pluto",45,null,null),
    NEPTUN( "Neptun",50,PLUTO,null),
    MERCURY( "Mercury", 100,NEPTUN,null);


    String name;
    int radius;
    Planet next;
    Planet prev;

    Planet(String name,int radius, Planet next,Planet prev){
        this.name = name;
        this.radius = radius;
        this.next = next;
    }

}