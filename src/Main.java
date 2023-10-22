/* BUSE: TR1265 0780 124 098 657 5453 13 17
 NUR: TR1245 3432 567 445 678 5656 45 89
 Buse'nin hesap kullanıcı adı ve şifresi: buse18 -- 1818
 Nur'un hesap kullanıcı adı ve şifresi: nur1919 -- 1919
 Bakiye görüntülemek için --> 1
 Para yatırmak için --> 2
 Farklı hesaba para yatırmak için --> 3
 Uygulamadan çıkmak için --> 4 basınız...
 */
import java.util.Scanner;
public class Main {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String transactionOptions =
                "Balance view -->1"
                        + "withdraw money -->2"
                        + "deposit money to different account--> 3"
                        + "Exit --> 4 ";

        double buseBalance = 2500;
        String buseIBAN = "TR1265 0780 124 098 657 5453 13 17";
        String userName = "buse18";
        String busePassword= "1818";

        double nurBalance = 3000;
        String nurIBAN = "TR1245 3432 567 445 678 5656 45 89";
        String userName1 = "nur19";
        String nurPasswordd = "1919";

        System.out.println("welcome to ATM");
        System.out.println("please enter your information");

        System.out.print("user name:   ");
        String username = scanner.nextLine();

        System.out.print("Password:  ");
        String password = scanner.nextLine();

        if (username.equals("buse1818") &&  password.equals("1818")) {
            System.out.println("Buse Ozen account logged in...");
            System.out.println(transactionOptions);

            System.out.print("Please make your choice : ");
            String vote = scanner.nextLine();

            switch (vote) {
                case "1":
                    System.out.println("Your balance :  " + buseBalance);
                    break;
                case "2":
                    System.out.print("enter the amount you want to withdraw:  ");
                    int amountToBeWithdrawn = scanner.nextInt();
                    if (buseBalance >= amountToBeWithdrawn) {
                        buseBalance -= amountToBeWithdrawn;
                        System.out.println("money has been deducted from your account.  ");
                        System.out.println("avaşlable balance " + buseBalance);
                    } else {
                        System.out.println("you cannot withdraw more than your balance.");
                    }
                    break;
                case "3":
                    System.out.print("how much do you want to deposit: ");
                    int amountToBeDeposited =scanner.nextInt();
                    if (amountToBeDeposited<=buseBalance)
                    {
                        System.out.println("enter your iban :   ");
                        scanner.nextLine();
                        String amountToBeDepositedIban = scanner.nextLine();
                        if(amountToBeDepositedIban.equals(nurIBAN))
                        {
                            System.out.println("the money is deposited to nur başar...");

                            buseBalance-= amountToBeDeposited;
                            nurBalance+= amountToBeDeposited;
                            System.out.println("remaining amount in your account :   "+buseBalance);
                        }
                    }
                    break;

                case "4":
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("invalid transaction!");
            }

        } else if (username.equals("nur1919") && nurPasswordd.equals("1919"))
        {
            System.out.println("logged in to nur basar account...");
            System.out.println(transactionOptions);

            System.out.print("please make a choice : ");
            String vote = scanner.nextLine();

            switch (vote) {
                case "1":
                    System.out.println("Balance :  " + buseBalance);
                    break;
                case "2":
                    System.out.print("enter the amount you want to withdraw:  ");
                    int amountToBeWithdrawn = scanner.nextInt();
                    if (buseBalance >= amountToBeWithdrawn) {
                        nurBalance -= amountToBeWithdrawn;
                        System.out.println("money has been deducted from your account.  ");
                        System.out.println("available balance " + nurBalance);
                    } else {
                        System.out.println("you cannot withdraw more than your balance.");
                    }
                    break;
                case "3":
                    System.out.print("how much do you want to deposit: ");
                    int amountToBeDeposited =scanner.nextInt();
                    if (amountToBeDeposited<=nurBalance)
                    {
                        System.out.println("enter your iban :   ");
                        scanner.nextLine();
                        String IbanToBeDeposited = scanner.nextLine();
                        if(IbanToBeDeposited.equals(buseIBAN))
                        {
                            System.out.println("the money is deposited to a person named buse özen...");
                            nurBalance-=amountToBeDeposited;
                            buseBalance+=amountToBeDeposited;
                            System.out.println("amount remaining in your account :   "+nurBalance);
                        }
                    }
                    break;

                case "4":
                    System.out.println("exiting...");
                    System.exit(0);
                default:
                    System.out.println("invalid transaction!");
            }

        } else {
            System.out.println("your username or password is incorrect...");

        }

    }
}