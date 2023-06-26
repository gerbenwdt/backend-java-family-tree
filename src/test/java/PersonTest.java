import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {
        Person person = new Person("TestKees","TestGraag",73,"Male");
        String result = person.getName();
        assertEquals("TestKees", result);
    }

    @Test
    void getMiddleName() {
        Person person = new Person("TestKees", "von", "TestGraag",73,"Male");
        String result = person.getMiddleName();
        assertEquals("von", result);
    }

    @Test
    void getLastName() {
        Person person = new Person("TestKees","TestGraag",73,"Male");
        String result = person.getLastName();
        assertEquals("TestGraag", result);
    }

    @Test
    void getSex() {
        Person person = new Person("TestKees","TestGraag",73,"Male");
        String result = person.getSex();
        assertEquals("Male", result);
    }

    @Test
    void getAge() {
        Person person = new Person("TestKees","TestGraag",73,"Male");
        int result = person.getAge();
        assertEquals(73, result);
    }

    @Test
    void getMother() {
        Person person = new Person("TestKees","TestGraag",73,"Male");
        Person parent = new Person("TestParent", "TestParentsLastname", 98,"female");
        person.setMother(parent);

        Person mother = person.getMother();

        assertEquals(mother,parent);
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
    void getSiblings() {

    }

    @Test
    void getChildren() {
    }

    @Test
    void getPets() {
    }

    @Test
    void setSex() {
    }

    @Test
    void setAge() {
    }

    @Test
    void setMother() {
    }

    @Test
    void setFather() {
    }

    @Test
    void setSiblings() {
    }

    @Test
    void setChildren() {
    }

    @Test
    void setPets() {
    }

    @Test
    void addParents() {
    }

    @Test
    void addChild() {
    }

    @Test
    void addPet() {
    }

    @Test
    void addSibling() {
    }

    @Test
    void getGrandChildren() {
    }
}