package model;

public class Transmission {

	private int transSubId;
	private String substationCode;
	private String active;
	private String activeFrom;
	private String activeTo;
	
	public int getTransSubId() {
		return transSubId;
	}
	public void setTransSubId(int transSubId) {
		this.transSubId = transSubId;
	}
	public String getSubstationCode() {
		return substationCode;
	}
	public void setSubstationCode(String substationCode) {
		this.substationCode = substationCode;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getActiveFrom() {
		return activeFrom;
	}
	public void setActiveFrom(String activeFrom) {
		this.activeFrom = activeFrom;
	}
	public String getActiveTo() {
		return activeTo;
	}
	public void setActiveTo(String activeTo) {
		this.activeTo = activeTo;
	}
	
	  @Override
	    public String toString() {
	        return "Transmission{" +
	        		"transSubId=" + transSubId +
	                "substationCode=" + substationCode +
	                ", active='" + active + 
	                ", activeFrom=" + activeFrom +'\'' +
	                ",activeTo=" + activeTo +
	                '}';
	    }
	
}
