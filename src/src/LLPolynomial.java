import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LLPolynomial implements Polynomial{

    private final List<Term> terms;

    public LLPolynomial(List<Term> terms) {
        this.terms = new LinkedList<>();
    }
    public LLPolynomial() {
        this.terms = new LinkedList<>();
    }

    @Override
    public boolean addTerm(Term t) {
        return terms.add(t);
    }

    @Override
    public boolean removeTerm(Term t) {
        return terms.remove(t);
    }

    @Override
    public int getTermCount() {
        return terms.size();
    }

    @Override
    public List<Character> getVariables() {
        List<Character> vars = new LinkedList<>();

        for(Term term : terms){
            char nvVar = term.getVariable();
            if(!vars.contains(nvVar)){
                vars.add(nvVar);
            }
        }

        return vars;
    }

    @Override
    public List<Integer> getExponents() {
        List<Integer> expos = new LinkedList<>();

        for(Term term : terms){
            int nvExp = term.getExponent();
            if(!expos.contains(nvExp)){
                expos.add(nvExp);
            }
        }
        return expos;
    }

    @Override
    public List<Term> getTerms(char variable, int exponent) {
        List<Term> newTerms = new LinkedList<>();
        for(Term term:this.terms){
            if (term.getVariable() == variable && term.getExponent() == exponent) {
                newTerms.add(term);
            }
        }
        return newTerms;
    }

    @Override
    public List<Term> getAllTerms() {
        return this.terms;
    }

    @Override
    public String toString() {
        if (terms.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Term term : this.terms) {
            if (sb.length() > 0 && term.getCoefficient() > 0) {
                sb.append("+");
            }
            sb.append(term.toString());
        }
        return sb.toString();
    }
    public void sort(){
        this.terms.sort(new TermComparator());
    }

}
