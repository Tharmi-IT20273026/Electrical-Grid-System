import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DailyTransmissionRepo {
	Connection con = null;

    public  DailyTransmissionRepo () {

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
        public List<DailyTransmission>getdailytransmission()
    {
            List<DailyTransmission> dailyTransmissionList = new ArrayList<>();
            String sql = "select * from daily";
            try {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                	DailyTransmission los = new DailyTransmission();
                    los.setDaiTransId(rs.getInt(1));
                    los.setTransSubId(rs.getInt(2));
                    los.setReportDate(rs.getDate(3));
                    los.setQuantity(rs.getDouble(4));

                    dailyTransmissionList.add(los);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            return dailyTransmissionList;
        }


        // insert into the database

       public void insertLocal(DailyTransmission dailyTransmission){
         String sql = "insert into dailytransmission values (?,?,?,?) ";
         try {
             PreparedStatement st = con.prepareStatement(sql);
             st.setInt(1,dailyTransmission.getDaiTransId());
             st.setInt(2,dailyTransmission.getTransSubId());
             st.setDate(3,dailyTransmission.getReportDate());
             st.setDouble(4,dailyTransmission.getQuantity());
         }catch (Exception e){
             System.out.println(e);
         }
       }

       //update the representation
    public void updatedailyTransmission(DailyTransmission dailyTransmission){
        String sql = "update dailyTransmission set daiTransId=?,transSubId=?,reportDate=?,quantity=? ";
        try {
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1,dailyTransmission.getDaiTransId());
            st.setInt(2,dailyTransmission.getTransSubId());
            st.setDate(3,dailyTransmission.getReportDate());
            st.setDouble(4,dailyTransmission.getQuantity());
        }catch (Exception e){
            System.out.println(e);
        }
    }

    //delete method
    public void deleteDailyTransmissions(int daiTransId) {

        String sql = "delete from dailyTransmission where daiTransId = ?";
        try {
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, daiTransId);
            st.executeUpdate();

        }catch (Exception e){
            System.out.println(e);
        }
    }

	public void insertDailyTransmission(DailyTransmission los) {
		// TODO Auto-generated method stub
		
	}

	public void updateDailyTransmission(DailyTransmission los) {
		// TODO Auto-generated method stub
		
	}

	public void deleteDailyTransmission(int daiTransId) {
		// TODO Auto-generated method stub
		
	}

}
