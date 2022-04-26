import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JunctureRepo {
	Connection con = null;

    public  JunctureRepo () {

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
        public List<Juncture>getjuncture()
    {
            List<Juncture> junctureList = new ArrayList<>();
            String sql = "select * from juncture";
            try {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                	Juncture los = new Juncture();
                	los.setJuncId(rs.getInt(1));
                	los.setPlantId(rs.getInt(2));
                    los.setTransSubId(rs.getInt(3));
                    los.setLineId(rs.getInt(4));
                    los.setActive(rs.getString(5));
                    los.setActiveFrom(rs.getString(6));
                    los.setActiveTo(rs.getString(7));

                    junctureList.add(los);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            return junctureList;
        }


        // insert into the database

       public void insertLocal(Juncture juncture){
         String sql = "insert into juncture values (?,?,?,?,?,?,?) ";
         try {
             PreparedStatement st = con.prepareStatement(sql);
             st.setInt(1,juncture.getJuncId());
             st.setInt(2,juncture.getPlantId());
             st.setInt(3,juncture.getTransSubId());
             st.setInt(4,juncture.getLineId());
             st.setString(5,juncture.getActive());
             st.setString(6,juncture.getActiveFrom());
             st.setString(7,juncture.getActiveTo());
         }catch (Exception e){
             System.out.println(e);
         }
       }

       //update the representation
    public void updatejuncture(Juncture juncture){
        String sql = "update transmission set juncId=?,plantId=?,transSubId=?,lineId=?,active=?,activeFrom=?,activeTo=? ";
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1,juncture.getJuncId());
            st.setInt(2,juncture.getPlantId());
            st.setInt(3,juncture.getTransSubId());
            st.setInt(4,juncture.getLineId());
            st.setString(5,juncture.getActive());
            st.setString(6,juncture.getActiveFrom());
            st.setString(7,juncture.getActiveTo());
        }catch (Exception e){
            System.out.println(e);
        }
    }

    //delete method
    public void deleteTransmissions(int juncId) {

        String sql = "delete from juncture where juncId = ?";
        try {
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, juncId);
            st.executeUpdate();

        }catch (Exception e){
            System.out.println(e);
        }
    }

}
