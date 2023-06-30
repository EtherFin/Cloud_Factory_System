package Program;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Objects;

public class System_Account extends Account {
    private static System_Account SA = null;
    private System_Account(String initialAccount_Number, String initialName, String initialPassword, String initialContact_Way){
        super(initialAccount_Number,initialName,initialPassword,initialContact_Way);
    }
    public static System_Account getSA(){
        if(SA == null) SA = new System_Account("3", "System_Account", "2", "System");
        return SA;
    }
    @Override
    public String toString() {
         Gson gson = new GsonBuilder().setPrettyPrinting().create();
         return gson.toJson(this);
    }

}
