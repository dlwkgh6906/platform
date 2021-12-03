import java.util.Objects;

public class Beverage {
    private final String type;
    private final String name;

    public Beverage(String n ,String t) {
        type= t;
        name = n;
    }

    public String getBeverageName(){
        return name;

    }
    public String getType(){
        return type;

    }
    public String toString(){
        return String.format("["+name+", "+type+"]\n");
    }


    public boolean equals(Object o) {
        if ( ! ( o instanceof Beverage ) ) return false ;
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Beverage other = (Beverage) o;
        return Objects.equals(name, other.name)
                && Objects.equals(type, other.type);
    }
    //Your code here

    public int hashCode() {
        int result = 1;
        result = 31 * result + name.hashCode();
        result = 31 * result + type.hashCode();
        return result;
    }
}
