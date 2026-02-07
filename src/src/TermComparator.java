import java.util.Comparator;

public class TermComparator implements Comparator<Term> {

    @Override
    public int compare(Term term1, Term term2) {
        char var1 = term1.getVariable();
        char var2 = term2.getVariable();

        if(var1 == var2){
            return Integer.compare(term2.getExponent(), term1.getExponent());
        }
        else if(var1 == ' '){
            return 1;
        }
        else if(var2 == ' '){
            return -1;
        }
        return Character.compare(var1,var2);


    }

}
