package controllers;

import models.Person;
//Metodo que ordena personas por su edad usando insercion
public class PersonController {
    public void sortPeopleByAge(Person[] personas ) {
        for (int i = 1; i < personas.length; i++) {
            Person aux = personas[i];
            int j = i - 1;
            while (j >= 0 && personas[j].getAge() > aux.getAge()) {
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = aux;
        }
    }
    public void sortPeopleByName(Person[] personas ) {
        for (int i = 1; i < personas.length; i++) {
            Person aux = personas[i];
            int j = i - 1;
            while (j >= 0 && personas[j].getName().compareTo(aux.getName()) > 0) {
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = aux;
        }
    }

}