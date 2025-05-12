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
public class UpdateRtcCloudRecordingRequest extends RpcAcsRequest<UpdateRtcCloudRecordingResponse> {
	   

	private String taskId;

	@SerializedName("subscribeParams")
	private SubscribeParams subscribeParams;

	@SerializedName("mixLayoutParams")
	private MixLayoutParams mixLayoutParams;
	public UpdateRtcCloudRecordingRequest() {
		super("live", "2016-11-01", "UpdateRtcCloudRecording", "live");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putQueryParameter("TaskId", taskId);
		}
	}

	public SubscribeParams getSubscribeParams() {
		return this.subscribeParams;
	}

	public void setSubscribeParams(SubscribeParams subscribeParams) {
		this.subscribeParams = subscribeParams;	
		if (subscribeParams != null) {
			putQueryParameter("SubscribeParams" , new Gson().toJson(subscribeParams));
		}	
	}

	public MixLayoutParams getMixLayoutParams() {
		return this.mixLayoutParams;
	}

	public void setMixLayoutParams(MixLayoutParams mixLayoutParams) {
		this.mixLayoutParams = mixLayoutParams;	
		if (mixLayoutParams != null) {
			putQueryParameter("MixLayoutParams" , new Gson().toJson(mixLayoutParams));
		}	
	}

	public static class SubscribeParams {

		@SerializedName("SubscribeUserIdList")
		private List<SubscribeUserIdListItem> subscribeUserIdList;

		public List<SubscribeUserIdListItem> getSubscribeUserIdList() {
			return this.subscribeUserIdList;
		}

		public void setSubscribeUserIdList(List<SubscribeUserIdListItem> subscribeUserIdList) {
			this.subscribeUserIdList = subscribeUserIdList;
		}

		public static class SubscribeUserIdListItem {

			@SerializedName("StreamType")
			private Integer streamType;

			@SerializedName("SourceType")
			private Integer sourceType;

			@SerializedName("UserId")
			private String userId;

			public Integer getStreamType() {
				return this.streamType;
			}

			public void setStreamType(Integer streamType) {
				this.streamType = streamType;
			}

			public Integer getSourceType() {
				return this.sourceType;
			}

			public void setSourceType(Integer sourceType) {
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

	public static class MixLayoutParams {

		@SerializedName("UserPanes")
		private List<UserPanesItem> userPanes;

		@SerializedName("MixBackground")
		private MixBackground mixBackground;

		public List<UserPanesItem> getUserPanes() {
			return this.userPanes;
		}

		public void setUserPanes(List<UserPanesItem> userPanes) {
			this.userPanes = userPanes;
		}

		public MixBackground getMixBackground() {
			return this.mixBackground;
		}

		public void setMixBackground(MixBackground mixBackground) {
			this.mixBackground = mixBackground;
		}

		public static class UserPanesItem {

			@SerializedName("ZOrder")
			private Integer zOrder;

			@SerializedName("Width")
			private String width;

			@SerializedName("X")
			private String x;

			@SerializedName("Y")
			private String y;

			@SerializedName("SourceType")
			private Integer sourceType;

			@SerializedName("UserId")
			private String userId;

			@SerializedName("Height")
			private String height;

			@SerializedName("SubBackground")
			private SubBackground subBackground;

			public Integer getZOrder() {
				return this.zOrder;
			}

			public void setZOrder(Integer zOrder) {
				this.zOrder = zOrder;
			}

			public String getWidth() {
				return this.width;
			}

			public void setWidth(String width) {
				this.width = width;
			}

			public String getX() {
				return this.x;
			}

			public void setX(String x) {
				this.x = x;
			}

			public String getY() {
				return this.y;
			}

			public void setY(String y) {
				this.y = y;
			}

			public Integer getSourceType() {
				return this.sourceType;
			}

			public void setSourceType(Integer sourceType) {
				this.sourceType = sourceType;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getHeight() {
				return this.height;
			}

			public void setHeight(String height) {
				this.height = height;
			}

			public SubBackground getSubBackground() {
				return this.subBackground;
			}

			public void setSubBackground(SubBackground subBackground) {
				this.subBackground = subBackground;
			}

			public static class SubBackground {

				@SerializedName("RenderMode")
				private Integer renderMode;

				@SerializedName("Url")
				private String url;

				public Integer getRenderMode() {
					return this.renderMode;
				}

				public void setRenderMode(Integer renderMode) {
					this.renderMode = renderMode;
				}

				public String getUrl() {
					return this.url;
				}

				public void setUrl(String url) {
					this.url = url;
				}
			}
		}

		public static class MixBackground {

			@SerializedName("RenderMode")
			private Integer renderMode;

			@SerializedName("Url")
			private String url;

			public Integer getRenderMode() {
				return this.renderMode;
			}

			public void setRenderMode(Integer renderMode) {
				this.renderMode = renderMode;
			}

			public String getUrl() {
				return this.url;
			}

			public void setUrl(String url) {
				this.url = url;
			}
		}
	}

	@Override
	public Class<UpdateRtcCloudRecordingResponse> getResponseClass() {
		return UpdateRtcCloudRecordingResponse.class;
	}

}
