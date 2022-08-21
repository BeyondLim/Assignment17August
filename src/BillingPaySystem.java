import java.math.BigDecimal;
import java.util.*;
public class BillingPaySystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of unit used:");
        int noOfNumberUnit=sc.nextInt();

        int chargePerUnitForBelow50Unit=5;
        int chargePerUnitForAbove50Unit=10;
        if(noOfNumberUnit<50){
            System.out.println("Energy consumption is of rupees: INR "+noOfNumberUnit*chargePerUnitForBelow50Unit);
        }
        else {
            int bill=(49*chargePerUnitForBelow50Unit)+(noOfNumberUnit-49)*10;
            System.out.println("Energy consumption is of rupees: INR "+noOfNumberUnit*chargePerUnitForBelow50Unit);

        }
    }
}
