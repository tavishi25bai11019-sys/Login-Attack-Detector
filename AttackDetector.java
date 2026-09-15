public class AttackDetector {

    private static final int HIGH_RISK_LIMIT = 5;
    private static final int MEDIUM_RISK_LIMIT = 3;

    public boolean isBruteForce(int failedAttempts) {

        return failedAttempts >= HIGH_RISK_LIMIT;
    }

    public String getThreatLevel(int failedAttempts) {

        if (failedAttempts >= HIGH_RISK_LIMIT) {

            return "HIGH";

        } else if (failedAttempts >= MEDIUM_RISK_LIMIT) {

            return "MEDIUM";

        } else {

            return "LOW";
        }
    }

    public String getRecommendation(int failedAttempts) {

        if (failedAttempts >= HIGH_RISK_LIMIT) {

            return "Block user and monitor IP address.";

        } else if (failedAttempts >= MEDIUM_RISK_LIMIT) {

            return "Monitor user for suspicious activity.";

        } else {

            return "No immediate action required.";
        }
    }
}