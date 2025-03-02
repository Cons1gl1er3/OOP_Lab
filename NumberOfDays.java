import java.util.Scanner;

public class NumberOfDays {
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }
    
    public static int getDaysInMonth(String month, int year) {
        month = month.toLowerCase();

        switch (month) {
	        case "january":
	        case "jan":
	        case "jan.":
	        case "1":
	            return 31;
	        case "february":
	        case "feb":
	        case "feb.":
	        case "2":
	            return isLeapYear(year) ? 29 : 28;
	        case "march":
	        case "mar":
	        case "mar.":
	        case "3":
	            return 31;
	        case "april":
	        case "apr":
	        case "apr.":
	        case "4":
	            return 30;
	        case "may":
	        case "may.":
	        case "5":
	            return 31;
	        case "june":
	        case "jun":
	        case "jun.":
	        case "6":
	            return 30;
	        case "july":
	        case "jul":
	        case "jul.":
	        case "7":
	            return 31;
	        case "august":
	        case "aug":
	        case "aug.":
	        case "8":
	            return 31;
	        case "september":
	        case "sep":
	        case "sep.":
	        case "9":
	            return 30;
	        case "october":
	        case "oct":
	        case "oct.":
	        case "10":
	            return 31;
	        case "november":
	        case "nov":
	        case "nov.":
	        case "11":
	            return 30;
	        case "december":
	        case "dec":
	        case "dec.":
	        case "12":
	            return 31;
	        default:
	            return -1;  // Invalid month
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String monthInput;
        int yearInput;
        
        while (true) {
            System.out.print("Enter the month: ");
            monthInput = scanner.nextLine().trim();
            
            System.out.print("Enter the year: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input! Please enter a valid year: ");
                scanner.next();  
            }
            yearInput = scanner.nextInt();
            scanner.nextLine();  // Consume the leftover newline

            if (yearInput < 0) {
                System.out.println("Invalid year! Please enter a non-negative year.");
            } else {
                int days = getDaysInMonth(monthInput, yearInput);
                if (days == -1) {
                    System.out.println("Invalid month! Please try again.");
                } else {
                    System.out.println("The number of days is: " + days);
                    break;
                }
            }
        }

        scanner.close();
    }
}
