import java.util.ArrayList;
import java.util.List;
import java.sql.*;

import static java.lang.Class.forName;

public class LocalSubRepo {

    Connection con = null;

    public  LocalSubRepo () {

        String url = "jdbc:mysql://localhost:3306/powerDistributed";
        String username = "root";
        String password = "rst131";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

        //to get the representation from the database
        public List<LocalSubstation>getlocalStations()
    {
            List<LocalSubstation> localSubstationList = new ArrayList<>();
            String sql = "select * from localSubstation";
            try {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    LocalSubstation los = new LocalSubstation();
                    los.setId(rs.getInt(1));
                    los.setSubstaionCode(rs.getString(2));
                    los.setActive(rs.getString(3));
                    los.setActiveFrom(rs.getString(4));
                    los.setActiveTo(rs.getString(5));

                    localSubstationList.add(los);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            return localSubstationList;
        }


        // insert into the database

       public void insertLocalSubStation(LocalSubstation localSubstation){
         String sql = "insert into localSubstation values (?,?,?,?,?) ";
         try {
             PreparedStatement st = con.prepareStatement(sql);
             st.setInt(1,localSubstation.getId());
             st.setString(2,localSubstation.getSubstaionCode());
             st.setString(3,localSubstation.getActive());
             st.setString(4,localSubstation.getActiveFrom());
             st.setString(5,localSubstation.getActiveTo());
         }catch (Exception e){
             System.out.println(e);
         }
       }

       //update the representation
    public void updateLocalSubstation(LocalSubstation localSubstation){
        String sql = "update localSubstation set id=?,substaionCode=?,active=?,activeFrom=?,activeTo=? ";
        try {
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1,localSubstation.getId());
            st.setString(2,localSubstation.getSubstaionCode());
            st.setString(3,localSubstation.getActive());
            st.setString(4,localSubstation.getActiveFrom());
            st.setString(5,localSubstation.getActiveTo());
        }catch (Exception e){
            System.out.println(e);
        }
    }

    //delete method
    public void deleteLocalSub(int id) {

        String sql = "delete from localSubstation where id = ?";
        try {
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, id);
            st.executeUpdate();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}