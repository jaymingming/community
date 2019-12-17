package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface DiscussportMapper {
    //后面两个参数用于分页查询
    //含有多个参数时需要加上@Param
    List<DiscussPost> selectDiscussPosts(@Param("userId")int userId, @Param("offset")int offset, @Param("limit")int limit);
    //List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);
    //@Param注解用于给参数取别名
    //如果只有一个参数，并且在<if>里面使用，则必须加别名
    //查询帖子的行数
    int selectDiscussPostRows(@Param("userId") int userId);
    //int selectDiscussPostRows(@Param("userId") int userId);
   // List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    // @Param注解用于给参数取别名,
    // 如果只有一个参数,并且在<if>里使用,则必须加别名.

}
