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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class AddCustomLiveStreamTranscodeRequest extends RpcAcsRequest<AddCustomLiveStreamTranscodeResponse> {
	
	public AddCustomLiveStreamTranscodeRequest() {
		super("live", "2016-11-01", "AddCustomLiveStreamTranscode", "live");
	}

	private String app;

	private String template;

	private Integer profile;

	private Integer fPS;

	private String gop;

	private Long ownerId;

	private String templateType;

	private Integer audioBitrate;

	private String domain;

	private Integer width;

	private Integer videoBitrate;

	private Integer height;

	public String getApp() {
		return this.app;
	}

	public void setApp(String app) {
		this.app = app;
		if(app != null){
			putQueryParameter("App", app);
		}
	}

	public String getTemplate() {
		return this.template;
	}

	public void setTemplate(String template) {
		this.template = template;
		if(template != null){
			putQueryParameter("Template", template);
		}
	}

	public Integer getProfile() {
		return this.profile;
	}

	public void setProfile(Integer profile) {
		this.profile = profile;
		if(profile != null){
			putQueryParameter("Profile", profile.toString());
		}
	}

	public Integer getFPS() {
		return this.fPS;
	}

	public void setFPS(Integer fPS) {
		this.fPS = fPS;
		if(fPS != null){
			putQueryParameter("FPS", fPS.toString());
		}
	}

	public String getGop() {
		return this.gop;
	}

	public void setGop(String gop) {
		this.gop = gop;
		if(gop != null){
			putQueryParameter("Gop", gop);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getTemplateType() {
		return this.templateType;
	}

	public void setTemplateType(String templateType) {
		this.templateType = templateType;
		if(templateType != null){
			putQueryParameter("TemplateType", templateType);
		}
	}

	public Integer getAudioBitrate() {
		return this.audioBitrate;
	}

	public void setAudioBitrate(Integer audioBitrate) {
		this.audioBitrate = audioBitrate;
		if(audioBitrate != null){
			putQueryParameter("AudioBitrate", audioBitrate.toString());
		}
	}

	public String getBizDomain() {
		return this.domain;
	}

	public void setBizDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putQueryParameter("Domain", domain);
		}
	}

	/**
	 * @deprecated use getBizDomain instead of this.
	 */
	@Deprecated
	public String getDomain() {
		return this.domain;
	}

	/**
	 * @deprecated use setBizDomain instead of this.
	 */
	@Deprecated
	public void setDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putQueryParameter("Domain", domain);
		}
	}

	public Integer getWidth() {
		return this.width;
	}

	public void setWidth(Integer width) {
		this.width = width;
		if(width != null){
			putQueryParameter("Width", width.toString());
		}
	}

	public Integer getVideoBitrate() {
		return this.videoBitrate;
	}

	public void setVideoBitrate(Integer videoBitrate) {
		this.videoBitrate = videoBitrate;
		if(videoBitrate != null){
			putQueryParameter("VideoBitrate", videoBitrate.toString());
		}
	}

	public Integer getHeight() {
		return this.height;
	}

	public void setHeight(Integer height) {
		this.height = height;
		if(height != null){
			putQueryParameter("Height", height.toString());
		}
	}

	@Override
	public Class<AddCustomLiveStreamTranscodeResponse> getResponseClass() {
		return AddCustomLiveStreamTranscodeResponse.class;
	}

}
