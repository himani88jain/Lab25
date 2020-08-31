package co.grandcircus.Lab25;

public class Weather {

	private Location location;
	private Data data;
	private String productionCenter;
	private String creationDateLocal;
	
	public Weather() {
		super();
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}
	

	public String getProductionCenter() {
		return productionCenter;
	}

	public void setProductionCenter(String productionCenter) {
		this.productionCenter = productionCenter;
	}
	
	

	public String getCreationDateLocal() {
		return creationDateLocal;
	}

	public void setCreationDateLocal(String creationDateLocal) {
		this.creationDateLocal = creationDateLocal;
	}

	@Override
	public String toString() {
		return "Weather [location=" + location + ", data=" + data + ", productionCenter=" + productionCenter
				+ ", creationDateLocal=" + creationDateLocal + "]";
	}

	

	
	
	
}
