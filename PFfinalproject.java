import java.util.Scanner;

public class hotelAndRestaurantSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int roomsAvailability[] = new int[10];
        int guestinfoarray[][] = new int[10][4]; // 0: room number, 1: guest ID, 2: number of nights, 3: total bill

        System.out.println(".::||| WELCOME TO GRAND PALACE HOTEL & RESTAURANT |||::.");

        do {
          System.out.println("<> HOME PAGE <>");
          System.out.println("Select which system console do you want to access:");
          System.out.println("1. Hotel System ");
          System.out.println("2. Restaurant System ");
          System.out.println("3. Exit ");
          System.out.print("Enter the number ( 3 for exit ): ");
          int menuInput = sc.nextInt();

          while ( menuInput != 1 && menuInput != 2 && menuInput != 3 ) {
            System.out.println(" Invalid Input. Select a valid option ");
            System.out.print("Enter the number ( 3 for exit ): ");
            startMenuInput = sc.nextInt();
          }
         
          switch (menuInput) {
            case 1:

              hotelMenuSystem();

              break;

            case 2:

              restaurantMenuSystem();

              break;

            case 3:
              continue;
              break;

            default:
              System.out.println(" Invalid Input. Select a valid option ");

          }
        } while ( startMenuInput != 3 );


        System.out.println(" Thank you for using Grand Palace Hotel & Restaurant System. ");
        sc.close();
      }

      public static void hotelMenuSystem() {

        do {
        System.out.println("Hotel System Dashboard");

        System.out.println("1. Check room status");
        System.out.println("2. Book a room");
        System.out.println("3. View Guest Information");
        System.out.println("4. Generate Bill Invoice");
        System.out.println("5. Back to main menu");

        int choice = sc.nextInt();

        switch (choice) {
          case 1:

          System.out.println("Enter Room number to check its status:");
          int roomNumber = sc.nextInt();

          System.out.println("Checking status for room number: " + roomNumber + "...");

          if (roomsAvailability[roomNumber] == 1) { // 1 = booked, 0 = available
            System.out.println("Room " + roomNumber + " is currently booked.");
          } else {
          System.out.println("Room " + roomNumber + " is currently available.");
          
          break;

          case 2:
            
            System.out.println("Enter Room number to book:");
            int roomToBook = sc.nextInt();

            boolean control = false;

            while (roomToBook < 0 || roomToBook >= roomsAvailability.length) {
              System.out.println("Invalid room number. Please enter a valid room number:");
              roomToBook = sc.nextInt();
            }

            while (control == false) {}
            // 1 = booked, 0 = available
            if (roomsAvailability[roomToBook] == 0) {
              roomsAvailability[roomToBook] = 1;
              System.out.println("Room " + roomToBook + " has been successfully booked.");
              control = true;
            } else {
              System.out.println("Room " + roomToBook + " is already booked. Please choose another room.");
            }
            break;

          case 3:
            
            break;

          case 4:
            // code for bill invoice
            break;

          case 5:
            // code for back to main menu
            break;

          default:
            System.out.println("Invalid choice. Please select a valid option.");
          
          System.out.println("Returning to Hotel System Dashboard...");
        
        }
      } while ( choice != 5 );


        
      }

      public static void restaurantMenuSystem() {

        System.out.println("Restaurant System Dashboard");
        
        // Further implementation for restaurant system goes here
      }
}
