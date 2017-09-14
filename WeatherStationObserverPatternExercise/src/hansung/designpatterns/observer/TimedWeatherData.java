package hansung.designpatterns.observer;

import java.util.Date;

public class TimedWeatherData extends WeatherData {
    private String measuredTime= new Date().toString();;
    @Override
    public void setMeasurements(float temperature, float humidity, float pressure) {
        super.setMeasurements(temperature, humidity, pressure);
        this.measuredTime= new Date().toString();
    }
    public String getMeasuredTime() {
        return measuredTime;
    }

}
