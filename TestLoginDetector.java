public class TestLoginDetector {

    public static void main(String[] args) {

        AttackDetector detector = new AttackDetector();

        if (detector.isBruteForce(5)) {
            System.out.println("Test 1 Passed: Brute-force detection");
        } else {
            System.out.println("Test 1 Failed");
        }

        if (detector.getThreatLevel(5).equals("HIGH")) {
            System.out.println("Test 2 Passed: HIGH threat level");
        } else {
            System.out.println("Test 2 Failed");
        }

        if (detector.getThreatLevel(3).equals("MEDIUM")) {
            System.out.println("Test 3 Passed: MEDIUM threat level");
        } else {
            System.out.println("Test 3 Failed");
        }

        if (detector.getThreatLevel(1).equals("LOW")) {
            System.out.println("Test 4 Passed: LOW threat level");
        } else {
            System.out.println("Test 4 Failed");
        }

        if (detector.getRecommendation(5).contains("Block user")) {
            System.out.println("Test 5 Passed: Security recommendation");
        } else {
            System.out.println("Test 5 Failed");
        }
    }
}
