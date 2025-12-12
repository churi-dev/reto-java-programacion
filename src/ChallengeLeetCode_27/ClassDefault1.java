package ChallengeLeetCode_27;

public class ClassDefault1 {

    public static void main(String[] args) {

        /*
        try {
            throw new Derived();
        } catch (Base e) {
            System.out.println("Exception para clase base");
        } catch (Derived e) {
            System.out.println("Exception para clase derived");
        }
         */
    }

    int a = 0, b = 0;

    ClassDefault1() {
        this(10, 20);
        System.out.println(10 + 30);
    }

    ClassDefault1(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println(a + b);
    }

    static class Base extends Exception {

    }

    static class Derived extends Exception {

    }
}
