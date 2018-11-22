package com.littlered.conclusion.api;

import java.util.List;

public class ImageReq {
    /**
     * data : {"banners":[{"describe":"test1","url":"https://dmzy-1257844616.cos.ap-chengdu.myqcloud.com/banner/dm_banner1?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDW5Uinzj0lLkx1yCS6bykPtDQWSGxqt7A%26q-sign-time%3D1541579287%3B1573115347%26q-key-time%3D1541579287%3B1573115347%26q-header-list%3D%26q-url-param-list%3D%26q-signature%3D40131d7c86adaf02f9deee67067c051249fda49e"},{"describe":"test2","url":"https://dmzy-1257844616.cos.ap-chengdu.myqcloud.com/banner/dm_banner2?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDW5Uinzj0lLkx1yCS6bykPtDQWSGxqt7A%26q-sign-time%3D1541579332%3B1573115392%26q-key-time%3D1541579332%3B1573115392%26q-header-list%3D%26q-url-param-list%3D%26q-signature%3Dab19547b3224b55104978134d7fa5e309dae603f"},{"describe":"test3","url":"https://dmzy-1257844616.cos.ap-chengdu.myqcloud.com/banner/dm_banner2?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDW5Uinzj0lLkx1yCS6bykPtDQWSGxqt7A%26q-sign-time%3D1541579332%3B1573115392%26q-key-time%3D1541579332%3B1573115392%26q-header-list%3D%26q-url-param-list%3D%26q-signature%3Dab19547b3224b55104978134d7fa5e309dae603f"},{"describe":"test4","url":"https://dmzy-1257844616.cos.ap-chengdu.myqcloud.com/banner/dm_banner2?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDW5Uinzj0lLkx1yCS6bykPtDQWSGxqt7A%26q-sign-time%3D1541579332%3B1573115392%26q-key-time%3D1541579332%3B1573115392%26q-header-list%3D%26q-url-param-list%3D%26q-signature%3Dab19547b3224b55104978134d7fa5e309dae603f"},{"describe":"test5","url":"https://dmzy-1257844616.cos.ap-chengdu.myqcloud.com/banner/dm_banner2?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDW5Uinzj0lLkx1yCS6bykPtDQWSGxqt7A%26q-sign-time%3D1541579332%3B1573115392%26q-key-time%3D1541579332%3B1573115392%26q-header-list%3D%26q-url-param-list%3D%26q-signature%3Dab19547b3224b55104978134d7fa5e309dae603f"}],"indexes":[{"ad":1,"describe":"内容1测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试","title":"1","url":"https://dmzy-1257844616.cos.ap-chengdu.myqcloud.com/index/dm_index5?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDW5Uinzj0lLkx1yCS6bykPtDQWSGxqt7A%26q-sign-time%3D1540524840%3B1572060900%26q-key-time%3D1540524840%3B1572060900%26q-header-list%3D%26q-url-param-list%3D%26q-signature%3D5a9d316dcabef0df7af3bbee412a7215206e0b86"},{"ad":2,"describe":"内容2测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试","title":"2","url":"https://dmzy-1257844616.cos.ap-chengdu.myqcloud.com/index/dm_index2?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDW5Uinzj0lLkx1yCS6bykPtDQWSGxqt7A%26q-sign-time%3D1540524795%3B1572060855%26q-key-time%3D1540524795%3B1572060855%26q-header-list%3D%26q-url-param-list%3D%26q-signature%3Df7d3e8e855ddfe7b2e69a16ed5db1a40d309e453"},{"ad":1,"describe":"内容3测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试","title":"3","url":"https://dmzy-1257844616.cos.ap-chengdu.myqcloud.com/index/dm_index3?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDW5Uinzj0lLkx1yCS6bykPtDQWSGxqt7A%26q-sign-time%3D1540524822%3B1572060882%26q-key-time%3D1540524822%3B1572060882%26q-header-list%3D%26q-url-param-list%3D%26q-signature%3Df4c5201bc82eb85fbb5db0d4b0ac87e780e5d7d9"},{"ad":1,"describe":"内容4测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试","title":"4","url":"https://dmzy-1257844616.cos.ap-chengdu.myqcloud.com/index/dm_index4?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDW5Uinzj0lLkx1yCS6bykPtDQWSGxqt7A%26q-sign-time%3D1540524832%3B1572060892%26q-key-time%3D1540524832%3B1572060892%26q-header-list%3D%26q-url-param-list%3D%26q-signature%3Dd71d2f58cbb8b25c4cc875bb7fb12723051ac38d"},{"ad":1,"describe":"内容5测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试","title":"5","url":"https://dmzy-1257844616.cos.ap-chengdu.myqcloud.com/index/dm_index5?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDW5Uinzj0lLkx1yCS6bykPtDQWSGxqt7A%26q-sign-time%3D1540524840%3B1572060900%26q-key-time%3D1540524840%3B1572060900%26q-header-list%3D%26q-url-param-list%3D%26q-signature%3D5a9d316dcabef0df7af3bbee412a7215206e0b86"},{"ad":2,"describe":"内容6测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试","title":"6","url":"https://dmzy-1257844616.cos.ap-chengdu.myqcloud.com/index/dm_index6?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDW5Uinzj0lLkx1yCS6bykPtDQWSGxqt7A%26q-sign-time%3D1540524850%3B1572060910%26q-key-time%3D1540524850%3B1572060910%26q-header-list%3D%26q-url-param-list%3D%26q-signature%3D3e8c26d6659fbc78f5544d0e4afa73f2abdc5e22"},{"ad":1,"describe":"内容7测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试","title":"7","url":"https://dmzy-1257844616.cos.ap-chengdu.myqcloud.com/index/dm_index7?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDW5Uinzj0lLkx1yCS6bykPtDQWSGxqt7A%26q-sign-time%3D1540524861%3B1572060921%26q-key-time%3D1540524861%3B1572060921%26q-header-list%3D%26q-url-param-list%3D%26q-signature%3Da0f0de23e9dd9b471fee9e4061343489adea1ad2"},{"ad":1,"describe":"内容8测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试","title":"8","url":"https://dmzy-1257844616.cos.ap-chengdu.myqcloud.com/index/dm_index8?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDW5Uinzj0lLkx1yCS6bykPtDQWSGxqt7A%26q-sign-time%3D1540541466%3B1572077526%26q-key-time%3D1540541466%3B1572077526%26q-header-list%3D%26q-url-param-list%3D%26q-signature%3D00b61898556e315dab54b9dfb66622201d7dbfad"}],"next_page":1,"tabs":["全部","科技","幻想","霜降","人工智能","模特","大自然","宠物","高楼大厦"]}
     * error_code : 0
     * msg : ok
     * request : GET /v1/index
     */

    private DataBean data;
    private int error_code;
    private String msg;
    private String request;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public static class DataBean {
        /**
         * banners : [{"describe":"test1","url":"https://dmzy-1257844616.cos.ap-chengdu.myqcloud.com/banner/dm_banner1?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDW5Uinzj0lLkx1yCS6bykPtDQWSGxqt7A%26q-sign-time%3D1541579287%3B1573115347%26q-key-time%3D1541579287%3B1573115347%26q-header-list%3D%26q-url-param-list%3D%26q-signature%3D40131d7c86adaf02f9deee67067c051249fda49e"},{"describe":"test2","url":"https://dmzy-1257844616.cos.ap-chengdu.myqcloud.com/banner/dm_banner2?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDW5Uinzj0lLkx1yCS6bykPtDQWSGxqt7A%26q-sign-time%3D1541579332%3B1573115392%26q-key-time%3D1541579332%3B1573115392%26q-header-list%3D%26q-url-param-list%3D%26q-signature%3Dab19547b3224b55104978134d7fa5e309dae603f"},{"describe":"test3","url":"https://dmzy-1257844616.cos.ap-chengdu.myqcloud.com/banner/dm_banner2?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDW5Uinzj0lLkx1yCS6bykPtDQWSGxqt7A%26q-sign-time%3D1541579332%3B1573115392%26q-key-time%3D1541579332%3B1573115392%26q-header-list%3D%26q-url-param-list%3D%26q-signature%3Dab19547b3224b55104978134d7fa5e309dae603f"},{"describe":"test4","url":"https://dmzy-1257844616.cos.ap-chengdu.myqcloud.com/banner/dm_banner2?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDW5Uinzj0lLkx1yCS6bykPtDQWSGxqt7A%26q-sign-time%3D1541579332%3B1573115392%26q-key-time%3D1541579332%3B1573115392%26q-header-list%3D%26q-url-param-list%3D%26q-signature%3Dab19547b3224b55104978134d7fa5e309dae603f"},{"describe":"test5","url":"https://dmzy-1257844616.cos.ap-chengdu.myqcloud.com/banner/dm_banner2?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDW5Uinzj0lLkx1yCS6bykPtDQWSGxqt7A%26q-sign-time%3D1541579332%3B1573115392%26q-key-time%3D1541579332%3B1573115392%26q-header-list%3D%26q-url-param-list%3D%26q-signature%3Dab19547b3224b55104978134d7fa5e309dae603f"}]
         * indexes : [{"ad":1,"describe":"内容1测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试","title":"1","url":"https://dmzy-1257844616.cos.ap-chengdu.myqcloud.com/index/dm_index5?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDW5Uinzj0lLkx1yCS6bykPtDQWSGxqt7A%26q-sign-time%3D1540524840%3B1572060900%26q-key-time%3D1540524840%3B1572060900%26q-header-list%3D%26q-url-param-list%3D%26q-signature%3D5a9d316dcabef0df7af3bbee412a7215206e0b86"},{"ad":2,"describe":"内容2测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试","title":"2","url":"https://dmzy-1257844616.cos.ap-chengdu.myqcloud.com/index/dm_index2?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDW5Uinzj0lLkx1yCS6bykPtDQWSGxqt7A%26q-sign-time%3D1540524795%3B1572060855%26q-key-time%3D1540524795%3B1572060855%26q-header-list%3D%26q-url-param-list%3D%26q-signature%3Df7d3e8e855ddfe7b2e69a16ed5db1a40d309e453"},{"ad":1,"describe":"内容3测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试","title":"3","url":"https://dmzy-1257844616.cos.ap-chengdu.myqcloud.com/index/dm_index3?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDW5Uinzj0lLkx1yCS6bykPtDQWSGxqt7A%26q-sign-time%3D1540524822%3B1572060882%26q-key-time%3D1540524822%3B1572060882%26q-header-list%3D%26q-url-param-list%3D%26q-signature%3Df4c5201bc82eb85fbb5db0d4b0ac87e780e5d7d9"},{"ad":1,"describe":"内容4测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试","title":"4","url":"https://dmzy-1257844616.cos.ap-chengdu.myqcloud.com/index/dm_index4?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDW5Uinzj0lLkx1yCS6bykPtDQWSGxqt7A%26q-sign-time%3D1540524832%3B1572060892%26q-key-time%3D1540524832%3B1572060892%26q-header-list%3D%26q-url-param-list%3D%26q-signature%3Dd71d2f58cbb8b25c4cc875bb7fb12723051ac38d"},{"ad":1,"describe":"内容5测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试","title":"5","url":"https://dmzy-1257844616.cos.ap-chengdu.myqcloud.com/index/dm_index5?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDW5Uinzj0lLkx1yCS6bykPtDQWSGxqt7A%26q-sign-time%3D1540524840%3B1572060900%26q-key-time%3D1540524840%3B1572060900%26q-header-list%3D%26q-url-param-list%3D%26q-signature%3D5a9d316dcabef0df7af3bbee412a7215206e0b86"},{"ad":2,"describe":"内容6测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试","title":"6","url":"https://dmzy-1257844616.cos.ap-chengdu.myqcloud.com/index/dm_index6?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDW5Uinzj0lLkx1yCS6bykPtDQWSGxqt7A%26q-sign-time%3D1540524850%3B1572060910%26q-key-time%3D1540524850%3B1572060910%26q-header-list%3D%26q-url-param-list%3D%26q-signature%3D3e8c26d6659fbc78f5544d0e4afa73f2abdc5e22"},{"ad":1,"describe":"内容7测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试","title":"7","url":"https://dmzy-1257844616.cos.ap-chengdu.myqcloud.com/index/dm_index7?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDW5Uinzj0lLkx1yCS6bykPtDQWSGxqt7A%26q-sign-time%3D1540524861%3B1572060921%26q-key-time%3D1540524861%3B1572060921%26q-header-list%3D%26q-url-param-list%3D%26q-signature%3Da0f0de23e9dd9b471fee9e4061343489adea1ad2"},{"ad":1,"describe":"内容8测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试","title":"8","url":"https://dmzy-1257844616.cos.ap-chengdu.myqcloud.com/index/dm_index8?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDW5Uinzj0lLkx1yCS6bykPtDQWSGxqt7A%26q-sign-time%3D1540541466%3B1572077526%26q-key-time%3D1540541466%3B1572077526%26q-header-list%3D%26q-url-param-list%3D%26q-signature%3D00b61898556e315dab54b9dfb66622201d7dbfad"}]
         * next_page : 1
         * tabs : ["全部","科技","幻想","霜降","人工智能","模特","大自然","宠物","高楼大厦"]
         */

        private int next_page;
        private List<BannersBean> banners;
        private List<IndexesBean> indexes;
        private List<String> tabs;

        public int getNext_page() {
            return next_page;
        }

        public void setNext_page(int next_page) {
            this.next_page = next_page;
        }

        public List<BannersBean> getBanners() {
            return banners;
        }

        public void setBanners(List<BannersBean> banners) {
            this.banners = banners;
        }

        public List<IndexesBean> getIndexes() {
            return indexes;
        }

        public void setIndexes(List<IndexesBean> indexes) {
            this.indexes = indexes;
        }

        public List<String> getTabs() {
            return tabs;
        }

        public void setTabs(List<String> tabs) {
            this.tabs = tabs;
        }

        public static class BannersBean {
            /**
             * describe : test1
             * url : https://dmzy-1257844616.cos.ap-chengdu.myqcloud.com/banner/dm_banner1?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDW5Uinzj0lLkx1yCS6bykPtDQWSGxqt7A%26q-sign-time%3D1541579287%3B1573115347%26q-key-time%3D1541579287%3B1573115347%26q-header-list%3D%26q-url-param-list%3D%26q-signature%3D40131d7c86adaf02f9deee67067c051249fda49e
             */

            private String describe;
            private String url;

            public String getDescribe() {
                return describe;
            }

            public void setDescribe(String describe) {
                this.describe = describe;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }

        public static class IndexesBean {
            /**
             * ad : 1
             * describe : 内容1测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试
             * title : 1
             * url : https://dmzy-1257844616.cos.ap-chengdu.myqcloud.com/index/dm_index5?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDW5Uinzj0lLkx1yCS6bykPtDQWSGxqt7A%26q-sign-time%3D1540524840%3B1572060900%26q-key-time%3D1540524840%3B1572060900%26q-header-list%3D%26q-url-param-list%3D%26q-signature%3D5a9d316dcabef0df7af3bbee412a7215206e0b86
             */

            private int ad;
            private String describe;
            private String title;
            private String url;

            public int getAd() {
                return ad;
            }

            public void setAd(int ad) {
                this.ad = ad;
            }

            public String getDescribe() {
                return describe;
            }

            public void setDescribe(String describe) {
                this.describe = describe;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
