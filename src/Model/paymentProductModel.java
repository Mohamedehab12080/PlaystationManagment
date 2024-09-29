
package Model;

public class paymentProductModel {
    
    private int id;
    private int deviceID;
    private int payed;
    private String productname;
    private String DeviceName;
    private int productprice;
    private int Quantityneeded;
    private int priceofTaken;
    private String date;

    public int getPayed() {
        return payed;
    }

    public void setPayed(int payed) {
        this.payed = payed;
    }

    public int getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(int deviceID) {
        this.deviceID = deviceID;
    }

    public String getDeviceName() {
        return DeviceName;
    }

    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public int getProductprice() {
        return productprice;
    }

    public void setProductprice(int productprice) {
        this.productprice = productprice;
    }

    public int getQuantityneeded() {
        return Quantityneeded;
    }

    public void setQuantityneeded(int Quantityneeded) {
        this.Quantityneeded = Quantityneeded;
    }

    public int getPriceofTaken() {
        return priceofTaken;
    }

    public void setPriceofTaken(int priceofTaken) {
        this.priceofTaken = priceofTaken;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
}
