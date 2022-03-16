class Fruit{
    String name;
    void setName(String name){
        this.name=name;
    }
}
class Apple extends Fruit{
    void eat(){
        System.out.println(this.name+" yami");
    }
}
class GreenApple extends Apple{
    /*생성자
    1.메소드명이 클래스명과 동일하고 2.리턴 자료형을 정의하지 않는 메소드를 생성자(Constructor)라고 한다
    생성자는 객체가 생성될 때 호출된다. ex> new 클래스명(입력인수, ...)*/
    GreenApple(String name){
        this.setName(name);
    }
    //생성자 오버로딩=>하나의 클래스에 여러개의 입력항목이 다른 생성자를 만들 수 있다.
    GreenApple(int type){
        if (type==1){this.setName("greengreen");}
        else{
            this.setName("redred");
        }
        
    }

    void eat(){
        System.out.println(this.name+" eat");
    }
    void eat(int count){
        System.out.println(this.name+" eat "+count+" eat");
    }
}
public class Cst{
    public static void main(String[] args){
        GreenApple greenApple= new GreenApple("griny");//여기서 생성자는 문자열을 필요하므로 new로 객체를 만들때는 문자열을 전달해야한다.
        System.out.println(greenApple.name);
    }
}