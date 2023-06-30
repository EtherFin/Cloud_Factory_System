package Program;

import java.util.Objects;

public abstract class Account {
    private String name;
    private String account_Number;
    private String password;
    private String contact_Way;
    public String getName() {
        return name;
    }
    public String getAccount_Number() {
        return this.account_Number;
    }
    public String getPassword() {
        return password;
    }
    public String getContact_Way() {
        return contact_Way;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAccount_Number(String account_Number) {
        this.account_Number = account_Number;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setContact_Way(String contact_Way) {
        this.contact_Way = contact_Way;
    }
    public Account(String initialAccount_Number, String initialName, String initialPassword, String initialContact_Way){
        this.name = initialName;
        this.account_Number = initialAccount_Number;
        this.password = initialPassword;
        this.contact_Way = initialContact_Way;
    }
    @Override
    public boolean equals(Object o){
        if(o == this.getName()) return true;
        if(o instanceof Cloud_Account){
            return ((Cloud_Account) o).getName() == this.getName();
        }
        return false;
    }
    @Override
    public String toString() {
        return getName()+"_"+getAccount_Number()+"_"+getPassword()+"_"+getContact_Way();
    }
}
