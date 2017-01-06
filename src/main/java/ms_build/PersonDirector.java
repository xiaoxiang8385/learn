package ms_build;


/**
 * 角色Director：
 * @author: xiaoxiang
 * @date: 2017年1月6日
 */
public class PersonDirector {
     public Person constructPerson(PersonBuilder pb) {
          pb.buildHead();
          pb.buildBody();
          pb.buildFoot();
          return pb.buildPerson();
     }
}
