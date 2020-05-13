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

package com.aliyuncs.iovcc.model.v20180501;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iovcc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PushMessageRequest extends RpcAcsRequest<PushMessageResponse> {
	   

	private String receiverValues;

	private String customContent;

	private String title;

	private Integer type;

	private String act;

	private String projectId;

	private String pkgContent;

	private String receiverType;

	private String appPackage;

	private String uri;

	private Long expiredTime;

	private String appKey;

	private String desc;
	public PushMessageRequest() {
		super("iovcc", "2018-05-01", "PushMessage", "iovcc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getReceiverValues() {
		return this.receiverValues;
	}

	public void setReceiverValues(String receiverValues) {
		this.receiverValues = receiverValues;
		if(receiverValues != null){
			putQueryParameter("ReceiverValues", receiverValues);
		}
	}

	public String getCustomContent() {
		return this.customContent;
	}

	public void setCustomContent(String customContent) {
		this.customContent = customContent;
		if(customContent != null){
			putQueryParameter("CustomContent", customContent);
		}
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
		if(title != null){
			putQueryParameter("Title", title);
		}
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type.toString());
		}
	}

	public String getAct() {
		return this.act;
	}

	public void setAct(String act) {
		this.act = act;
		if(act != null){
			putQueryParameter("Act", act);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId);
		}
	}

	public String getPkgContent() {
		return this.pkgContent;
	}

	public void setPkgContent(String pkgContent) {
		this.pkgContent = pkgContent;
		if(pkgContent != null){
			putQueryParameter("PkgContent", pkgContent);
		}
	}

	public String getReceiverType() {
		return this.receiverType;
	}

	public void setReceiverType(String receiverType) {
		this.receiverType = receiverType;
		if(receiverType != null){
			putQueryParameter("ReceiverType", receiverType);
		}
	}

	public String getAppPackage() {
		return this.appPackage;
	}

	public void setAppPackage(String appPackage) {
		this.appPackage = appPackage;
		if(appPackage != null){
			putQueryParameter("AppPackage", appPackage);
		}
	}

	public String getUri() {
		return this.uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
		if(uri != null){
			putQueryParameter("Uri", uri);
		}
	}

	public Long getExpiredTime() {
		return this.expiredTime;
	}

	public void setExpiredTime(Long expiredTime) {
		this.expiredTime = expiredTime;
		if(expiredTime != null){
			putQueryParameter("ExpiredTime", expiredTime.toString());
		}
	}

	public String getAppKey() {
		return this.appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
		if(appKey != null){
			putQueryParameter("AppKey", appKey);
		}
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
		if(desc != null){
			putQueryParameter("Desc", desc);
		}
	}

	@Override
	public Class<PushMessageResponse> getResponseClass() {
		return PushMessageResponse.class;
	}

}
