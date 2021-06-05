

public class EventDescription { 						

	
	private String name, location, website;
	private String telNumber, posscode;
	private double Rating;
	
		
		//2.3 Encapsulation Setter
		public void setHotelName(String name) {
			this.name = name;
		}
		
		
		public void setPosscode(String posscode) {
			this.posscode = posscode;
		}
		
		public void setLocation(String location) {
			this.location = location;
		}
		
		public void setTelNumber(String telNumber) {
			this.telNumber = telNumber;
		}
		
		
		public void setWebsite(String website) {
			this.website = website;
		}
		
		public void setRating(double Rating) {
			this.Rating = Rating;
		}
		
		//2.3 Encapsulation Getter
	public String getHotelName() {
		return this.name;
	}
	
	public String getPosscode() {
		return this.posscode;
	}
	
	public String getLocation() {
		return this.location;
	}
	
	public String getTelNumber() {
		return this.telNumber;
	}
	
	
	public String getWebsite() {
		return this.website;
	}
	
	public Double getRating() {
		return this.Rating;
	}
}