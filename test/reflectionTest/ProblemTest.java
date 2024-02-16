package reflectionTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import reflection.Person;
import reflection.Problem;
import reflection.TypeOfProblem;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProblemTest {

    Problem problem;
    Person person;
    @BeforeEach
    public void setUp() {
        problem = new Problem("money", TypeOfProblem.EDUCATION);
        person = new Person();
    }

@Test
public void listOfProblemIsEmptyTest() {

        assertTrue(person.problems.isEmpty());

}

@Test
public void problemCanBeAdded_addProblemTest() {

        assertTrue(person.problems.isEmpty());
        person.addProblem(problem);
        assertFalse(person.problems.isEmpty());

}
@Test
public void problemCanBeRemoved_removeProblemTest() {

        assertTrue(person.problems.isEmpty());
        person.addProblem(problem);
        assertFalse(person.problems.isEmpty());
        person.removeProblem(problem);
        assertTrue(person.problems.isEmpty());

}

@Test
public void moreThanOneProblemCanBeAdded_addProblemTest() {

        assertTrue(person.problems.isEmpty());
        person.addProblem(problem);
        assertFalse(person.problems.isEmpty());
        person.addProblem(problem);
        assertFalse(person.problems.isEmpty());

}

@Test
public void moreThanOneProblemCanBeAdded_oneProblemCanBeRemovedTest() {
        assertTrue(person.problems.isEmpty());
        person.addProblem(problem);
        assertFalse(person.problems.isEmpty());
        person.addProblem(problem);
        assertFalse(person.problems.isEmpty());
        person.removeProblem(problem);
        assertFalse(person.problems.isEmpty());
}




}