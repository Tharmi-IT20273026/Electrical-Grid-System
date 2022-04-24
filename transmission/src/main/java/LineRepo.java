import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class LineRepo {

	Connection con = null;

    public  LineRepo () {

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
        public List<Line>getline()
        {
            List<Line> lineList = new ArrayList<>();
            String sql = "select * from line";
            try {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                	Line los = new Line();
                    los.setLineId(rs.getInt(1));
                    los.setUnitId(rs.getInt(2));
                    los.setLineType(rs.getString(3));
                    los.setRangeMin(rs.getFloat(4));
                    los.setRangeMax(rs.getFloat(5));

                    lineList.add(los);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            return lineList;
        }


        // insert into the database

       public void insertline(Line line){
         String sql = "insert into line values (?,?,?,?,?) ";
         try {
             PreparedStatement st = con.prepareStatement(sql);
             st.setInt(1,line.getLineId());
             st.setInt(2,line.getUnitId());
             st.setString(3,line.getLineType());
             st.setFloat(4,line.getRangeMin());
             st.setFloat(5,line.getRangeMax());
         }catch (Exception e){
             System.out.println(e);
         }
       }

       //update the representation
    public void updateline(Line line){
        String sql = "update line set lineId=?,unitId=?,lineType=?,rangeMin=?,rangeMax=? ";
        try {
        	PreparedStatement st = con.prepareStatement(sql);

        	st.setInt(1,line.getLineId());
            st.setInt(2,line.getUnitId());
            st.setString(3,line.getLineType());
            st.setFloat(4,line.getRangeMin());
            st.setFloat(5,line.getRangeMax());
        }catch (Exception e){
            System.out.println(e);
        }
    }

    //delete method
    public void deleteLines(int lineId) {

        String sql = "delete from line where lineId = ?";
        try {
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, lineId);
            st.executeUpdate();

        }catch (Exception e){
            System.out.println(e);
        }
    }

	public void deleteLine(int lineId) {
		// TODO Auto-generated method stub
		
	}

	public void updateLine(Line los) {
		// TODO Auto-generated method stub
		
	}

	public void insertLine(Line los) {
		// TODO Auto-generated method stub
		
	}


}
