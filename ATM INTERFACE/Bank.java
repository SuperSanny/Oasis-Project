import java.util.*;

public class Bank {

    private List<User> users;
    private User currUser;

    public Bank() {
        this.users = new ArrayList<>();
        this.currUser = null;
        users.add(new User("Sanny123", 1234, "Sanny Kumar", 1000.00));
        users.add(new User("Rahul99", 9955, "Rahul Kumar", 50000.00));
        users.add(new User("Sanjay123", 4321, "Sanjay Kumar", 100000.00));
    }
    public boolean authenticteUser(String userId, int pin) {
        for(User user: users) {
            if(user.getUserId().equals(userId) && user.authenticate(pin)) {
                currUser = user;
                return true;
            }
        }
        return false;
    }
    public User getCurrUser() { return currUser; }

    public User getUserById(String userId) {
        for(User user: users) {
            if(user.getUserId().equals(userId)) return user;
        }
        return null;
    }
}