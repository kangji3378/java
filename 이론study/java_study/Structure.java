public class Structure {
    public static void main(String[] args) {
        System.out.println("Hello java");
    }
}
/*소스코드의 가장 바깥쪽:클래스 블록
클래스 블록 안 메서드 블록
메서드 블록 안 명령문 블록=>문장의 끝에 ;

자바 소스코드의 구조
        /클래스 블록 /
        public class 클래스명 {
            /메소드 블록 /
                    접근제어자         정적메서드
            [public|private|protected] [static] (리턴자료형|void) 메소드명1(입력자료형 입력변수, ...) {
                명령문(statement);
                ...
            }
            /메소드 블록/
            [public|private|protected] [static] (리턴자료형|void) 메소드명2(입력자료형 입력변수, ...) {
                명령문(statement);
                ...
            }
            ...
        }
*/