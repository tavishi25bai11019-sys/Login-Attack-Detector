import java.util.HashMap;

public class IPMonitor {

    private HashMap<String, Integer> failedAttemptsByIP;

    public IPMonitor() {
        failedAttemptsByIP = new HashMap<>();
    }

    public void recordFailedAttempt(String ipAddress) {

        int currentCount = failedAttemptsByIP.getOrDefault(ipAddress, 0);

        failedAttemptsByIP.put(ipAddress, currentCount + 1);
    }

    public int getFailedAttempts(String ipAddress) {

        return failedAttemptsByIP.getOrDefault(ipAddress, 0);
    }

    public boolean isSuspiciousIP(String ipAddress) {

        return getFailedAttempts(ipAddress) >= 5;
    }

    public void displayIPStatus(String ipAddress) {

        int attempts = getFailedAttempts(ipAddress);

        System.out.println();
        System.out.println("IP MONITORING");
        System.out.println("------------------------------");
        System.out.println("IP Address       : " + ipAddress);
        System.out.println("Failed Attempts  : " + attempts);

        if (isSuspiciousIP(ipAddress)) {
            System.out.println("Status           : SUSPICIOUS");
        } else {
            System.out.println("Status           : NORMAL");
        }
    }
}