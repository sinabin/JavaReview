package review.solid.DependencyInversionPrinciple;

public class OldWeatherTracker {
    private OldWeather currentWeather = new OldWeather(); // OldWeather 인스턴스를 직접 생성 -> Weather 클래스에 직접적으로 의존하기 때문에 의존 역전의 원칙을 위반

    public void setCurrentWeather(OldWeather oldWeather){
        currentWeather = oldWeather;
    }

    public int getTemperature(){ // 만약 OldWeather 클래스에서 getTemperature 메소드의 구현방법이 변경되면 OldWeatherTracker에서도 수정이 발생될 가능성이 높다.
        return currentWeather.getTemperature();
    }

}
