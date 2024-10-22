package flightui.test.ot;

import com.borland.silk.keyworddriven.OutParameter;
import com.borland.silk.keyworddriven.annotations.Argument;
import com.borland.silk.keyworddriven.annotations.Keyword;

public class TestFlight {

	//private Desktop desktop = new Desktop();

	@Keyword(value = "Start application", isBaseState = true, description = "execute application")
	public void startApplication() {
		//BaseState baseState = new BaseState();
		//baseState.execute(desktop);
	}

	@Keyword(value = "100 Login", description = "Login with username + password")
	public void login(@Argument("Username") String userName, @Argument("Password") String password) {
		// Todo
		// userName = "john", passWord = "hp"
		//desktop.<WPFNavigationWindow>find("OpenText MyFlight Sample Application").setActive();
		//desktop.<WPFTextBox>find("OpenText MyFlight Sample Application.agentName").select(0, 0);
		//desktop.<WPFNavigationWindow>find("OpenText MyFlight Sample Application").setActive();
		//desktop.<WPFTextBox>find("OpenText MyFlight Sample Application.agentName").setText("john");
		//desktop.<WPFPasswordBox>find("OpenText MyFlight Sample Application.password").typePasswordKeys("7VA=");
		//desktop.<WPFButton>find("OpenText MyFlight Sample Application.okButton").select();
	}

	@Keyword(value = "200 Book Flight", description = "book a flight - from, to, class, no. tickets, passenger name, flight date")
	public void book_Flight(@Argument("FlyFrom") String flyFrom, @Argument("FlyTo") String flyTo,
			@Argument("ClassOfService") String classOfService, @Argument("Tickets") String tickets,
			@Argument("PassengerName") String passengerName, @Argument("SelectedRow") String selectedRow,
			@Argument("OrderDate") String orderDate, @Argument("OrderNumberOut") OutParameter orderNumberOut,
			@Argument("PassengerNameOut") OutParameter passengerNameOut,
			@Argument("OrderDateOut") OutParameter orderDateOut) {
		// Todo
		// flyFrom = "London", flyTo = "Paris", classOfService = "Economie"
		// tickets = "1", passengerName = "John Doe", selectedRow = "0"
		// orderDate = "19-Dec-2024"
	}

	@Keyword(value = "300 Change Order", description = "change order - no. tickets, class, passenger name, out: updated flight no.")
	public void change_Order(@Argument("Tickets") String tickets, @Argument("ClassOfService") String classOfService,
			@Argument("PassengerName") String passengerName,
			@Argument("UpdatedOrderNum") OutParameter updatedOrderNum) {
		// Todo
		// tickets = "2", classOfService = "First", passengerName = "John Deer"
	}

	@Keyword(value = "400 Delete Order Num", description = "delete flight order - no. flight order, passenger name, flight date")
	public void deleteOrderNum(@Argument("OrderNumber") String orderNumber,
			@Argument("PassengerName") String passengerName, @Argument("OrderDate") String orderDate) {
		// Todo
	}

	@Keyword(value = "500 Search Order", description = "search order - no. flight order, passenger name, flight date")
	public void searchOrder(@Argument("OrderNumber") String orderNumber,
			@Argument("PassengerName") String passengerName, @Argument("OrderDate") String orderDate) {
		// Todo
		// passengerName = "John"
	}

	@Keyword(value = "600 Trash can Order", description = "trash order - out: no. flight order")
	public void trashCanOrder(@Argument("OrderDeleteNumber") OutParameter orderDeletedNumber) {
		// Todo
	}

	@Keyword(value = "700 Logout", description = "logout")
	public void logout() {
		// Todo
	}

	@Keyword(value = "Close Application", description = "close application")
	public void closeApplication() {
		// Todo
	}

}