package Task2_CredentialsManager;

import java.util.Scanner;

/**
 *
 * @author Stanislav
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String username = null;
        String password = null;
        String re_password = null;
        String operation = "";
        Credentials user = new Credentials(username, password);
        while (!operation.equals("END")) {
            String input = sc.nextLine();
            String[] split = input.split(" ");
            operation = split[0].trim();
            if (split[0].equals("END")) {
                break;
            }
            username = split[1].trim();
            password = split[2].trim();
            if (split.length >= 4) {
                re_password = split[3].trim();
            }
            if (operation.equals("ENROLL")) {
                user = new Credentials(username, password);
                System.out.println("ENROLL success");
            }
            if (operation.equals("AUTH")) {
                if (user.checkPassword(username, password)) {
                    System.out.println("AUTH success");
                } else {
                    System.out.println("AUTH fail");
                }
            }
            if (operation.equals("CHPASS")) {
                if (user.checkPassword(username, password)) {
                    System.out.println(user.changePassword(password, re_password));
                } else {
                    System.out.println("CHPASS fail");
                }
            }
        }
    }

}
