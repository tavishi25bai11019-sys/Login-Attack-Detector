import java.util.ArrayList;

public class LoginManager {

    private ArrayList<LoginAttempt> attempts;

    public LoginManager() {

        attempts = new ArrayList<>();
    }

    public void recordAttempt(LoginAttempt attempt) {

        attempts.add(attempt);
    }

    public int getTotalAttempts() {

        return attempts.size();
    }

    public int getFailedAttempts() {

        int count = 0;

        for (LoginAttempt attempt : attempts) {

            if (!attempt.isSuccessful()) {

                count++;
            }
        }

        return count;
    }

    public int getSuccessfulAttempts() {

        int count = 0;

        for (LoginAttempt attempt : attempts) {

            if (attempt.isSuccessful()) {

                count++;
            }
        }

        return count;
    }

    public ArrayList<LoginAttempt> getAttempts() {

        return attempts;
    }
}