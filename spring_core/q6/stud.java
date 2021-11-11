
package spring_core3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("st")
public class stud {
	@Value("123")
int id;
	@Value("raj")
String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
