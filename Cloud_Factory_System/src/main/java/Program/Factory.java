package Program;

import Program.Catalog;
import Program.Cloud_Account;
import Program.Device;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Objects;

public class Factory {
    private final String name;
    private final String introduce;
    private String state;
    private final Catalog<Device> devices= new Catalog<Device>();
    public Factory(String initialFName, String initialFIntroduce, boolean initialFState) {
        this.name = initialFName;
        this.introduce = initialFIntroduce;
        this.state = "关停";
    }
    public Catalog<Device> getDevices() {
        return devices;
    }
    public String getName() {
        return name;
    }
    public String getIntroduce() {
        return introduce;
    }
    public String getState(){
        return state;
    }
    public void Change_State(){
        if(this.state.equals("关停")){
            this.state = "开启";
        }
        else{
            this.state = "关停";
        }
    }
    @Override
    public boolean equals(Object o){
        if(o == this.getName()) return true;
        if(o instanceof Factory){
            return ((Factory) o).getName() == this.getName();
        }
        return false;
    }
    @Override
    public String toString() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(this);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
