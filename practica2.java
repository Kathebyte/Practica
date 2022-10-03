public class practica2 {
    public static void main (String args[]){
        Integer i = 1;
        Integer j = 99;

        System.out.println("ciclo por for");
        System.out.println("**********************");
        for (i=1; i<=5; i++){
        if(i<5)  {
            System.out.print(i +",");
            System.out.print(j +",");
        }  else {
            System.out.print(i + "," );
            System.out.print(j);

        }
        j--;
        }
        
        System.out.println("**********************");
        System.out.println("ciclo while");
        i= 1;
        j = 99;
        while(i<=5){
            if(i<5)  {
                System.out.print(i +",");
                System.out.print(j +",");
                } else {
                System.out.print(i + "," );
                System.out.print(j);
            }
            i ++;
            j--;
            }
            
            System.out.println("**********************");
            System.out.println("ciclo por Do- While : ");
            System.out.println("**********************");
            i= 1;
            j = 99;
            do{ 
            if(i<5)  {
                System.out.print(i +",");
                System.out.print(j +",");
            }else{
                System.out.print(i + "," );
                System.out.print(j);
            }
            i ++;
            j--;
            }while (i<=5);
            


    }
}

