import java.util.Scanner;

import javax.swing.JOptionPane;


import java.util.ArrayList;
import java.util.List;



abstract class Conteudo
{

    static boolean db = true;

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

    abstract void escolher(Scanner entrada);


}

class Filme extends Conteudo
{
   public Filme(String nome, String sinopse, int ano)
    {
        super(nome, sinopse, ano);
        this.tipo = "Filme";
    }

    @Override
    void escolher(Scanner entrada)
    {
       System.out.println("\nEscolhendo " + this.nome);

        System.out.println("\nSinopse: "+ this.sinopse);
        System.out.println("\nAno: "+ this.ano);

        System.out.print("\nDeseja assistir? (y/n): ");
        String confirma = entrada.nextLine();
        if(confirma.equals("n")) {return;}

        JOptionPane.showMessageDialog(null, "Escolhendo "+this.nome);
        db = false;
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
    void escolher(Scanner entrada)
    {
        System.out.println("\nEscolhendo " + this.nome);

        System.out.println("\nSinopse: "+ this.sinopse);
        System.out.println("\nAno: "+ this.ano);

        System.out.print("\nDeseja assistir? (y/n): ");
        String confirma = entrada.nextLine();

        if(confirma.equals("n")) {return;}

        
        System.out.print("Escolha a temporada: ");
        int ep = entrada.nextInt();
        entrada.nextLine();
        
        System.out.print("Escolha o episodio: ");
        int temp = entrada.nextInt();
        entrada.nextLine();

        JOptionPane.showMessageDialog(null, "Escolhendo "+this.nome+" Episodio: "+ ep + " Temporada: "+ temp);
        db = false;

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

        JOptionPane.showMessageDialog(null,"Bem Vindo a Netflix\ntu dummmmmm🎵");


        List<Conteudo> conteudo = new ArrayList<>();

        conteudo.add(new Serie("Breaking Bad", "Cancer e drogas", 2000));
            
        conteudo.add(new Serie("Greys Anatomy", "Doutor vida academica", 2000));
        
        conteudo.add(new Serie("Cassandra", "IA baba", 2000));
    
        conteudo.add(new Filme("Michael Jackson", "Dança e carreira musical", 2000));

        Scanner entrada = new Scanner(System.in);

        System.out.println("##########################################");
        System.out.println("########## Bem Vindo a Netflix! ##########");
        System.out.println("##########################################\n");

        do
        {
            System.out.println("\nEscolha qual você deseja ver:");
            System.out.println("1. Serie");
            System.out.println("2. Filme");
            System.out.print("Escolha o numero: ");
            int serieoufilme = entrada.nextInt();
            entrada.nextLine();

            System.out.println();

            List<Conteudo> escolhindo = new ArrayList<>();

            switch (serieoufilme) {
                case 1:
                    conteudo.forEach(nome ->{
                        if(nome.tipo == "Serie") {escolhindo.add(nome);}
                    });
                    break;
            
                case 2:
                    conteudo.forEach(nome ->{
                        if(nome.tipo == "Filme") {escolhindo.add(nome);}
                    });
                    break;
            }
            
            for(int i=0; i< escolhindo.size(); i++)
            {
                System.out.println((i+1)+". " + escolhindo.get(i).nome);
            }

            System.out.print("Escolha o numero: ");
            int entr = entrada.nextInt();
            entrada.nextLine();

            escolhindo.get(entr-1).escolher(entrada);
            
        } while(Conteudo.db);
        

    }
}
