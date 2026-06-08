class funcionario{
    private int matricula;
    private String nome;
    private Boolean ativo;

    public funcionario(int matricula,String nome, Boolean ativo ){
        this.matricula = matricula;
        this.nome = nome;
        this.ativo = ativo;
    }
    
     public void exibirDados()
    {
        System.out.println("matricula: " + this.matricula);
        System.out.println("nome: " + this.nome);
        System.out.println("");
    }

    public void Verificar() 
    {
        if(Math.log10(this.matricula) >= 5 && ativo)
        {
            System.out.println("Acesso de " + this.nome + " Permitido");
            System.out.println("");
        } else
        {
            System.out.println("Acesso de " + this.nome + " Negado");
            System.out.println("");
        }
    }
}

public class padrao {
    public static void main(String[] args) {
        funcionario pessoa1 = new funcionario(12346, "Davi", true);
        funcionario pessoa2 = new funcionario(65432, "July", true);
    
            pessoa1.exibirDados();
            pessoa2.exibirDados();

            pessoa1.Verificar();
            pessoa2.Verificar();
    }
}
