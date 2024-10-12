import java.util.Scanner;

public class RunnerClass {
    public RunnerClass(int xCoordOne, int xCoordTwo, int yCoordOne, int yCoordTwo) {
    }

    public static void main(String[] args) {
        Scanner coords = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your first coordinates: ");
        String firstCoords = (String) coords.nextLine();
        firstCoords = firstCoords.replace("(","");
        firstCoords = firstCoords.replace(")","");
        int index = firstCoords.indexOf(",");
        int xCoordOne = Integer.parseInt(firstCoords.substring(0,index));
        int yCoordOne = Integer.parseInt(firstCoords.substring((index+1)));



        System.out.println("Enter your second coordinates: ");
        String secondCoords = (String) coords.nextLine();
        secondCoords = secondCoords.replace("(","");
        secondCoords = secondCoords.replace(")","");
        int indexTwo = secondCoords.indexOf(",");
        int xCoordTwo = Integer.parseInt(secondCoords.substring(0,indexTwo));
        int yCoordTwo = Integer.parseInt(secondCoords.substring((indexTwo+1)));

        Scanner thirdPoint = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a point to find corresponding y value: ");
        String third = (String) thirdPoint.nextLine();
        double xPoint = Double.valueOf(third);


        LinearEquation coordinates = new LinearEquation(xCoordOne,xCoordTwo,yCoordOne,yCoordTwo);


        System.out.println(coordinates);
        System.out.println("The corresponding point on the line is: " + coordinates.calculateY(xPoint));
    }
}