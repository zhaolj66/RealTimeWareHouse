package com.youfan.liuLiang.log;

public class AppInputDeviceLog extends LogParent{
    private String userId;
    private String deviceId;
    private String openTimeStamp;//打开时间
    private String leaveTimeStamp;//退出时间
    private String appPlatform;//平台，安卓，IOS
    private String deviceStyle;//型号
    private String brand;//品牌
    private String screenSize;//分辨率
    private String osType;//操作系统

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

    public String getOpenTimeStamp() {
        return openTimeStamp;
    }

    public void setOpenTimeStamp(String openTimeStamp) {
        this.openTimeStamp = openTimeStamp;
    }

    public String getLeaveTimeStamp() {
        return leaveTimeStamp;
    }

    public void setLeaveTimeStamp(String leaveTimeStamp) {
        this.leaveTimeStamp = leaveTimeStamp;
    }

    public String getAppPlatform() {
        return appPlatform;
    }

    public void setAppPlatform(String appPlatform) {
        this.appPlatform = appPlatform;
    }

    public String getDeviceStyle() {
        return deviceStyle;
    }

    public void setDeviceStyle(String deviceStyle) {
        this.deviceStyle = deviceStyle;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }
}
