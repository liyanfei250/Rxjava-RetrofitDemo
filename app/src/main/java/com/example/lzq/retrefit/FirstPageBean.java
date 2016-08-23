package com.example.lzq.retrefit;

import java.util.List;

/**
 * Created by LYF on 2016/8/22.
 */
public class FirstPageBean {
    @Override
    public String toString() {
        return "FirstPageBean{" +
                "rtnCode='" + rtnCode + '\'' +
                ", rtnMsg='" + rtnMsg + '\'' +
                ", responseData=" + responseData +
                '}';
    }

    /**
     * responseData : [{"id":2,"name":"Banner","code":"22","n_list":[{"id":0,"picture":"http://www.bjabia.com/userfile/news/20160601.png","type":-1,"commentNum":0,"clickNum":0},{"id":0,"name":"暑期基础畅享包","picture":"http://www.bjabia.com/userfile/news/1469159000644.png","type":2,"commentNum":0,"clickNum":0,"packVo":{"id":84,"packName":"暑期基础畅享包","studyTime":80034,"xPrice":248,"imageUrl":"http://www.bjabia.com/userfile/package/1469731612779.png","bookId":20,"bookName":"疯狂艺考教材","logoUrl":"http://www.bjabia.com/userfile/package/1470216797059.png"}},{"id":0,"picture":"http://www.bjabia.com/userfile/news/20160602.png","type":-1,"commentNum":0,"clickNum":0}]},{"id":0,"name":"最新课程","code":"00","c_List":[{"id":768,"courseName":"10素描中的结构","teacherName":"老岳","clickCount":172,"studyTime":3244,"xPrice":7.8,"imageUrl":"http://www.bjabia.com/userfile/course/1469714737183.jpg","moduleId":2322,"createTime":"2016-07-28 21:25:36","sectionNum":2,"likeCount":0,"commentsCount":0,"isPraise":0,"isCollect":0},{"id":767,"courseName":"19调整完成及总结","teacherName":"老岳","clickCount":120,"studyTime":968,"xPrice":7.8,"imageUrl":"http://www.bjabia.com/userfile/course/1469708720216.jpg","moduleId":2322,"createTime":"2016-07-28 20:25:20","sectionNum":2,"likeCount":0,"commentsCount":0,"isPraise":0,"isCollect":0},{"id":766,"courseName":"18深入刻画之衬布桌面","teacherName":"老岳","clickCount":60,"studyTime":1460,"xPrice":7.8,"imageUrl":"http://www.bjabia.com/userfile/course/1469708949520.jpg","moduleId":2322,"createTime":"2016-07-28 19:55:53","sectionNum":2,"likeCount":0,"commentsCount":0,"isPraise":0,"isCollect":0},{"id":765,"courseName":"17深入刻画之桔子","teacherName":"老岳","clickCount":62,"studyTime":1169,"xPrice":7.8,"imageUrl":"http://www.bjabia.com/userfile/course/1469708934045.jpg","moduleId":2322,"createTime":"2016-07-28 19:54:32","sectionNum":2,"likeCount":0,"commentsCount":0,"isPraise":0,"isCollect":0}]},{"id":2260,"name":"素描","code":"010201000102","c_List":[{"id":574,"courseName":"可乐瓶","teacherName":"老岳","clickCount":1121,"studyTime":1634,"xPrice":0,"imageUrl":"http://www.bjabia.com/userfile/course/120030.png","moduleId":2260,"moduleName":"素描","createTime":"2016-07-08 14:37:15","sectionNum":6,"likeCount":0,"commentsCount":0,"isPraise":0,"isCollect":0},{"id":575,"courseName":"雪碧瓶","teacherName":"老岳","clickCount":1054,"studyTime":1479,"xPrice":0,"imageUrl":"http://www.bjabia.com/userfile/course/120031.png","moduleId":2260,"moduleName":"素描","createTime":"2016-07-08 14:43:58","sectionNum":5,"likeCount":0,"commentsCount":0,"isPraise":0,"isCollect":0},{"id":545,"courseName":"苹果的结构与塑造","teacherName":"老岳","clickCount":824,"studyTime":1925,"xPrice":0,"imageUrl":"http://www.bjabia.com/userfile/course/120001.png","moduleId":2260,"moduleName":"素描","createTime":"2016-07-07 13:46:11","sectionNum":12,"likeCount":0,"commentsCount":0,"isPraise":0,"isCollect":0},{"id":577,"courseName":"矿泉水瓶","teacherName":"老岳","clickCount":583,"studyTime":1193,"xPrice":0,"imageUrl":"http://www.bjabia.com/userfile/course/120033.png","moduleId":2260,"moduleName":"素描","createTime":"2016-07-07 13:46:44","sectionNum":6,"likeCount":0,"commentsCount":0,"isPraise":0,"isCollect":0}]},{"id":2261,"name":"色彩","code":"010201000103","c_List":[{"id":662,"courseName":"花卉","teacherName":"老岳","clickCount":1420,"studyTime":1651,"xPrice":0,"imageUrl":"http://www.bjabia.com/userfile/course/210035.png","moduleId":2261,"moduleName":"色彩","createTime":"2016-07-07 13:03:41","sectionNum":8,"likeCount":0,"commentsCount":0,"isPraise":0,"isCollect":0},{"id":661,"courseName":"高脚杯","teacherName":"老岳","clickCount":883,"studyTime":1748,"xPrice":0,"imageUrl":"http://www.bjabia.com/userfile/course/210034.png","moduleId":2261,"moduleName":"色彩","createTime":"2016-07-01 15:52:59","sectionNum":8,"likeCount":0,"commentsCount":0,"isPraise":0,"isCollect":0},{"id":632,"courseName":"苹果","teacherName":"老岳","clickCount":480,"studyTime":1737,"xPrice":0,"imageUrl":"http://www.bjabia.com/userfile/course/210005.png","moduleId":2261,"moduleName":"色彩","createTime":"2016-07-03 17:12:54","sectionNum":7,"likeCount":0,"commentsCount":0,"isPraise":0,"isCollect":0},{"id":628,"courseName":"苹果","teacherName":"老岳","clickCount":411,"studyTime":1901,"xPrice":0,"imageUrl":"http://www.bjabia.com/userfile/course/210001.png","moduleId":2261,"moduleName":"色彩","createTime":"2016-07-02 14:53:58","sectionNum":8,"likeCount":0,"commentsCount":0,"isPraise":0,"isCollect":0}]},{"id":2262,"name":"速写","code":"010201000104","c_List":[{"id":718,"courseName":"女青年坐姿","teacherName":"老岳","clickCount":225,"studyTime":75,"xPrice":5.8,"imageUrl":"http://www.bjabia.com/userfile/course/310001.png","moduleId":2262,"moduleName":"速写","createTime":"2016-07-07 01:56:08","sectionNum":1,"likeCount":0,"commentsCount":0,"isPraise":0,"isCollect":0},{"id":719,"courseName":"男青年站姿","teacherName":"老岳","clickCount":97,"studyTime":63,"xPrice":5.8,"imageUrl":"http://www.bjabia.com/userfile/course/310002.png","moduleId":2262,"moduleName":"速写","createTime":"2016-07-07 01:56:17","sectionNum":1,"likeCount":0,"commentsCount":0,"isPraise":0,"isCollect":0},{"id":721,"courseName":"男青年坐姿","teacherName":"老岳","clickCount":28,"studyTime":62,"xPrice":5.8,"imageUrl":"http://www.bjabia.com/userfile/course/310004.png","moduleId":2262,"moduleName":"速写","createTime":"2016-07-02 00:03:28","sectionNum":1,"likeCount":0,"commentsCount":0,"isPraise":0,"isCollect":0},{"id":720,"courseName":"男青年蹲姿","teacherName":"老岳","clickCount":18,"studyTime":57,"xPrice":5.8,"imageUrl":"http://www.bjabia.com/userfile/course/310003.png","moduleId":2262,"moduleName":"速写","createTime":"2016-07-02 00:03:28","sectionNum":1,"likeCount":0,"commentsCount":0,"isPraise":0,"isCollect":0}]},{"id":2263,"name":"影视编导","code":"010201000105","c_List":[{"id":744,"courseName":"导演专题1·冯小刚","teacherName":"杨老师","clickCount":399,"studyTime":68,"xPrice":9.8,"imageUrl":"http://www.bjabia.com/userfile/course/1467894095836.jpg","moduleId":2263,"moduleName":"影视编导","createTime":"2016-07-07 20:21:35","sectionNum":1,"likeCount":0,"commentsCount":0,"isPraise":0,"isCollect":0},{"id":743,"courseName":"视听语言1·色彩","teacherName":"杨老师","clickCount":174,"studyTime":43,"xPrice":9.8,"imageUrl":"http://www.bjabia.com/userfile/course/1467892146007.jpg","moduleId":2263,"moduleName":"影视编导","createTime":"2016-07-07 19:49:06","sectionNum":1,"likeCount":0,"commentsCount":0,"isPraise":0,"isCollect":0}]},{"id":1,"name":"图书","code":"11","b_list":[{"id":20,"name":"疯狂艺考教材","price":138,"picture":"http://www.bjabia.com/userfile/book/1470459703239.png","saleNum":4,"des":"疯狂艺考教材"}]}]
     * rtnCode : 000000
     * rtnMsg : 请求成功!
     */

    private String rtnCode;
    private String rtnMsg;
    /**
     * id : 2
     * name : Banner
     * code : 22
     * n_list : [{"id":0,"picture":"http://www.bjabia.com/userfile/news/20160601.png","type":-1,"commentNum":0,"clickNum":0},{"id":0,"name":"暑期基础畅享包","picture":"http://www.bjabia.com/userfile/news/1469159000644.png","type":2,"commentNum":0,"clickNum":0,"packVo":{"id":84,"packName":"暑期基础畅享包","studyTime":80034,"xPrice":248,"imageUrl":"http://www.bjabia.com/userfile/package/1469731612779.png","bookId":20,"bookName":"疯狂艺考教材","logoUrl":"http://www.bjabia.com/userfile/package/1470216797059.png"}},{"id":0,"picture":"http://www.bjabia.com/userfile/news/20160602.png","type":-1,"commentNum":0,"clickNum":0}]
     */

    private List<ResponseDataBean> responseData;

    public String getRtnCode() {
        return rtnCode;
    }

    public void setRtnCode(String rtnCode) {
        this.rtnCode = rtnCode;
    }

    public String getRtnMsg() {
        return rtnMsg;
    }

    public void setRtnMsg(String rtnMsg) {
        this.rtnMsg = rtnMsg;
    }

    public List<ResponseDataBean> getResponseData() {
        return responseData;
    }

    public void setResponseData(List<ResponseDataBean> responseData) {
        this.responseData = responseData;
    }

    public static class ResponseDataBean {
        private int id;
        private String name;
        private String code;
        /**
         * id : 0
         * picture : http://www.bjabia.com/userfile/news/20160601.png
         * type : -1
         * commentNum : 0
         * clickNum : 0
         */

        private List<NListBean> n_list;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public List<NListBean> getN_list() {
            return n_list;
        }

        public void setN_list(List<NListBean> n_list) {
            this.n_list = n_list;
        }

        public static class NListBean {
            private int id;
            private String picture;
            private int type;
            private int commentNum;
            private int clickNum;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getPicture() {
                return picture;
            }

            public void setPicture(String picture) {
                this.picture = picture;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getCommentNum() {
                return commentNum;
            }

            public void setCommentNum(int commentNum) {
                this.commentNum = commentNum;
            }

            public int getClickNum() {
                return clickNum;
            }

            public void setClickNum(int clickNum) {
                this.clickNum = clickNum;
            }
        }
    }
}
