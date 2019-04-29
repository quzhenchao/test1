package cn.itcast.service.impl;

import cn.itcast.dao.ItemsDao;
import cn.itcast.domain.Items;
import cn.itcast.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//加入容器
@Service
//加上事务管理
@Transactional
public class ItemserviceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;

    public Items findbyid(Integer id) {
        return itemsDao.finfitems(id);
    }
}
