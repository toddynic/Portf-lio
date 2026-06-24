import java.util.Scanner;

abstract class Conteudo
{
    public String nome;
    public String sinopse;
    public int ano;
    public String tipo;

    public Conteudo(String nome, String sinopse, int ano)
    {
        this.nome = nome;
        this.sinopse = sinopse;
        this.ano = ano;
    }

    abstract void escolher();


}

class Filme extends Conteudo
{
   public Filme(String nome, String sinopse, int ano)
    {
        super(nome, sinopse, ano);
        this.tipo = "Filme";
    }

    @Override
    void escolher()
    {
        System.out.println("Escolhendo " + this.nome);
    }
}

class Serie extends Conteudo
{
    public Serie(String nome, String sinopse, int ano)
    {
        super(nome, sinopse, ano);
        this.tipo = "Serie";
    }

    @Override
    void escolher()
    {
        System.out.println("Escolhendo " + this.nome);
        System.out.println("Escolha a temporada");
        System.out.println("escolha o episodio ");
    }
}

/*Conteudo escolherConteudo(int i)
        {
            switch (i) {
                case 0:
                    return conteudo0;
                    break;
                case 1:
                    return conteudo1;
                    break;
                case 2:
                    return conteudo2;
                    break;
                case 3:
                    return conteudo3;
                    break;
            }
        }
            */

public class netflix
{


  public static void main(String[] args)
    {

        Conteudo conteudo0 = new Filme("Breaking Bad", "Cancer e drogas", 2000);
            
            Conteudo conteudo1 = new Serie("Greys Anatomy", "Doutor vida academica", 2000);
        
            Conteudo conteudo2 = new Serie("Cassandra", "IA baba", 2000);
    
            Conteudo conteudo3 = new Filme("Michael Jackson", "Dança e carreira musical", 2000);

        do { 
            System.out.println("Escolha a série ou filme que você queira ver");

            Scanner entrada = new Scanner(System.in);

            for(int i=0; i< 4;i++)
            {
                
            }

            

        } while (true);
    }
}