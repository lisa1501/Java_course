public class SwaptwoVariables {
    public void swaptwoVariables() {
        String x = "water";
        String y = "Kool-Aid";
        // x=y;
        // y=x;
        String temp;
        temp = x;
        x = y;
        y = temp;

        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }
}
