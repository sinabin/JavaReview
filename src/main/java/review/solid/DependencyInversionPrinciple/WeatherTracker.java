package review.solid.DependencyInversionPrinciple;

public class WeatherTracker {

    private Weather currentWeather;

    public WeatherTracker(Weather weather){ //Weather 클래스를 생성자를 통해서 주입받게 되므로 추후 Weather 클래스가 변경되더라도 문제없음.
        currentWeather = weather;
    }

    public void setCurrentWeather(Weather weather){
        currentWeather = weather;
    }

    public int getTremperature(){
        return currentWeather.getTemperature();
    }
}
