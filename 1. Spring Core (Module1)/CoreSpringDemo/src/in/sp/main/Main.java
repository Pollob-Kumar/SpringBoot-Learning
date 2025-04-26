/*3*/
package in.sp.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import in.sp.beans.Student;

public class Main
{
	public static void main(String[] args)
	{
		Resource resource = new ClassPathResource("/in/sp/resources/applicationContext.xml"); /* just XML path ekta object er  vitor nibar jonno */
		
		BeanFactory container = new XmlBeanFactory(resource); /* object bade sorasori path dileo hoto. container object create korar karon getBean method k call korar jonno. BeanFactory parent intterface*/
		Student std = (Student) container.getBean("stdObj");  /*1.akhane main target getBean k call kora, karon Bean proparty  gula get korar jonno. 2.akadhik pojo class thakte pare tai alada aldaa vabe refarence vaariable create kori main class a. 
		                                                        3.Student right side dibar karonn return type same rakhar jonno (left & right side). Note: right side default return korchilo BeanFactory.
		                                                        4.right side a student return type diya lagto na jokhon amra perametare  reference variable "stdObj" bade direct POJO class bosabo */
		                                                           
		std.display();    /*ekti specific pojo class er method k call kora hoiche getBean er refarence variable dara*/
	}
}