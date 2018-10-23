package MRT;

public class Bus{
	private int BUS_ID; 
//	private BusRoute BUS_ROUTE;
	private int CURRENT_PASSENGERS;
	private int PASSENGER_CAP;
	private double SPEED;
	private double CURRENT_FUEL;
	private double MAX_FUEL;
//	private Location LOCATION;
	
	//BUS OBJECT REQUIREMNTS 
	//add_bus,<ID>,<Route>,<Location>,<Initial-Passengers>,<Passenger-Capacity>,<Initial-Fuel>,<Fuel-Capacity>,<Speed>
	public Bus(int Bus_Id, int Cur_Pass, int Max_Pass, double Cur_Fuel, double Max_Fuel, double Speed){
		this.BUS_ID = Bus_Id;
		this.CURRENT_PASSENGERS = Cur_Pass;
		this.PASSENGER_CAP = Max_Pass;
		this.CURRENT_FUEL = Cur_Fuel;
		this.MAX_FUEL = Max_Fuel;
		this.SPEED = Speed;
	}

	public int  getRoute(){
		return BUS_ID; 
	}

	public void addStop(BusStop Stop){
		
	}


}
