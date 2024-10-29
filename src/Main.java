import HerancaComPolimorfismoEObserver.Guitarra;
import HerancaComPolimorfismoEObserver.Musico;
import ObserverGoogleFlights.Passagem;
import ObserverGoogleFlights.Usuario;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

//        Guitarra g1 = new Guitarra("Padrao",
//                "Marupá",
//                "Vermelha",
//                "Dimarzio", 6, 24,
//                "Ibanez");


//        HerancaComPolimorfismoEObserver.Guitarra g2 = new HerancaComPolimorfismoEObserver.GuitarraMicroAfinacao(
//                "Padrao",
//                "Cedro",
//                "Verde",
//                "XPTO", 6, 24,
//                "Tagima",
//                "Gotoh",
//                "RolerNut");
//
//        HerancaComPolimorfismoEObserver.Guitarra g3 = new HerancaComPolimorfismoEObserver.GuitarraAcustica(
//                "Padrao",
//                "Cedro",
//                "Verde",
//                "XPTO", 6, 24,
//                "Tagima",
//                "Completo",
//                "40%");

        //Musico m1 = new Musico("Samuel");

        //g1.adicionarObservador(m1);

        //System.out.println(g1.Configurar("Dad Gad")); // base
       // System.out.println(g1.Configurar("Dad Gad", "Dimarzio")); //sobrecarga 1
        //System.out.println(g1.Configurar("Dad Gad", "Dimarzio", "Memphis", "Amarela")); //sobrecarga 2


        Passagem passagem = new Passagem("Nova York", 3500.00);

        Usuario usuario1 = new Usuario("Carlos");
        Usuario usuario2 = new Usuario("Ana");

        passagem.adicionarObservador(usuario1);
        passagem.adicionarObservador(usuario2);

        // Mudando o preço da passagem; os usuários serão notificados
        System.out.println("Alterando o preço da passagem...");
        passagem.setPreco(3000.00);


    }
}