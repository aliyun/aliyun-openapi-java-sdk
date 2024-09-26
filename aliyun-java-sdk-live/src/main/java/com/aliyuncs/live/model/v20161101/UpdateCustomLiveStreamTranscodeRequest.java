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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateCustomLiveStreamTranscodeRequest extends RpcAcsRequest<UpdateCustomLiveStreamTranscodeResponse> {
	   

	private String template;

	private String resWithSource;

	private String lazy;

	private String gop;

	private String audioCodec;

	private String templateType;

	private String audioProfile;

	private Integer height;

	private String app;

	private String encryptParameters;

	private Integer audioChannelNum;

	private Integer profile;

	private Integer fPS;

	private Long ownerId;

	private String extWithSource;

	private String bitrateWithSource;

	private Integer audioRate;

	private String fpsWithSource;

	private Integer audioBitrate;

	private String domain;

	private Integer width;

	private Integer videoBitrate;
	public UpdateCustomLiveStreamTranscodeRequest() {
		super("live", "2016-11-01", "UpdateCustomLiveStreamTranscode", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getResWithSource() {
		return this.resWithSource;
	}

	public void setResWithSource(String resWithSource) {
		this.resWithSource = resWithSource;
		if(resWithSource != null){
			putQueryParameter("ResWithSource", resWithSource);
		}
	}

	public String getLazy() {
		return this.lazy;
	}

	public void setLazy(String lazy) {
		this.lazy = lazy;
		if(lazy != null){
			putQueryParameter("Lazy", lazy);
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

	public String getAudioCodec() {
		return this.audioCodec;
	}

	public void setAudioCodec(String audioCodec) {
		this.audioCodec = audioCodec;
		if(audioCodec != null){
			putQueryParameter("AudioCodec", audioCodec);
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

	public String getAudioProfile() {
		return this.audioProfile;
	}

	public void setAudioProfile(String audioProfile) {
		this.audioProfile = audioProfile;
		if(audioProfile != null){
			putQueryParameter("AudioProfile", audioProfile);
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

	public String getApp() {
		return this.app;
	}

	public void setApp(String app) {
		this.app = app;
		if(app != null){
			putQueryParameter("App", app);
		}
	}

	public String getEncryptParameters() {
		return this.encryptParameters;
	}

	public void setEncryptParameters(String encryptParameters) {
		this.encryptParameters = encryptParameters;
		if(encryptParameters != null){
			putQueryParameter("EncryptParameters", encryptParameters);
		}
	}

	public Integer getAudioChannelNum() {
		return this.audioChannelNum;
	}

	public void setAudioChannelNum(Integer audioChannelNum) {
		this.audioChannelNum = audioChannelNum;
		if(audioChannelNum != null){
			putQueryParameter("AudioChannelNum", audioChannelNum.toString());
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getExtWithSource() {
		return this.extWithSource;
	}

	public void setExtWithSource(String extWithSource) {
		this.extWithSource = extWithSource;
		if(extWithSource != null){
			putQueryParameter("ExtWithSource", extWithSource);
		}
	}

	public String getBitrateWithSource() {
		return this.bitrateWithSource;
	}

	public void setBitrateWithSource(String bitrateWithSource) {
		this.bitrateWithSource = bitrateWithSource;
		if(bitrateWithSource != null){
			putQueryParameter("BitrateWithSource", bitrateWithSource);
		}
	}

	public Integer getAudioRate() {
		return this.audioRate;
	}

	public void setAudioRate(Integer audioRate) {
		this.audioRate = audioRate;
		if(audioRate != null){
			putQueryParameter("AudioRate", audioRate.toString());
		}
	}

	public String getFpsWithSource() {
		return this.fpsWithSource;
	}

	public void setFpsWithSource(String fpsWithSource) {
		this.fpsWithSource = fpsWithSource;
		if(fpsWithSource != null){
			putQueryParameter("FpsWithSource", fpsWithSource);
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

	public String getDomain() {
		return this.domain;
	}

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

	@Override
	public Class<UpdateCustomLiveStreamTranscodeResponse> getResponseClass() {
		return UpdateCustomLiveStreamTranscodeResponse.class;
	}

}
