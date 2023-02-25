package shahriar.FACTORY;

import shahriar.DROID.R3;
import shahriar.DROID.AstromechDroid;
import shahriar.DROID.R4;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import shahriar.DB_SUPPORT.DBConnect;

public class R4Factory extends DroidFactory {

    public R4Factory(String factoryID) {
        super(factoryID);
        this.setDroidStorage(new ArrayList<>());
    }
    
    public void buildStoreDroids(int count) throws SQLException, ClassNotFoundException{
        this.buildDroids(count);
        DBConnect DB = new DBConnect("Astromech", "3306", "root", "admin");
        Connection C = DB.getConnection();
        DB.executeUseQuery(C);
        
        for(AstromechDroid d: this.getDroidStorage()){
            String D = ((R3)d).dataString();
            String Q = "INSERT INTO Droids VALUES";
            String query = Q+D;
            DB.executeInsertQuery(query, C);
        }
        System.out.println(count + " R3 Droids built and stored");
        C.close();
    }
    
    public ArrayList<R3> retrieveBuildDroids() throws SQLException, ClassNotFoundException {
        ArrayList<R3> d = new ArrayList<>();
        DBConnect DB = new DBConnect("astromech", "3306", "root", "admin");
        Connection C = DB.getConnection();
        DB.executeUseQuery(C);
        String query = "SELECT * FROM droids WHERE DType = 'R3';";
        return null;
    }
    
    @Override
    public boolean buildDroids(int count) {
       for(int i = 0; i < count; i++){
           R4 dr4 = new R4("R4-00" + i);
           this.getDroidStorage().add(dr4);
       }
       return true;
    }

    @Override
    public void displayAllDroids() {
       for(AstromechDroid d : this.getDroidStorage()){
           d.displayDroid();           
       }
    }
}
