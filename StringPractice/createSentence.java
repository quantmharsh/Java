package StringPractice;
import java.util.Random;

import java.beans.VetoableChangeSupport;


class SentenceMaker
{

    void sentence()
    {
        Random rand= new Random();
        String[] article={ "the", "a", "one", "some","any"};
        String [] noun ={"boy", "girl", "dog", "town" , "car" };
        String[] verb ={"drove", "jumped", "ran", "walked" , "skipped"};
        String [] preposition={"to", "from", "over", "under" ,"on"};
        for( int i=0;i<20;i++)
        {
            String article1 =article[rand.nextInt(article.length)];
            String noun1 =noun[rand.nextInt(noun.length)];
            String verb1=verb[rand.nextInt(verb.length)];
            String preposition1= preposition[rand.nextInt(preposition.length)];
            String article2= article[rand.nextInt(article.length)];
            String  noun2= noun[rand.nextInt(noun.length)];
            String concateneString =  article1.substring(0,1).toUpperCase()+article1.substring(1)+" "+noun1+" "+verb1+" "+preposition1+" "+article2+ " "+noun2;
            System.out.println(concateneString);


        }

    }
}
public  class createSentence {
    public static void main(String[] args) {
        SentenceMaker sm=  new SentenceMaker();
        sm.sentence();
    }
    
}

