package ObserverPattern;

import ObserverPattern.impl.KitchenDisplay;
import ObserverPattern.impl.PhoneDisplay;
import ObserverPattern.impl.WeatherStation;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        PhoneDisplay phoneDisplay = new PhoneDisplay(station);
        KitchenDisplay kitchenDisplay = new KitchenDisplay(station);

        station.addObserver(phoneDisplay);
        station.addObserver(kitchenDisplay);

        station.setTemperature(35);
        station.setTemperature(45);

        station.removeObserver(phoneDisplay);

        station.setTemperature(55);
    }
}
