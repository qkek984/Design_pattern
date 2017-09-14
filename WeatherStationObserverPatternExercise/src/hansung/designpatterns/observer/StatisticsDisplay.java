package hansung.designpatterns.observer;

public class StatisticsDisplay implements Observer, DisplayElement {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	private WeatherData weatherData;

	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temp, float humidity, float pressure) {
		tempSum += temp;
		numReadings++;

		if (temp > maxTemp) {
			maxTemp = temp;
		}
 
		if (temp < minTemp) {
			minTemp = temp;
		}

		display();
	}
	@Override
	public void update(Subject sub) {
		if (sub instanceof WeatherData){
			WeatherData  weatherData = (WeatherData)sub;

			this.tempSum += weatherData.getTemperature();
			numReadings++;
			if (weatherData.getTemperature() > maxTemp) {
				maxTemp = weatherData.getTemperature();
			}
			display();
		}
	}
	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
	}
}
