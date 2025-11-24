import java.sql.*;

public class StudentDAO {

    private Connection getConnection() throws Exception {
        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/sms?useSSL=false&allowPublicKeyRetrieval=true",
            "root",
            "root123"
        );
    }

   
    public void addStudent(Student s) {
        try {
            Connection con = getConnection();
            String q = "INSERT INTO students VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());
            ps.setInt(3, s.getAge());
            ps.setString(4, s.getCourse());
            ps.executeUpdate();
            System.out.println("Student added successfully!");
        } catch(Exception e) { 
            System.out.println(e);
        }
    }

    
    public void viewStudents() {
        try {
            Connection con = getConnection();
            String q = "SELECT * FROM students";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q);

            while(rs.next()) {
                System.out.println(
                    rs.getInt(1) + " | " +
                    rs.getString(2) + " | " +
                    rs.getInt(3) + " | " +
                    rs.getString(4)
                );
            }
                     con.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    
    public void deleteStudent(int id) {
        try {
            Connection con = getConnection();
            String q = "DELETE FROM students WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Student deleted!");
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    
    public void updateStudent(int id, String newCourse) {
        try {
            Connection con = getConnection();
            String q = "UPDATE students SET course = ? WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setString(1, newCourse);
            ps.setInt(2, id);
            ps.executeUpdate();
            System.out.println("Student updated!");
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}