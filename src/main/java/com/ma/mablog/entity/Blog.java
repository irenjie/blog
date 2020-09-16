package com.ma.mablog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author ma
 * @since 2020-09-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@JsonIgnoreProperties({"isDelete"})
public class Blog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章描述
     */
    private String description;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 逻辑删除,1删除，0未删
     */
    private Integer isDelete;

    /**
     * create时间
     */
    private LocalDateTime cstCreate;

    /**
     * modified时间
     */
    private LocalDateTime cstModified;


}
