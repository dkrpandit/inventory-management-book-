import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        library obj = new library();
        int choice;
        String id;
        String id1 = "dkrpandit";
        String password;
        String password1 = "I2IT";
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("1.list of book ");
            System.out.println("2.Buy Book");
            System.out.println("3.Book information");
            System.out.println("4.check profit");
            System.out.println("0.Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    obj.list_of_book();
                    break;
                case 2:
                    obj.buy_book();
                    break;
                case 3:
                    obj.bookInformation();
                    break;
                case 4:
                    System.out.println("Enter user id ");
                    id = input.next();
                    System.out.println("Enetr password");
                    password = input.next();
                    if (id.equals(id1) && password.equals(password1)) {
                        obj.profit();
                    } else {
                        System.out.println("ID and password and incoreect");
                    }

            }
        } while (choice != 0);
    }
}

