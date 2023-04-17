package LambdaBasic;

import java.util.Comparator;

/*
Наставники JavaRush
*/

public class NameComparator implements Comparator<JavaRushMentor>{
    //напишите тут ваш код
    public int compare (JavaRushMentor mentor1, JavaRushMentor mentor2){
        return mentor1.toString().length() - mentor2.toString().length();
    }
}