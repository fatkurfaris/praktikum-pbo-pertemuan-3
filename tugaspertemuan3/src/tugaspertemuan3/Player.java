/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan3;

/**
 *
 * @author Windows 8.1
 */
public class Player {
    private String username;
    private String password;

    public Player(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
 
        boolean login (String username, String password){
            if (this.username.equals(username)&& this.password.equals(password)) {
                return true;
            }else{
                return false;
            }
        }
}
