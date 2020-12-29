package com.lean.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by Administrator on 2020/12/28.
 */
@Data//get和set
@AllArgsConstructor //全参，全部参数的构造函数的自动生成，该注解的作用域也是只有在实体类上，参数的顺序与属性定义的顺序一致。
@NoArgsConstructor//空参，无参构造函数
public class Payment implements Serializable {
    private Long id;
    private String serial;
}