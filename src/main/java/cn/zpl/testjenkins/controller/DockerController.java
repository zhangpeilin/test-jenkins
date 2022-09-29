package cn.zpl.testjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author zhangpl1
 * @date 2022/9/29
 */
@RestController
public class DockerController {

    @GetMapping("/test")
    public String testDocker(){
        return "jenkins 测试成功";
    }
}
