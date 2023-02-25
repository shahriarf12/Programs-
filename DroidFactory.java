package shahriar.FACTORY;

import shahriar.INTERFACES.Displayable;
import java.util.ArrayList;
import shahriar.DROID.AstromechDroid;


public abstract class DroidFactory implements Displayable{
    
    private String factoryID;
    private ArrayList<AstromechDroid> droidStorage; 

    public DroidFactory(String factoryID) {
        this.factoryID = factoryID;
    }

    public String getFactoryID() {
        return factoryID;
    }

    public void setFactoryID(String factoryID) {
        this.factoryID = factoryID;
    }

    public ArrayList<AstromechDroid> getDroidStorage() {
        return droidStorage;
    }

    public void setDroidStorage(ArrayList<AstromechDroid> droidStorage) {
        this.droidStorage = droidStorage;
    }
    
    public abstract boolean buildDroids(int count);  
}
