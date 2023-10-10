package prova1.questao7e8;

public class Main {
    public static void main(String[] args) {
      Animal animal = new Animal();
      Animal cachorro = new Cachorro();
      Animal gato = new Gato();
      Animal animais[] = {animal, cachorro, gato};
      for (Animal a: animais){
         a.fazerSom();
         a.mover();
      }
   }  
}