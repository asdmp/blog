package com.xiejiahao.service.impl;

import com.xiejiahao.entity.Article;
import com.xiejiahao.mapper.ArticleMapper;
import com.xiejiahao.service.ArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章表 服务实现类
 * </p>
 *
 * @author XieJiaHao
 * @since 2021-12-20
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

}
