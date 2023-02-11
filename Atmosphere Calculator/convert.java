public class convert{
    public static double meter(double x){
        x = x*3.281;
        return x;
    }
    public static double feet(double x){
        x = x/3.281;
        return x;
    }
    public static double masstoweight(double x){
        x = x*9.81;
        return x;
    }
    public static double ms2(double x){
        x = x/3.6;
        return x;
    }
    public static double drag2newtons(double x){
        x = x*9.81;
        return x;
    }
    public static double temperaturecel(double x){
        x = 15.04 - (0.00649*x);
        return x;
    }
    public static double temperaturefah(double x){
        x = (x*9)/5+32;
        return x;
    }
    public static double pressurekpa(double x){
        x = 101.29 * Math.pow((((x + 273.1)/288.08)),5.256);
        return x;
    }
    public static double pressurepsi(double x){
        x = x*0.14504;
        return x;
    }
    public static double densitykg(double p, double t){
        double d = p / (0.2869 * (t + 273.1));
        return d;
    }
    public static double densitylb(double x){
        x = x*0.062428;
        return x;
    }
    public static double Cl(double weight,double area, double density, double velocity){
        double c = (2*weight)/(area*density*(Math.pow(velocity,2)));
        return c;
    }
    public static double Cd(double drag, double area, double density, double velocity){
        double c = (2*drag)/((area)*(density)*(Math.pow(velocity,2)));
        return c;
    }
    public static double Re(double density,double velocity,double cordlength,double fluidviscosity){
        double c = cordlength;
        double f = fluidviscosity;
        double r = (density*velocity*c)/f;
        return r;
    }
    public static double D(double Cd,double area,double density,double velocity){
        double d = (Cd*area*density*(Math.pow(velocity,2)))/2;
        return d;
    }
}