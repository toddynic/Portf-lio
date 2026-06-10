import java.util.Scanner;
class Funcionario
{
    public int matricula;
    public String nome;
    public String cargo;
    public double salario;
    public Boolean ativo;

    public Funcionario(int matricula, String nome, String cargo, double salario, Boolean ativo)
    {
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.ativo = ativo;
    }

    public void exibirDados()
    {
        System.out.println("");
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Nome: " + this.nome);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Salario: " + this.salario);
    }
    

    public void verificarBonus()
    {
        if (this.salario < 5000)
        {
            System.out.println("Pode receber o bonus");
        } else
        {
            System.out.println("Nao pode receber o bonus");
        }
    }

    public void verificarTrabalhar()
    {
        if (this.ativo && String.valueOf(this.matricula).length() >= 6)
        {
            System.out.println("Pode Trabalhar");
        } else
        {
            System.out.println("Nao pode trabalhar");
        }
    }
    
}

class Funcio
{
    public static void main()
    {
        /* 
        
        */

        Scanner entrada = new Scanner(System.in);

        System.out.print("Matricula: ");
        int matricula1 = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Nome: ");
        String nome1 = entrada.nextLine();

        System.out.print("Cargo: ");
        String cargo1 = entrada.nextLine();

        System.out.print("Salário: ");
        double salario1 = entrada.nextDouble();

        System.out.print("Ativo (true/false): ");
        Boolean ativo1 = entrada.nextBoolean();


        Funcionario Funcionario1 = new Funcionario(matricula1, nome1, cargo1, salario1, ativo1);
        
        Funcionario1.exibirDados();
        Funcionario1.verificarTrabalhar();
        Funcionario1.verificarBonus();

        entrada.close();
    }
}