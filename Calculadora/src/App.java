public class App {
    /**
     * @param args
     */
    public static void main(String[] args)  {
        int x = Integer.parseInt(args[0]);
        int y =Integer.parseInt(args[1]);

        if(args[0].equals("somar")){
           sum(x,y);
        }
        else if (args[0].equals("subtrair")){
            minimu(x,y);
        }
        else{
            System.out.println("Nenhuma opção encontrada");
        }

    }

    static void sum(int x , int y){
        System.out.println(x+y);
    }
    static void minimu(int x, int y){
        System.out.println(x-y);
    }
}
