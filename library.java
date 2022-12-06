import java.util.ArrayList;
import java.util.Scanner;

public class library extends product{
    ArrayList<product> shop = new ArrayList<>();
    int totalcostBuy = 64326;
    int sell = 0;

//    	ArrayList<product> slip = new ArrayList<>();
    public void list_of_book() {

//		store 1 book information
        product obj1 = new product();
        shop.add(obj1);
        obj1.book_name = "A Passage to India\n";
//        obj1.setBook_name("A Passage to India\n");
        obj1.Author = "E.M. Foster\n";
        obj1.mrp = 150; // 120
        obj1.stock = 89;
        obj1.language = "ENGLISH";
//        obj1.setBook_name("A Passage to India\n");
//        obj1.setAuthor("E.M. Foster\n");
//        obj1.setMrp(150);  // 120
//        obj1.setStock(89);
//        obj1.setLanguage("ENGLISH");
//		store 2 book information
        product obj2 = new product();
        shop.add(obj2);
        obj2.book_name = "Aadhe Adhure\n";
        obj2.Author = "Mohan Rakesh\n";
        obj2.mrp = 234; // 189
        obj2.stock = 34;
        obj2.language = "HINDI";
//        obj2.setBook_name("Aadhe Adhure\n");
//        obj2.setAuthor("Mohan Rakesh\n");
//        obj2.setMrp(234);  // 189
//        obj2.setStock(34);
//        obj2.setLanguage("HINDI");

//		store 3 book information
        product obj3 = new product();
        shop.add(obj3);
        obj3.book_name = "A Woman's Life\n";
        obj3.Author = "Guy de Maupassant\n";
        obj3.mrp = 350; // 340
        obj3.stock = 93;
        obj3.language = "ENGLISH";
//        obj3.setBook_name("A Woman's Life\n");
//        obj3.setAuthor("Guy de Maupassant\n");
//        obj3.setMrp(350);  // 340
//        obj3.setStock(93);
//        obj3.setLanguage("ENGLISH");
//		store 4 book information
        product obj4 = new product();
        shop.add(obj4);
        obj4.book_name = "Autobiography of a Yogi\n";
        obj4.Author = "Yogananda Paramhans\n";
        obj4.mrp = 99; // 50
        obj4.stock = 9;
        obj4.language = "HINDI";

//        obj4.setBook_name("Autobiography of a Yogi \n");
//        obj4.setAuthor("Yogananda Paramhans\n");
//        obj4.setMrp(99);  // 50
//        obj4.setStock(9);
//        obj4.setLanguage("HINDI");
        ;
//		store 5 book information
        product obj5 = new product();
        shop.add(obj5);
        obj5.book_name = "Blind Beauty\n";
        obj5.Author = "Boris Pasternak\n";
        obj5.mrp = 250; // 210
        obj5.stock = 59;
        obj5.language = "ENGLISH";


//        obj5.setBook_name("Blind Beauty\n");
//        obj5.setAuthor("Boris Pasternak\n");
//        obj5.setMrp(250);  // 210
//        obj5.setStock(59);
//        obj5.setLanguage("ENGLISH");
//		store 6 book information
        product obj6 = new product();
        shop.add(obj6);
        obj6.book_name = "Old Man and the Sea\n";
        obj6.Author = "Ernest Hemingway\n";
        obj6.mrp = 350; // 310
        obj6.stock = 9;
        obj6.language = "ENGLISH";


//        obj6.setBook_name("Old Man and the Sea\n");
//        obj6.setAuthor("Ernest Hemingway\n");
//        obj6.setMrp(350); // 310
//        obj6.setStock(9);
//        obj6.setLanguage("ENGLISH");

        int j = 1;
        for (int i = 0; i < 6; i++) {
            System.out.println(j + " Book name :- " + shop.get(i).book_name);
//            System.out.println(j + " Book name :- " + shop.get(i).getBook_name());
            System.out.println("   Author :- " + shop.get(i).Author);
//            System.out.println("   Author :- " + shop.get(i).getAuthor());
            j++;
        }
    }

    public void buy_book() {
        list_of_book();
            int choice;
            Scanner input = new Scanner(System.in);
            System.out.println("Select which book you want to buy");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("MRP :-" + shop.get(0).mrp + " INR");
//                    System.out.println("MRP :-" + shop.get(0).getMrp() + " INR");
                    System.out.println("No of stock :-" + shop.get(0).stock);
//                    System.out.println("No of stock :-" + shop.get(0).getStock());
                    do {
                        System.out.println("Enter 1. Buy \n      2. Exit");
                        choice = input.nextInt();
                        if (choice == 1) {
                            System.out.println("How many book you want to buy ");
                            choice = input.nextInt();
                            if ((shop.get(0).stock - choice) < 0) {
//                            if ((shop.get(0).getStock() - choice) < 0) {
                                System.out.println("sorry books are not available");
                            } else {
                                shop.get(0).stock -= choice;
//                                shop.get(0).getStock() - =choice;
                                sell += choice * shop.get(0).mrp;
//                                sell += choice * shop.get(0).getMrp();
                                System.out.println("Boooks buy successfully");
                            }

                        }
                    } while (choice != 2);
                    break;
                case 2:
                    System.out.println("MRP :-" + shop.get(1).mrp + " INR");
//                    System.out.println("MRP :-" + shop.get(1).getMrp() + " INR");
                    System.out.println("No of stock :-" + shop.get(1).stock);
//                    System.out.println("No of stock :-" + shop.get(1).getStock());
                    do {
                        System.out.println("Enter 1. Buy \n      2. Exit");
                        choice = input.nextInt();
                        if (choice == 1) {
                            System.out.println("How many book you want to buy ");
                            choice = input.nextInt();
                            if ((shop.get(1).stock - choice) < 0) {
                                System.out.println("sorry books are not available");
                            } else {
                                shop.get(1).stock -= choice;
                                sell += choice * shop.get(1).mrp;
                                System.out.println("Boooks buy successfully");
                            }

                        }
                    } while (choice != 2);
                    break;
                case 3:
                    System.out.println("MRP :-" + shop.get(2).mrp + " INR");
                    System.out.println("No of stock :-" + shop.get(2).stock);
                    do {
                        System.out.println("Enter 1. Buy \n      2. Exit");
                        choice = input.nextInt();
                        if (choice == 1) {
                            System.out.println("How many book you want to buy ");
                            choice = input.nextInt();
                            if ((shop.get(2).stock - choice) < 0) {
                                System.out.println("sorry books are not available");
                            } else {
                                shop.get(2).stock -= choice;
                                sell += choice * shop.get(2).mrp;
                                System.out.println("Boooks buy successfully");
                            }

                        }
                    } while (choice != 2);
                    break;
                case 4:
                    System.out.println("MRP :-" + shop.get(3).mrp + " INR");
                    System.out.println("No of stock :-" + shop.get(3).stock);
                    do {
                        System.out.println("Enter 1. Buy \n      2. Exit");
                        choice = input.nextInt();
                        if (choice == 1) {
                            System.out.println("How many book you want to buy ");
                            choice = input.nextInt();
                            if ((shop.get(3).stock - choice) < 0) {
                                System.out.println("sorry books are not available");
                            } else {
                                shop.get(3).stock -= choice;
                                sell += choice * shop.get(3).mrp;

                                System.out.println("Boooks buy successfully");
                            }

                        }
                    } while (choice != 2);
                    break;
                case 5:
                    System.out.println("MRP :-" + shop.get(4).mrp + " INR");
                    System.out.println("No of stock :-" + shop.get(4).stock);
                    do {
                        System.out.println("Enter 1. Buy \n      2. Exit");
                        choice = input.nextInt();
                        if (choice == 1) {
                            System.out.println("How many book you want to buy ");
                            choice = input.nextInt();
                            if ((shop.get(4).stock - choice) < 0) {
                                System.out.println("sorry books are not available");
                            } else {
                                shop.get(4).stock -= choice;
                                sell += choice * shop.get(4).mrp;
                                System.out.println("Boooks buy successfully");
                            }

                        }
                    } while (choice != 2);
                    break;
                case 6:
                    System.out.println("MRP :-" + shop.get(0).mrp + " INR");
                    System.out.println("No of stock :-" + shop.get(0).stock);
                    do {
                        System.out.println("Enter 1. Buy \n      2. Exit");
                        choice = input.nextInt();
                        if (choice == 1) {
                            System.out.println("How many book you want to buy ");
                            choice = input.nextInt();
                            if ((shop.get(0).stock - choice) < 0) {
                                System.out.println("sorry books are not available");
                            } else {
                                shop.get(0).stock -= choice;
                                sell += choice * shop.get(5).mrp;
                                System.out.println("Boooks buy successfully");
                            }
                        }
                    } while (choice != 2);
                    break;
            }
        }


    public void bookInformation() {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.print("Select book :-  ");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Book name :- " + shop.get(0).book_name);
//                System.out.print("Book name :- " + shop.get(0).getBook_name());
                System.out.print("Author :- " + shop.get(0).Author);
                System.out.println("language :-  " + shop.get(0).language);
                System.out.println("MRP :- " + shop.get(0).mrp + " INR");
                System.out.println("No of stock are available :-  " + shop.get(0).stock);
                break;
            case 2:
                System.out.print("Book name :- " + shop.get(1).book_name);
//                System.out.print("Book name :- " + shop.get(1).getBook_name());
                System.out.print("Author :- " + shop.get(1).Author);
                System.out.println("language :-  " + shop.get(1).language);
                System.out.println("MRP :- " + shop.get(1).mrp + " INR");
                System.out.println("No of stock are available :-  " + shop.get(1).stock);
                break;
            case 3:
                System.out.print("Book name :- " + shop.get(2).book_name);
//                System.out.print("Book name :- " + shop.get(2).getBook_name());
                System.out.print("Author :- " + shop.get(2).Author);
                System.out.println("language :-  " + shop.get(2).language);
                System.out.println("MRP :- " + shop.get(2).mrp + " INR");
                System.out.println("No of stock are available :-  " + shop.get(2).stock);
                break;
            case 4:
                System.out.print("Book name :- " + shop.get(3).book_name);
//                System.out.print("Book name :- " + shop.get(3).getBook_name());
                System.out.print("Author :- " + shop.get(3).Author);
                System.out.println("language :-  " + shop.get(3).language);
                System.out.println("MRP :- " + shop.get(3).mrp + " INR");
                System.out.println("No of stock are available :-  " + shop.get(3).stock);
                break;
            case 5:
                System.out.print("Book name :- " + shop.get(4).book_name);
//                System.out.print("Book name :- " + shop.get(4).getBook_name());
                System.out.print("Author :- " + shop.get(4).Author);
                System.out.println("language :-  " + shop.get(4).language);
                System.out.println("MRP :- " + shop.get(4).mrp + " INR");
                System.out.println("No of stock are available :-  " + shop.get(4).stock);
                break;
            case 6:
                System.out.print("Book name :- " + shop.get(5).book_name);
//                System.out.print("Book name :- " + shop.get(5).getBook_name());
                System.out.print("Author :- " + shop.get(5).Author);
                System.out.println("language :-  " + shop.get(5).language);
                System.out.println("MRP :- " + shop.get(5).mrp + " INR");
                System.out.println("No of stock are available :-  " + shop.get(5).stock);
                break;
        }
    }

    void profit() {
        if (sell > totalcostBuy) {
            System.out.println("profit :- " + (sell - totalcostBuy));
        } else {
            System.out.println("loss :- " + (totalcostBuy - sell));
        }
    }

}
