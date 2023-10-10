public class HelloWorldAnonymousClasses {
    interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }

    public static void sayHello() {
        // beágyazott osztály
        class EnglishGreeting implements HelloWorld {
            String name = " world " ;

            public void greet() {
                greetSomeone(" world ");
            }

            public void greetSomeone(String someone) {
                name = someone ;
                System.out.println(" Hello " + name);
            }
        }

        HelloWorld englishGreeting = new EnglishGreeting();
        englishGreeting.greet();

        // névtelen osztály
        HelloWorld frenchGreeting = new HelloWorld() {
            String name = " tout le monde " ;
            public void greet() {
                greetSomeone(" tout le monde ");
            }
            public void greetSomeone(String someone) {
                name = someone ;
                System.out.println(" Salut " + name);
            }
        };

        frenchGreeting.greetSomeone(" Fred ");
    }

    public static void main(String[] args) {
        HelloWorldAnonymousClasses.sayHello();
    }
}
