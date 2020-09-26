package com.offcn.order.mapper;

import java.util.List;

import com.offcn.order.po.TTransaction;
import com.offcn.order.po.TTransactionExample;
import org.apache.ibatis.annotations.Param;

public interface TTransactionMapper {
    long countByExample(TTransactionExample example);

    int deleteByExample(TTransactionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TTransaction record);

    int insertSelective(TTransaction record);

    List<TTransaction> selectByExample(TTransactionExample example);

    TTransaction selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TTransaction record, @Param("example") TTransactionExample example);

    int updateByExample(@Param("record") TTransaction record, @Param("example") TTransactionExample example);

    int updateByPrimaryKeySelective(TTransaction record);

    int updateByPrimaryKey(TTransaction record);
}