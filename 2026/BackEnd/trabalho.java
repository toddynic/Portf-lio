import java.util.Scanner;
import javax.swing.JOptionPane;

class Cadastro
{
    public int codigo;
    public String nome;
    public String local;
    public double valor;
    public int quantidade;
    public String horario;


    public Cadastro(int codigo, String nome, String local, double valor, int quantidade, String horario)
    {
        this.codigo = codigo;
        this.nome = nome;
        this.local = local;
        this.valor = valor;
        this.quantidade = quantidade;
        this.horario = horario;
    }

    public Boolean verificarDesconto()
    {
        return (this.valor > 300.0);
    }

    public void exibirDados()
    {
        System.out.println("-------------- Informação do evento ---------------");
        System.out.println("Código do evento: " + this.codigo);
        System.out.println("Nome do evento: " + this.nome);
        System.out.println("Local: " + this.local);
        System.out.println("Valor da inscrição: " + this.valor);
        if(verificarDesconto()) {System.out.println("Valor da inscrição com desconto: " + (this.valor - this.valor * 0.1));}
        System.out.println("Quantidade de vagas disponíveis: " + this.quantidade);
        System.out.println("Carga horária: " + this.horario);
    }
    

    public Boolean verificarVagas()
    {
        return quantidade > 0;
    }

    public void situacaoVaga()
    {
        if(!verificarVagas()) {System.out.println("Sem vagas"); return;}

        if (this.quantidade < 10)
        {
            System.out.println("Últimas vagas");
            JOptionPane.showMessageDialog(null, "As Vagas estão acabando!");
        }
        else if (this.quantidade <= 30)
        {
            System.out.println("Vagas moderadas");
        }
        else
        {
            System.out.println("Muitas vagas disponivel");
        }
    }

    static Cadastro input(Scanner entrada)
    {
        

        System.out.print("Código do evento: ");
        int codigo1 = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Nome do evento: ");
        String nome1 = entrada.nextLine();

        System.out.print("Local: ");
        String local1 = entrada.nextLine();

        System.out.print("Valor da inscrição: ");
        double valor1 = entrada.nextDouble();

        System.out.print("Quantidade de vagas disponíveis: ");
        int quantidade1 = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Carga horária: ");
        String horario1 = entrada.nextLine();

        Cadastro cadastro1 = new Cadastro(codigo1, nome1, local1, valor1, quantidade1, horario1);

        

        return cadastro1;
    }
    
}

class trabalho
{
    public static void main()
    {
            
        Scanner entrada = new Scanner(System.in);

        //Cadastro dos dados
        System.out.println("\n---------------------------- Cadastro 1 ----------------------------");
        Cadastro cadastro1 = Cadastro.input(entrada);
        
        System.out.println("\n---------------------------- Cadastro 2 ----------------------------");
        Cadastro cadastro2 = Cadastro.input(entrada);

        System.out.println("\n---------------------------- Cadastro 3 ----------------------------");
        Cadastro cadastro3 = Cadastro.input(entrada);

        System.out.println("");

        //Informações sobre os dados
        System.out.println("\n---------------------------- Cadastro 1 ----------------------------");
        cadastro1.exibirDados();
        cadastro1.situacaoVaga();

        System.out.println("\n---------------------------- Cadastro 2 ----------------------------");
        cadastro2.exibirDados();
        cadastro2.situacaoVaga();

        System.out.println("\n---------------------------- Cadastro 3 ----------------------------");
        cadastro3.exibirDados();
        cadastro3.situacaoVaga();

        entrada.close();


    }

    
}