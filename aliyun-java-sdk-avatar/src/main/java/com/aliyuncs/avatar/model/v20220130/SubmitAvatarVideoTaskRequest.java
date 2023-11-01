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

package com.aliyuncs.avatar.model.v20220130;

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SubmitAvatarVideoTaskRequest extends RpcAcsRequest<SubmitAvatarVideoTaskResponse> {
	   

	private String title;

	private String callbackParams;

	private Long tenantId;

	private String videoParams;

	@SerializedName("app")
	private App app;

	private String extParams;

	private Boolean callback;
	public SubmitAvatarVideoTaskRequest() {
		super("avatar", "2022-01-30", "SubmitAvatarVideoTask");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
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

	public String getCallbackParams() {
		return this.callbackParams;
	}

	public void setCallbackParams(String callbackParams) {
		this.callbackParams = callbackParams;
		if(callbackParams != null){
			putQueryParameter("CallbackParams", callbackParams);
		}
	}

	public Long getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putQueryParameter("TenantId", tenantId.toString());
		}
	}

	public String getVideoParams() {
		return this.videoParams;
	}

	public void setVideoParams(String videoParams) {
		this.videoParams = videoParams;
		if(videoParams != null){
			putQueryParameter("VideoParams", videoParams);
		}
	}

	public App getApp() {
		return this.app;
	}

	public void setApp(App app) {
		this.app = app;	
		if (app != null) {
			putQueryParameter("App" , new Gson().toJson(app));
		}	
	}

	public String getExtParams() {
		return this.extParams;
	}

	public void setExtParams(String extParams) {
		this.extParams = extParams;
		if(extParams != null){
			putQueryParameter("ExtParams", extParams);
		}
	}

	public Boolean getCallback() {
		return this.callback;
	}

	public void setCallback(Boolean callback) {
		this.callback = callback;
		if(callback != null){
			putQueryParameter("Callback", callback.toString());
		}
	}

	public static class App {

		@SerializedName("AppId")
		private String appId;

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}
	}

	@Override
	public Class<SubmitAvatarVideoTaskResponse> getResponseClass() {
		return SubmitAvatarVideoTaskResponse.class;
	}

}
