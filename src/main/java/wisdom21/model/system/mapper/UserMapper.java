package wisdom21.model.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import wisdom21.model.system.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {

}
