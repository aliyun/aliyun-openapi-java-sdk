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
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class StartInstanceRequest extends RpcAcsRequest<StartInstanceResponse> {
	   

	private String app;

	@SerializedName("textRequest")
	private TextRequest textRequest;

	private Long tenantId;

	private String bizId;

	@SerializedName("channel")
	private Channel channel;

	@SerializedName("commandRequest")
	private CommandRequest commandRequest;

	private String user;
	public StartInstanceRequest() {
		super("avatar", "2022-01-30", "StartInstance");
		setMethod(MethodType.POST);
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

	public TextRequest getTextRequest() {
		return this.textRequest;
	}

	public void setTextRequest(TextRequest textRequest) {
		this.textRequest = textRequest;	
		if (textRequest != null) {
			putQueryParameter("TextRequest" , new Gson().toJson(textRequest));
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

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	public Channel getChannel() {
		return this.channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;	
		if (channel != null) {
			putQueryParameter("Channel" , new Gson().toJson(channel));
		}	
	}

	public CommandRequest getCommandRequest() {
		return this.commandRequest;
	}

	public void setCommandRequest(CommandRequest commandRequest) {
		this.commandRequest = commandRequest;	
		if (commandRequest != null) {
			putQueryParameter("CommandRequest" , new Gson().toJson(commandRequest));
		}	
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
		if(user != null){
			putQueryParameter("User", user);
		}
	}

	public static class TextRequest {

		@SerializedName("Voice")
		private String voice;

		@SerializedName("Volume")
		private Integer volume;

		@SerializedName("SpeechRate")
		private Integer speechRate;

		@SerializedName("PitchRate")
		private Integer pitchRate;

		public String getVoice() {
			return this.voice;
		}

		public void setVoice(String voice) {
			this.voice = voice;
		}

		public Integer getVolume() {
			return this.volume;
		}

		public void setVolume(Integer volume) {
			this.volume = volume;
		}

		public Integer getSpeechRate() {
			return this.speechRate;
		}

		public void setSpeechRate(Integer speechRate) {
			this.speechRate = speechRate;
		}

		public Integer getPitchRate() {
			return this.pitchRate;
		}

		public void setPitchRate(Integer pitchRate) {
			this.pitchRate = pitchRate;
		}
	}

	public static class Channel {

		@SerializedName("Type")
		private String type;

		@SerializedName("ReqConfig")
		private Map<String,String> reqConfig;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Map<String,String> getReqConfig() {
			return this.reqConfig;
		}

		public void setReqConfig(Map<String,String> reqConfig) {
			this.reqConfig = reqConfig;
		}
	}

	public static class CommandRequest {

		@SerializedName("BackGroundImageUrl")
		private String backGroundImageUrl;

		@SerializedName("AlphaSwitch")
		private Boolean alphaSwitch;

		@SerializedName("Locate")
		private Integer locate;

		public String getBackGroundImageUrl() {
			return this.backGroundImageUrl;
		}

		public void setBackGroundImageUrl(String backGroundImageUrl) {
			this.backGroundImageUrl = backGroundImageUrl;
		}

		public Boolean getAlphaSwitch() {
			return this.alphaSwitch;
		}

		public void setAlphaSwitch(Boolean alphaSwitch) {
			this.alphaSwitch = alphaSwitch;
		}

		public Integer getLocate() {
			return this.locate;
		}

		public void setLocate(Integer locate) {
			this.locate = locate;
		}
	}

	@Override
	public Class<StartInstanceResponse> getResponseClass() {
		return StartInstanceResponse.class;
	}

}
