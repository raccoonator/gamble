import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Main {
    public static void main(String[] args) {
        String play = "poker";
        Games g = new Games();
        Method[] games = g.getClass().getDeclaredMethods();
        for (Method game: games) {
            game.setAccessible(true);
            Annotation[] annotations = game.getDeclaredAnnotations();
            for(Annotation a:annotations){
                if(a instanceof Play){
                    if(((Play) a).commandName().equals(play)){
                        try {
                            int result = (int)game.invoke(g);
                            System.out.println(result);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
