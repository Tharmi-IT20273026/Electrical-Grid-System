package org.apache.maven.my_system;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

import static java.lang.Class.forName;

public class customerRepository {

    Connection con = null;

    public  customerRepository () {

        String url = "jdbc:mysql://localhost:3306/billing_system";
        String username = "sajitha";
        String password = "root";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    //to get the representation from the database
    public List<Customer>getCustomer()
{
        List<Customer> customerList = new ArrayList<>();
        String sql = "select * from customer";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Customer customer1 = new Customer();
                customer1.setCid(rs.getInt(1));
                customer1.setName(rs.getString(2));
                customer1.setPhone(rs.getInt(3));
                customer1.setCatergory(rs.getString(4));
                customer1.setAddress(rs.getString(5));

                customerList.add(customer1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return customerList;
    }
    
    //find by customer using id
    public Customer getCustomer(int id) {
    String sql = "select * from customer where id="+id;
    Customer customer1 = new Customer();
    try {
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        if (rs.next()) {
           
            customer1.setCid(rs.getInt(1));
            customer1.setName(rs.getString(2));
            customer1.setPhone(rs.getInt(3));
            customer1.setCatergory(rs.getString(4));
            customer1.setAddress(rs.getString(5));
        }
    } catch (Exception e) {
        System.out.println(e);
    }
       return customer1;
    }
    

    // insert into the database(customer table)

   public void create(Customer customer){
     String sql = "insert into customer values (?,?,?,?,?) ";
     try {
         PreparedStatement st = con.prepareStatement(sql);
         st.setInt(1,customer.getCid());
         st.setString(2,customer.getName());
         st.setInt(3,customer.getPhone());
         st.setString(4,customer.getCatergory());
         st.setString(5,customer.getAddress());
         st.executeUpdate();
     }catch (Exception e){
         System.out.println(e);
     }
   }
   
 
  
   
  

}