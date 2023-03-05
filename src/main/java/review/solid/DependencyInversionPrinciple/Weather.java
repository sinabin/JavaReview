package review.solid.DependencyInversionPrinciple;

public class Weather {
    private WeatherService weatherService; // Weather 클래스를 WeatherService 라는 인터페이스에 의존하도록 변경하여
                                          // 추후 Weather 클래스가 변경되더라도 WeatherTracker 클래스는 생성자를 통해
                                         // Weather 객체를 주입받기 때문에 수정이 일어나지 않는다.
                                        // 따라서 코드 유지보수성과 재사용성이 증가하게 된다.
    private int temperature;
    private int humidity;

    public Weather(WeatherService weatherService){
        this.weatherService = weatherService;
    }

    public int getTemperature(){
        return temperature;
    }

}
