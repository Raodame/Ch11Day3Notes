public class Runner {
    public static void main(String[] args) {

        Animal a = new Animal();
        Cat c = new Cat();
        Animal a1 = new Cat(); //makes a Cat object, has an Animal reference
        Cat c1 = (Cat)(a1); //creates a Cat object, references Animal and Cat

        Animal[] array = {new Cat(), new Dog(), new Dog()}; //array[0] isn't a Cat object yet, still has an Animal reference
        if (array[0] instanceof Cat){ //boolean instanceof checks if data type of array is a reference of Cat
            Cat current = (Cat) array[0];
            current.method2();
        }
        else if(array[0] instanceof Dog){ //instanceof checks if data type of array is a reference of Dog
            Dog current = (Dog) array[0];
            current.method3();
        }
        else{
            //deal as animal
            Animal current = (Animal) array[0]; //array[0] already an Animal, so this is redundant
            current.method1();
        }

        Animal a2 = new Animal();
        a.method4();
        Cat c2 = new Cat();
        c.method4();
        Animal a3 = new Cat(); //object (Cat in this situation) determines what's overwritten
        a3.method4();
        Animal a4 = new Dog();
        a4.method4();
    }
}
