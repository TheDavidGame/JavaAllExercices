package ru.mirea.Exercise16;

public class ATM extends Thread {

    Account account = new Account();

    private volatile boolean meter = true;

    public void whitdraw(){

        if(account.balance > 0) {
            account.balance = account.balance - 10;
        }

    }
    public void deposit(){

            account.balance =account.balance + 10;

    }
    public void change_meter(){
        meter = !meter;
    }


    public void run() {


        synchronized (account) {
            do {
                if (!Thread.interrupted()) { //устанавливает у потока статус, что он прерван
                    if (meter) { //меняет (переключатель)
                        deposit();
                    } else {
                        whitdraw();
                    }
                    System.out.println("Balance: " + account.balance);
                } else {
                    return;
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }

            }
            while (true);

        }
    }
 }








