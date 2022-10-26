public class Drink {

    String color;
    double alcohol;
    String flavor;
    int volume = 100;
    double ca;
    String brand;
    int pressure;

    public Drink(String color, double alcohol, String flavor, int volume, double ca, String brand, int pressure) {
        this.color = color;
        this.alcohol = alcohol;
        this.flavor = flavor;
        this.volume = volume;
        this.ca = ca;
        this.brand = brand;
        this.pressure = pressure;
    }

    public void Shake(){
        pressure += 10;
    }

    public int Drink(int drink){
        volume = 100-drink;
        return volume;
    }

    public void Refill()
    {
        volume = 100;
    }
    public void Empty()
    {
        volume = 0;
    }
    public void Open()
    {
        pressure -= 30;

    }


}
