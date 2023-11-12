public class Ini {
    static Test t1=new Test("t1");
    Ini(String s){
        Test t2=new Test("t2");
        System.out.println("Constructor clasa Ini");
        System.out.println("Valoare string din Ini: "+s);
    }
    static Test t3=new Test("t3");
    Test t4=new Test("t4");
}
