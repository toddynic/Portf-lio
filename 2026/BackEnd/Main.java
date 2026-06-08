class Login
{
    private String login;
    private String senha;
    private Boolean acesso;

    public Login(String login, String senha, Boolean acesso)
    {
        this.login = login;
        this.senha = senha;
        this.acesso = acesso;
    }

    public void exibirDados()
    {
        System.out.println("login: " + this.login);
        System.out.println("senha: " + this.senha);
        System.out.println("");
    }

    public void Verificar() 
    {
        if(this.senha.length() >= 7 && acesso)
        {
            System.out.println("Acesso de " + this.login + " Permitido");
            System.out.println("");
        } else
        {
            System.out.println("Acesso de " + this.login + " Negado");
            System.out.println("");
        }
    }
}



class Main
{
    public static void main()
    {
        Login pessoa1 = new Login("Davi", "dueksyelfje", true);
        Login pessoa2 = new Login("Roberta", "macacu", false);

        pessoa1.exibirDados();
        pessoa2.exibirDados();

        pessoa1.Verificar();
        pessoa2.Verificar();
    }
}