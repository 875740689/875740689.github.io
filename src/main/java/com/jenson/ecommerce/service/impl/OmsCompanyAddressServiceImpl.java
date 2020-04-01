package com.jenson.ecommerce.service.impl;

import com.jenson.ecommerce.service.OmsCompanyAddressService;
import com.jenson.ecommerce.mapper.OmsCompanyAddressMapper;
import com.jenson.ecommerce.model.OmsCompanyAddress;
import com.jenson.ecommerce.model.OmsCompanyAddressExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 收货地址管理Service实现类
 *
 */
@Service
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService {
    @Autowired
    private OmsCompanyAddressMapper companyAddressMapper;
    @Override
    public List<OmsCompanyAddress> list() {
        return companyAddressMapper.selectByExample(new OmsCompanyAddressExample());
    }
}
