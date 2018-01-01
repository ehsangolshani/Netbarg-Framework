package item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ehsangolshani on 1/1/18.
 */
public class TermOfUse {
    private List<String> terms;

    public TermOfUse(List<String> terms) {
        if (terms != null) {
            this.terms = terms;
        } else {
            this.terms = new ArrayList<String>();
        }
    }

    public String getTerm(int index) {
        return terms.get(index);
    }

    public void addTerm(String term) {
        this.terms.add(term);
    }

    public List<String> getTerms() {
        return terms;
    }

    public void addTerms(List<String> terms) {
        this.terms.addAll(terms);
    }
}
