public class SecurityReport {

    public void generateReport(
            String username,
            String ipAddress,
            int totalAttempts,
            int successfulLogins,
            int failedLogins,
            String threatLevel) {

        System.out.println();
        System.out.println("======================================");
        System.out.println("          SECURITY REPORT");
        System.out.println("======================================");

        System.out.println("Username          : " + username);
        System.out.println("IP Address        : " + ipAddress);
        System.out.println("Total Attempts    : " + totalAttempts);
        System.out.println("Successful Logins : " + successfulLogins);
        System.out.println("Failed Logins     : " + failedLogins);
        System.out.println("Threat Level      : " + threatLevel);

        if (failedLogins >= 5) {
            System.out.println();
            System.out.println("ALERT: BRUTE FORCE ATTACK DETECTED!");
        } else if (failedLogins >= 3) {
            System.out.println();
            System.out.println("WARNING: Suspicious Login Activity!");
        } else {
            System.out.println();
            System.out.println("STATUS: Login activity is normal.");
        }

        System.out.println("======================================");
    }
}