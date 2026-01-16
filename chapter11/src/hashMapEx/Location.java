package hashMapEx;

public class Location {
	//멤버변수는 접근제어자 private 사용
	private String cityName; //나라이름
	private int latitude; //위도
	private int longitude; //경도
	
	//디폴트 생성자
	public Location() {};
	//매개변수 생성자
	public Location(String cityName, int latitude, int longitude) {
		this.cityName = cityName;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int getLatitude() {
		return latitude;
	}
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}
	public int getLongitude() {
		return longitude;
	}
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}
	
	// 자바 최상위 클래스 Object 이다. 
	// Object -> toString()메소드 디폴트 => String데이터 타입으로 출력할 때사용
	// 현재메소드의 최상클래스 확인하는 방법 : ctrl + T
	// 단, 반드시 Override(재정의)해야 한다.
	@Override
	public String toString() {
		return cityName + ":" + latitude + ":" + longitude;
	}
	
	
	
	
	
	
	
}
