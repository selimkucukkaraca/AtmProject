public class Atm extends AtmOperations{

    User user = new User("Selim", 1234);

    public boolean login(User user) {

        if (user.getUserName().equals(this.user.getUserName()) && user.getPassword() == this.user.getPassword()) {
            return true;


        }
        else {
            return false;
        }
    }

}
