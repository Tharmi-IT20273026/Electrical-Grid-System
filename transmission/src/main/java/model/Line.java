package model;

public class Line {
	
	private int lineId;
	private int unitId;
	private String lineType;
	private float rangeMin;
	private float rangeMax;
	
	public int getLineId() {
		return lineId;
	}
	public void setLineId(int lineId) {
		this.lineId = lineId;
	}
	public int getUnitId() {
		return unitId;
	}
	public void setUnitId(int unitId) {
		this.unitId = unitId;
	}
	public String getLineType() {
		return lineType;
	}
	public void setLineType(String lineType) {
		this.lineType = lineType;
	}
	public float getRangeMin() {
		return rangeMin;
	}
	public void setRangeMin(float rangeMin) {
		this.rangeMin = rangeMin;
	}
	public float getRangeMax() {
		return rangeMax;
	}
	public void setRangeMax(float rangeMax) {
		this.rangeMax = rangeMax;
	}
	
	  @Override
	    public String toString() {
	        return "Line{" +
	        		"lineId=" + lineId +
	                "unitId=" + unitId +
	                ", lineType='" + lineType + 
	                ", rangeMin=" + rangeMin +'\'' +
	                ",rangeMax=" + rangeMax +
	                '}';
	    }

}
