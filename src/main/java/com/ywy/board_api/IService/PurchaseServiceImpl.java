package com.ywy.board_api.IService;

import com.ywy.board_api.Service.PurchaseService;
import com.ywy.board_api.dao.PurchaseRepository;
import com.ywy.board_api.entity.Purchase;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class PurchaseServiceImpl implements PurchaseService {
    @Resource
    PurchaseRepository purchaseRepository ;

    @Override
    public List<Purchase> findAll() {
        return purchaseRepository.findAllDesc() ;
    }

    @Override
    public void delete(int id) {
        purchaseRepository.deleteById(id);
    }

    @Override
    public Purchase add(Purchase purchase) {
//        UUID uuid=UUID.randomUUID();
//        String str = uuid.toString();
//        String uuidStr=str.replace("-", "");

//        Date date=new Date();
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        df.format(date);
//        purchase.setPurchaseDate(date);
        return purchaseRepository.save(purchase);
    }
}
