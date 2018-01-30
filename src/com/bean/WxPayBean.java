package com.bean;

public class WxPayBean {
	//测试成功
	private String appid;//微信后台查看
	private String backUri;//Oauth2验证回调链接
	private String appsecret;//微信后台查看（需申请）
	private String partner;//来自申请成功的邮件
	private String partnerkey;//来自申请成功的邮件
	private String apikey;//商户后台生成的api密钥
	private String mch_id;//来自申请成功的邮件
	private String notify_url;//支付结果通知地址（异步）
	
	public WxPayBean(){
		this.appid="";
		this.backUri="http://facetao.free.ngrok.cc/pay/topayServlet";
		this.appsecret="";
		this.partner="";
		this.partnerkey="";
		this.apikey="";
		this.mch_id="";
		this.notify_url="http://facetao.free.ngrok.cc/pay/NotifyServlet";
	}
	
	public String getNotify_url() {
		return notify_url;
	}

	public void setNotify_url(String notify_url) {
		this.notify_url = notify_url;
	}

	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public String getBackUri() {
		return backUri;
	}
	public void setBackUri(String backUri) {
		this.backUri = backUri;
	}
	public String getAppsecret() {
		return appsecret;
	}
	public void setAppsecret(String appsecret) {
		this.appsecret = appsecret;
	}
	public String getPartner() {
		return partner;
	}
	public void setPartner(String partner) {
		this.partner = partner;
	}
	public String getPartnerkey() {
		return partnerkey;
	}
	public void setPartnerkey(String partnerkey) {
		this.partnerkey = partnerkey;
	}
	public String getApikey() {
		return apikey;
	}
	public void setApikey(String apikey) {
		this.apikey = apikey;
	}
	public String getMch_id() {
		return mch_id;
	}
	public void setMch_id(String mch_id) {
		this.mch_id = mch_id;
	}
	
}
