package cn.ruiyeclub.controller;


import cn.ruiyeclub.entity.UserRecord;
import cn.ruiyeclub.service.UserRecordService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (UserRecord)表控制层
 *
 * @author Ray。
 * @date 2020-07-18 10:15:38
 */
@Api(tags = "用户信息管理")
@RestController
@RequestMapping("userRecord")
public class UserRecordController /*extends ApiController*/ {
    /**
     * 服务对象
     */
    @Resource
    private UserRecordService userRecordService;

    /**
     * 分页查询所有数据
     * @param page       分页对象
     * @param userRecord 查询实体
     * @return 所有数据
     */
    @ApiOperation("分页查询所有数据")
    @GetMapping("page")
    public String selectAll(/*Page<UserRecord> page,*/ UserRecord userRecord) {
        return null;
//        return success(this.userRecordService.page(page, new QueryWrapper<>(userRecord)));
    }

    /**
     * 通过主键查询单条数据
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation("通过主键查询单条数据")
    @GetMapping("{id}")
    public String selectOne(@PathVariable Serializable id) {
        return null;
//        return success(this.userRecordService.getById(id));
    }

    /**
     * 新增数据
     * @param userRecord 实体对象
     * @return 新增结果
     */
    @ApiOperation("新增数据")
    @PostMapping("insert")
    public String insert(@RequestBody UserRecord userRecord) {
        return null;
//        return success(this.userRecordService.save(userRecord));
    }

    /**
     * 修改数据
     * @param userRecord 实体对象
     * @return 修改结果
     */
    @ApiOperation("修改数据")
    @PutMapping("update")
    public String update(@RequestBody UserRecord userRecord) {
        return null;
//        return success(this.userRecordService.updateById(userRecord));
    }

    /**
     * 删除数据
     * @param idList 主键结合
     * @return 删除结果
     */
    @ApiOperation("删除数据")
    @DeleteMapping("delete")
    public String delete(@RequestParam("idList") List<Long> idList) {
        return null;
//        return success(this.userRecordService.removeByIds(idList));
    }
}