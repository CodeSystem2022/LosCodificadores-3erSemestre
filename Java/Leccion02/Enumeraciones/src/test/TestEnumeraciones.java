package test;

import enumeraciones.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
       // System.out.println("Dia 1: " + Dias.LUNES);
       
       
        System.out.println("Continente Nro. 4:"+Continentes.AMERICA);
        System.out.println("Nro. de paises en el 4to. continente: "
                +Continentes.AMERICA.getPaises());
        System.out.println("Nro. de habitantes en el 4to. continente: "
                +Continentes.AMERICA.getHabitantes());
        System.out.println("Continente Nro. 1:"+Continentes.AFRICA);
        System.out.println("Nro. de paises en el 1er. continente: "
                +Continentes.AFRICA.getPaises());
        System.out.println("Nro. de habitantes en el 1er. continente: "
                +Continentes.AFRICA.getHabitantes());
        System.out.println("Continente Nro. 2:"+Continentes.EUROPA);
        System.out.println("Nro. de paises en el 2do. continente: "
                +Continentes.EUROPA.getPaises());
        System.out.println("Nro. de habitantes en el 2do. continente: "
                +Continentes.EUROPA.getHabitantes());
        System.out.println("Continente Nro. 3:"+Continentes.ASIA);
        System.out.println("Nro. de paises en el 3ro. continente: "
                +Continentes.ASIA.getPaises());
        System.out.println("Nro. de habitantes en el 3ro. continente: "
                +Continentes.ASIA.getHabitantes());
        System.out.println("Continente Nro. 5:"+Continentes.OCEANIA);
        System.out.println("Nro. de paises en el 5to. continente: "
                +Continentes.OCEANIA.getPaises());
        System.out.println("Nro. de habitantes en el 5to. continente: "
                +Continentes.OCEANIA.getHabitantes());
    }
}
