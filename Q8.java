//8.	Write a constructor in the Car class given below that initializes the brand class field with the string “Ford”. Call the getBrand () method in the main method of the Sample class and store the value of the brand in a variable, and print the value.





class Car {
    String brand;

    Car(String s) {
        this.brand = s;
    }

    public void getBrand() {
        System.out.println("The name of the brand is " + brand);
    }

    public static void main(String[] args) {
        Car ob = new Car("BMW");
        ob.getBrand();
    }
}