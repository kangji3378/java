//인터페이스 작성하기 (인터페이스를 기준으로 작성된 클래스는 구현체(ex>lion,tiger)는 늘어나도 인터페이스(ex>Predator)는 한개이다.)

interface Predator{
    String getFood();
    /*인터페이스의 메소드는 메소드의 이름과 입출력에 대한 정의만 있고 그 내용은 없다. 그러므로
    구현체에 getFood 메소드를 구현해야 한다.
        상속은 해당 메소드를 반드시 구현해야하는 '강제성'이 없지만 인터페이스의 메소드는 '강제성'을 갖는다.*/
    default void printFood() {
        System.out.printf("my food is %s\n", getFood());
    }
    /*디폴트 메서드는 메소드명 가장 앞에 "default" 라고 표기해야 한다. 
    이렇게 Predator 인터페이스에 printFood 디폴트 메서드를 구현하면 
    Predator 인터페이스를 구현한 Tiger, Lion 등의 실제 클래스는 printFood 메서드를 구현하지 않아도 사용할 수 있다. 
    그리고 디폴트 메스드는 오버라이딩이 가능하다. 즉, printFood 메서드를 실제 클래스에서 다르게 구현하여 사용할수 있다. */
}


class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Animal implements Predator {
    public String getFood(){
        return "apple";
    }
}

class Lion extends Animal implements Predator {
    public String getFood(){
        return "banana";
    }
}

class ZooKeeper {
    /* 인터페이스 추가 전 
        void feed(Tiger tiger) {  // 호랑이가 오면 사과를 던져 준다.
        System.out.println("feed apple");
    }

    void feed(Lion lion) {  // 사자가 오면 바나나를 던져준다.
        System.out.println("feed banana");
    }*/
    void feed(Predator predator){
        System.out.println("feed "+predator.getFood());
    }/*tiger, lion은 각각 Tiger, Lion의 객체이면서 동시에 Predator 인터페이스의 객체이다.
    그래서 Predator를 자료용으로 사용할 수 있다.*/
}

public class Inter {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zooKeeper.feed(tiger);  // feed apple 출력
        zooKeeper.feed(lion);  // feed banana 출력
        
    }
}