package pl.arxsoft.tqapp.users;

import pl.arxsoft.tqapp.adapters.UserAdapter;

public class UserManager {
    private final UserAdapter userAdapter;

    public UserManager(UserAdapter userAdapter) {
        this.userAdapter = userAdapter;
    }
}
