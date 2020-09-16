package com.ma.mablog.service.impl;

import com.ma.mablog.entity.Blog;
import com.ma.mablog.mapper.BlogMapper;
import com.ma.mablog.service.IBlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ma
 * @since 2020-09-11
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements IBlogService {

}
