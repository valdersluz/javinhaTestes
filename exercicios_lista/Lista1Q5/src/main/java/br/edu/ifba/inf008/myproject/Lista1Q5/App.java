package br.edu.ifba.inf008.myproject.Lista1Q5;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        AppConfig app1 = new AppConfig();
        
        app1.updateSettings(2, 7);
        app1.updateSettings(true);
        app1.validateConfig();
    }
}
