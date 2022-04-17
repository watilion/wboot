package top.watilion.wboot.system.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.watilion.wboot.common.vo.Response;

/**
 * @author watilion
 * @date 2021/7/9 17:35
 */
@RestController
@Api("用户信息")
public class UserController {

    @GetMapping("/hello")
    @ApiOperation("hello world")
    public Response<Void> hello(){
        return new Response<Void>().success("Hello World");
    }
}
