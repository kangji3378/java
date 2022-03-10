class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}
//          상속
class Dog extends Animal {
    void sleep() {
        System.out.println(this.name+" zzz");
    }/*
    부모 클래스의 기능을 확장
        보통 부모 클래스를 상속받은 자식 클래스는 
        부모 클래스의 기능에 더하여 좀 더 많은 기능을 갖도록 작성한다.*/
}



/*
IS-A 관계
     Dog는 Animal의 하위 개념이므로 Dog is a Animal이라 할 수 있다.
     IS-A 관계(상속관계)에 있을 때 자식 클래스의 객체는 부모 클래스의 자료형인 것처럼 사용할 수 있다.
     ex>Animal dog = new Dog()*/

public class Animals {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("poppy");
    }
}