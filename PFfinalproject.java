
import java.util.InputMismatchException;
import java.util.Scanner;

public class PFfinalproject2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int roomsAvailability[] = new int[10];
        int guestinfoarray[][] = new int[10][4];

        System.out.println("\n.::||| WELCOME TO GRAND PALACE HOTEL & RESTAURANT |||::.");

        int startMenuInput;

        do {
            try {

            System.out.println("\n\n<> HOME PAGE <>");
            System.out.println("\n1. Hotel System");
            System.out.println("\n2. Restaurant System");
            System.out.println("\n3. Exit");
            System.out.print("\nEnter the number ( 3 for exit ): ");

            startMenuInput = sc.nextInt();

            while (startMenuInput != 1 && startMenuInput != 2 && startMenuInput != 3) {
                System.out.println("\nInvalid Input. Select a valid option");
                System.out.print("\nEnter the number ( 3 for exit ): ");
                startMenuInput = sc.nextInt();
            }

            switch (startMenuInput) {

                case 1:
                    hotelMenuSystem(sc, roomsAvailability, guestinfoarray);
                    break;

                case 2:
                    restaurantMenuSystem(sc);
                    break;

                case 3:
                    break;

                default:
                    System.out.println("\nInvalid Input. Select a valid option");
            }
            } catch (Exception e) {
                System.out.print("\nInvalid Input. Please enter numeric values only: ");
                sc.next();
                startMenuInput = 0;
            }

        } while (startMenuInput != 3);

        System.out.println("\nThank you for using Grand Palace Hotel & Restaurant System.");

        sc.close();
        
    }

    public static void hotelMenuSystem(Scanner sc, int roomsAvailability[], int guestinfoarray[][]) {

        int choice = 0;

        try {

        do {
            try {

                System.out.println("\nHotel System Dashboard");
                System.out.println("\n1. Check room status");
                System.out.println("\n2. Book a room");
                System.out.println("\n3. View Guest Information");
                System.out.println("\n4. Generate Bill Invoice");
                System.out.println("\n5. Back to main menu");

                System.out.print("\nEnter your choice: ");

                choice = sc.nextInt();

                switch (choice) {

                    case 1:

                        System.out.println("\nEnter Room number to check its status:");
                        int roomNumber = sc.nextInt();

                        if (roomNumber < 0 || roomNumber >= roomsAvailability.length) {
                            System.out.println("\nInvalid room number");
                            break;
                        }

                        if (roomsAvailability[roomNumber] == 1)
                            System.out.println("\nRoom " + roomNumber + " is booked.");
                        else
                            System.out.println("\nRoom " + roomNumber + " is available.");

                        break;

                    case 2:

                        System.out.println("\nEnter Room number to book:");
                        int roomToBook = sc.nextInt();

                        while (roomToBook < 0 || roomToBook >= roomsAvailability.length) {
                            System.out.println("\nInvalid room number. Enter again:");
                            roomToBook = sc.nextInt();
                        }

                        if (roomsAvailability[roomToBook] == 0) {
                            roomsAvailability[roomToBook] = 1;
                            System.out.println("\nRoom " + roomToBook + " booked.");
                        } else {
                            System.out.println("\nRoom already booked.");
                        }

                        break;

                    case 3:

                        System.out.println("\nGuest info feature not implemented yet");
                        break;

                    case 4:

                        System.out.println("\nBill invoice feature not implemented yet");
                        break;

                    case 5:

                        System.out.println("\nReturning to main menu");
                        break;

                    default:

                        System.out.println("\nInvalid choice");
                }
                System.out.println("Do you want to continue in Hotel System? (y/n)");
                char continueChoice = sc.next().charAt(0);

                while (continueChoice != 'y' && continueChoice != 'n') {
                    System.out.println("\nInvalid choice. Please enter 'y' or 'n': ");
                    continueChoice = sc.next().charAt(0);
                }

                if (continueChoice == 'n')
                    choice = 5;

            } catch (Exception e) {
                System.out.print("\nInvalid Input. Please enter numeric values only: ");
                sc.next();
                choice = 0;
            }

        } while (choice != 5);
        } catch (Exception e) {
            System.out.print("\nInvalid Input. Please enter numeric values only: ");
            sc.next();
        }
    }

    public static void restaurantMenuSystem(Scanner sc) {

        int restChoice = 0;
        char continueChoice = 'y';

        do {

            try {

                System.out.println("\nRestaurant System Dashboard");
                System.out.println("\n1. Test Option A");
                System.out.println("\n2. Test Option B");
                System.out.println("\n3. Return to Main Menu");

                System.out.print("\nEnter your choice: ");

                restChoice = sc.nextInt();

                switch (restChoice) {

                    case 1:
                        System.out.println("\nTesting option A working...");
                        break;

                    case 2:
                        System.out.println("\nTesting option B working...");
                        break;

                    case 3:
                        System.out.println("\nReturning to main menu...");
                        break;

                    default:
                        System.out.println("\nInvalid choice. Try again.");
                }

                System.out.println("Do you want to continue in Restaurant System? (y/n)");
                continueChoice = sc.next().charAt(0);
                
                if (continueChoice == 'n')
                    restChoice = 3;

            } catch (Exception e) {
                System.out.print("\nInvalid Input. Please enter numeric values only: ");
                sc.next();
                restChoice = 0;
                continueChoice = 'y';
            }

        } while (restChoice != 3);
    }
}

