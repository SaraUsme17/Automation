package org.example;

import Entidad.Bank;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Bank b = new Bank();
        b.factory();
        b.showUsers();

    }
}
