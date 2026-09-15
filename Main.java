import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int failed = 0;
        int successful = 0;

        System.out.println("======================================");
        System.out.println("       LOGIN ATTACK DETECTOR");
        System.out.println("======================================");

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter IP address: ");
        String ip = sc.nextLine();

        System.out.println("\nEnter login results.");
        System.out.println("Type success or fail.");
        System.out.println("Type exit to finish.\n");

        while (true) {

            System.out.print("Login result: ");
            String result = sc.nextLine();

            if (result.equalsIgnoreCase("exit")) {
                break;
            }

            if (result.equalsIgnoreCase("fail")) {

                failed++;
                System.out.println("Login failed.");

            } else if (result.equalsIgnoreCase("success")) {

                successful++;
                System.out.println("Login successful.");

            } else {

                System.out.println("Invalid input.");
            }
        }

        int total = failed + successful;

        String threat;

        if (failed >= 5) {
            threat = "HIGH";
        } else if (failed >= 3) {
            threat = "MEDIUM";
        } else {
            threat = "LOW";
        }

        System.out.println("\n======================================");
        System.out.println("          SECURITY REPORT");
        System.out.println("======================================");

        System.out.println("Username          : " + username);
        System.out.println("IP Address        : " + ip);
        System.out.println("Total Attempts    : " + total);
        System.out.println("Successful Logins : " + successful);
        System.out.println("Failed Logins     : " + failed);
        System.out.println("Threat Level      : " + threat);

        if (failed >= 5) {
            System.out.println("\nALERT: BRUTE FORCE ATTACK DETECTED!");
        } else {
            System.out.println("\nNo Brute Force Attack Detected.");
        }

        System.out.println("======================================");

        sc.close();
    }
}