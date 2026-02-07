import java.util.List;

public class PolynomialToolbox {

    public static Polynomial simplify(Polynomial poly) {

        Polynomial resultat = new LLPolynomial();

        for (char var : poly.getVariables()) {

            for (int exp : poly.getExponents()) {
                List<Term> termList = poly.getTerms(var, exp);
                double totalCoef = 0;
                for (Term t : termList) {
                    totalCoef += t.getCoefficient();
                }
                if (totalCoef != 0) {
                    resultat.addTerm(new Term(totalCoef, var, exp));
                }
            }
        }
        return resultat;

    }

    public static Polynomial sum(Polynomial poly1, Polynomial poly2) {

        Polynomial resultat = new LLPolynomial();

        for(Term term : poly1.getAllTerms()){
            resultat.addTerm(term);
        }
        for(Term term : poly2.getAllTerms()){
            resultat.addTerm(term);
        }

        return simplify(resultat);


    }

}
