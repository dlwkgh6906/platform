public class GenericList <T>{
    private  static final int DEFAULT_SIZE = 10;
    private Object[] data;
    private int size = 0;

    public GenericList(int a){};
    public GenericList() {

        if(DEFAULT_SIZE>0)
            this.data=new Object[DEFAULT_SIZE];
        // your code here
    }

    public int getSize(){
        return size;
    }
    public void put( T newBeverage) {
        this.data[size++]=newBeverage;
    }

    public void clear() {
        for(int i =0; i<DEFAULT_SIZE;i++)
            this.data[i]=null;
        size=0;
    }

    public T get(int i) {
        return (T) data[i];
    }
}
