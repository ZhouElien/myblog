package com.seagull.myblog.service;

import com.seagull.myblog.model.Article;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;

/**
 * @author Seagull_gby
 * @date 2018/12/16 22:29
 * Description: 文章操作接口
 */
@Service
public interface ArticleService {

    /**
     * 获取数据库全部文章
     * @param rows  一页大小
     * @param pageNum  当前页数
     * @return 对应JSON格式数据
     */
    JSONObject getPageArticles(int rows, int pageNum);

    /**
     * 获得指定文章的内容
     * @param articleId 文章Id
     * @return 对应JSON格式数据
     */
    JSONObject getArticlesContent(long articleId);

    /**
     * 文章喜欢数增加
     * @param articleId 文章ID
     * @param userId 用户ID
     * @return JSON
     */
    JSONObject updateArticleLike(long articleId, String userId);

    /**
     * 文章阅读量增加
     * @param ip 用户IP
     * @param articleId 文章ID
     * @return JSON
     */
    JSONObject updateArticleRead(String ip, long articleId);

    /**
     * 插入文章
     * @param article 文章实体
     * @param contentHtml 内容html格式（便于生成摘要）
     */
    void insertArticle(Article article, String contentHtml);

    /**
     * 更新文章
     * @param article 文章实体
     * @param contentHtml 内容html格式（便于生成摘要）
     */
    void updateArticle(Article article, String contentHtml);
}
