package com.itwillbs.fintech.vo;

public class RequestTokenVO {
	private String code;
	private String scope;
	private String client_info;
	private String state;
	
	private String client_id;
	private String client_secret;
	private String redirect_uri;
	private String grant_type;
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	public String getClient_info() {
		return client_info;
	}
	public void setClient_info(String client_info) {
		this.client_info = client_info;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	public String getClient_id() {
		return client_id;
	}
	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}
	public String getClient_secret() {
		return client_secret;
	}
	public void setClient_secret(String client_secret) {
		this.client_secret = client_secret;
	}
	public String getRedirect_uri() {
		return redirect_uri;
	}
	public void setRedirect_uri(String redirect_uri) {
		this.redirect_uri = redirect_uri;
	}
	public String getGrant_type() {
		return grant_type;
	}
	public void setGrant_type(String grant_type) {
		this.grant_type = grant_type;
	}
	@Override
	public String toString() {
		return "RequestTokenVO [code=" + code + ", scope=" + scope + ", client_info=" + client_info + ", state=" + state
				+ ", client_id=" + client_id + ", client_secret=" + client_secret + ", redirect_uri=" + redirect_uri
				+ ", grant_type=" + grant_type + "]";
	}
	
	
	
	
	
	
}
