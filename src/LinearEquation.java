
public class LinearEquation {
    private int xOne;
    private int xTwo;
    private int yOne;
    private int yTwo;
    private double yInt;
    private String signOne;
    private String signTwo;


    public LinearEquation(int xOne, int xTwo, int yOne, int yTwo) {
        this.xOne = xOne;
        this.xTwo = xTwo;
        this.yOne = yOne;
        this.yTwo = yTwo;
    }


    public double distance() {
        double dist = Math.sqrt((Math.pow((xTwo - xOne), 2)) + (Math.pow((yTwo - yOne), 2)));
        return Double.valueOf(String.format("%.2f", dist));
    }


    public double slope() {
        return ((double) yTwo - yOne) / (xTwo - xOne);
    }


    public double yIntercept() {
        yInt = (double) (yOne - (slope() * xOne));
        yInt = yInt*100;
        yInt = Math.round(yInt);
        yInt = yInt/100;
        return yInt;
    }

    public String equation() {
        String yIntercepp = "";
        String fraction = Math.abs(yTwo - yOne) + "\\" + Math.abs(xTwo - xOne);
        String wholeNum = String.valueOf((yTwo - yOne) / (xTwo - xOne));
        signOne = "";
        double slope = (double) (yTwo - yOne) / (xTwo - xOne);
        if (yIntercept() < 0 ){
            signTwo = "-";
            yIntercepp = String.valueOf(Math.abs(yInt));

        }
        if (yIntercept() == 0){
            signTwo = "";
            yIntercepp = "";

        }
        if (yIntercept() > 0) {
            signTwo = "+";
            yIntercepp = String.valueOf(yInt);

        }
        if (slope == 1 ){
            signOne = "";
            fraction = "1";
            wholeNum = "1";
        }
        if (slope == -1 ){
            signOne = "-";
            fraction = "1";
            wholeNum = "1";
        }
        if (slope > 0 && slope != 1 ){
            fraction = Math.abs(yTwo - yOne) + "\\" + Math.abs(xTwo - xOne);

        }
        if (slope < 0 && slope != -1){
            signOne = "-";
            fraction = Math.abs(yTwo - yOne) + "\\" + Math.abs(xTwo - xOne);
            wholeNum =  String.valueOf(Math.abs((yTwo - yOne) / (xTwo - xOne)));

        }


        if ((yTwo - yOne) % (xTwo - xOne) < 0) {
            return "y = " + signOne + fraction + "x" + signTwo + yIntercepp;
        }
        if ((yTwo - yOne) % (xTwo - xOne) > 0 ){
            return "y = " + signOne + fraction + "x" + signTwo + yIntercepp;
        }
        if ((yTwo - yOne) % (xTwo - xOne) == 0 ) {
            return "y = " + signOne + wholeNum + "x" + signTwo + yIntercepp;
        }
        else {
            System.out.println("Check");
            return "";
        }
    }

    public String toString() {
        return "Point 1: (" + xOne + ", " + yOne + ")\n" +
                "Point 2: (" + xTwo + ", " + yTwo + ")\n" +
                "Slope: " + String.format("%.2f", slope()) + "\n" +
                "Y-Intercept: " + String.format("%.2f", yIntercept()) + "\n" +
                "Distance: " + String.format("%.2f", distance()) + "\n" +
                "Equation: " + equation();
    }


    public String calculateY(double x) {
        double y = slope() * x + yIntercept();
        return String.format("(%.2f, %.2f)", x, y);
    }


}