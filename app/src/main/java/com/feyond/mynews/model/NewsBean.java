package com.feyond.mynews.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016/6/28.
 */
public class NewsBean implements Serializable{
    private String postid;
    private boolean hasCover;
    private int hasHead;
    private int replyCount;
    private int hasImg;
    private String digest;
    private boolean hasIcon;
    private String docid;
    private String title;
    private int order;
    private int priority;
    private String lmodify;
    private String boardid;
    private String photosetID;
    private String template;
    private int votecount;
    private String skipID;
    private String alias;
    private String skipType;
    private String cid;
    private int hasAD;
    private String source;
    private String ename;
    private String imgsrc;
    private String tname;
    private String ptime;
    private String url;
    private String url_3w;

    public String getUrl_3w(){
        return url_3w;
    }

    public void setUrl_3w(String url_3w){
        this.url_3w = url_3w;
    }

    public String getUrl(){
        return url;
    }

    public void setUrl(String url){
        this.url = url;
    }

    /**
     * title : 《看客》:中国驴友“迷失”在路上
     * tag : photoset
     * imgsrc : http://cms-bucket.nosdn.127.net/cca9f33c809042969be62d9b3739915220160628072305.jpeg
     * subtitle :
     * url : 3R710001|2187799
     */

    private List<Ads> ads;
    /**
     * imgsrc : http://cms-bucket.nosdn.127.net/67b1868ea8284e98b25d5360981e26b220160628101248.jpeg
     */

    private List<Imgextra> imgextra;

    public String getPostid(){
        return postid;
    }

    public void setPostid(String postid){
        this.postid = postid;
    }

    public boolean isHasCover(){
        return hasCover;
    }

    public void setHasCover(boolean hasCover){
        this.hasCover = hasCover;
    }

    public int getHasHead(){
        return hasHead;
    }

    public void setHasHead(int hasHead){
        this.hasHead = hasHead;
    }

    public int getReplyCount(){
        return replyCount;
    }

    public void setReplyCount(int replyCount){
        this.replyCount = replyCount;
    }

    public int getHasImg(){
        return hasImg;
    }

    public void setHasImg(int hasImg){
        this.hasImg = hasImg;
    }

    public String getDigest(){
        return digest;
    }

    public void setDigest(String digest){
        this.digest = digest;
    }

    public boolean isHasIcon(){
        return hasIcon;
    }

    public void setHasIcon(boolean hasIcon){
        this.hasIcon = hasIcon;
    }

    public String getDocid(){
        return docid;
    }

    public void setDocid(String docid){
        this.docid = docid;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int getOrder(){
        return order;
    }

    public void setOrder(int order){
        this.order = order;
    }

    public int getPriority(){
        return priority;
    }

    public void setPriority(int priority){
        this.priority = priority;
    }

    public String getLmodify(){
        return lmodify;
    }

    public void setLmodify(String lmodify){
        this.lmodify = lmodify;
    }

    public String getBoardid(){
        return boardid;
    }

    public void setBoardid(String boardid){
        this.boardid = boardid;
    }

    public String getPhotosetID(){
        return photosetID;
    }

    public void setPhotosetID(String photosetID){
        this.photosetID = photosetID;
    }

    public String getTemplate(){
        return template;
    }

    public void setTemplate(String template){
        this.template = template;
    }

    public int getVotecount(){
        return votecount;
    }

    public void setVotecount(int votecount){
        this.votecount = votecount;
    }

    public String getSkipID(){
        return skipID;
    }

    public void setSkipID(String skipID){
        this.skipID = skipID;
    }

    public String getAlias(){
        return alias;
    }

    public void setAlias(String alias){
        this.alias = alias;
    }

    public String getSkipType(){
        return skipType;
    }

    public void setSkipType(String skipType){
        this.skipType = skipType;
    }

    public String getCid(){
        return cid;
    }

    public void setCid(String cid){
        this.cid = cid;
    }

    public int getHasAD(){
        return hasAD;
    }

    public void setHasAD(int hasAD){
        this.hasAD = hasAD;
    }

    public String getSource(){
        return source;
    }

    public void setSource(String source){
        this.source = source;
    }

    public String getEname(){
        return ename;
    }

    public void setEname(String ename){
        this.ename = ename;
    }

    public String getImgsrc(){
        return imgsrc;
    }

    public void setImgsrc(String imgsrc){
        this.imgsrc = imgsrc;
    }

    public String getTname(){
        return tname;
    }

    public void setTname(String tname){
        this.tname = tname;
    }

    public String getPtime(){
        return ptime;
    }

    public void setPtime(String ptime){
        this.ptime = ptime;
    }

    public List<Ads> getAds(){
        return ads;
    }

    public void setAds(List<Ads> ads){
        this.ads = ads;
    }

    public List<Imgextra> getImgextra(){
        return imgextra;
    }

    public void setImgextra(List<Imgextra> imgextra){
        this.imgextra = imgextra;
    }

    public static class Ads implements Serializable{
        private String title;
        private String tag;
        private String imgsrc;
        private String subtitle;
        private String url;

        public String getTitle(){
            return title;
        }

        public void setTitle(String title){
            this.title = title;
        }

        public String getTag(){
            return tag;
        }

        public void setTag(String tag){
            this.tag = tag;
        }

        public String getImgsrc(){
            return imgsrc;
        }

        public void setImgsrc(String imgsrc){
            this.imgsrc = imgsrc;
        }

        public String getSubtitle(){
            return subtitle;
        }

        public void setSubtitle(String subtitle){
            this.subtitle = subtitle;
        }

        public String getUrl(){
            return url;
        }

        public void setUrl(String url){
            this.url = url;
        }
    }

    public static class Imgextra implements Serializable{
        private String imgsrc;

        public String getImgsrc(){
            return imgsrc;
        }

        public void setImgsrc(String imgsrc){
            this.imgsrc = imgsrc;
        }
    }
}
