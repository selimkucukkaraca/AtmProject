public class User {

    private String userName;
    private int password;

    public User(String userName, int password) {     // -> User class ına ait bir obje oluşturulduğu an nasıl davranacağını belirler
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
