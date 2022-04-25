import java.sql.Date;

public class DailyTransmission {
	 private int daiTransId;
	 private int transSubId;
	 private Date reportDate;
	 private double quantity;
	 
     public DailyTransmission(){}

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
	public Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
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
		"tranSubId=" + transSubId +
                ", reportDate='" + reportDate + '\'' +
                ", quantity=" + quantity +
                '}';
    }     
}
