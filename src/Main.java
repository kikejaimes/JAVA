import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {
        Perro perro=new Perro("canela","labrador",5);
        System.out.println(perro.getNombre());
        System.out.println(perro.getEdad());
        System.out.println(perro.getRaza());


    }
}