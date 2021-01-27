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

package com.aliyuncs.rtc.model.v20180111;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rtc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class StartRecordTaskRequest extends RpcAcsRequest<StartRecordTaskResponse> {
	   

	private List<UserPanes> userPaness;

	private String taskProfile;

	private String taskId;

	private Long ownerId;

	private String templateId;

	private List<String> subSpecUserss;

	private String appId;

	private Integer mediaEncode;

	private String channelId;
	public StartRecordTaskRequest() {
		super("rtc", "2018-01-11", "StartRecordTask", "rtc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<UserPanes> getUserPaness() {
		return this.userPaness;
	}

	public void setUserPaness(List<UserPanes> userPaness) {
		this.userPaness = userPaness;	
		if (userPaness != null) {
			for (int depth1 = 0; depth1 < userPaness.size(); depth1++) {
				putQueryParameter("UserPanes." + (depth1 + 1) + ".PaneId" , userPaness.get(depth1).getPaneId());
				putQueryParameter("UserPanes." + (depth1 + 1) + ".UserId" , userPaness.get(depth1).getUserId());
				putQueryParameter("UserPanes." + (depth1 + 1) + ".SourceType" , userPaness.get(depth1).getSourceType());
				if (userPaness.get(depth1).getImagess() != null) {
					for (int depth2 = 0; depth2 < userPaness.get(depth1).getImagess().size(); depth2++) {
						putQueryParameter("UserPanes." + (depth1 + 1) + ".Images." + (depth2 + 1) + ".Url" , userPaness.get(depth1).getImagess().get(depth2).getUrl());
						putQueryParameter("UserPanes." + (depth1 + 1) + ".Images." + (depth2 + 1) + ".Display" , userPaness.get(depth1).getImagess().get(depth2).getDisplay());
						putQueryParameter("UserPanes." + (depth1 + 1) + ".Images." + (depth2 + 1) + ".X" , userPaness.get(depth1).getImagess().get(depth2).getX());
						putQueryParameter("UserPanes." + (depth1 + 1) + ".Images." + (depth2 + 1) + ".Y" , userPaness.get(depth1).getImagess().get(depth2).getY());
						putQueryParameter("UserPanes." + (depth1 + 1) + ".Images." + (depth2 + 1) + ".Width" , userPaness.get(depth1).getImagess().get(depth2).getWidth());
						putQueryParameter("UserPanes." + (depth1 + 1) + ".Images." + (depth2 + 1) + ".Height" , userPaness.get(depth1).getImagess().get(depth2).getHeight());
						putQueryParameter("UserPanes." + (depth1 + 1) + ".Images." + (depth2 + 1) + ".ZOrder" , userPaness.get(depth1).getImagess().get(depth2).getZOrder());
					}
				}
				if (userPaness.get(depth1).getTextss() != null) {
					for (int depth2 = 0; depth2 < userPaness.get(depth1).getTextss().size(); depth2++) {
						putQueryParameter("UserPanes." + (depth1 + 1) + ".Texts." + (depth2 + 1) + ".Text" , userPaness.get(depth1).getTextss().get(depth2).getText());
						putQueryParameter("UserPanes." + (depth1 + 1) + ".Texts." + (depth2 + 1) + ".X" , userPaness.get(depth1).getTextss().get(depth2).getX());
						putQueryParameter("UserPanes." + (depth1 + 1) + ".Texts." + (depth2 + 1) + ".Y" , userPaness.get(depth1).getTextss().get(depth2).getY());
						putQueryParameter("UserPanes." + (depth1 + 1) + ".Texts." + (depth2 + 1) + ".FontType" , userPaness.get(depth1).getTextss().get(depth2).getFontType());
						putQueryParameter("UserPanes." + (depth1 + 1) + ".Texts." + (depth2 + 1) + ".FontSize" , userPaness.get(depth1).getTextss().get(depth2).getFontSize());
						putQueryParameter("UserPanes." + (depth1 + 1) + ".Texts." + (depth2 + 1) + ".FontColor" , userPaness.get(depth1).getTextss().get(depth2).getFontColor());
						putQueryParameter("UserPanes." + (depth1 + 1) + ".Texts." + (depth2 + 1) + ".ZOrder" , userPaness.get(depth1).getTextss().get(depth2).getZOrder());
					}
				}
			}
		}	
	}

	public String getTaskProfile() {
		return this.taskProfile;
	}

	public void setTaskProfile(String taskProfile) {
		this.taskProfile = taskProfile;
		if(taskProfile != null){
			putQueryParameter("TaskProfile", taskProfile);
		}
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putQueryParameter("TemplateId", templateId);
		}
	}

	public List<String> getSubSpecUserss() {
		return this.subSpecUserss;
	}

	public void setSubSpecUserss(List<String> subSpecUserss) {
		this.subSpecUserss = subSpecUserss;	
		if (subSpecUserss != null) {
			for (int i = 0; i < subSpecUserss.size(); i++) {
				putQueryParameter("SubSpecUsers." + (i + 1) , subSpecUserss.get(i));
			}
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

	public Integer getMediaEncode() {
		return this.mediaEncode;
	}

	public void setMediaEncode(Integer mediaEncode) {
		this.mediaEncode = mediaEncode;
		if(mediaEncode != null){
			putQueryParameter("MediaEncode", mediaEncode.toString());
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

	public static class UserPanes {

		private Integer paneId;

		private String userId;

		private String sourceType;

		private List<Images> imagess;

		private List<Texts> textss;

		public Integer getPaneId() {
			return this.paneId;
		}

		public void setPaneId(Integer paneId) {
			this.paneId = paneId;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public List<Images> getImagess() {
			return this.imagess;
		}

		public void setImagess(List<Images> imagess) {
			this.imagess = imagess;
		}

		public List<Texts> getTextss() {
			return this.textss;
		}

		public void setTextss(List<Texts> textss) {
			this.textss = textss;
		}

		public static class Images {

			private String url;

			private Integer display;

			private Float x;

			private Float y;

			private Float width;

			private Float height;

			private Integer zOrder;

			public String getUrl() {
				return this.url;
			}

			public void setUrl(String url) {
				this.url = url;
			}

			public Integer getDisplay() {
				return this.display;
			}

			public void setDisplay(Integer display) {
				this.display = display;
			}

			public Float getX() {
				return this.x;
			}

			public void setX(Float x) {
				this.x = x;
			}

			public Float getY() {
				return this.y;
			}

			public void setY(Float y) {
				this.y = y;
			}

			public Float getWidth() {
				return this.width;
			}

			public void setWidth(Float width) {
				this.width = width;
			}

			public Float getHeight() {
				return this.height;
			}

			public void setHeight(Float height) {
				this.height = height;
			}

			public Integer getZOrder() {
				return this.zOrder;
			}

			public void setZOrder(Integer zOrder) {
				this.zOrder = zOrder;
			}
		}

		public static class Texts {

			private String text;

			private Float x;

			private Float y;

			private Integer fontType;

			private Integer fontSize;

			private Integer fontColor;

			private Integer zOrder;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public Float getX() {
				return this.x;
			}

			public void setX(Float x) {
				this.x = x;
			}

			public Float getY() {
				return this.y;
			}

			public void setY(Float y) {
				this.y = y;
			}

			public Integer getFontType() {
				return this.fontType;
			}

			public void setFontType(Integer fontType) {
				this.fontType = fontType;
			}

			public Integer getFontSize() {
				return this.fontSize;
			}

			public void setFontSize(Integer fontSize) {
				this.fontSize = fontSize;
			}

			public Integer getFontColor() {
				return this.fontColor;
			}

			public void setFontColor(Integer fontColor) {
				this.fontColor = fontColor;
			}

			public Integer getZOrder() {
				return this.zOrder;
			}

			public void setZOrder(Integer zOrder) {
				this.zOrder = zOrder;
			}
		}
	}

	@Override
	public Class<StartRecordTaskResponse> getResponseClass() {
		return StartRecordTaskResponse.class;
	}

}
