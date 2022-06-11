/**
 * @author duccaom
 * @version 1.0
 * @since 2022/06/11
 */
public class Student {

  private String name;
  private String email;
  private String address;

  private Sport sport;

  public Student() {
  }

  public Student(String name, String email, String address, Sport sport) {
    this.name = name;
    this.email = email;
    this.address = address;
    this.sport = sport;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Sport getSport() {
    return sport;
  }

  public void setSport(Sport sport) {
    this.sport = sport;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", email='" + email + '\'' +
        ", address='" + address + '\'' +
        ", sport=" + sport +
        '}';
  }
}
