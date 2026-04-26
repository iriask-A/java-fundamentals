package lab1;

public class Temperature{
    private double temperature;
    private char scale;
    public Temperature(){
        this.temperature = 0;
        this.scale = 'C';
    }
    public Temperature(double temperature){
        this.temperature = temperature;
        this.scale = 'C';
    }
    public Temperature(char scale){
        this.temperature = 0;
        this.scale = scale;
    }
    public Temperature(double temperature, char scale){
        this.temperature = temperature;
        this.scale = scale;
    }
    public double tempC(){
        if(this.scale =='C'){
            return this.temperature;
        }
        return 5*(this.temperature-32)/9;
    }
    public double tempF(){
        if(this.scale == 'F'){
            return this.temperature;
        }
        return 9*(this.temperature/5)+32;
    }
    public void setTemp(double temperature){
        this.temperature = temperature;
    }
    public void setScale(char scale){
        this.scale = scale;
    }
    public void setTempScale(double temperature,char scale){
        this.temperature = temperature;
        this.scale = scale;
    }
    public char returnScale(){
        return this.scale;
    }
    public static void main(String args[]){
        Temperature temp = new Temperature(55);
        System.out.println("Temperature in Celsius: " + temp.tempC());
        System.out.println("Temperature in Fahrenheit: " + temp.tempF());
        System.out.println("Scale: " + temp.returnScale());
        temp.setScale('F');
        System.out.println("Scale after change: " + temp.returnScale());
    }
}
