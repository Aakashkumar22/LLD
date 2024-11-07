package AbstractFactoryPractie;

public class absmain {
    public static void main(String[] args) {
        Absgetshpae a= new Absgetshpae();
        absshape ab=a.getfinalshape("finalRandomShape");
        shape s=ab.getShape("square");
        s.draw();

    }
}
