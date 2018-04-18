package com.example.delli3.taller_clase;

import java.util.ArrayList;

public class Dato {
    private static ArrayList<Guardar_Celular> celular = new ArrayList<>();
    public static void guardar (Guardar_Celular c){celular.add(c);    }
    public static ArrayList<Guardar_Celular> obtener (){
        return celular;
    }
}
