package fixUse;

import java.util.List;

/**
 * Created by LYF on 2016/8/22.
 */
public class AddressFixBean {

    private ResponseDataBean responseData;
    /**
     * responseData : {"resultList":[{"id":224,"userId":483410,"name":"贼尼玛","tel":"13856238974","city":"北京东城区","address":"13825369874","defaults":1},{"id":225,"userId":483410,"name":"操尼玛","tel":"15632658956","city":"北京东城区","address":"傻逼","defaults":0},{"id":226,"userId":483410,"name":"日你妈","tel":"13266589653","city":"北京宣武区","address":"哈尼","defaults":0}]}
     * rtnCode : 000000
     * rtnMsg : 请求成功!
     */

    private String rtnCode;
    private String rtnMsg;

    public ResponseDataBean getResponseData() {
        return responseData;
    }

    public void setResponseData(ResponseDataBean responseData) {
        this.responseData = responseData;
    }

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

    public static class ResponseDataBean {
        /**
         * id : 224
         * userId : 483410
         * name : 贼尼玛
         * tel : 13856238974
         * city : 北京东城区
         * address : 13825369874
         * defaults : 1
         */

        private List<ResultListBean> resultList;

        public List<ResultListBean> getResultList() {
            return resultList;
        }

        public void setResultList(List<ResultListBean> resultList) {
            this.resultList = resultList;
        }

        public static class ResultListBean {
            private int id;
            private int userId;
            private String name;
            private String tel;
            private String city;
            private String address;
            private int defaults;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getTel() {
                return tel;
            }

            public void setTel(String tel) {
                this.tel = tel;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public int getDefaults() {
                return defaults;
            }

            public void setDefaults(int defaults) {
                this.defaults = defaults;
            }
        }
    }
}
