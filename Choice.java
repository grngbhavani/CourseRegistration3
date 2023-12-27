package Registration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import Registration.Login;
public class Choice {
	public String user_choice(String email) {
	
		Connection krishna = null;
		
		
		try {
			krishna = DriverManager.getConnection("jdbc:mysql://localhost:3306/CourseRegistration","root","admin");
			System.out.println("db connected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean loop=true;
		while(loop) {
			 System.out.println("Enter your choice \n1.display cources\n2.check report\n3.exit");
			 Scanner myObj = new Scanner(System.in);
			 int userinput = myObj.nextInt();
			switch(userinput) {
			case 1:
				System.out.println("Cources are \n enter\n1.java\n2.python\n3.deep learning\n4.data structure");
				int usercource = myObj.nextInt();
				
				switch(usercource) 
				{
				case 1:
					System.out.println("you chosed java");
					
					System.out.println("Java is a popular programming language.\n"
							
							+ "Java is used to develop mobile apps, web apps, desktop apps, games and much more.Java is one of the most popular and widely used programming language and platform. A platform is an environment that helps to develop and run programs written in any programming language.\r\n"
							+ "Java is fast, reliable and secure. From desktop to web applications, scientific supercomputers to gaming consoles, cell phones to the Internet, Java is used in every nook and corner.Java Environment: The programming environment of Java consists of three components mainly:\r\n"
							+ "JDK, "
							+ "JRE, "
							+ "JVM, ");
					System.out.println("Your cource completed\n enter email-id");
					email=myObj.next();
					System.out.println("your certificate is mailed to your "+email);
					
					//selecting id
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					String q = "UPDATE CourseRegistration SET statuss = ? WHERE course = ?";					//update
					try {
						PreparedStatement ps=krishna.prepareStatement(q);
						
						ps.setBoolean(1,true);
						ps.setString(2,"java");
						int row=ps.executeUpdate();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
					break;
					
				case 2:
					
					System.out.println("you chosed python");

					System.out.println("FUNDAMENTALS");
					System.out.println("Python is an interpreted, object-oriented, high-level programming language with dynamic semantics. Its high-level built in data structures, combined with dynamic typing and dynamic binding, make it very attractive for Rapid Application Development, as well as for use as a scripting or glue language to connect existing components together. Python's simple, easy to learn syntax emphasizes readability and therefore reduces the cost of program maintenance.");
					System.out.println("ADVANCED PYTHON CONCEPTS");
					System.out.println("Web development:\r\n"
							+ "Python is a popular choice for web development, especially for frameworks like Django and Flask.\r\n"
							+ "Data science:\r\n"
							+ "Python is also a popular choice for data science, with libraries like NumPy, Pandas, and scikit-learn.\r\n"
							+ "Machine learning:\r\n"
							+ "Python is also a popular choice for machine learning, with libraries like TensorFlow and PyTorch.\r\n"
							+ "Artificial intelligence:\r\n"
							+ "Python is also a popular choice for artificial intelligence, with libraries like TensorFlow and PyTorch.\r\n"
							+ "Scientific computing:\r\n"
							+ "Python is also a popular choice for scientific computing, with libraries like NumPy and SciPy.\r\n"
							+ "Software development:\r\n"
							+ "Python is also a popular choice for software development, with libraries like PyQt and Tkinter.\r\n"
							+ "Game development:\r\n"
							+ "Python is also a popular choice for game development, with libraries like Pygame and PyOpenGL.\r\n"
							+ "Mobile development:\r\n"
							+ "Python is also a popular choice for mobile development, with frameworks like Kivy and BeeWare.");
				
					System.out.println("Your cource completed\n enter email-id");
					email=myObj.next();
					System.out.println("your certificate is mailed to your "+email);
				
					
					//selecting id
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					String q_p = "UPDATE CourseRegistration SET statuss = ? WHERE course = ?";					//update
					try {
						PreparedStatement ps=krishna.prepareStatement(q_p);
						
						ps.setBoolean(1,true);
						ps.setString(2,"python");
						int row=ps.executeUpdate();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 3:
					System.out.println("you chosed Deep Learning");
					System.out.println("Deep learning is a branch of machine learning which is based on artificial neural networks.\nIt is capable of learning complex patterns and relationships within data. In deep learning, we don’t need to explicitly program everything.");
						System.out.println("Your cource completed\n enter email-id");
					email=myObj.next();
					System.out.println("your certificate is mailed to your "+email);
				
					
					//selecting id
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					String q_c = "UPDATE CourseRegistration SET statuss = ? WHERE course = ?";					//update
					try {
						PreparedStatement ps=krishna.prepareStatement(q_c);
						
						ps.setBoolean(1,true);
						ps.setString(2,"deep learning");
						int row=ps.executeUpdate();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
					
				case 4:
					System.out.println("you chosed data structure");
					System.out.println("A data structure is a storage that is used to store and organize data. It is a way of arranging data on a computer so that it can be accessed and updated efficiently.");
					System.out.println("Your cource completed\n enter email-id");
					email=myObj.next();
					System.out.println("your certificate is mailed to your "+email);
				
					
					//selecting id
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					String q_d = "UPDATE CourseRegistration SET statuss = ? WHERE course = ?";					//update
					try {
						PreparedStatement ps=krishna.prepareStatement(q_d);
						
						ps.setBoolean(1,true);
						ps.setString(2,"data structure");
						int row=ps.executeUpdate();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
					break;	
				}
				break;
			case 2:
				
				String selec="select course from CourseRegistration where email=? and statuss=1";
				try {
					PreparedStatement p=krishna.prepareStatement(selec);
					p.setString(1, email);
					ResultSet w=p.executeQuery();
					System.out.println("compleated cources");
					while(w.next()) {
						String course=w.getString("course");
						System.out.println(course);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String nselec="select course from CourseRegistration where email=? and statuss=0";
				try {
					PreparedStatement p=krishna.prepareStatement(nselec);
					p.setString(1, email);
					ResultSet w=p.executeQuery();
					System.out.println("not compleated cources");
					while(w.next()) {
						String course=w.getString("course");
						System.out.println(course);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
			case 3:
				loop=false;
				System.out.println("logged out");
				break;
				
			}
			
			
		}
		return email;
		
	}

	
		// TODO Auto-generated method stub
	
}