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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class StartRtcCloudTranscodeRequest extends RpcAcsRequest<StartRtcCloudTranscodeResponse> {
	   

	private Long maxIdleTime;

	@SerializedName("outputParams")
	private List<OutputParams> outputParams;

	@SerializedName("inputParam")
	private InputParam inputParam;

	private String appId;

	private String channelId;
	public StartRtcCloudTranscodeRequest() {
		super("live", "2016-11-01", "StartRtcCloudTranscode", "live");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getMaxIdleTime() {
		return this.maxIdleTime;
	}

	public void setMaxIdleTime(Long maxIdleTime) {
		this.maxIdleTime = maxIdleTime;
		if(maxIdleTime != null){
			putQueryParameter("MaxIdleTime", maxIdleTime.toString());
		}
	}

	public List<OutputParams> getOutputParams() {
		return this.outputParams;
	}

	public void setOutputParams(List<OutputParams> outputParams) {
		this.outputParams = outputParams;	
		if (outputParams != null) {
			putQueryParameter("OutputParams" , new Gson().toJson(outputParams));
		}	
	}

	public InputParam getInputParam() {
		return this.inputParam;
	}

	public void setInputParam(InputParam inputParam) {
		this.inputParam = inputParam;	
		if (inputParam != null) {
			putQueryParameter("InputParam" , new Gson().toJson(inputParam));
		}	
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public String getChannelId() {
		return this.channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
		if(channelId != null){
			putQueryParameter("ChannelId", channelId);
		}
	}

	public static class OutputParams {

		@SerializedName("UserToken")
		private String userToken;

		@SerializedName("UserId")
		private String userId;

		@SerializedName("ChannelId")
		private String channelId;

		@SerializedName("TranscodeTemplate")
		private String transcodeTemplate;

		public String getUserToken() {
			return this.userToken;
		}

		public void setUserToken(String userToken) {
			this.userToken = userToken;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getChannelId() {
			return this.channelId;
		}

		public void setChannelId(String channelId) {
			this.channelId = channelId;
		}

		public String getTranscodeTemplate() {
			return this.transcodeTemplate;
		}

		public void setTranscodeTemplate(String transcodeTemplate) {
			this.transcodeTemplate = transcodeTemplate;
		}
	}

	public static class InputParam {

		@SerializedName("SingleSubUserParam")
		private SingleSubUserParam singleSubUserParam;

		public SingleSubUserParam getSingleSubUserParam() {
			return this.singleSubUserParam;
		}

		public void setSingleSubUserParam(SingleSubUserParam singleSubUserParam) {
			this.singleSubUserParam = singleSubUserParam;
		}

		public static class SingleSubUserParam {

			@SerializedName("StreamType")
			private Long streamType;

			@SerializedName("SourceType")
			private Long sourceType;

			@SerializedName("UserId")
			private String userId;

			public Long getStreamType() {
				return this.streamType;
			}

			public void setStreamType(Long streamType) {
				this.streamType = streamType;
			}

			public Long getSourceType() {
				return this.sourceType;
			}

			public void setSourceType(Long sourceType) {
				this.sourceType = sourceType;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}
		}
	}

	@Override
	public Class<StartRtcCloudTranscodeResponse> getResponseClass() {
		return StartRtcCloudTranscodeResponse.class;
	}

}
