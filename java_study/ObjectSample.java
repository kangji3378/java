//예시용이므로 클래스 무시
class Animal{
    String name;//클래스에 선언된 변수=> 객체변수   객체.객체변수 로 접근 가능 (ex>cat.name)
    
    public void setName(String name/*매개변수*/){
        this.name =name;//this=> Animal클래스에 의해서 생성된 객체를 지칭
    }
}
public class ObjectSample {
    public static void main(String[] args){
        Animal cat = new Animal();/*Animal클래스의 인스턴스 cat, 즉 Animal의 객체 생성
        객체와 인스턴스의 차이 
            ex> cat은 객체, cat은 Animal의 인스턴스
        클래스=> 객체를 만드는 기능
        */
        Animal dog = new Animal();
        cat.setName("boby");//메서드 호출
        dog.setName("happy");
        System.out.println(cat.name);
        System.out.println(dog.name); //객체변수는 공유되지 않는다.
    }
}
