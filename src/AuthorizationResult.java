public class AuthorizationResult {
    private final boolean authorized;

    public AuthorizationResult(boolean auth) {
        this.authorized = auth;
    }

    public boolean isAuthorized() {
        return authorized;
    }
}