package model;

public class DailyTransmission {

    private int id;
    private String date;
    // private int localSubId;
    private double quantity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                "id=" + id +
                ", date='" + date + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
