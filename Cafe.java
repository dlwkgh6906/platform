import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

public class Cafe {
    private final String name;
    private final HashMap<String, Beverage> menues = new HashMap<>();

    public Cafe(String starbucks) {
        name =starbucks;
    }

    public  String toString(){
        String msg = " Cafe Name: "+ name + " Beverage Count: " + menues.size()+"\n" ;
        Iterator<Beverage> values = menues.values().iterator();
        while(values.hasNext()){
            msg+= "\t"+ values.next() + "\n";

        }
    return msg;
    }


    public void addBeverage(Beverage newBeverage) {
        menues.put(newBeverage.getBeverageName(), newBeverage);
        System.out.println("");
    }

    public void removeAllBeverage() {
        menues.clear();System.out.println("");

    }

    public Beverage findBeverage(String name, String type) {

        System.out.println("");
        return  menues.get(name);
    }
    public boolean equals(Object o) {
        if ( ! ( o instanceof Cafe ) ) return false ;
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Cafe other = (Cafe) o;
        return Objects.equals(name, other.name)
                && Objects.equals(menues, other.menues);
    }
    //Your code here

    public int hashCode() {
        int result = 1;
        result = 31 * result + name.hashCode();
        result = 31 * result + menues.hashCode();
        return result;
    }
}
