package com.yupi.yuojcodesandbox.controller;

import com.yupi.yuojcodesandbox.JavaNativeCodeSandbox;
import com.yupi.yuojcodesandbox.model.ExecuteCodeRequest;
import com.yupi.yuojcodesandbox.model.ExecuteCodeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024/9/8 10:01
 * @Version V1.0
 */
@RequestMapping
@RestController
public class MainController {

    @Autowired
    private JavaNativeCodeSandbox javaNativeCodeSandbox;

    @GetMapping("/test")
    public String test() {
        return "test";
    }


    /**
     * 执行代码
     * @param executeCodeRequest
     * @return
     */
    @PostMapping("/executeCode")
    ExecuteCodeResponse executeCode(@RequestBody ExecuteCodeRequest executeCodeRequest) {
        if (executeCodeRequest == null) {
            throw new RuntimeException("请求参数为空");
        }
        return javaNativeCodeSandbox.executeCode(executeCodeRequest);
    }
}
