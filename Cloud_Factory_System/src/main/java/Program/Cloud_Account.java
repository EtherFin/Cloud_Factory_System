package Program;

import Program.Account;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Cloud_Account extends Account {
    private final Factory factory;
    public Cloud_Account(String initialAccount_Number, String initialName, String initialPassword, String initialContact_Way,String initialFName,String initialFIntroduce,Boolean initialFState){
        super(initialAccount_Number,initialName,initialPassword,initialContact_Way);
        this.factory = new Factory(initialFName,initialFIntroduce,false);
    }
    public Factory getFactory() {
        return factory;
    }
    public void setName(String name) {
        super.setName(name);
    }
    public void setAccount_Number(String account_Number) {
        super.setAccount_Number(account_Number);
    }
    public void setPassword(String password) {
        super.setPassword(password);
    }
    public void setContact_Way(String contact_Way) {
        super.setContact_Way(contact_Way);
    }
    @Override
    public String toString() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(this);
    }
}
