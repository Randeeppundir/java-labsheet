public class UserBean {
    private String password;

    // Write-only JavaBean property: setter without a getter.
    public void setPassword(String password) {
        this.password = password;
    }

    // Demonstration method that does not expose the password itself.
    public boolean hasPassword() {
        return password != null && !password.isEmpty();
    }
}
