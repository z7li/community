package com.lixuan.community.service.impl;

import com.lixuan.community.pojo.entity.Article;
import com.lixuan.community.mapper.ArticleDao;
import com.lixuan.community.service.ArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章表  服务实现类
 * </p>
 *
 * @author lixuan
 * @since 2023-02-09
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleDao, Article> implements ArticleService {

}
