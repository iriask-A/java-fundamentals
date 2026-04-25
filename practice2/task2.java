package practice2;

class starTriangle{
    private int size;
    starTriangle(int size){
        this.size = size;
    }
    public String toString(){
        String result = "";
        for(int i =1;i<=size;i++){
            for(int j =1;j<=i;j++){
                result+="[*]";
            }
            result+="\n";
        }
        return result;
    }
}
public class task2{
    public static void main(String args[]){
        starTriangle trian =new starTriangle(3);
        System.out.println(trian.toString());
    }
}