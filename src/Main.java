//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
        {
            Editora ratchuchingas = new Editora();
            ratchuchingas.nome = "Ratchuchingas.SA";
            ratchuchingas.email = "Ratchuchingas.SA.1@gmail.com";
            ratchuchingas.site = "RatchuchingasSA.org.com.br";

            Livro meuLivro = new Livro();
            meuLivro.titulo = "Harry Potter e a Pedra Filosofal";
           // System.out.println(meuLivro.titulo);

            meuLivro.autor  = "J.K Rowling";
           // System.out.println(meuLivro.autor);

            meuLivro.valor = 42.23;
           // System.out.println("Valor: R$" + meuLivro.valor);

            meuLivro.editora = ratchuchingas;
           // System.out.println(meuLivro.editora);

           // System.out.println("Número de páginas:");
            meuLivro.paginas = 208;
           // System.out.println(meuLivro.paginas);

            meuLivro.resumo = "Resumo: Bla bla bla";
           // System.out.println(meuLivro.resumo);

           meuLivro.tipoCapa = "Capa escolhida: Capa Dura";
          // System.out.println(meuLivro.tipoCapa);

            System.out.println("O livro " + meuLivro.titulo + ", escrito por " + meuLivro.autor + ", custa R$"
            + meuLivro.valor + ", contém " + meuLivro.paginas + " páginas e é publicado por " + meuLivro.editora.nome);





            /*Time juvenaFC = new Time();

            juvenaFC.nome = "Juvenas FC";
            juvenaFC.treinador = "Pedrinho";
            juvenaFC.qtdePlayers = 39;

            System.out.println(juvenaFC.nome);
            System.out.println(juvenaFC.treinador);
            System.out.println(juvenaFC.qtdePlayers);*/

            /*Livro livroPredileto = new Livro();
             livroPredileto.titulo = "Um qualquer";
             livroPredileto.valor = 10;
             li'vroPredileto.resumo = "Não tem";

            System.out.println(livroPredileto.titulo);
            System.out.println(livroPredileto.valor);
            System.out.println(livroPredileto.resumo);*/





        }
    }