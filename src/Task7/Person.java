package Task7;

public class Person {

    private String name;

    private int age;

    private  MaleType maleType;

    public Person(String name, int age, MaleType maleType) {
        this.name = name;
        this.age = age;
        this.maleType = maleType;
    }

    public String getName() {
        if (maleType.equals(MaleType.MALE)) {
            return "Mr. " + name;
        }else {
            return "Mrs. " + name;
        }

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MaleType getMaleType() {
        return maleType;
    }

    public void setMaleType(MaleType maleType) {
        this.maleType = maleType;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", maleType=" + maleType +
                '}';
    }
}
