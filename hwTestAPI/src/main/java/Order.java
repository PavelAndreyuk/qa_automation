import com.google.gson.annotations.SerializedName;

public class Order {
    @SerializedName("id")
    private int id;

    @SerializedName("petId")
    private int petId;

    @SerializedName("quantity")
    private int quantity;

    @SerializedName("shipDate")
    private String shipDate;

    @SerializedName("status")
    private Status status;

    @SerializedName("complete")
    private boolean complete;

    public int getId() {
        return id;
    }

    public Order setId(int id) {
        this.id = id;
        return this;
    }

    public int getPetId() {
        return petId;
    }

    public Order setPetId(int petId) {
        this.petId = petId;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public Order setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getShipDate() {
        return shipDate;
    }

    public Order setShipDate(String shipDate) {
        this.shipDate = shipDate;
        return this;
    }

    public Status getStatus() {
        return status;
    }

    public Order setStatus(Status status) {
        this.status = status;
        return this;
    }

    public boolean isComplete() {
        return complete;
    }

    public Order setComplete(boolean complete) {
        this.complete = complete;
        return this;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", petId=" + petId +
                ", quantity=" + quantity +
                ", shipDate=" + shipDate +
                ", status=" + status +
                ", complete=" + complete +
                '}';
    }
}
