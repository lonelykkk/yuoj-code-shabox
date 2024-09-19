package com.yupi.yuojcodesandbox.model;

import lombok.Data;

/**
 * 进程执行信息
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024/9/8 16:07
 * @Version V1.0
 */
@Data
public class ExecuteMessage {
    private Integer exitValue;

    private String message;

    private String errorMessage;

    private Long time;
    private Long Memory;
}
