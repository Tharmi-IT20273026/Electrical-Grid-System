import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TransmissionRepo {
	Connection con = null;

    public  TransmissionRepo () {

        String url = "jdbc:mysql://localhost:3306/transmission";
        String username = "root";
        String password = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

        //to get the representation from the database
        public List<Transmission>gettransmission()
    {
            List<Transmission> transmissionList = new ArrayList<>();
            String sql = "select * from transmission";
            try {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                	Transmission los = new Transmission();
                    los.setTransSubId(rs.getInt(1));
                    los.setSubstaionCode(rs.getString(2));
                    los.setActive(rs.getString(3));
                    los.setActiveFrom(rs.getString(4));
                    los.setActiveTo(rs.getString(5));

                    transmissionList.add(los);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            return transmissionList;
        }


        // insert into the database

       public void insertLocal(Transmission transmission){
         String sql = "insert into transmissionSubstation values (?,?,?,?,?) ";
         try {
             PreparedStatement st = con.prepareStatement(sql);
             st.setInt(1,transmission.getTransSubId());
             st.setString(2,transmission.getSubstaionCode());
             st.setString(3,transmission.getActive());
             st.setString(4,transmission.getActiveFrom());
             st.setString(5,transmission.getActiveTo());
         }catch (Exception e){
             System.out.println(e);
         }
       }

       //update the representation
    public void updatetransmission(Transmission transmission){
        String sql = "update transmission set transSubId=?,substaionCode=?,active=?,activeFrom=?,activeTo=? ";
        try {
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1,transmission.getTransSubId());
            st.setString(2,transmission.getSubstaionCode());
            st.setString(3,transmission.getActive());
            st.setString(4,transmission.getActiveFrom());
            st.setString(5,transmission.getActiveTo());
        }catch (Exception e){
            System.out.println(e);
        }
    }

    //delete method
    public void deleteTransmissions(int transSubId) {

        String sql = "delete from transmission where transSubId = ?";
        try {
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, transSubId);
            st.executeUpdate();

        }catch (Exception e){
            System.out.println(e);
        }
    }

	public void insertTransmission(Transmission los) {
		// TODO Auto-generated method stub
		
	}

	public void updateTransmission(Transmission los) {
		// TODO Auto-generated method stub
		
	}

	public void deleteTransmission(int transSubId) {
		// TODO Auto-generated method stub
		
	}


}
