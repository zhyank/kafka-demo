package kafka.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author yan
 */
@Data
@ToString
public class User implements Serializable {
    /**
     * 姓名
     */
    private String userName;
    /**
     * 年龄
     */
    private Integer age;
}