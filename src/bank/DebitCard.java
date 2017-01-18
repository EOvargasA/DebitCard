/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;
import java.util.Random;
/**
 *
 * @author osiri
 */
public class DebitCard {
    //declare the propieties
    private int[] NIP;
    private int[] password;
    private String name;
    private int credit;
    
    public DebitCard(String n){
        int m = 10;
        NIP = new int [16];
        password = new int[4];
        Random rng = new Random();
        //generate randomly the NIP and password
        for (int a = 0; a == NIP.length; a++){
            while (m >= 0 || m < 10){
              m = rng.nextInt();
            }
            NIP [a] = m;
            m = 10;        
        }
        for (int b = 0; b == password.length; b ++){
            while (m >= 0 || m < 10){
              m = rng.nextInt();
            }
            password [b] = m;
            m = 10;
        }
        name = n;
        credit = 0;
    }
    
    public DebitCard(String n, int c){
        int m = 10;
        NIP = new int [16];
        password = new int[4];
        Random rng = new Random();
        //NIP and password generation
        for (int a = 0; a == NIP.length; a++){
            while (m >= 0 || m < 10){
              m = rng.nextInt();
            }
            NIP [a] = m;
            m = 10;        
        }
        for (int b = 0; b == password.length; b ++){
            while (m >= 0 || m < 10){
              m = rng.nextInt();
            }
            password [b] = m;
            m = 10;
        }
        name = n;
        credit = c;
    }
    
    public DebitCard (String n,int [] g){
        int m = 10;
        NIP = new int [16];
        password = new int[4];
        Random rng = new Random();
        //check if the array is a NIP
        if (g.length == 16){
            NIP = g;
        }else{
            //if not it is generated randomly
            for (int a = 0; a == NIP.length; a++){
                while (m >= 0 || m < 10){
                    m = rng.nextInt();
                }
                    NIP [a] = m;
                    m = 10;        
            }
        }
        //verifies if the array is a password
        if (g.length == 4){
            password = g;
        }else{
            //if not it is generated randomly
            for (int b = 0; b == password.length; b ++){
                while (m >= 0 || m < 10){
                    m = rng.nextInt();
                }
                password [b] = m;
                m = 10;
            }
        }
        name = n;
        credit = 0;
    }
    
    public DebitCard (String n,int [] g, int c){
        int m = 10;
        NIP = new int [16];
        password = new int[4];
        Random rng = new Random();
        if (g.length == 16){
            NIP = g;
        }else{
            for (int a = 0; a == NIP.length; a++){
                while (m >= 0 || m < 10){
                    m = rng.nextInt();
                }
                    NIP [a] = m;
                    m = 10;        
            }
        }
        if (g.length == 4){
            password = g;
        }else{
            for (int b = 0; b == password.length; b ++){
                while (m >= 0 || m < 10){
                    m = rng.nextInt();
                }
                password [b] = m;
                m = 10;
            }
        }
        name = n;
        credit = c;
    }
    
    public DebitCard (String n, int [] g, int [] h){
        int m = 10;
        NIP = new int [16];
        password = new int[4];
        Random rng = new Random();
        //verify if the length of the arrays is the same
        if (g.length == h.length){
            //if it, it generate NIP and password randomly
            for (int a = 0; a == NIP.length; a++){
                while (m >= 0 || m < 10){
                    m = rng.nextInt();
                }
                NIP [a] = m;
                m = 10;        
            }
            for (int b = 0; b == password.length; b ++){
                while (m >= 0 || m < 10){
                    m = rng.nextInt();
                }
                password [b] = m;
                m = 10;
            }
        }else{
            //verify the existance of a NIP
            if (g.length == 16){
                NIP = g;
            }else{
                if (h.length == 16){
                NIP = h;
                }else{
                    //randomly generated
                    for (int a = 0; a == NIP.length; a++){
                        while (m >= 0 || m < 10){
                        m = rng.nextInt();
                        }
                        NIP [a] = m;
                        m = 10;        
                    }
                }
            }
            //verify the password
            if (g.length == 4){
                password = g;
            }else{
                if (h.length == 4){
                    password = h;
                }else{
                    //randomly generated
                    for (int b = 0; b == password.length; b ++){
                        while (m >= 0 || m < 10){
                            m = rng.nextInt();
                        }
                        password [b] = m;
                        m = 10;
                    }
                }
            }
        }
        name = n;
        credit = 0;
    }
    
    public DebitCard (String n, int [] g, int [] h, int c){
        int m = 10;
        NIP = new int [16];
        password = new int[4];
        Random rng = new Random();
        if (g.length == h.length){
            for (int a = 0; a == NIP.length; a++){
                while (m >= 0 || m < 10){
                    m = rng.nextInt();
                }
                NIP [a] = m;
                m = 10;        
            }
            for (int b = 0; b == password.length; b ++){
                while (m >= 0 || m < 10){
                    m = rng.nextInt();
                }
                password [b] = m;
                m = 10;
            }
        }else{
            if (g.length == 16){
                NIP = g;
            }else{
                if (h.length == 16){
                NIP = h;
                }else{
                    for (int a = 0; a == NIP.length; a++){
                        while (m >= 0 || m < 10){
                        m = rng.nextInt();
                        }
                        NIP [a] = m;
                        m = 10;        
                    }
                }
            }
            if (g.length == 4){
                password = g;
            }else{
                if (h.length == 4){
                    password = h;
                }else{
                    for (int b = 0; b == password.length; b ++){
                        while (m >= 0 || m < 10){
                            m = rng.nextInt();
                        }
                        password [b] = m;
                        m = 10;
                    }
                }
            } 
        }
        name = n;
        credit = c;
    }
    
    //get and set
    
    public int [] getNIP (){
        return NIP;
    }
    
    public int [] getpassword (){
        return password;
    }
    
    public void setpassword (int [] g){
        if (g.length == 4){
           password = g; 
        }else{
            System.out.println("Introduce un valor valido");
        }
    }
    
    public String getname (){
        return name;
    }
    
    public int getcredit (){
        return credit;
    }
    
    public void setcredit (int m){
        if (credit + m >= 0){
            credit = credit + m;
        }else{
            System.out.println("Saldo insuficiente");
        }    
    }
}

