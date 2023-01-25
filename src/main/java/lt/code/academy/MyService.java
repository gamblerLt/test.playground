package lt.code.academy;

public class MyService {

    public  int sum (int a, int b) {
        return a + b;

    }

    public int sum(Integer numb, Integer numb2) {
        if(numb == null || numb2 == null) {
            return 0;
        }
        return numb + numb2;
    }

   /* void updateUser(User user) {
        User updatedUser = use
    }*/

   /* public int dev(int x, int y) {
        return x / y;
    }*/


}
