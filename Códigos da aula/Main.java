class MyException extends Exception
{
}

public class Main
{
    public static void myMethod() throws MyException {
        if (true) {
            throw new MyException();
        }
    }
    public static Object createInstance(String className) {
        Class clazz = null;
        try {
            clazz = Class.forName(className); // Forma 3 (com tipo em tempo de execução)
            return clazz.newInstance();
            //
            //
            //
        } catch(ClassNotFoundException e) {
            System.out.println("Class " + className + " doesn't exist! " + e.getMessage());
        } catch(Exception e) {
            System.out.println("InstantiationException | IllegalAccessException " + e.getMessage());
        }

        return null;
    }
    public static void main(String[] args) {
            String s = "IFBA";
            Class clazz1 = s.getClass(); // Forma 1 (o objeto deve existir)
            Class clazz2 = String.class; // Forma 2 (o tipo deve ser conhecido em tempo de compilação)
            Object myString = createInstance("java.lang.Stringh");

            try {
                myMethod();
            } catch (MyException e) {
                System.out.println("MyException thrown");
            }
    }
}
