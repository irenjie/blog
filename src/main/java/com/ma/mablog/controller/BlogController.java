package com.ma.mablog.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ma.mablog.entity.Blog;
import com.ma.mablog.service.IBlogService;
import com.ma.mablog.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author ma
 * @since 2020-09-11
 */
@RestController
@RequestMapping("/mablog")
public class BlogController {
    @Autowired
    IBlogService blogService;

    /*
     * 文章列表
     */
    @GetMapping("/blogs")
    public Result blogs() {
        return Result.success(blogService.list());
    }

    /*
     * 根据 id 查找文章
     * @param blogId 文章 Id
     */
    @GetMapping("/blog/{blogId}")
    public Result detail(@PathVariable(name = "blogId") Long blogId) {
        return Result.success(blogService.getById(blogId));
    }

    /**
     * 文章编辑 修改或新建，id为 0 新建，其它修改
     *
     * @param blog
     */
    @PostMapping("/blogedit")
    public Result edit(@RequestBody Blog blog) {
        if (blog.getId() == 0) {
            blog.setCstCreate(LocalDateTime.now());
        }
        blog.setCstModified(LocalDateTime.now());
        boolean isSave = blogService.saveOrUpdate(blog);
        return isSave ? Result.success(200, "保存成功", blog.getId()) : Result.fail("保存失败");
    }

    /**
     * 文章删除
     * @param id
     */
    @GetMapping("/blogdelete/{id}")
    public Result delete(@PathVariable(name = "id") String id) {
        boolean isDel = blogService.removeById(id);
        return isDel ? Result.success("删除成功") : Result.fail("删除失败");
    }

}
