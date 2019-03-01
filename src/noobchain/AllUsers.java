package noobchain;

import java.security.PublicKey;
import java.util.ArrayList;

public class AllUsers {
    static ArrayList<Wallet> allUsers=new ArrayList<>(10);
    public static void addUser(Wallet wallet){
        allUsers.add(wallet);

    }
    public static ArrayList getAllUsers(){
        return allUsers;
    }
}
