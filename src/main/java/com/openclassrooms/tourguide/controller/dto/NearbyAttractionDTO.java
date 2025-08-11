package com.openclassrooms.tourguide.controller.dto;

public class NearbyAttractionDTO {
	private final String attractionName;
	private final LocationDTO attractionLocation;
	private final LocationDTO userLocation;
	private final Double distanceInMiles;
	private final Integer rewardPoints;

	public NearbyAttractionDTO(String attractionName, LocationDTO attractionLocation, LocationDTO userLocation,
							   double distanceInMiles, int rewardPoints) {
		this.attractionName = attractionName;
		this.attractionLocation = attractionLocation;
		this.userLocation = userLocation;
		this.distanceInMiles = distanceInMiles;
		this.rewardPoints = rewardPoints;
	}

	public String getAttractionName() {
		return attractionName;
	}

	public LocationDTO getAttractionLocation() {
		return attractionLocation;
	}

	public LocationDTO getUserLocation() {
		return userLocation;
	}

	public double getDistanceInMiles() {
		return distanceInMiles;
	}

	public int getRewardPoints() {
		return rewardPoints;
	}
}
