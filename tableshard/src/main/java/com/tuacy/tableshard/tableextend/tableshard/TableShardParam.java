package com.tuacy.tableshard.tableextend.tableshard;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * @name: TableShardParam
 * @author: tuacy.
 * @date: 2019/8/30.
 * @version: 1.0
 * @Description: 添加在参数上的注解
 * <p>
 * 我们是这样考虑的,分表核心在于确定表的名字,表的名字怎么来,肯定是通过某个参数来获取到.
 * 所以,这里我们设计TableShardParam注解,用于添加在参数上,让我们方便的获取到通过那个参数来获取表名
 * 1. value = ""
 * 2. value = "xxx"
 */
@Documented
@Inherited
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface TableShardParam {

    @AliasFor("dependFieldName")
    String value() default "";

    /**
     * dependFieldName取到我们需要的获取表名的依据
     */
    @AliasFor("value")
    String dependFieldName() default "";

}
