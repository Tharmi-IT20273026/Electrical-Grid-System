package model;

public class DailyTransmission {
	 private int daiTransId;
	 private String date;
	// private int transmissionSubId;
	 private double quantity;

	    public int getDaiTransId() {
	        return daiTransId;
	    }

	    public void setDaiTransId(int daiTransId) {
	        this.daiTransId = daiTransId;
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
	                ", date='" + date + '\'' +
	                ", quantity=" + quantity +
	                '}';
	    }
	}