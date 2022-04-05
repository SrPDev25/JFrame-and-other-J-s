
package control;

import java.util.ArrayList;
import model.Line;
import model.Stop;
import model.User;

/**
 *
 * @author dam
 */
public class BusControlC {

    private ArrayList<Line> lines;
    private ArrayList<User> users;
    private ArrayList<Stop> stops;

    public BusControlC() {
        lines = new ArrayList<>();
        users = new ArrayList<>();
        stops = new ArrayList<>();
    }

    public void chargeStops() {
        stops.add(new Stop("001", "Mio cid"));
        stops.add(new Stop("002", "Madrid"));
        stops.add(new Stop("003", "Kyoto"));
        stops.add(new Stop("004", "Teatro"));
        stops.add(new Stop("005", "Cinco de mayo"));
        stops.add(new Stop("006", "Juan"));
        stops.add(new Stop("007", "ElPepe"));
        stops.add(new Stop("008", "Abadia"));
        stops.add(new Stop("009", "San Saturno"));
        stops.add(new Stop("010", "Mio cid reborn"));
    }

    public void chargeDefaultUsers(){
        users.add(new User("MJ", "VDQTP", 0));
        users.add(new User("DN", "0000", 1));
        users.add(new User("1", "1", 1));
        users.add(new User("0", "0", 0));
    }
    
    public User userExist(String user){
        int pos=users.indexOf(new User(user));
        User userToReturn=null;
        if(pos!=-1){
            userToReturn=users.get(pos);
        }
        return userToReturn;
    }

    public ArrayList<Line> getLines() {
        return lines;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<Stop> getStops() {
        return stops;
    }
    
    
}
