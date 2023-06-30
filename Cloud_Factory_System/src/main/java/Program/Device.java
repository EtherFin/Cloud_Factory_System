package Program;

import Program.Cloud_Account;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.Objects;

public class Device {
    private String type;
    private String name;
    private String number;
    private String state;
    private String rentState;
    private String Specification;
    private String description;
    private final ArrayList<String> factories;
    public Device(String initialType,String initialName,String initialNumber,String initialSpecification,String initialDescription,String initialState,String initialRentState){
        this.type = initialType;
        this.name = initialName;
        this.number = initialNumber;
        this.Specification = initialSpecification;
        this.description = initialDescription;
        this.state = initialState;
        this.rentState = initialRentState;
        this.factories = new ArrayList<String>();
    }
    public String getRentState() {
        return rentState;
    }
    public String getState() {
        return state;
    }
    public ArrayList<String> getFactories() {
        return factories;
    }
    public String getType() {
        return type;
    }
    public String getName(){
        return this.name;
    }
    public String getNumber() {
        return number;
    }
    public String getSpecification() {
        return this.Specification;
    }
    public String getDescription() {
        return description;
    }
    public void setState() {
        if(this.state.equals("关闭")){
            this.state = "开启";
        }
        else{
            this.state = "关闭";
        }
    }
    public void setRentState() {
        if(this.rentState.equals("已被出租")){
            this.rentState = "未被出租";
        } else if (this.rentState.equals("工厂设备")) {
            this.rentState = "工厂设备";
        } else{
            this.rentState = "已被出租";
        }
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public void setSpecification(String specification) {
        this.Specification = specification;
    }
    @Override
    public boolean equals(Object o){
        if(o == this.getName()) return true;
        if(o instanceof Device){
            return ((Device) o).number == this.number;
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
        return Objects.hash(number);
    }
}
