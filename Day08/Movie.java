package Day08;

public class Movie {

    private String name;

    private int price;

    public void setPrice(int price) {
        this.price = price;
        if(price <=0){
            System.out.println("금액이 0이하로 지정 할 수 없습니다.");
        }else{
            this.price = price;
            System.out.println("금액 설정 완료 !");
        }
    }

    public Movie(String name) {
        this.name = name;
        this.price = price;
    }
}

