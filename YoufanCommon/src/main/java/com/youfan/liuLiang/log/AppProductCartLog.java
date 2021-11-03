package com.youfan.liuLiang.log;

public class AppProductCartLog extends AppInputDeviceLog{
    private String deviceId;//设备id
    private String pindaoId;//频道id
    private String productTypeId;//产品类别id
    private String productId;//产品id
    private String operatorType;//0添加1删除
    private String operatorTime;//操作时间戳
    private String ip;//用户app访问的ip
    private String userId;//用户id
    private String country;//国家
    private String province;//省
    private String city;//市
    private String network;//网络方式
    private String yunYinShang;//运营商
    private String appVersion;//app版本
    private String appChannel;//渠道

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getPindaoId() {
        return pindaoId;
    }

    public void setPindaoId(String pindaoId) {
        this.pindaoId = pindaoId;
    }

    public String getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(String productTypeId) {
        this.productTypeId = productTypeId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(String operatorType) {
        this.operatorType = operatorType;
    }

    public String getOperatorTime() {
        return operatorTime;
    }

    public void setOperatorTime(String operatorTime) {
        this.operatorTime = operatorTime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getYunYinShang() {
        return yunYinShang;
    }

    public void setYunYinShang(String yunYinShang) {
        this.yunYinShang = yunYinShang;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getAppChannel() {
        return appChannel;
    }

    public void setAppChannel(String appChannel) {
        this.appChannel = appChannel;
    }
}
