package daily.test1017.generic;

public class GenericExample3 {
    public static void main(String[] args) {
        HomeAgency homeAgency = new HomeAgency();
        Home home = homeAgency.rent();
        home.turnOnLight();

        CarAgency carAgency = new CarAgency();
        Car2 car = carAgency.rent();
        car.run();
    }
}
