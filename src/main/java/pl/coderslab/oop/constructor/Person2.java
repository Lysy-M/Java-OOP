package pl.coderslab.oop.constructor;

public class Person2 {
        private String name;
        private String surname;
        private int age;
        private String gender;

        public Person2(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public Person2(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Person2(String name, String surname, int age, String gender) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.gender = gender;
        }

        // Gettery i settery
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }
    
}
//    W powyższym kodzie, tworzymy klasę Person z prywatnymi atrybutami name, surname, age i gender. W konstruktorach, ustawiamy wartości tych atrybutów na wartości podane jako argumenty.
//
//        Dodatkowo, dodajemy publiczne gettery i settery dla atrybutów, aby umożliwić dostęp do ich wartości z poziomu innych klas.