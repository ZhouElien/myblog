# ☁️ myblog
SSM框架独立搭建的个人博客系统

项目链接：https://www.seaguller.cn 

## 🌞 开发项目
请先看项目目录中：`关于应用本项目您需要知道的一些事`。

数据库文件为 `myblog.sql`，请自行建库并引入。

## 🌞 项目介绍
### 🍪 项目简介
本项目为 `Spring boot + Mybatis` 搭建的个人博客项目，旨在通过这个项目熟悉前后端的交互与`Spring boot`进行整体项目的构造，解决从零开始建站中要考虑的问题和困难，对于初学Spring boot的人来说是个不错的练手机会。

### 🍪 主要技术
* 用`SSM框架`进行搭建。

* 前后端交互采用`Ajax`技术，前端模板使用了`Thymeleaf`。

* 对于文章阅读量使用`redis`进行个人IP与文章ID的缓存。

* 安全方面使用 `Spring security` 安全框架进行登录注册的处理与权限的管理。

* 数据库连接池使用`druid`配置，数据库方面选择的是`mysql`。

### 🍪 环境设置
| 工具 | 名称 |
|:-------------:|:-------------:|
| 开发工具 | IDEA |
| 语言 | JDK1.8、HTML、css、js |
| 数据库 | Mysql 5.7 |
| 项目框架 | SSM |
| ORM | Mybatis |
| 安全框架 | Spring security |
| 缓存 | Redis |
| 项目构建 | Maven |
| 运行环境 | 阿里云Centos7 |

### 🍪 主要数据表展示
#### ☕ 文章表
| 名称 | 类型 | 非空 | 默认 | 主键 | 描述 |
|:-------------:|:-------------:|:-------------:|:-------------:|:-------------:|:-------------:|
| id | int | ture | 无 | true | 主键ID |
| title | varchar | ture | 无 | false | 文章标题 |
| author | varchar | ture | 无 | false | 作者ID |
| content | longtext | ture | 无 | false | 文章内容 |
| create_time | timestamp | ture | CURRENT_TIMESTAMP | false | 文章创建时间 |
| update_time | timestamp | ture | CURRENT_TIMESTAMP | false | 文章更新时间 |
| attribute_label | varchar | false | 无 | false | 文章标签 |
| summary | longtext | false | 无 | false | 文章摘要 |
| article_id | bigint | false | 无 | false | 文章ID标识 |
| type | varchar | true | 无 | false | 文章分类 |
| classify | varchar | true | 无 | false | 文章类别（原创） |

#### ☕ 用户表
| 名称 | 类型 | 非空 | 默认 | 主键 | 描述 |
|:-------------:|:-------------:|:-------------:|:-------------:|:-------------:|:-------------:|
| id | varchar | ture | 无 | true | 主键用户ID标识 |
| gender | tinyint | ture | 无 | false | 性别 |
| user_name | varchar | ture | 无 | false | 昵称 |
| email | varchar | false | 无 | false | 电子邮箱地址 |
| birthday | varchar | false | 无 | false | 生日 |
| image_url | varchar | false | 无 | false | 头像外链地址 |
| recent_login_date | timestamp | false | 无 | false | 用户最近登录时间 |
| phone | varchar | true | 无 | false | 手机号 |
| password | varchar | true | 无 | false | 密码 |
| name | varchar | false | 无 | false | 真实姓名 |
| introduce | varchar | false | 无 | false | 个人介绍 |

#### ☕ 评论表
| 名称 | 类型 | 非空 | 默认 | 主键 | 描述 |
|:-------------:|:-------------:|:-------------:|:-------------:|:-------------:|:-------------:|
| id | varchar | ture | 无 | true | 主键ID |
| self_id | varchar | ture | '1' | false | 层级ID |
| article_id | bigint | ture | 无 | false | 文章ID |
| original_author | varchar | true | 无 | false | 文章作者ID |
| answer_name | varchar | true | 无 | false | 被回复者ID |
| respondent_name | varchar | true | 无 | false | 回复者ID |
| comment_date | timestamp | true | CURRENT_TIMESTAMP | false | 评论日期 |
| likes | int | true | 0 | false | 楼层点赞数 |
| comment_content | text | true | 无 | false | 评论内容 |

### 🍪 页面展示
#### ☕ 首页
![首页](http://seaguller.oss-cn-beijing.aliyuncs.com/myblog/index.jpg)
![首页](http://seaguller.oss-cn-beijing.aliyuncs.com/myblog/index.png)

#### ☕ 个人中心
![个人中心](http://seaguller.oss-cn-beijing.aliyuncs.com/myblog/user.jpg)

#### ☕ 后台管理
![后台管理](http://seaguller.oss-cn-beijing.aliyuncs.com/myblog/admin.jpg)

### 🍊 项目待优化
* live2D模型加载时间过长（要10几秒，太恐怖嘞！）  （已解决）
* 字体文件加载时间略长（压缩过后的字体文件加载时间还是要1-3秒）  （已解决）
* 文章目录不能跳级（第一个标题可以是任意标题，但是接下来的标题必须一级一级来，比方第一个标题是三级标题，那么下面不能出现二级标题，也不能在没有四级标题的情况下直接写五级标题）
* 手机适配（目前只做了首页）
* 不同浏览器的适配（目前只做了谷歌和火狐浏览器的适配）

### 🍊 功能待增添
* 网站访客量的统计
* 个人中心“悄悄话”页面加入评论与回复显示
* 加入QQ直接登录功能
* 后台加入对“更新”与“音乐”界面的管理
* 写作暂时保存（草稿箱）
* 用户手机号码更换功能
* 对文章分类的管理与友链的增添
