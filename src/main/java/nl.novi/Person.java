import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String middleName;
    private String lastName;
    private String sex;
    private int age;
    private Person mother;
    private Person father;
    private List<Person> siblings = new ArrayList<Person>();
    private List<Person> children = new ArrayList<Person>();
    private List<Pet> pets = new ArrayList<Pet>();
//    private Person partner;

    public Person(String name, String lastName, int age, String sex){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }
    public Person(String name, String middleName, String lastName, int age, String sex){
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public List<Person> getChildren() {
        return children;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void setSiblings(List<Person> siblings) {
        this.siblings = siblings;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public void addParents(Person child, Person father, Person mother) {
        child.setMother(mother);
        child.setFather(father);
        mother.addChild(mother, child);
        father.addChild(father, child);
    }
    public void addChild(Person parent, Person child){
        List<Person> childs = new ArrayList<>();
        if (parent.getChildren() != null){
            for (Person person : parent.getChildren()){
                childs.add(person);
            }
        }
        childs.add(child);
        parent.setChildren(childs);
//        this.children.add(child);
    }
    public void addPet(Pet pet){
        this.pets.add(pet);
    }
    public void addSibling(Person sibling){
        this.siblings.add(sibling);
    }

    public List<Person> getGrandChildren() {
        List<Person> grandChildren = new ArrayList<>();

        for (Person child : children) {
            for (Person grandChild : child.getChildren()) {
                grandChildren.add(grandChild);
            }
        }
        return grandChildren;
    }

//    public List<Person> getGrandChildren(Person person){
//        List<Person> grandChildren = new ArrayList<>();
//        if(person.getChildren() != null){
//            for (Person children : person.getChildren()){
//                if (children.getChildren() != null){
//                    for (Person grandChild : children.getChildren()){
//                        grandChildren.add(grandChild);
//                    }
//                }
//            }
//        }
//        return grandChildren;
//    }

}
