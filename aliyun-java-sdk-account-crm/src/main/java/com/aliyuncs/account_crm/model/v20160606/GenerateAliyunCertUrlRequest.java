/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.account_crm.model.v20160606;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GenerateAliyunCertUrlRequest extends RpcAcsRequest<GenerateAliyunCertUrlResponse> {
	   

	private Boolean isOpenApp;

	private String applyChannel;

	private Boolean ignoreAlreadyCert;

	private String source;

	private String platform;

	private String aliyunPk;

	private String appName;

	private String certWay;

	private String callback;

	private String subjectType;

	private String applyType;

	private Boolean isMobile;
	public GenerateAliyunCertUrlRequest() {
		super("account-crm", "2016-06-06", "GenerateAliyunCertUrl");
		setMethod(MethodType.POST);
	}

	public Boolean getIsOpenApp() {
		return this.isOpenApp;
	}

	public void setIsOpenApp(Boolean isOpenApp) {
		this.isOpenApp = isOpenApp;
		if(isOpenApp != null){
			putQueryParameter("IsOpenApp", isOpenApp.toString());
		}
	}

	public String getApplyChannel() {
		return this.applyChannel;
	}

	public void setApplyChannel(String applyChannel) {
		this.applyChannel = applyChannel;
		if(applyChannel != null){
			putQueryParameter("ApplyChannel", applyChannel);
		}
	}

	public Boolean getIgnoreAlreadyCert() {
		return this.ignoreAlreadyCert;
	}

	public void setIgnoreAlreadyCert(Boolean ignoreAlreadyCert) {
		this.ignoreAlreadyCert = ignoreAlreadyCert;
		if(ignoreAlreadyCert != null){
			putQueryParameter("IgnoreAlreadyCert", ignoreAlreadyCert.toString());
		}
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putQueryParameter("Source", source);
		}
	}

	public String getPlatform() {
		return this.platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
		if(platform != null){
			putQueryParameter("Platform", platform);
		}
	}

	public String getAliyunPk() {
		return this.aliyunPk;
	}

	public void setAliyunPk(String aliyunPk) {
		this.aliyunPk = aliyunPk;
		if(aliyunPk != null){
			putQueryParameter("AliyunPk", aliyunPk);
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public String getCertWay() {
		return this.certWay;
	}

	public void setCertWay(String certWay) {
		this.certWay = certWay;
		if(certWay != null){
			putQueryParameter("CertWay", certWay);
		}
	}

	public String getCallback() {
		return this.callback;
	}

	public void setCallback(String callback) {
		this.callback = callback;
		if(callback != null){
			putQueryParameter("Callback", callback);
		}
	}

	public String getSubjectType() {
		return this.subjectType;
	}

	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
		if(subjectType != null){
			putQueryParameter("SubjectType", subjectType);
		}
	}

	public String getApplyType() {
		return this.applyType;
	}

	public void setApplyType(String applyType) {
		this.applyType = applyType;
		if(applyType != null){
			putQueryParameter("ApplyType", applyType);
		}
	}

	public Boolean getIsMobile() {
		return this.isMobile;
	}

	public void setIsMobile(Boolean isMobile) {
		this.isMobile = isMobile;
		if(isMobile != null){
			putQueryParameter("IsMobile", isMobile.toString());
		}
	}

	@Override
	public Class<GenerateAliyunCertUrlResponse> getResponseClass() {
		return GenerateAliyunCertUrlResponse.class;
	}

}
