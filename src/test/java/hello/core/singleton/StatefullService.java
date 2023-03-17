package hello.core.singleton;

public class StatefullService {

    private int price; //상태를 유지하는 필드

    public int order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
        this.price = price; //여기가 문제!
        return price; //싱클톤은 무조건 호출값을 줘라 (stateless 무상태로 설계)
    }

    public int getPrice() {
        return price;
    }
}
