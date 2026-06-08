class Pessoa
{
    public String nome;
    public int idade;

    public Pessoa(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirDados()
    {
        System.out.println("nome: " + this.nome);
        System.out.println("Idade: " + this.nome);
    }
}

class Main
{
    public static void main()
    {
        Pessoa pessoa1 = new Pessoa("Davi", 21);
        Pessoa pessoa2 = new Pessoa("Roberta", 23);

        
    }
}