package org.mintcode.errabbit.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleApplication {

    public static void main(String[] args){

        Logger logger = LoggerFactory.getLogger(ExampleApplication.class);

        try{

            Thread.sleep(3000);

            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);
        }
        catch (Exception e){
            logger.error(e.getMessage(),e);
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
