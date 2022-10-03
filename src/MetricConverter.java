import java.util.Scanner;

public class MetricConverter{
    public static void main(String[] args) {
        double meters;
        double miles;
        double feet;
        double inches;
        double convert1;
        double convert2;
        double convert3;
        String trash;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the value in meters");

        if (in.hasNextDouble()){
            meters = in.nextDouble();
            in.nextLine();

            convert1 = (meters / 1609.344);
            convert2 = (meters * 3.28);
            convert3 = (meters * 39.37);


            System.out.printf("The value in miles is %.2f%n ", convert1);
            System.out.printf("The value in feet is %.2f%n ", convert2);
            System.out.printf("The value in inches is %.2f%n ", convert3);

        } else {
            trash = in.nextLine();
            System.out.println("You entered an invalid width value" + trash);
        }

    }
}





