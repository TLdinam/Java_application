import java.util.Objects;

public class Person {
    public static String MALE_GENDER = "male";
    public static String FEMALE_GENDER = "female";
    private String firstName;
    private String lastName;
    private int age;
    private String partnerName;
    private String partnerLastName;
    private String gender;

    public Person(String firstName, String lastName, int age, String partnerName, String partnerLastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.partnerName = partnerName;
        this.partnerLastName = partnerLastName;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public String getPartnerLastName() {
        return partnerLastName;
    }

    public void setPartnerLastName(String partnerLastName) {
        this.partnerLastName = partnerLastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isRetired() {
        return (this.gender.equals(MALE_GENDER) && this.age >= 65) || (this.gender.equals(FEMALE_GENDER) && this.age >= 60);
    }

    public void registerPartnership () {
        this.lastName = this.gender.equals(FEMALE_GENDER) ? this.partnerLastName + 'a' : this.lastName;
    }

    public void deregisterPartnership (boolean rollbackToPreviousLastName, String previousLastName) {
        this.lastName = rollbackToPreviousLastName ? previousLastName : this.lastName;
    }

    public boolean isRespectPartner() {
        return this.lastName.equals(this.partnerLastName);
    }
}
