package Program;
import Gui.*;
import com.google.gson.Gson;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.*;

public class CloudSystem {
    private Catalog<Account> CAs = new Catalog<>();
    private Catalog<Device>  devices= new Catalog<>();
    private Catalog<String> device_types = new Catalog<>();
    private Catalog<Product> products = new Catalog<>();
    private Catalog<String> Product_types = new Catalog<>();
    private Cloud_Account current_account;
    private final Main_Menu main_menu = new Main_Menu();
    private final Accounts_Menu accounts_menu = new Accounts_Menu();
    private final Factory_Menu factory_menu = new Factory_Menu();
    private final Device_Menu1 device_menu1 = new Device_Menu1();
    private final Device_Menu2 device_menu2 = new Device_Menu2();
    private final Product_Menu1 product_menu1 = new Product_Menu1();
    private final Product_Menu2 product_menu2 = new Product_Menu2();
    private final Add_Device add_device = new Add_Device();
    private final Add_Device1 add_device1 = new Add_Device1();
    private final Add_Product add_product = new Add_Product();
    private final LogIn logIn = new LogIn();
    private final SignIn signIn = new SignIn();
    private final Menu system_menu = new Menu();
    private final Normal_Menu normal_menu = new Normal_Menu();
    private static final CloudSystem cloudSystem = new CloudSystem();

    public static void main(String[] args) throws IOException {

        cloudSystem.CAs = cloudSystem.Load_Account_Catalog();
        cloudSystem.devices = cloudSystem.Load_Device_Catalog();
        //cloudSystem.normal_menu().getTable1().setModel(cloudSystem.LoadTableModel_Normal(cloudSystem.current_account.getFactory().getDevices()));

        //主界面main_menu,在点击或关闭后才能打开登录和注册页面
        cloudSystem.main_menu().setVisible(false);
        while(cloudSystem.main_menu().isVisible()){
            System.out.println("Hello")
            ;}
        System.out.println("Main_Menu is closed");
        //普通用户登录之后的主菜单
        cloudSystem.normal_menu().setVisible(false);
        //用户管理界面
        cloudSystem.accounts_menu().setVisible(false);
        cloudSystem.accounts_menu.getTable1().setModel(cloudSystem.LoadTableModel_Account(cloudSystem.CAs));
        cloudSystem.accounts_menu.getTable1().getSelectionModel().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        //工厂管理界面
        cloudSystem.factory_menu().setVisible(false);
        cloudSystem.factory_menu().getTable1().setModel(cloudSystem.LoadTableModel_Factory(cloudSystem.CAs));
        cloudSystem.factory_menu().getTable1().getSelectionModel().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        //产品管理界面
        cloudSystem.products = cloudSystem.Load_Product_Catalog();
        cloudSystem.Product_types = cloudSystem.Load_Product_Type();
        cloudSystem.product_menu1().setVisible(false);
        cloudSystem.product_menu2().setVisible(false);
        cloudSystem.product_menu1.getTable1().setModel(cloudSystem.LoadTableModel1_Product(cloudSystem.Product_types));
        cloudSystem.product_menu1.getTable1().getSelectionModel().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        cloudSystem.product_menu2.getTable1().setModel(cloudSystem.LoadTableModel2_Product(cloudSystem.products));
        cloudSystem.product_menu2.getTable1().getSelectionModel().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        //设备管理界面
        cloudSystem.device_types = cloudSystem.Load_Device_Type();
        cloudSystem.devices = cloudSystem.Load_Device_Catalog();
        cloudSystem.device_menu1().setVisible(false);
        cloudSystem.device_menu2().setVisible(false);
        cloudSystem.device_menu1.getTable1().setModel(cloudSystem.LoadTableModel1_Device(cloudSystem.device_types));
        cloudSystem.device_menu1.getTable1().getSelectionModel().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        cloudSystem.device_menu2.getTable1().setModel(cloudSystem.LoadTableModel2_Device(cloudSystem.devices));
        cloudSystem.device_menu2.getTable1().getSelectionModel().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        //系统管理员登录之后的主菜单
        cloudSystem.system_menu().setVisible(false);
        //注册界面signIn
        cloudSystem.signIn.setVisible(false);

        //登录界面logIn
        cloudSystem.logIn.setVisible(true);
    }
    public Catalog<Account> Load_Account_Catalog() throws IOException {
        Gson gson = new Gson();
        Catalog<Account> accounts = new Catalog<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/java/Program/Account_Information.json"))) {
            StringBuilder jsonBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonBuilder.append(line);
                if (line.trim().endsWith("}")) {
                    String json = jsonBuilder.toString();
                    if (json.contains("System_Account")) {
                        System_Account systemAccount = gson.fromJson(json, System_Account.class);
                        accounts.add(systemAccount);
                    } else {
                        Cloud_Account cloudAccount = gson.fromJson(json, Cloud_Account.class);
                        accounts.add(cloudAccount);
                    }
                    jsonBuilder.setLength(0);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return accounts;
    }//加载账号目录
    public Catalog<Device> Load_Device_Catalog() throws IOException {
    Gson gson = new Gson();
    Catalog<Device> devices = new Catalog<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/java/Program/Device_Information.json"))) {
        StringBuilder jsonBuilder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            jsonBuilder.append(line);
            if (line.trim().endsWith("}")) {
                String json = jsonBuilder.toString();
                Device device = gson.fromJson(json, Device.class);
                devices.add(device);
                jsonBuilder.setLength(0);
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

        return devices;
}//加载设备目录
    public Catalog<String> Load_Device_Type() {
        Gson gson = new Gson();
        Catalog<String> device_types = new Catalog<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/java/Program/Device_Type_Information.json"))) {
            StringBuilder jsonBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonBuilder.append(line);
                String json = jsonBuilder.toString();
                String device_type = gson.fromJson(json, String.class);
                device_types.add(device_type);
                jsonBuilder.setLength(0);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return device_types;
    }//加载设备类型目录
    public Catalog<Product> Load_Product_Catalog() {
        Gson gson = new Gson();
        Catalog<Product> products = new Catalog<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/java/Program/Product_Information.json"))) {
            StringBuilder jsonBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonBuilder.append(line);
                if (line.trim().endsWith("}")) {
                    String json = jsonBuilder.toString();
                    Product product = gson.fromJson(json, Product.class);
                    products.add(product);
                    jsonBuilder.setLength(0);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return products;
    }//加载产品目录
    public Catalog<String> Load_Product_Type() {
        Gson gson = new Gson();
        Catalog<String> product_types = new Catalog<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/java/Program/Product_Type_Information.json"))) {
            StringBuilder jsonBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonBuilder.append(line);
                String json = jsonBuilder.toString();
                String product_type = gson.fromJson(json, String.class);
                product_types.add(product_type);
                jsonBuilder.setLength(0);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return product_types;
    }//加载产品类型目录
    public void Write_Account_Catalog(Catalog<Account> CAs) throws FileNotFoundException {
        Gson gson = new Gson();
        PrintWriter pw = new PrintWriter("src/main/java/Program/Account_Information.json");
        for (Account account : CAs.getList()) {
            String json = gson.toJson(account);
            pw.println(json);
        }
        pw.close();
    }//写入账号目录
    public void Write_Device_Catalog(Catalog<Device> Devices) throws FileNotFoundException {
        Gson gson = new Gson();
        PrintWriter pw = new PrintWriter("src/main/java/Program/Device_Information.json");
        for (Device device : Devices.getList()) {
            String json = gson.toJson(device);
            pw.println(json);
        }
        pw.close();
    }//写入设备目录
    public void Write_Device_Type(Catalog<String> Device_Types) throws FileNotFoundException {
        Gson gson = new Gson();
        PrintWriter pw = new PrintWriter("src/main/java/Program/Device_Type_Information.json");
        for (String device_type : Device_Types.getList()) {
            String json = gson.toJson(device_type);
            pw.println(json);
        }
        pw.close();
    }//写入设备类型
    public void Write_Product_Catalog(Catalog<Product> Products) throws FileNotFoundException {
        Gson gson = new Gson();
        PrintWriter pw = new PrintWriter("src/main/java/Program/Product_Information.json");
        for (Product product : Products.getList()) {
            String json = gson.toJson(product);
            pw.println(json);
        }
        pw.close();
    }//写入产品目录
    public void Write_Product_Type(Catalog<String> Product_Types) throws FileNotFoundException {
        Gson gson = new Gson();
        PrintWriter pw = new PrintWriter("src/main/java/Program/Product_Type_Information.json");
        for (String product_type : Product_Types.getList()) {
            String json = gson.toJson(product_type);
            pw.println(json);
        }
        pw.close();
    }//写入产品类型
    public DefaultTableModel LoadTableModel_Account(Catalog<Account> CAs) {
        DefaultTableModel model = new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                        " ", "ID", "\u767b\u9646\u8d26\u53f7", "\u59d3\u540d", "\u8054\u7cfb\u65b9\u5f0f", "\u767b\u9646\u65b9\u5f0f"
                }
        ){
            final Class<?>[] columnTypes = new Class<?>[] {
                    Boolean.class, Object.class, Object.class, Object.class, Object.class, Object.class
            };
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
        };
        for (int i = 0; i < CAs.getLengthOfList(); i++) {
            String Login_Way;
            if(CAs.get(i) instanceof System_Account){
                Login_Way = "管理员";
            }else{
                Login_Way = "云工厂";
                Object[] row = {false, i+1, CAs.get(i).getAccount_Number(), CAs.get(i).getName(), CAs.get(i).getContact_Way(),Login_Way};
                model.addRow(row);
            }
        }
        return model;
    }//加载用户管理界面的表格
    public DefaultTableModel LoadTableModel1_Device(Catalog<String> Device_Types) {
        DefaultTableModel model = new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                        " ", "ID", "\u7c7b\u522b\u540d\u79f0"
                }
        ) {
            final Class<?>[] columnTypes = new Class<?>[] {
                    Boolean.class, Object.class, Object.class
            };
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
        };
        for (int i = 0; i < Device_Types.getLengthOfList(); i++) {
            Object[] row = {false, i+1, Device_Types.get(i)};
            model.addRow(row);
        }
        return model;
    }//加载设备管理界面的表格
    public DefaultTableModel LoadTableModel2_Device(Catalog<Device> Devices) {
        DefaultTableModel model = new DefaultTableModel(
                new Object[][] {
                        //{null, null, null, "", null, null, null, "", null, null},
                },
                new String[] {
                        " ", " ID", "\u8bbe\u5907\u540d\u79f0", "\u8bbe\u5907\u7f16\u53f7", "\u8bbe\u5907\u7c7b\u522b", "\u8bbe\u5907\u89c4\u683c", "\u8bbe\u5907\u72b6\u6001", "\u8bbe\u5907\u63cf\u8ff0", "\u79df\u7528\u72b6\u6001", "\u6240\u5c5e\u5de5\u5382"
                }
        ) {
            final Class<?>[] columnTypes = new Class<?>[] {
                    Boolean.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class
            };
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
        };
        for (int j = 0; j < Devices.getLengthOfList(); j++) {
            String factory_name = "";
            if(Devices.get(j).getFactories() != null){
                for (int k = 0;k < Devices.get(j).getFactories().size();k++){
                    factory_name = Devices.get(j).getFactories().get(k);
                }
            }else{
                factory_name = "";
            }
            Object[] row = {false, j+1, Devices.get(j).getName(), Devices.get(j).getNumber(), Devices.get(j).getType(), Devices.get(j).getSpecification(),Devices.get(j).getState(), Devices.get(j).getDescription(), Devices.get(j).getRentState(), factory_name};
            model.addRow(row);
        }
        return model;
    }//加载设备管理界面的表格
    public DefaultTableModel LoadTableModel_Factory(Catalog<Account> CAs) {

        DefaultTableModel model = new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                        " ", "ID", "\u5de5\u5382\u540d\u79f0", "\u5de5\u5382\u7b80\u6d01", "\u8d1f\u8d23\u4eba", "\u8054\u7cfb\u65b9\u5f0f", "\u767b\u5f55\u8d26\u53f7", "\u5de5\u5382\u72b6\u6001"
                }
        ) {
            final Class<?>[] columnTypes = new Class<?>[] {
                    Boolean.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class
            };
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
        };
        for (int i = 0; i < CAs.getLengthOfList(); i++) {

            if(CAs.get(i) instanceof System_Account){
                System.out.println("OK");
            }else{
                Cloud_Account cloud_account = (Cloud_Account) CAs.get(i);
                Object[] row = {false, i+1, cloud_account.getFactory().getName(), cloud_account.getFactory().getIntroduce(), cloud_account.getName(), cloud_account.getContact_Way(), cloud_account.getAccount_Number(), cloud_account.getFactory().getState()};
                model.addRow(row);
            }
        }
        return model;
    }//加载工厂管理界面2的表格
    public DefaultTableModel LoadTableModel1_Product(Catalog<String> Product_Types) {
        DefaultTableModel model = new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                        " ", "ID", "\u7c7b\u522b\u540d\u79f0"
                }
        ) {
            final Class<?>[] columnTypes = new Class<?>[] {
                    Boolean.class, Object.class, Object.class
            };
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }

        };
        for (int i = 0; i < Product_Types.getLengthOfList(); i++) {
            Object[] row = {false, i+1, Product_Types.get(i)};
            model.addRow(row);
        }
        return model;
    }//加载产品类型管理界面1的表格
    public DefaultTableModel LoadTableModel2_Product(Catalog<Product> Products) {
        DefaultTableModel model = new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                        " ", "ID", "\u4ea7\u54c1\u7f16\u53f7", "\u4ea7\u54c1\u540d\u79f0", "\u4ea7\u54c1\u7c7b\u522b", "\u4ea7\u54c1\u89c4\u683c", "\u4ea7\u54c1\u63cf\u8ff0"
                }
        ) {
            final Class<?>[] columnTypes = new Class<?>[] {
                    Boolean.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class
            };
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
        };
        for (int i = 0; i < Products.getLengthOfList(); i++) {
            Object[] row = {false, i+1, Products.get(i).getNumber(), Products.get(i).getName(), Products.get(i).getType(), Products.get(i).getSpecification(), Products.get(i).getDescription()};
            model.addRow(row);
        }
        return model;
    }//加载产品管理界面2的表格
    public DefaultTableModel LoadTableModel_Normal(Catalog<Device> Devices){
        DefaultTableModel model = new DefaultTableModel(
                new Object[][] {
                        //{null, null, null, null, null, null, null, null, null, null},
                },
                new String[] {
                        " ", "ID", "\u8bbe\u5907\u540d\u79f0", "\u8bbe\u5907\u7f16\u53f7", "\u8bbe\u5907\u7c7b\u522b", "\u8bbe\u5907\u89c4\u683c", "\u8bbe\u5907\u72b6\u6001", "\u8bbe\u5907\u63cf\u8ff0", "\u79df\u7528\u72b6\u6001", "\u6240\u5c5e\u5de5\u5382"
                }
        ) {
            final Class<?>[] columnTypes = new Class<?>[] {
                    Boolean.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class
            };
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
        };
        for (int j = 0; j < Devices.getLengthOfList(); j++) {
            String factory_name = "";
            if(Devices.get(j).getFactories() != null){
                for (int k = 0;k < Devices.get(j).getFactories().size();k++){
                    factory_name = Devices.get(j).getFactories().get(k);
                }
            }else{
                factory_name = "";
            }
            if(factory_name.contains(current_account.getFactory().getName())){
                Object[] row = {false, j+1, Devices.get(j).getName(), Devices.get(j).getNumber(), Devices.get(j).getType(),
                        Devices.get(j).getSpecification(),Devices.get(j).getState(),
                        Devices.get(j).getDescription(), Devices.get(j).getRentState(), factory_name};
                model.addRow(row);
            }
        }
        return model;
    }
    public DefaultTableModel LoadTableModel_Rent(Catalog<Device> Devices) {
        DefaultTableModel model = new DefaultTableModel(
                new Object[][] {
                        //{null, null, null, null, null, null, null, null, null, null},
                },
                new String[] {
                        " ", "ID", "\u8bbe\u5907\u540d\u79f0", "\u8bbe\u5907\u7f16\u53f7", "\u8bbe\u5907\u7c7b\u522b", "\u8bbe\u5907\u89c4\u683c", "\u8bbe\u5907\u72b6\u6001", "\u8bbe\u5907\u63cf\u8ff0", "\u79df\u7528\u72b6\u6001", "\u6240\u5c5e\u5de5\u5382"
                }
        ) {
            final Class<?>[] columnTypes = new Class<?>[] {
                    Boolean.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class
            };
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
        };
        for (int j = 0; j < Devices.getLengthOfList(); j++) {
            String factory_name = "";
            if(Devices.get(j).getFactories() != null){
                for (int k = 0;k < Devices.get(j).getFactories().size();k++){
                    factory_name = Devices.get(j).getFactories().get(k);
                }
            }else{
                factory_name = "";
            }
            if(factory_name.equals("")){
                Object[] row = {false, j+1, Devices.get(j).getName(), Devices.get(j).getNumber(), Devices.get(j).getType(),
                        Devices.get(j).getSpecification(),Devices.get(j).getState(),
                        Devices.get(j).getDescription(), Devices.get(j).getRentState(), factory_name};
                model.addRow(row);
            }
        }
        return model;
    }
    public Main_Menu main_menu(){
        return this.main_menu;
    }
    public Accounts_Menu accounts_menu(){
        return this.accounts_menu;
    }
    public Factory_Menu factory_menu(){
        return this.factory_menu;
    }
    public Device_Menu1 device_menu1(){
        return this.device_menu1;
    }
    public Device_Menu2 device_menu2(){
        return this.device_menu2;
    }
    public Product_Menu1 product_menu1(){
        return this.product_menu1;
    }
    public Product_Menu2 product_menu2(){
        return this.product_menu2;
    }
    public Add_Device add_device(){
        return this.add_device;
    }
    public Add_Device1 add_device1(){
        return this.add_device1;
    }
    public Add_Product add_product(){
        return this.add_product;
    }
    public Normal_Menu normal_menu(){
        return this.normal_menu;
    }
    public Catalog<Account> getCAs() {
        return CAs;
    }
    public Cloud_Account getCurrent_account() {
        return current_account;
    }
    public void setCurrent_account(Cloud_Account current_account) {
        this.current_account = current_account;
    }
    public Catalog<Device> getDevices() {
        return devices;
    }
    public void setDevices(Catalog<Device> devices) {
        this.devices = devices;
    }
    public Catalog<String> getDevice_types() {
        return device_types;
    }
    public Catalog<Product> getProducts() {
        return products;
    }
    public Catalog<String> getProduct_Types() {
        return Product_types;
    }
    public LogIn logIn(){
        return this.logIn;
    }
    public SignIn signIn(){
        return this.signIn;
    }
    public Menu system_menu(){
        return this.system_menu;
    }
    public static CloudSystem getCloudSystem(){
        return cloudSystem;
    }
//    public static String setProduct_Number(){
//
//
//    }

}
