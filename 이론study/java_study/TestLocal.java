public class TestLocal {

    int a;  // 객체변수 a

    void varTest(TestLocal sample) {
        sample.a++;
    }
    /*this 이용법
    void varTest(){
        this.a++
    }
    main=>
        sample.varTest();
    */

    public static void main(String[] args) {
        TestLocal sample = new TestLocal();
        sample.a = 1;
        sample.varTest(sample);
        System.out.println(sample.a);
    }
}
