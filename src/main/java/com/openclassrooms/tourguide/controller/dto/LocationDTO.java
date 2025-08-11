package com.openclassrooms.tourguide.controller.dto;

public class LocationDTO {
	private final Double latitude;
	private final Double longitude;

	public LocationDTO(Double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}
}
