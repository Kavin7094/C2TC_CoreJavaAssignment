package assignmentfour;

	import java.util.Scanner;

	class TicketBooking {
	    private String stageEvent;
	    private String customer;
	    private Integer noOfSeats;

	    // Default Constructor
	    public TicketBooking() {}

	    // Parameterized Constructor
	    public TicketBooking(String stageEvent, String customer, Integer noOfSeats) {
	        this.stageEvent = stageEvent;
	        this.customer = customer;
	        this.noOfSeats = noOfSeats;
	    }

	    // getters & setters of stageEvent
	    public String getStageEvent() {
	        return stageEvent;
	    }

	    public void setStageEvent(String stageEvent) {
	        this.stageEvent = stageEvent;
	    }

	    
	    // getter & setter of customer
	    public String getCustomer() {
	        return customer;
	    }

	    public void setCustomer(String customer) {
	        this.customer = customer;
	    }

	    
	    // getter & setter of noOfSeats
	    public Integer getNoOfSeats() {
	        return noOfSeats;
	    }

	    public void setNoOfSeats(Integer noOfSeats) {
	        this.noOfSeats = noOfSeats;
	    }

	    // Overloaded of makePayment
	    public void makePayment(double amount) {
	        System.out.printf("Amount %.1f paid in cash\n", amount);
	    }

	    public void makePayment(double amount, String walletNumber) {
	        System.out.printf("Amount %.1f paid using wallet number %s\n", amount, walletNumber);
	    }

	    public void makePayment(String holderName, double amount, String cardType, String ccv) {
	        System.out.println("Holder name:" + holderName);
	        System.out.printf("Amount %.1f paid using %s card\n", amount, cardType);
	        System.out.println("CCV:" + ccv);
	    }

	    // Display
	    public void displayDetails() {
	        System.out.println("Stage event:" + stageEvent);
	        System.out.println("Customer:" + customer);
	        System.out.println("Number of seats:" + noOfSeats);
	    }
	}

	public class mainClass {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Read booking details
	        String bookingDetails = sc.nextLine();
	        String[] parts = bookingDetails.split(",");
	        TicketBooking tb = new TicketBooking(parts[0], parts[1], Integer.parseInt(parts[2]));

	        // Read payment choice
	        int choice = sc.nextInt();
	        sc.nextLine(); // consume newline

	        

	        switch (choice) {
	            case 1:
	                double cashAmount = sc.nextDouble();
	                tb.makePayment(cashAmount);
	                break;

	            case 2:
	                double walletAmount = sc.nextDouble();
	                sc.nextLine(); // consume newline
	                String walletNumber = sc.nextLine();
	                tb.makePayment(walletAmount, walletNumber);
	                break;

	            case 3:
	                String holderName = sc.nextLine();
	                double cardAmount = sc.nextDouble();
	                sc.nextLine();
	                String cardType = sc.nextLine();
	                String ccv = sc.nextLine();
	                tb.makePayment(holderName, cardAmount, cardType, ccv);
	                break;

	            default:
	                System.out.println("Invalid choice");
	        }
	        tb.displayDetails();

	    }
	}


