package Tests;

import java.util.HashSet;
import java.util.Set;

class X{
    private int x;
    public X(int x){this.x = x;}
    public int hashCode(){
        return 2;
    }

    public static void main(String[] args) {
        X obj1 = new X(1); X obj2 = new X(1);
        Set<X> set = new HashSet<X>();
        set.add(obj1);
        set.add(obj2);
        System.out.println(set.size());
    }
}
