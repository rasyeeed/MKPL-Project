package mkplproject;

/**
 * Convert
 */
public class Convert {
    private double celciusValue;

    public double getCelciusValue(){
        return celciusValue;
    }

    public Convert(int celciusValue){
        this.celciusValue = celciusValue;
    }

    public double toKelvin(){
        double celcius = celciusValue;
        return celcius += 273.15;
    }

    public double toKelvin1(){
        double celcius = celciusValue;
        return celcius += 273.15;
    }

    public double toKelvin2(){
        double celcius = celciusValue;
        return celcius += 273.15;
    }

     public double toKelvin3(){
        double celcius = celciusValue;
        return celcius += 273.15;
    }

     public double toKelvin4(){
        double celcius = celciusValue;
        return celcius += 273.15;
    }

     public double toKelvin5(){
        double celcius = celciusValue;
        return celcius += 273.15;
    }

    public double toFahrenheit(){
        double celcius = celciusValue;
        return celcius * (9/5) + 32;
    }
}
