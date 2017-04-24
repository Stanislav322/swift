/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2_CredentialsManager;

/**
 *
 * @author Stanislav
 */
public class Credentials {
      private String username;
    private String password;
    private String[] oldPasswords = new String[100];
    private int indexOldPasswords = 0;

    Credentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    String changePassword(String currentPassword, String newPassword) {

        if (checkPassword(username, currentPassword)) {
            if (newPassword.equals(currentPassword)) {
                return "The new password can not be like current";
            }
            
            for (String oldPassword : this.oldPasswords) {
                if (oldPassword != null && oldPassword.equals(newPassword)) {
                    return "New password alredy is used before!";
                }
            }
            this.oldPasswords[indexOldPasswords] = newPassword;
            this.password = newPassword;
            indexOldPasswords++;
            return "Password changed!";
        }
        return "CHPASS faiil";
    }

    boolean checkPassword(String username, String password) {
        if (password.equals(this.password) && username.equals(this.username)) {
            return true;
        }
        return false;
    }
     }

    
    

