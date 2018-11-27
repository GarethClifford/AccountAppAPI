package com.gareth.persistence.domain;

public class Offer {
	public String offer;

	public Offer() {
	}

	public Offer(String offer) {
		this.offer = offer;
	}

	public String getOffer() {
		return offer;
	}

	public void setOffer(String offer) {
		this.offer = offer;
	}

	@Override
	public String toString() {
		return "offer=" + offer;
	}
}
