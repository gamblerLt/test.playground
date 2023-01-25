package lt.code.academy;

public class UserService {
    public User getUser() {
        return new User("Vardenis", "PAvardemis");
    }
    public void deleteUser(User user) {

    }
    public  User updateUser(User user) {

        return user;
    }
}
