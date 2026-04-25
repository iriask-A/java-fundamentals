package practice2;

class Time{
 private int hour;
 private int minute;
 private int second;
 
 public Time(int hour,int minute,int second) {
  setTime(hour,minute,second);
 }
 public void setTime(int hour,int minute,int second) {
  if(hour < 0|| hour > 23)throw new Error ("Hour must be 0-23");
  if( minute < 0|| minute > 59) throw new Error("Minute must be 0-59");
  if( second < 0 || second > 59) throw new Error("Second must be 0-59");
  
  this.hour=hour;
  this.minute=minute;
  this.second=second;
 }
 public String toUniversal() {
  return String.format("%02d:%02d:%02d",hour,minute,second);
 }
 public String toStandard() {
  int displayHour = hour % 12;
  String ampm;
  if(displayHour==0) displayHour= 12;
  if (hour < 12) {
        ampm = "AM";
    } else {
        ampm = "PM";
    }
  return String.format("%02d:%02d:%02d %s",displayHour,minute,second,ampm);
 }
 public void add(Time t2) {
  this.second+= t2.second;
  this.minute +=t2.minute+ this.second/60;
  this.second= this.second%60;  
  this.hour+= t2.hour + this.minute/60;
  this.minute = this.minute % 60;
  this.hour = this.hour % 24;
  
 }
}

public class task3 {

 public static void main(String[] args) {
        Time t1 = new Time(13, 5, 6);
        Time t2 = new Time(4, 24, 33);

        System.out.println(t1.toUniversal()); 
        System.out.println(t1.toStandard());  

        t1.add(t2); 
        System.out.println(t1.toUniversal()); 
        System.out.println(t1.toStandard()); 
    }

}