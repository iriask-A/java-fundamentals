package lab1;

import java.util.Vector;
enum Gender{Boy,Girl}
class Person{
    private Gender gender;

    public Person(Gender gender){
        this.gender = gender;
    }
    public Gender getGender(){
        return gender;
    }
    @Override
    public String toString(){
        return gender == Gender.Boy ? "B":"G";
    }

}
public class DragonLaunch{
    private Vector<Person> victims;
    public DragonLaunch(){
        this.victims = new Vector<>();
    }
    public void kidnap(Person p){
        victims.add(p);
    }
    public Boolean willDragonEatOrNot(){
        int boysWithoutPair = 0;
        int girlsWithoutPair = 0;
        for(int i = 0;i<victims.size();i++){
            Person p = victims.get(i);
            if(p.getGender() == Gender.Boy){
                boysWithoutPair++;
            }else{
                if(boysWithoutPair>0){
                    boysWithoutPair--;
                }else{
                    girlsWithoutPair++;
            }
        }
    }
    return girlsWithoutPair+boysWithoutPair > 0;
}
public static void main(String args[]){
    DragonLaunch launch = new DragonLaunch();
    launch.kidnap(new Person(Gender.Boy));
    launch.kidnap(new Person(Gender.Girl));
    launch.kidnap(new Person(Gender.Boy));
    if(launch.willDragonEatOrNot()){System.out.println("The dragon will eat");}
        else{System.out.println("The dragon will not eat");}
}
}