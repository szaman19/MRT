package MRT; 

public class BusStop{
	private Location LOCATION;
	private int STOP_ID;
	private String STOP_NAME;
	
	public BusStop(Location LOCATION, int STOP_ID, String STOP_NAME){
		this.LOCATION = LOCATION;
		this.STOP_ID = STOP_ID;
		this.STOP_NAME = STOP_NAME;
	}

	public Location Get_Location(){
		return this.LOCATION;
	}
	public int Get_StopID(){
		return this.STOP_ID;
	}
	public String Get_Stop_Name(){
		return this.STOP_NAME;
	}
}
