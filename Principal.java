//atividade da Avaliação P2 - java I.pdf 

public class Principal{
    public static void main(String[] args){
        TestaFigura retangulo = new TestaFigura();
        retangulo.setBase(4);
        retangulo.setAltura(2);

        System.out.println(retangulo.getNomeFigura());
        System.out.println(retangulo.getArea());
        System.out.println(retangulo.getPerimetro());
    }
}
