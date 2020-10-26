package ru.mirea.exercise15;


public class Main15 {

    public static void main(String[] args) {

        Step commonResource= new Step();
        System.out.println("Started ");

        for (int i = 1; i < 3; i++){

            Thread a = new Thread(new First(commonResource));

            a.setName("Thead " + i );

            a.start();
        }
    }
}

class Step {

    boolean step = true;
}

class First implements Runnable{

    Step res;

    First(Step res){
        this.res=res;
    }
    public void change (){
    res.step = !res.step;
    }
    public void run(){

        synchronized(res){

                try{
                    if(res.step){
                        System.out.println("RIGHT");
                    }else{
                        System.out.println("LEFT");
                    }
                    change();
                    Thread.sleep(500);
                }

                catch(InterruptedException e){}

        }

    }
}



