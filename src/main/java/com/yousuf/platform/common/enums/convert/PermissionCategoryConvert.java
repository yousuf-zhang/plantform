package com.yousuf.platform.common.enums.convert;

import com.yousuf.platform.common.core.BaseEnum;
import com.yousuf.platform.common.enums.PermissionCategoryEnum;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Objects;

/**
 * <p> Title: TrueOrFalseConvert
 * <p> Description: 枚举转换
 *
 * @author yousuf zhang 2019/11/17
 */
@Converter(autoApply = true)
public class PermissionCategoryConvert implements AttributeConverter<PermissionCategoryEnum, Integer> {
    @Override
    public Integer convertToDatabaseColumn(PermissionCategoryEnum attribute) {
        return Objects.isNull(attribute) ? null : attribute.getCode();
    }

    @Override
    public PermissionCategoryEnum convertToEntityAttribute(Integer dbData) {
        return Objects.isNull(dbData) ? null : BaseEnum.findByCode(PermissionCategoryEnum.class, dbData);
    }
}
