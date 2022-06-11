/**
 *
 * @author duccaom
 * @version 1.0
 * @since 2022/06/11
 */
public class Main {

  public static void main(String[] args) {

    Sport soccer = new Sport();
    soccer.setName("soccer");

    // TODO: Nếu lỡ như student không muốn chơi đá banh nữa thì sao
    // TODO: Tạo 1 Object Sport mới hả ? e.g: Sport swim = new Sport("swim"); student.setSport(swim) ???
    // => 2 object đang bị phụ thuộc vào nhau, khó thay đổi, mở rộng về sau
    Student student = new Student();
    student.setName("Duc Cao");
    student.setAddress("82 Truong Chinh, Hue");
    student.setEmail("test@gmail.com");
    student.setSport(soccer);

    System.out.println(student);
  }
}
