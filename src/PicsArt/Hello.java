package PicsArt;


public class Hello {
    public static void main(String[] args) {
        int a = 4, b = 4;
        System.out.println("Hello");
        String s = "Java Lesson 2";
        a = 2;
        System.out.println(s);
        System.out.println(s + ":" + a);
        int x = 4, y = 6;
        System.out.println(x + y);
        System.out.println(x * y);
        int z = y / x;
        System.out.println(z);
        int q = y % x;
        System.out.println(q);
        x = 4;
        y = 7;
        z = x++ - --y;
        System.out.println(z--);
        System.out.println(++x);
        System.out.println("x =" + x);
        System.out.println("y =" + y);
        System.out.println("z =" + z);

        boolean d = x == 5;
        System.out.println(d);
        System.out.println(x != 6);
        System.out.println(x > 44);
        System.out.println(x < 45);
        System.out.println(x <= 44);

        boolean p = x >= 0 && x <= 10;
        System.out.println(p);

        System.out.println((x < 10 || x % 15 == 0) && x > 10);
        System.out.println(!(x < 10 || x % 15 == 0));


        int[] myArray = new int[5];
        myArray[0] = 7;
        myArray[4] = 77;
        System.out.println(myArray[1]);
        System.out.println(myArray.length);
        System.out.println(myArray[myArray.length - 1]);

        double[] doubleArray = {1.2, 32.4};

        double[] doubleArray2 = new double[]{1.2, 32.4};

        int[][] k = {{4, 6}, {62, 44}};
        System.out.println(k[1][0]);


        x=45;
        if (x > 0) {
            System.out.println("positive");
            System.out.println("not positive");

        }
        int  l = x > 0 ? 0 : 1;
        System.out.println(l);

        x=21;
        if (x==1){
            System.out.println("mek");
        } else {
            if (x == 2) {
            System.out.println("erkus");
        } else {
            if (x==3) {
                System.out.println("erek");
            } else {
                System.out.println("meca");
            }
            }
        }
        x=3;
        switch (x) {
            case 1:
                System.out.println("mek");
                break;
            case 2 :
                System.out.println("erkus");
                break;
            case 3:
                System.out.println("ereq");
                break;
            default:
                System.out.println("meca");

        }




    }
}
//