 class Demo extends Thread{

    public void run()
   {
       for(int i=1;i<=10;i++)
       {

           try{
               if(i == 6)
               {
                 Thread.currentThread().sleep(5000);
               }
           }
           catch(Exception e)
           {
               e.printStackTrace();
           }
           System.out.println(i);

       }
    }
}
class Demo1
{
    public static void main(String... args)
    {
           Demo t1 = new Demo();
           t1.start();


    }
}
