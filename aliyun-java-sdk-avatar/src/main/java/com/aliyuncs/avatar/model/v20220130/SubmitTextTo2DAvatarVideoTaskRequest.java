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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SubmitTextTo2DAvatarVideoTaskRequest extends RpcAcsRequest<SubmitTextTo2DAvatarVideoTaskResponse> {
	   

	@SerializedName("app")
	private App app;

	@SerializedName("videoInfo")
	private VideoInfo videoInfo;

	private Long tenantId;

	private String text;

	private String title;
	public SubmitTextTo2DAvatarVideoTaskRequest() {
		super("avatar", "2022-01-30", "SubmitTextTo2DAvatarVideoTask");
		setMethod(MethodType.POST);
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

	public VideoInfo getVideoInfo() {
		return this.videoInfo;
	}

	public void setVideoInfo(VideoInfo videoInfo) {
		this.videoInfo = videoInfo;	
		if (videoInfo != null) {
			putQueryParameter("VideoInfo" , new Gson().toJson(videoInfo));
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

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
		if(text != null){
			putQueryParameter("Text", text);
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

	public static class VideoInfo {

		@SerializedName("IsAlpha")
		private Boolean isAlpha;

		@SerializedName("IsSubtitles")
		private Boolean isSubtitles;

		public Boolean getIsAlpha() {
			return this.isAlpha;
		}

		public void setIsAlpha(Boolean isAlpha) {
			this.isAlpha = isAlpha;
		}

		public Boolean getIsSubtitles() {
			return this.isSubtitles;
		}

		public void setIsSubtitles(Boolean isSubtitles) {
			this.isSubtitles = isSubtitles;
		}
	}

	@Override
	public Class<SubmitTextTo2DAvatarVideoTaskResponse> getResponseClass() {
		return SubmitTextTo2DAvatarVideoTaskResponse.class;
	}

}
