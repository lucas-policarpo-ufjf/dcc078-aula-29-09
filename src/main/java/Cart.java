public class Cart {
    private Cart() {};
    private static Cart instance = new Cart();
    public static Cart getInstance() {
        return instance;
    }


    private Integer totalAmount;
    private Float totalProductsPrice;
    private Float shippingPrice;

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Float getTotalProductsPrice() {
        return totalProductsPrice;
    }

    public void setTotalProductsPrice(Float totalProductsPrice) {
        this.totalProductsPrice = totalProductsPrice;
    }

    public Float getShippingPrice() {
        return shippingPrice;
    }

    public void setShippingPrice(Float shippingPrice) {
        this.shippingPrice = shippingPrice;
    }

    public Float getTotalPrice() {
        return this.totalProductsPrice + this.shippingPrice;
    }

}
