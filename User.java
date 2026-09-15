public class User {

    private String username;
    private String ipAddress;
    private boolean blocked;

    public User(String username, String ipAddress) {
        this.username = username;
        this.ipAddress = ipAddress;
        this.blocked = false;
    }

    public String getUsername() {
        return username;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void blockUser() {
        blocked = true;
    }

    public void unblockUser() {
        blocked = false;
    }
}