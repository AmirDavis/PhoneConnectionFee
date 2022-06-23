



import java.util.Scanner;
public class Practice_3_3 {
   public static void main (String[] args) {
   Scanner scan = new Scanner (System.in);
   
   System.out.print ("Enter an amount of minutes: ");
   double min = scan.nextDouble();
   
   double ConnectionFee = 1.99;
   double FirstThreeMin = 2.00;
   double AdditionalMin = 0.45;
   
   double bill = ConnectionFee + (FirstThreeMin * 3);
   
   if (min > 3) {
   double Bill = ConnectionFee + (FirstThreeMin * 3) + ((min - 3) * AdditionalMin);
   System.out.println("Your call duration was " + min + " minutes.");
   System.out.println("Your bill is " + Bill); }
   
   else if (min <= 3) {
   System.out.println("Your call duration was " + min + " minutes.");
   System.out.println("Your bill is " + bill); }
   }
  }