package com.lean.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Administrator on 2020/12/25.
 */
@Data//get和set
@AllArgsConstructor //全参构造方法，全部参数的构造函数的自动生成，该注解的作用域也是只有在实体类上，参数的顺序与属性定义的顺序一致。
@NoArgsConstructor//空参，无参构造函数
public class CommonResult<T> {
    private  Integer code;
    private String message;
    private T      date;
    public CommonResult(Integer code, String message){
        this(code,message,null);
    }
}
