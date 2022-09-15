package Practic_2;

public class DogKennel {
    Dog[] dogs;

    DogKennel() {

    }
    DogKennel (Dog[] dogs) {
        this.dogs = dogs.clone();
    }

    void AddDog(Dog dog){
        Dog[] newDog = new Dog[dogs.length + 1];
        System.arraycopy(dogs, 0, newDog, 0, dogs.length);
        newDog[newDog.length - 1] = dog;

        dogs = newDog.clone();
    }

    void AddDog(Dog[] dogs){
        Dog[] newDog = new Dog[this.dogs.length + dogs.length];
        System.arraycopy(this.dogs, 0, newDog, 0, this.dogs.length);
        System.arraycopy(dogs, this.dogs.length, newDog, 0, dogs.length);

        dogs = newDog.clone();
    }

    void Print() {
        for (Dog dog: dogs) {
            System.out.println(dog);
        }
    }


    public Dog[] getDogs() {
        return dogs;
    }

}
