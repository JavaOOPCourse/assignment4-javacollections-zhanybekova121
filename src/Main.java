import service.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StudentService studentService = new StudentService();
        AppointmentService appointmentService = new AppointmentService();
        IssueService issueService = new IssueService();
        ActionHistoryService actionService = new ActionHistoryService();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== 🎓 Smart University Service System =====");
            System.out.println("1. Show Students");
            System.out.println("2. Show Appointments");
            System.out.println("3. Show Emergency Issues");
            System.out.println("4. Show Action History");
            System.out.println("5. Add New Issue");
            System.out.println("6. Undo Action");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Show students
                    studentService.printStudents();
                    break;
                case 2:
                    // Show appointments
                    appointmentService.printAppointments();
                    break;
                case 3:
                    // Show Emergency Issues
                    issueService.showEmergencyIssues();
                    break;
                case 4:
                    // Show Action History
                    actionService.printHistory();
                    break;
                case 5:
                    // Add new issue
                    System.out.print("Enter issue description: ");
                    scanner.nextLine(); // Consume newline
                    String description = scanner.nextLine();
                    System.out.print("Enter urgency (1-5): ");
                    int urgency = scanner.nextInt();    
                    issueService.addNewIssue(description, urgency);
                    break;
                case 6:
                    // Undo last action
                    actionService.undoLastAction();
                    break;
                case 7:
                    System.out.println("Exiting... 👋");
                    break;
                default:
                    System.out.println("Invalid option ❌");
            }

        } while (choice != 7);

        scanner.close();
    }
}
