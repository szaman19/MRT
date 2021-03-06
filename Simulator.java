package MRT;
import java.util.HashMap;

public class Simulator{
	private HashMap <Integer, Bus> BUS_LIST;
	private HashMap <Integer, BusRoute> ROUTE_LIST;
	private HashMap <Integer, BusStop> STOP_LIST;

	public Simulator(){
	}
	

	/* Adds a depot to the simulation 
	 *
	 *
	 *
	 */
	public void add_depot(){
	
	}

	public void add_route(){
	}
	/* Adds a Bus object to the Simulation
	 *
	 * Creates a new Bus object and stores it in BUS_LIST with BUS_ID as the key.
	 *
	 * Results in BUS_LIST being updated
	 */
	public void add_bus(){
	}
	
	/* Adds a bus stop to a given route.
	 * extend_route,<Route-ID>,<Stop-ID>
	 *
	 * Algorithm:
	 * 1) Find RouteID in ROUTE_LIST, else throw error
	 * 2) Find StopID in STOP_LIST, else throw error
	 * 3) If route in ROUTE_LIST, call  <Route>.addStop(<BusStop>)
	 * 4) Iterate through BUS_LIST and update all Bus objects with matching Route_ID by calling add.Stop()
	 *
	  */
	public void extend_route(int RouteID, int StopID){
		if(this.ROUTE_LIST.containsKey(RouteID)){
			if(this.STOP_LIST.containsKey(StopID)){
				BusRoute Route = this.ROUTE_LIST.get(RouteID);
				BusStop Stop = this.STOP_LIST.get(StopID);
				Route.addStop(Stop);

				for(Bus x: BUS_LIST.values()){
					if(x.getRoute() == RouteID){
						x.addStop(Stop);
					}
				}
			}
			else{
				System.out.println("State Unchanged. STOPID not found");
			}	

		}
		else{
			System.out.println("State unchanged. BUSID not found");
		}		
	}

}
