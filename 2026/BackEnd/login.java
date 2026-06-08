class Login
{
    public String login;
    public String senha;

    public Login(String login, String senha)
    {
        this.login = login;
        this.senha = senha;
    }

    public void exibirDados()
    {
        System.out.println("login: " + this.login);
        System.out.println("senha: " + this.login);
    }
}

