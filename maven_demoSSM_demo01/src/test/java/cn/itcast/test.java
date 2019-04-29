package cn.itcast;

import cn.itcast.dao.ItemsDao;
import cn.itcast.domain.Items;
import cn.itcast.service.ItemsService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    @Test
    public void daotest() {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationcontext.xml");
        ItemsDao bean = app.getBean(ItemsDao.class);
        Items finfitems = bean.finfitems(1);
        System.out.println(finfitems);
    }

    @Test
    public void servicetest() {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationcontext.xml");
        ItemsService bean = app.getBean(ItemsService.class);
        Items finfitems = bean.findbyid(1);
        System.out.println(finfitems);
    }

    @Test
    public static void one(){
        System.out.println("1111111");
    }
}
