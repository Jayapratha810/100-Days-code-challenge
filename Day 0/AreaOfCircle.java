//Area Of Circle

import java.util.Scanner;

public class AreaOfCircle 
{
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double pi = Math.PI;

        double area = pi * radius * radius;

        System.out.println("The area of the circle is: " + area);
    }
}


