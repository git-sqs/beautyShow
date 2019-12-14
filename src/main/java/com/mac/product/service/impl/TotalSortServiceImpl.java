package com.mac.product.service.impl;

import com.mac.common.vo.ResultVo;
import com.mac.product.dao.TotalSortMapper;
import com.mac.product.entity.TotalSort;
import com.mac.product.service.ITotalSortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: sqs
 * @Date: 2019/12/14 16:42
 * @Description:
 * @Version: 1.0
 */
@Service
public class TotalSortServiceImpl implements ITotalSortService {

    @Autowired
    TotalSortMapper totalSortMapper;

    @Override
    public ResultVo queryAllSort() {
        return ResultVo.Ok(totalSortMapper.queryAllSort());
    }

    @Override
    public ResultVo querySortByUp(int sortId) {
        return ResultVo.Ok(totalSortMapper.querySortByUp(sortId));
    }
}
