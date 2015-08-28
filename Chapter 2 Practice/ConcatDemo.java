

public class ConcatDemo
{
    public static void main( String [] args)
    {
        String animal1 = " quick brown fox" ;
        String animal2 = " lazy dog";
        String article = " the";
        String action = " jumps over";
        String messagea = article.concat(animal1);
        String messageb = messagea.concat(action);
        String messagec = messageb.concat(article);
        String message = messagec.concat(animal2);
        System.out.println(message);
        
        
    }
}