package p1;

public class Protection {

    public static void main(String[] args) {

        Protection p = new Protection();
    }

    int n = 1;
    private int n_pri = 2;
    public int n_pro = 3;
    public int n_pub = 4;

    public Protection() {

        System.out.println("base constructor");
        System.out.println("n = " + n);
        System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }

}
