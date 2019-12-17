package com.nowcoder.community;

import com.nowcoder.community.dao.DiscussportMapper;
import com.nowcoder.community.dao.UserMapper;
import com.nowcoder.community.entity.DiscussPost;
import com.nowcoder.community.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class ApplicationTests {

	@Autowired
	UserMapper userMapper;

	@Autowired
	DiscussportMapper discussportMapper;
	@Test
	public void contextLoads() {
		User user = userMapper.selectById(101);
		System.out.println(user);
		User user1 = userMapper.selectByName("nowcoder23");
		System.out.println(user1);
	}
	@Test
	public void testSelectPosts(){
		List<DiscussPost> list = discussportMapper.selectDiscussPosts(0,0,10);
		for(DiscussPost post : list){
			System.out.println(post);
		}
		int rows = discussportMapper.selectDiscussPostRows(149);
		System.out.println(rows);
	}
}
