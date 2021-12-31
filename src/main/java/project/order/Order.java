package project.order;

public class Order {
    private Long memberId;
    private String itemName;
    private int itemPrice;
    private int discountPrice;
    
    public Order(Long memberId, String itemName, int itemPrice, int discountPrice){
        this.memberId = memberId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.discountPrice = discountPrice;
    }
    public int CalculatePrice(){
        return itemPrice-discountPrice;
    }
    public void setMemberId(Long memberId){
        this.memberId = memberId;
    }
    public Long getMemberId(){
        return memberId;
    }
    public void setItemName(String itemName){
        this.itemName = itemName;
    }
    public String getItemName(){
        return itemName;
    }
    public void setItemPrice(int itemPrice){
        this.itemPrice = itemPrice;
    }
    public int getItemPrce(){
        return itemPrice;
    }
    public void setDiscountPrice(int discountPrice){
        this.discountPrice = discountPrice;
    }
    public int getDiscountPrice(){
        return discountPrice;
    }
    @Override
    public String toString(){
        return "order{" + 
            "memberId= " + memberId +
            ", itemName= " + itemName +
            ", itemPrice= " + itemPrice + 
            ", DiscountPrice= " + discountPrice +
            "}";
    }
}
