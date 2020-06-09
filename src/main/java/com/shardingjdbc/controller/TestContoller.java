package com.shardingjdbc.controller;

import com.shardingjdbc.exception.CustomerException;
import com.shardingjdbc.model.JsonResult;
import com.shardingjdbc.model.Order;
import com.shardingjdbc.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@RestController
@Slf4j
@Api(tags = "测试模块")
@RequestMapping("/test/")
public class TestContoller {

    @Autowired
    private OrderService orderService;

    @PostMapping("testParameter")
    @ApiOperation(value = "测试参数", notes = "测试参数")
    public JsonResult<String> mobileIn(
            @ApiParam(value = "名称", name = "name", required = false)
            @RequestParam(value = "name", required = false)
            @NotBlank(message = "名称不能为空")
                    String name,
            @ApiParam(value = "年龄", name = "age", required = false)
            @RequestParam(value = "age", required = false)
            @NotNull(message = "年龄不能为空")
                    Integer age
    ) throws CustomerException {
        int a = 1/0;
        return JsonResult.success("成功");
    }

    @PostMapping("testShard")
    @ApiOperation(value = "测试分片", notes = "测试分片")
    public JsonResult<String> testShard() throws CustomerException {
        orderService.testShard();
        return JsonResult.success("成功");
    }
}
