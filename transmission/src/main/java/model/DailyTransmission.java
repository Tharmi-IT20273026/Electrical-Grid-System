package model;

public class DailyTransmission {
	 private int daiTransId;
	 private int transSubId;
	 private String date;
	 private double quantity;

	    public int getDaiTransId() {
	        return daiTransId;
	    }

	    public void setDaiTransId(int daiTransId) {
	        this.daiTransId = daiTransId;
	    }
	
            public int getTransSubId() {
	        return transSubId;
            }

	    public void setTransSubId(int transSubId) {
		this.transSubId = transSubId;
	    }
	
	    public String getDate() {
	        return date;
	    }

	    public void setDate(String date) {
	        this.date = date;
	    }

	    public double getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(double quantity) {
	        this.quantity = quantity;
	    }

	    @Override
	    public String toString() {
	        return "DailyTransmission{" +
	                "daiTransId=" + daiTransId +
			"transSubId=" + transSubId +
	                ", date='" + date + '\'' +
	                ", quantity=" + quantity +
	                '}';
	    }
	}
