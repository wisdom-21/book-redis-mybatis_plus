package wisdom21.model.system.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import wisdom21.common.util.RedisUtil;
import wisdom21.model.system.entity.UserEntity;
import wisdom21.model.system.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("test")
public class UserController {

    @Autowired
    private UserMapper userMapper;


    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list() {
        QueryWrapper<UserEntity> wrapper = new QueryWrapper<>();
        List<UserEntity> userEntities = userMapper.selectList(wrapper);
        return userEntities.toString();
    }

    @GetMapping(value = "test")
    public void analyzeQRCode() {
        redisUtil.set("test","测试数据",60);

        System.out.println(redisUtil.get("test"));
    }

}
