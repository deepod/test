import java.util.Scanner;
/**
 * Created by davidpitt on 15/11/2015.
 */


public class EmpoyeeDatabase {
    public static void main(String[] args) {

        Employee[] employees = {new Employee("David Beckham", 41, "President", 230000.0), new Employee("Helen Pinterest", 41, "Chief Executive", 230000.0), new Employee("Ada Lovelace", 41, "Vice President", 230000.0), new Employee("Edward Bananahead", 41, "President", 230000.0)};

        boolean stillRunning = true;
        int choice;
        //choice = menuChoice();


        while (stillRunning == true) {

            choice = menuChoice();

            switch (choice) {
                case 1:
                    printAllEmployees(employees);
                    break;
                case 2:
                    printEmployee(employees);
                    break;
                case 9:
                    stillRunning = false;
                    break;
                default:
                    System.out.println("This number is invalid");
            }// end of switch statement


        }// end of while loop

        quitProgram();

    }



    // presents the options and gets menu choice from user
    private static int menuChoice(){
        Scanner input = new Scanner(System.in);

        System.out.println("Choose a number and press Enter: \n");
        System.out.println("********************************************************\n");
        System.out.println("[1] Print Employee details \t\t [2] Print all Employees ");
        System.out.println("[9] Quit");
        System.out.println("\n********************************************************");

        return input.nextInt();
    } // end of menuChoice

    // prints out all Employees in emps
    private static void printAllEmployees(Employee[] emps){
        System.out.println("Here is a list of all employees: \n");
        for (int i = 0; i<emps.length; i++){
            System.out.println(emps[i]);
        }

        enterToContinue();

    }// end of printAll

    // prints out Employee of specific name
    private static void printEmployee(Employee[] emps){

        String name;
        boolean found = false;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name of the employee that you would like to find:");
        name = input.nextLine();

        for (int i = 0; i < emps.length; i++){
        //look for name in emps array
            if ((emps[i].getName()).equals(name)) {
                System.out.println(emps[i]);
                found = true;
            }
        }

        if (!found){
            System.out.println("The employee could not be found."); // only if the employee was not found
        }

        enterToContinue();

    }// end of printEmployee

    //Waits for user to press Enter to continue
    private static void enterToContinue(){
        Scanner getEnter = new Scanner(System.in);
        System.out.println("Press enter to continue");
        getEnter.nextLine();
    } // end of enterToContinue

    // quits the program
    private static void quitProgram(){
        System.out.println("Thank you and goodbye!");
    }
}
