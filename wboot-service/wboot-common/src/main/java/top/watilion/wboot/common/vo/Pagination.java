package top.watilion.wboot.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author watilion
 * @date 2021/5/3 00:49
 */
@Data
@ApiModel(description = "分页信息实体")
public class Pagination {
    @ApiModelProperty(value = "当前页数")
    private int current;

    @ApiModelProperty(value = "数据总数")
    private long total;

    @ApiModelProperty(value = "每页展示数")
    private int pageSize;

    @ApiModelProperty(value = "总页数")
    private int pages;

    public Pagination() {
    }

    public Pagination(int current, long total,int pageSize,int pages) {
        this.current = current;
        this.total = total;
        this.pageSize = pageSize;
        this.pages = pages;
    }
}
