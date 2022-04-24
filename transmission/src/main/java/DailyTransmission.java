import java.sql.Date;

public class DailyTransmission {
	 private int daiTransId;
	 private Date reportDate;
	// private int transmissionSubId;
	 private double quantity;
	 
     public DailyTransmission(){}

	public int getDaiTransId() {
		return daiTransId;
	}

	public void setDaiTransId(int daiTransId) {
		this.daiTransId = daiTransId;
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
                ", reportDate='" + reportDate + '\'' +
                ", quantity=" + quantity +
                '}';
    }     
}
