import controllers.PersonController;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {
      Person[] personas = {
        new Person("Juan", 20, new int[]{10, 15, 20}),//15
        new Person("Maria", 18, new int[]{15, 15,20}),//16.66
        new Person("Pedro", 25, new int[]{20, 15, 20}),//18.33
        new Person("Ana", 22, new int[]{20, 20, 20}),//20
        new Person("Jorge", 15, new int[]{10, 10, 10}),//10   

      };
      //Imprimimos
      //Intanciamos
      //Ordenado por edad
      //Imprimimos 
      for (Person persona : personas) {
        System.out.println(persona);
      }
      //Ordenado por edad
      PersonController pcontroller = new PersonController();
        pcontroller.sortPeopleByAge(personas);
        System.out.println("\nPersonas ordenadas por edad:");
        for (Person persona : personas) {
            System.out.println(persona);
        }
        //Ordenado por nombre
        pcontroller.sortPeopleByName(personas);
        System.out.println("\nPersonas ordenadas por nombre:");
        for (Person persona : personas) {
            System.out.println(persona);
        }

    }
    public static void getAverageGrade(Person[] personas) {
        System.out.println("\nPromedio de calificaciones:");
        for (Person persona : personas) {
            System.out.println(persona.getName() + ": " + String.format("%.2f", persona.getAverageGrade()));
        }
    }
   
}