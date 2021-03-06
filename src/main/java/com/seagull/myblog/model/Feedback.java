package com.seagull.myblog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Seagull_gby
 * @date 2019/4/1 15:06
 * Description: 反馈实体
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Feedback {

    /**
     * 主键ID
     */
    private int id;

    /**
     * 反馈信息
     */
    private String msg;

    /**
     * 联系方式
     */
    private String contact;

    /**
     * 阅读标识（1为阅读过，0为未阅读）
     */
    private int state;
}
