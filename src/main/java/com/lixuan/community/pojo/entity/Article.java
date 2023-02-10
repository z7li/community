package com.lixuan.community.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 文章表 
 * </p>
 *
 * @author lixuan
 * @since 2023-02-09
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("loris_article")
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 文章标题
     */
    @TableField("article_title")
    private String articleTitle;

    /**
     * 文章缩略图
     */
    @TableField("article_thumbnail_url")
    private String articleThumbnailUrl;

    /**
     * 文章作者id
     */
    @TableField("article_author_id")
    private Long articleAuthorId;

    /**
     * 文章类型
     */
    @TableField("article_type")
    private String articleType;

    /**
     * 文章标签
     */
    @TableField("article_tags")
    private String articleTags;

    /**
     * 浏览总数
     */
    @TableField("article_view_count")
    private Integer articleViewCount;

    /**
     * 预览内容
     */
    @TableField("article_preview_content")
    private String articlePreviewContent;

    /**
     * 评论总数
     */
    @TableField("article_comment_count")
    private Integer articleCommentCount;

    /**
     * 文章永久链接
     */
    @TableField("article_permalink")
    private String articlePermalink;

    /**
     * 站内链接
     */
    @TableField("article_link")
    private String articleLink;

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

    /**
     * 0:非优选1：优选
     */
    @TableField("article_perfect")
    private String articlePerfect;

    /**
     * 文章状态
     */
    @TableField("article_status")
    private String articleStatus;

    /**
     * 点赞总数
     */
    @TableField("article_thumbs_up_count")
    private Integer articleThumbsUpCount;

    /**
     * 赞赏总数
     */
    @TableField("article_sponsor_count")
    private Integer articleSponsorCount;
}
