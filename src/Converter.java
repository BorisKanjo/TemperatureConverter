import java.util.Scanner;

public class Converter {

   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.print("From which measurement system do you want to convert from\n " +
               "input 'c' for celcius, 'f' for farenheit or 'k' for kelvin: ");

       String value = sc.nextLine();

       //celcius selected
       if(value.equals("c")) {

           System.out.print("Input temperature value (for example 2,5 or 2,0): ");

           Double temp = sc.nextDouble();
           sc.nextLine();

           System.out.print("To which system do you wish to convert to\n" +
                   "'f' for farenheit or 'k' for kelvin: ");
           String deg = sc.nextLine();


           //farenheit selected
           if(deg.equals("f")) {

               double convertedTemp = (temp * (9.0/5.0)) + 32.0;

               System.out.println("Your temperature " + temp + " in farenheit is " + convertedTemp);
           }
           //kelvin selected
           else if(deg.equals("k")) {

               double covnvertedTemp = temp + 273.15;

               System.out.println("Your temperature " + temp + " in kelvin is " + covnvertedTemp);
           }
           else {
               System.out.println("WRONG IMPUT!!. Try again later");
           }
       }

       //farenheit selected
       else if(value.equals("f")) {

           System.out.print("Input temperature value (for example 2,5 or 2,0): ");

           Double temp = sc.nextDouble();
           sc.nextLine();

           System.out.print("To which system do you wish to convert to\n" +
                   "'c' for celcius or 'k' for kelvin: ");
           String deg = sc.nextLine();

           //celcius selected
           if(deg.equals("c")) {

               double covnvertedTemp = (temp - 32.0) * (double)(5.0/9.0);

               System.out.println("Your temperature " + temp + " in celcius is " + covnvertedTemp);
           }
           //kelvin selected
           else if(deg.equals("k")) {

               double covnvertedTemp = ((temp - 32.0) * (double)(5.0/9.0)) + 273.15;

               System.out.println("Your temperature " + temp + " in kelvin is " + covnvertedTemp);
           }
           else {
               System.out.println("WRONG IMPUT!!. Try again later");
           }
       }

       //kelvin selected
       else if(value.equals("k")) {

           System.out.print("Input temperature value (for example 2,5 or 2,0): ");

           Double temp = sc.nextDouble();
           sc.nextLine();

           System.out.print("To which system do you wish to convert to\n" +
                   "'c' for celcius or 'f' for farenheit: ");
           String deg = sc.nextLine();

           //celcius selected
           if(deg.equals("c")) {

               double covnvertedTemp = temp - 273.15;

               System.out.println("Your temperature " + temp + " in celcius is " + covnvertedTemp);
           }
           //kelvin selected
           else if(deg.equals("f")) {

               double covnvertedTemp = ((temp - 273.15) * (double)(9.0/5.0)) + 32.0;

               System.out.println("Your temperature " + temp + " in farenheit is " + covnvertedTemp);
           }
           else {
               System.out.println("WRONG IMPUT!!. Try again later");
           }
       }

       //wrong character entered (default case)
       else {

           System.out.println("WRONG IMPUT!!. Try again later");
       }

   }

}
