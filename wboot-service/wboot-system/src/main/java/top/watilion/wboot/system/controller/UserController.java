package top.watilion.wboot.system.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.watilion.wboot.common.vo.Response;
import top.watilion.wboot.system.po.UserPo;
import top.watilion.wboot.system.service.UserService;

/**
 * @author watilion
 * @date 2021/7/9 17:35
 */
@Slf4j
@RestController
@Tag(name = "UserController", description = "用户信息")
@RequestMapping("/system/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    @Operation(description="根据ID获取用信息")
    public Response<UserPo> get(@PathVariable Long id){
        Response<UserPo> response = new Response<>();
        UserPo userPo = userService.getById(id);
        return response.success(userPo);
    }
}
