package com.composite.example;

import com.composite.app.Application;

/**
 * Clase demo. Todos los recursos se visualizan aquí.
 */
public class CompositeMain {

    public static void main(String[] args) {
        Application app = new Application();

        //app.orderSimpleProducts();
        app.orderGammerPC();
        app.PCCorporativo();
        app.portatil();

    }

}
