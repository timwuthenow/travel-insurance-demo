package org.kie.drl.insurance;

public class TravelInsuranceApplication {
	private String id;
	private Traveler traveler;
	private String destination;
	private int tripDuration;
	private boolean approved;

	public TravelInsuranceApplication() {
	}

	public TravelInsuranceApplication(String id, Traveler traveler, String destination, int tripDuration,
			boolean approved) {
		this.id = id;
		this.traveler = traveler;
		this.destination = destination;
		this.tripDuration = tripDuration;
		this.approved = approved;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Traveler getTraveler() {
		return traveler;
	}

	public void setTraveler(Traveler traveler) {
		this.traveler = traveler;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getTripDuration() {
		return tripDuration;
	}

	public void setTripDuration(int tripDuration) {
		this.tripDuration = tripDuration;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

}
