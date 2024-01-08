import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person testPerson;
    Person testFather;
    Person testMother;
    Person testChild;
    Person testGrandChild;
    Pet testPet;
    String expected;

    @BeforeEach
    // Arrange
    void setup(){
        testPerson = new Person("Robin", "Berg", 23, "Male");
        testFather = new Person("Kees", "Dalen", 54, "Male");
        testMother = new Person("Miep", "Hopla",45,"Female");
        testChild = new Person("Kiddo", "Familyname", 7, "Female");
        testGrandChild = new Person("Jip", "GrandChild", 3, "Male");
        testPet = new Pet("Mickey", 3, "Mouse");
    }

    @Test
    void getFather() {
        Person person = new Person("TestKees","TestGraag",73,"Male");
        Person parent = new Person("TestParent", "TestParentsLastname", 89,"male");
        person.setFather(parent);

        Person father = person.getFather();

        assertEquals(father,parent);
    }

    @Test
    void addParents() {
        // act
        testPerson.addParents(testPerson, testFather, testMother);

        // assert
        assertEquals(testPerson.getFather(), testFather);
        assertEquals(testPerson.getMother(), testMother);
    }

    @Test
    void addChild() {
        testPerson.addChild(testPerson, testChild);

        for (Person child : testPerson.getChildren()){
            assertEquals(child, testChild);
        }
    }

    @Test
    void addPet() {
        testPerson.addPet(testPet);

        for (Pet pets : testPerson.getPets()){
            assertEquals(pets, testPet);
        }
    }

    @Test
    void addSibling() {
        testPerson.addSibling(testChild);

        for (Person siblings : testPerson.getSiblings()){
            assertEquals(siblings, testChild);
        }
    }

    @Test
    void getGrandChildren() {
        testPerson.addChild(testPerson,testChild);
        testChild.addChild(testChild,testGrandChild);

        for (Person grandChilds : testPerson.getGrandChildren()){
            assertEquals(grandChilds, testGrandChild);
        }
    }
}