package Program;

import Program.Cloud_Account;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Objects;

public class Product {
    private String name;
    private String type;
    private String number;
    private String Specification;
    private String description;

    public Product(String initialName,String initialType,String initialNumber,String initialSpecification,String initialDescription){
        this.name = initialName;
        this.type = initialType;
        this.number = initialNumber;
        this.Specification = initialSpecification;
        this.description = initialDescription;
    }
    public String getName(){
        return this.name;
    }
    public String getType(){
        return this.type;
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
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setType(String type) {
        this.type = type;
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
        if(o instanceof Product){
            return ((Product) o).getNumber() == this.getNumber();
        }
        return false;
    }
    @Override
    public String toString() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(this);
    }

}
