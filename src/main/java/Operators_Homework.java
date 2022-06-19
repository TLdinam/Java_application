public class Operators_Homework {

    public static void main(String[] args) {
        int r1 = 33;
        int r2 = 23;
        int r3 = 45;
        int r4 = 13;
        int r1r2 = r1 + r2;
        int r3r4 = r3 + r4;
        System.out.println(r1r2);
        System.out.println(r3r4);
        System.out.println(r1r2 > r3r4);



        r1r2 += 1;
        r3r4 -= 2;
        System.out.println(r1r2 > r3r4);

        boolean multiplicity_check = (r1r2 % 2 == 0) || (r3r4 % 2 == 0);
        System.out.println(multiplicity_check);




    }
}
