package com.nowcoder.community.service;

import com.nowcoder.community.dao.DiscussportMapper;
import com.nowcoder.community.entity.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussPostService {
    @Autowired
    private DiscussportMapper discussportMapper;
    public List<DiscussPost> findDiscussPosts(int userId, int offset, int limit){
        return discussportMapper.selectDiscussPosts(userId, offset,limit);
    }
    public int findDiscussPostRows(int userId){
        return discussportMapper.selectDiscussPostRows(userId);
    }
}
