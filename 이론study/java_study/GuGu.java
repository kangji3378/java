public class GuGu {
    public void dan(int n){
        //for 문
        for (int i=1;i<10;i++){
            System.out.println(n*i);
        }
    }
    public static void main(String[] args){
        GuGu gugu=new GuGu();   //GuGu 클래스의 자료형 gugu변수, gugu변수에 값을 저장할려면 GuGu클래스의 객체를 먼저 만들어야함
        for (int n=2;n<10;n++){//메서드 dan은 static이 없으므로 GuGu클래스의 객체를 먼저 생성한 후에 그 객체의 메서드인 dan메서드를 호출 할 수 있다.
            gugu.dan(n);
        }       
    }
}

