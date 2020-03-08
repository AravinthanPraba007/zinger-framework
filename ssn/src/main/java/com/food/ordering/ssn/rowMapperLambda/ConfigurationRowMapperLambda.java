package com.food.ordering.ssn.rowMapperLambda;

import com.food.ordering.ssn.model.ConfigurationModel;
import com.food.ordering.ssn.model.ShopModel;
import org.springframework.jdbc.core.RowMapper;

import static com.food.ordering.ssn.column.ConfigurationColumn.*;

public class ConfigurationRowMapperLambda {
    public static final RowMapper<ConfigurationModel> configurationRowMapperLambda = (rs, rownum) -> {
        ConfigurationModel configurationModel = new ConfigurationModel();

        ShopModel shopModel = new ShopModel();
        shopModel.setId(rs.getInt(shopId));
        configurationModel.setShopModel(shopModel);

        configurationModel.setDeliveryPrice(rs.getDouble(deliveryPrice));
        configurationModel.setIsDeliveryAvailable(rs.getInt(isDeliveryAvailable));
        configurationModel.setIsOrderTaken(rs.getInt(isOrderTaken));
        return configurationModel;
    };
}