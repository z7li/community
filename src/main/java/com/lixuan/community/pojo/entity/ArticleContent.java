package com.lixuan.community.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 文章正文表
 * </p>
 *
 * @author lixuan
 * @since 2023-02-09
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("loris_article_content")
public class ArticleContent implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableField("id_article")
    private Long idArticle;

    /**
     * 文章内容原文
     */
    @TableField("article_content")
    private String articleContent;

    /**
     * 文章内容Html
     */
    @TableField("article_content_html")
    private String articleContentHtml;

    /**
     * 创建时间
     */
    @TableField("created_time")
    private LocalDateTime createdTime;

    /**
     * 更新时间
     */
    @TableField("updated_time")
    private LocalDateTime updatedTime;
}
