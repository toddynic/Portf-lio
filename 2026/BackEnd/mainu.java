public class mainu
{
    public static void main(String[] args) throws InterruptedException
    {
        int bateria = 30;



        for(int i = 0;i<5;i++)
        {
            System.out.println("Etapa: "+ (i+1));
            switch(i)
            {
                case 0:
                    System.out.println("Carro iniciando...");
                    if(bateria<=50)
                    {
                        System.out.println("Bateria insufiente.");
                        return;
                    }
                    break;
                
                case 1:
                    System.out.println("Sensores ativado...");
                    break;

                case 2:
                    System.out.println("Modo autonomo ligado...");
                    break;

                case 3:
                    System.out.println("Melhores rotas sendo calculada...");
                    break;

                case 4:
                    System.out.println("O trajeto será iniciado...");
                    break;
            }
            Thread.sleep(1000);
            System.out.println("");
        }
    }
}