package practice;

import java.util.Objects;

enum AccessLevel{
    PUBLIC,PRIVATE,PROTECTED;
}
public class Cara {
    private String name;
    private long size;
    private AccessLevel level;
    public Cara(String name,long size){
        this.name=name;
        this.size=size;
    }
    public String getName(){
        return name;
    }
    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if (o==null||getClass()!=o.getClass()) {
            return false;
        }
        Cara obj = (Cara) o;
        return Objects.equals(name, obj.name);
    }
    @Override
    public int hashCode(){
        return Objects.hash(name);
    }


}