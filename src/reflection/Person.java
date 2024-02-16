package reflection;

import java.util.ArrayList;
import java.util.List;

public class Person {
    public List<Problem> problems = new ArrayList<>();


    public void addProblem (Problem problem){
        problems.add(problem);
    }

    public void removeProblem (Problem problem) {
        problems.remove(problem);
    }

    public List<Problem> countProblem() {
        return problems;
    }
}
