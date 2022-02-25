
import java.util.ArrayList;



public class LambdaQ2 {
    
    public LambdaQ2(int totalPrice, String status) {
        this.totalPrice = totalPrice;
        this.status = status;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private int totalPrice;
    private String status;

    public static ArrayList<LambdaQ2> listOfOrders(ArrayList<LambdaQ2> orders) {
        ArrayList<LambdaQ2> listOrders = new ArrayList<>();


        for(LambdaQ2 order:orders){
            if((order.getStatus().equals("ACCEPTED") || order.getStatus().equals("COMPLETED"))&& order.getTotalPrice()>1000){
                System.out.println("Inside if");
                LambdaQ2 or = new LambdaQ2(order.getTotalPrice(),order.getStatus());
                listOrders.add(or);
            }
        }

        return listOrders;
    }
    public static void main(String[] args) {
        LambdaQ2 a1 = new LambdaQ2(10001,"ACCEPTED");
        LambdaQ2 a2 = new LambdaQ2(1000,"ACCEPTED");
        LambdaQ2 a3 = new LambdaQ2(10500,"COMPLETED");
        LambdaQ2 a4 = new LambdaQ2(100,"ACCEPTED");
        LambdaQ2 a5 = new LambdaQ2(10002,"ACCEPTED");
        LambdaQ2 a6 = new LambdaQ2(10005,"REJECTED");
        LambdaQ2 a7 = new LambdaQ2(50000,"COMPLETED");

        ArrayList<LambdaQ2> list = new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);
        list.add(a6);
        list.add(a7);
        System.out.println(list);
        System.out.println(listOfOrders(list));



    }
}