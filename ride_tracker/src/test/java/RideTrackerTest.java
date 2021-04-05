import com.oburnett127.controller.RestControllerTest;
public class RideTrackerTest {
	public static void main(String[] args) {
		try {
			RestControllerTest test = new RestControllerTest();
			test.testCreateRide();
			test.testGetRides();
			test.testGetRide();
			test.testUpdateRide();
			test.testBatchUpdate();
			test.testDelete();
			test.testException();	
		} catch(Exception e) { e.getMessage();}
	}	
}