public class GrandSon implements Son{
    public static void main(String[] args) {
        GrandFather popo = new GrandSon(); popo.grandFather();
        // GrandFather는 본인의 메소드만 접근 가능
        Father  poring = new GrandSon(); poring.grandFather();
        // Father는 본인 메소드와 GrandFather 메소드 접근가능
        Mother poehl = new GrandSon(); poehl.Mother(); // 시아버지꺼 못씀ㅋ
        // Mother는 본인 메소드만 접근가능
        Son poporang = new GrandSon(); poporang.son();
        // Son은 GrandFather, Father, Mother 그리고 본인 메소드 모두 가능
         Son [] array = new Son[3];
        System.out.println(Father.NAME + "," + Mother.NAME);
    }


    @Override
    public void Father(){
        System.out.println("Calles by father()");
    };

    @Override
    public void grandFather(){
        System.out.println("Calles by grandFather()");
    };

    @Override
    public void Mother(){
        System.out.println("Calles by Mother()");
    };

    @Override
    public void son(){
        System.out.println("Calles by son()");
    };


}
