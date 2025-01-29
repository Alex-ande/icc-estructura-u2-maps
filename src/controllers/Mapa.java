package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Mapa {
    public Mapa() {
        hashMap();
    }
    public void hashMap (){
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("manzana", 10);
        mapa.put("pera", 11);
        mapa.put("durazna", 5);
        mapa.put("mango", 6);

        System.out.println(mapa);

// contraskey
        System.out.println("hay pera"+ mapa.containsKey("pera"));
        System.out.println("hay kiwi"+mapa.containsKey("kiwi"));

        // obtener valor}
        System.out.println("valor de pera"+ mapa.get("pera"));
        // eliminar item
        mapa.remove("pera");
        System.out.println(mapa);
    }

    public void LinkedHashMap (){
        LinkedHashMap<String, Integer> limkMpa = new LinkedHashMap<>();
        limkMpa.put("manzana", 10);
        limkMpa.put("pera", 11);
        limkMpa.put("durazno", 5);
        limkMpa.put("mango", 6);

        System.out.println(limkMpa);

       
    }
    public void TreeMap () {
        TreeMap <String, Integer> treemap = new TreeMap<>();
        treemap.put("masana", 10);
        treemap.put("pera", 11);
        treemap.put("durazno",5);
        treemap.put("mango", 6);

        System.out.println(treemap);
    }
    

}
