// Airline Booking System
// Created by Christiane A. Bacani
import java.util.Scanner;
public class AirlineBookingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int price[] = {1200,1300,1400,1500,1600,1700,1800,1900,2000};
        boolean sell = true;
        int total = 0;
        
        System.out.print("Welcome to Bataan Airlines!\n");
        System.out.print("Username : ");
        String username = input.nextLine();
        
        System.out.print("Enter your password : ");
        String password = input.nextLine();
        
        while(sell){
        System.out.print("1.) Book a ticket\n2.) Search a passenger\n3.) Exit\n");
        System.out.print("Enter your choice here : ");
        String choice = input.nextLine();
        
        if(choice.equals("1")){
            System.out.print("            BOOK A TICKET\n");
            System.out.print("ROUTE\t\t\t\tPRICE\n");
            System.out.print("1.) Bataan - Cebu\t\tP 1200\n");
            System.out.print("2.) Bataan - Davao\t\tP 1300\n");
            System.out.print("3.) Bataan - Laoag\t\tP 1400\n");
            System.out.print("4.) Bataan - Batanes\t\tP 1500\n");
            System.out.print("5.) Bataan - Palawan\t\tP 1600\n");
            System.out.print("6.) Bataan - Baguio\t\tP 1700\n");
            System.out.print("7.) Bataan - Tuguegarao\t\tP 1800\n");
            System.out.print("8.) Bataan - Dagupan\t\tP 1900\n");
            System.out.print("9.) Bataan - Cotabato\t\tP 2000\n");
            System.out.print("Book your ticket : ");
            int ticket = input.nextInt();
            
            System.out.print("Enter quantity of your ticket here : ");
            int quantity = input.nextInt();
            
            System.out.print("20% discount\n");
            System.out.print("How many passenger/s have PWD/Senior Citizen/Pregnant ? : ");
            int discount = input.nextInt();
            
            double discountedPrice = (20/price[discount - 1]) * 100;
            
            total += (price[ticket - 1] * quantity) - discountedPrice;
            
            System.out.print("The total price is : P " + total + "\n");
            
            System.out.print("Enter your payment here : P ");
            int payment = input.nextInt();
            
            int change = payment - total;
            System.out.print("Change : P " + change + "\n");
            
            System.out.print("Do you want to have a transaction again ? (y/n) : ");
            input.nextLine();
            String buyMore = input.nextLine();
            
            if(buyMore.equalsIgnoreCase("n")){
                sell = false;
                System.out.print("\n\nTHANK YOU FOR THE TRANSACTION, PLEASE COME AGAIN!\n");
            }
            
        }
        else if(choice.equals("2")){
            System.out.print("      SEARCH PASSENGER\n");
            System.out.print("Enter her/his name here : ");
            String name = input.nextLine();
            
            if(name.equals(username)){
                System.out.print("---PASSENGER HAS A TRANSACTION ON US---\n");
            }
            else{
                System.out.print("---PASSENGER DOESN`T HAVE A TRANSACTION ON US---\n");
            }
            
            
        }
        else if(choice.equals("3")){
            System.out.print("\n\n---EXITING---\n");
        }
        else{
            System.out.print("\n\nINVALID CHOICE!\n");
        }
        
        }
        
        
        
        
    }
}
