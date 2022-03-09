public class Method1 {
    public static void numbering(){
        int i=0;
        while (i<10){
            System.out.println(i);
            i++;
        }
    }//메소드 정의
    public static void main(String[] args){
        numbering();//메소드 호출
    }
}
/*
main 메소드란 무엇인가
자바-개발자 사이간의 약속
public static void main(String[] args)라는 형식의 메소드 main에
하고자 하는 작업에 해당하는 코드를 위치시킨다. 이후 자바가 실행될 때 main이 실행되도록 약속됨

main 함수에 public,static,String args를 붙이는 이유:
            static: 객체를 생성하지 않아도 자동으로 실행되어 작업을 수행해야 하므로 static선언
            public: main 함수가 어디있던 실행되어야 하므로 public선언
            String args: 자바를 커맨드라인에서 실행할 때 매개변수를 지원해주기 위해 기본으로 사용??
                이후 입력과 출력 파트에서 더 배움

메소드로 인해 이미 정의해놓은 로직을 재활용 가능,
즉 코드량 감소, 유지보수 유리
*/