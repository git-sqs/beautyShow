package com.mac.product.service;

import com.mac.common.vo.ResultVo;


/**
 * @Author: sqs
 * @Date: 2019/12/14 16:42
 * @Description:
 * @Version: 1.0
 */
public interface ITotalSortService {

    ResultVo queryAllSort();

    ResultVo querySortByUp(int sortId);

    ResultVo backAllSort();
}
