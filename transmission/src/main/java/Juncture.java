
public class Juncture {
	private int juncId;
	private int plantId;
	private int transSubId;
    private int lineId;
    private String active;
    private String activeFrom;
    private String activeTo;

    public Juncture(){}
    
    public int getJuncId() {
		return juncId;
	}


	public void setJuncId(int juncId) {
		this.juncId = juncId;
	}


	public int getPlantId() {
		return plantId;
	}


	public void setPlantId(int plantId) {
		this.plantId = plantId;
	}


	public int getLineId() {
		return lineId;
	}


	public void setLineId(int lineId) {
		this.lineId = lineId;
	}


	public int getTransSubId() {
        return transSubId;
    }

    public void setTransSubId(int transSubId) {
        this.transSubId = transSubId;
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
        return "LocalSubstation{" +
        		"juncId=" + juncId +
        		"plantId=" + plantId +
                "transSubId=" + transSubId +
                ", lineId='" + lineId + 
                ", active='" + active + 
                ", activeFrom='" + activeFrom + '\'' +
                ", activeTo='" + activeTo +
                '}';
    }
}
