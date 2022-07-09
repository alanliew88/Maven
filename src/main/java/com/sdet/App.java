package com.sdet;

import java.util.ResourceBundle;

// A mini app to verify username and password from resources > config.propreties

public class App {
    public int userLogin(String in_user, String in_pwd)
        {
            ResourceBundle rb = ResourceBundle.getBundle("config");
            String userName=rb.getString("username");
            String password=rb.getString("password");

            if (in_user.equals(userName)&& in_pwd.equals(password))
                return 1;
            else
                return 0;
        }

}
