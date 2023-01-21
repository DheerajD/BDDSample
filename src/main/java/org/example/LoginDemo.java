package org.example;

public class LoginDemo {
    public static final String username = "TestUser";
    public static final String password = "TestPwd";

    private boolean blockedUser = false;

    public boolean login(String uname, String pwd) {
        if(uname.startsWith(username) && pwd.startsWith(password))
            return true;
        else {
            if(uname.equals("TestBlockedUser"))
                blockedUser = true;
            return false;
        }

    }
}
