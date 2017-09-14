package hansung.designpatterns.observer;
	
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private String measuredTime;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	public void update(Subject sub) {
		if (sub instanceof TimedWeatherData){
			TimedWeatherData  weatherData = (TimedWeatherData) sub;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			this.measuredTime = weatherData.getMeasuredTime();
			display();
		}
	}
	
	public void display() {
		System.out.println("Time : "+this.measuredTime);
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");

	}
}
