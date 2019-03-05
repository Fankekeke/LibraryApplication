package com.library.library.mapper;

import com.library.library.pojo.sales;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface SalesMapper {
    /**
     * 查询订单信息
     * @return
     */
    List<sales> selectSales();

    /**
     * 添加订单消息
     * @param sales
     * @return
     */
    int insertSale(sales sales);

    /**
     * 删除订单消息
     * @param saleId
     * @return
     */
    int deleteSale(@Param("saleId") int saleId);

    /**
     * 根据id查询订单信息
     * @param saleId
     * @return
     */
    sales selectSaleById(@Param("saleId") int saleId);

    /**
     * 分页查询
     * @param pageNo
     * @param pageSize
     * @param titleId
     * @return
     */
    List<sales> selectSalesByFenye(@Param("pageNo") Integer pageNo, @Param("pageSize") Integer pageSize,@Param("titleId") Integer titleId,@Param("userId") Integer userId);

    /**
     * 查询总数量
     * @return
     */
    int selectSalesCount();

    /**
     * 修改订单
     * @param sales
     * @return
     */
    int updateSale(sales sales);

    /**
     * 查询即将过期订单
     * @param nowTime
     * @return
     */
    List<sales> selectUps(@Param("nowTime") Date nowTime);
}
