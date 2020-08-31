package co.grandcircus.Lab25;

public class Location {

	private Double latitude;
	private Double longitute;
	
	
	
	public Location() {
		super();
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitute() {
		return longitute;
	}
	public void setLongitute(Double longitute) {
		this.longitute = longitute;
	}
	@Override
	public String toString() {
		return "Location [latitude=" + latitude + ", longitute=" + longitute + "]";
	}
	
	
	
}
