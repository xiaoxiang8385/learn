package ms_build;

/**
 * 角色Builder：
 * @author: xiaoxiang
 * @date: 2017年1月6日
 */
public interface PersonBuilder {
     void buildHead();
     void buildBody();
     void buildFoot();
     Person buildPerson();
}