package top.watilion.wboot.system.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author watilion
 * @date 2022/1/22 23:43
 */
@Data
@Schema(description = "用户持久化对象")
@TableName("user")
public class UserPo {

    @TableId
    @Schema(name = "id", description = "用户ID")
    private Long id;

    @Schema(description = "姓名")
    private String name;

    @Schema(description = "用户名")
    private String username;
}
