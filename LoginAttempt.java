public class LoginAttempt {

    private String username;
    private boolean successful;
    private String ipAddress;

    public LoginAttempt(String username, boolean successful, String ipAddress) {

        this.username = username;
        this.successful = successful;
        this.ipAddress = ipAddress;
    }

    public String getUsername() {

        return username;
    }

    public boolean isSuccessful() {

        return successful;
    }

    public String getIpAddress() {

        return ipAddress;
    }
}