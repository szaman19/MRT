package MRT;

public class Location{
	private double LATTITUDE;
	private double LONGITUDE;

	public Location (Double LATTITUDE, double LONGITUDE){
		this.LATTITUDE = LATTITUDE;
		this.LONGITUDE = LONGITUDE;

	}

	public Double get_LAT(){
		return this.LATTITUDE;
	}

	public Double get_LONG(){
		return this.LONGITUDE;
	}
}
