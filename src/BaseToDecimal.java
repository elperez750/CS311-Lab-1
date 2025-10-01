import java.util.Scanner;



public class BaseToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int base;
                
        do {
            System.out.println("Please enter a base to between 2-9");
            base = scanner.nextInt();
            
            if (base < 2 || base > 9) {
                System.out.println("Base Number is not valid");
                
            }
        } while (base < 2 || base > 9);
        
        
        System.out.print("Enter the number: ");
        String number = scanner.next();
        
        
        int result = 0;
        
        for (int i=0; i<number.length(); i++) {
            
            result = (result * base) + Character.getNumericValue(number.charAt(i));
            
                    
        }
        
        
        System.out.println(result);
        
        
        
        
        
        
        
        scanner.close();
        
    }

}