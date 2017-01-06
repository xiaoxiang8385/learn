package ms_build;

/**
 * 角色ConcreteBuilder：
 * @author: xiaoxiang
 * @date: 2017年1月6日
 */
public class ManBuilder implements PersonBuilder {
     Person person;
     public ManBuilder() {
          person = new Man();
     }
     public void buildBody() {
          person.setBody("建造男人的身体");
          System.out.println("建造男人的身体");
     }
     public void buildFoot() {
          person.setFoot("建造男人的脚");
          System.out.println("建造男人的脚");
     }
     public void buildHead() {
          person.setHead("建造男人的头");
          System.out.println("建造男人的头");
     }
     public Person buildPerson() {
          return person;
     }
}
