/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;
import model.User;

/**
 *
 * @author satan
 */
public class Mail {

    private ArrayList<User> users;

    public Mail() {
        users = new ArrayList<>();
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    /**
     * Comprueba si un usuario existe vía nombre de usuario
     * Problema, tiene en cuenta que al dar de alta no se puedan repetir ya 
     *  que este metodo coge al primero que encuentra y falla si hay repetidos
     * @param user se introduce en nombre de usuario
     * @return 
     */
    public int userExist(String user) {
        ArrayList<String> logins = new ArrayList<>();
        int exist = -1;
        int pos = 0;
        while (pos < users.size() && exist == -1) {
            if (users.get(pos).getLogin().equals(user)) {
                exist = pos;
            }
            pos++;
        }
        return exist;
    }
    
    public int validateUser(String user, String pass){
        int pos=userExist(user);
        if (pos!=-1){
            User checking=users.get(pos);
            if (!checking.getPass().equals(pass)) {
                pos=-2;
            }
        }
        
        return pos;
    }

    public int userDirectionExist(String direction){
        return users.indexOf(new User(direction));
    }
    
    public User userAt(int pos){
        return users.get(pos);
    }
    
    /**
     * Carga usuarios predeterminados para un funcionamiento basico del programa
     */
    public void chargeDefaultUsers(){
        users.add(new User("0", "0", User.ADMIN, "admin@admin.com"));
        users.add(new User("1", "1", User.USER, "user@miMail.com"));
    }
    
}
