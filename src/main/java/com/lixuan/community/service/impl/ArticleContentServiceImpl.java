package com.lixuan.community.service.impl;

import com.lixuan.community.pojo.entity.ArticleContent;
import com.lixuan.community.mapper.ArticleContentDao;
import com.lixuan.community.service.ArticleContentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章正文表 服务实现类
 * </p>
 *
 * @author lixuan
 * @since 2023-02-09
 */
@Service
public class ArticleContentServiceImpl extends ServiceImpl<ArticleContentDao, ArticleContent> implements ArticleContentService {

}
