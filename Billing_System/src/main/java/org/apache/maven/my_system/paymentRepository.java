package org.apache.maven.my_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class paymentRepository {
	 Connection con = null;

	    public  paymentRepository () {

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
	    
	    //insert payment details
	    public void add(Payment payment){
	        String sql = "insert into payment (?,?,?,?,?) ";
	        try {
	            PreparedStatement st = con.prepareStatement(sql);
	            st.setInt(1,payment.getCard_no());
	            st.setString(2,payment.getCard_type());
	            st.setInt(3,payment.getExpiry());
	            st.setInt(4,payment.getCvc());
	            
	            st.executeUpdate();
	        }catch (Exception e){
	            System.out.println(e);
	        }
	      }
	    
	    //update card details
	    public void update(Payment payment){
	        String sql = "update card set card_type=?,cvc=?,expiry=?,card_no=?, where cid=?";
	        try {
	            PreparedStatement st = con.prepareStatement(sql);
	            st.setInt(1,payment.getCard_no());
	            st.setString(2,payment.getCard_type());
	            st.setInt(3,payment.getExpiry());
	            st.setInt(4,payment.getCvc());
	            
	            st.executeUpdate();
	        }catch (Exception e){
	            System.out.println(e);
	        }
	      }
	    
	    //delete saved card details
	    public void delete(int card_no) {
	    	String sql = "delete from payment where card_no=?";
	    	try {
	            PreparedStatement st = con.prepareStatement(sql);
	            st.setInt(1,card_no);
	             st.executeUpdate();
	        }catch (Exception e){
	            System.out.println(e);
	        }
	    	
	    }
	    
	    

}
