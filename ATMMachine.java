package atm_machine_oops;

import java.util.Scanner;

class ATM {

    float balance;
    int pin = 1223;

    public void checkpin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================== *** ATM MACHINE *** ==========================");
        while(true){
            System.out.println("Enter your pin: ");
            int enteredpin = sc.nextInt();
            if (enteredpin == pin) {
                menu();
            } else {
                System.out.println("enter valid pin");
            }
        }
        }


    public void Check_Balance() {
        System.out.println("your current balance is $" + balance);
        menu();
    }

    public void WithDrawMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your amount: ");
        float entered_balance = sc.nextFloat();
        if (entered_balance > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance = balance - entered_balance;
            System.out.println("Money Withdrawl Sucessfully!!!");
        }
        menu();

    }

    public void DepositMoney() {
        System.out.println("Enter the Amount: ");
        Scanner sc = new Scanner(System.in);
        float deposited_amount = sc.nextFloat();
        balance = balance + deposited_amount;
        System.out.println("Money Deposited Sucessfully!!!");
        menu();
    }

    public void menu() {

        System.out.println("======================== *** ATM MACHINE *** ==========================");
        System.out.println();
        System.out.println("1].CHECK A/C BALANCE");
        System.out.println("2].WITHDRAW MONEY");
        System.out.println("3].DEPOSIT MONEY");
        System.out.println("4].EXIT");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        while (choice != 4) {
            switch (choice) {
                case 1:
                    Check_Balance();
                case 2:
                    WithDrawMoney();
                case 3:
                    DepositMoney();
                case 4:
                    menu();
                default:
                    System.out.println("Enter valid choice");
                    choice = sc.nextInt();

            }
        }
    }
}


public class ATMMachine {

    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
    }
}

