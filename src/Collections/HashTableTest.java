package Collections;

import java.util.Hashtable;

public class HashTableTest {
    public static void main(String[] args) {

        Hashtable<String , Integer> users=new Hashtable<String , Integer>();
        users.put("Naveen",100);
        users.put("Mona",300);
        users.put("Jyoti",800);
        users.put("Hank",90);

        System.out.println(users.get("Mona"));
        System.out.println(users.get("Hank"));
    }
}
