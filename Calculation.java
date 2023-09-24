class Calculation extends TempConverter{

    public Calculation(double temp){
        super.setCelsius(temp);
        super.setFahrenheit(temp);
        super.setKelvin(temp);
    }

    public void findCtoF(){
        double temp = super.getCelsius() * ((double) 9/5) + 32;
        int answer = (int) temp;
        System.out.print(temp + "° Fahrenheit");
    }
    public void findCtoK(){
        double temp = super.getCelsius() + 273.15;
        int answer = (int) temp;
        System.out.print(temp + "° Kelvin");
    }
    public void findFtoC(){
        double temp = (super.getFahrenheit() - 32) * (double) 5/9;
        int answer = (int) temp;
        System.out.print(temp + "° Degree Celsius");
    }
    public void findFtoK(){
        double temp = (super.getFahrenheit() - 32) * (double) 5/9 + 273.15;
        int answer = (int) temp;
        System.out.print(temp + "° Kelvin");
    }
    public void findKtoC(){
        double temp = super.getKelvin() - 273.15;
        int answer = (int) temp;
        System.out.print(temp + "° Degree Celsius");
    }
    public void findKtoF(){
        double temp = (super.getKelvin() - 273.15) * (double) 9/5 + 32;
        int answer = (int) temp;
        System.out.print(temp + "° Fahrenheit");
    }

}
