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
public class UpdateRecordTaskRequest extends RpcAcsRequest<UpdateRecordTaskResponse> {
	   

	private List<UserPanes> userPaness;

	private List<String> subSpecCameraUserss;

	private List<Long> layoutIdss;

	private String taskId;

	private List<String> unsubSpecCameraUserss;

	private List<String> unsubSpecAudioUserss;

	private List<String> unsubSpecShareScreenUserss;

	private Long ownerId;

	private String templateId;

	private List<String> subSpecAudioUserss;

	private List<String> subSpecShareScreenUserss;

	private List<String> subSpecUserss;

	private String appId;

	private String channelId;
	public UpdateRecordTaskRequest() {
		super("rtc", "2018-01-11", "UpdateRecordTask");
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
				if (userPaness.get(depth1).getImagess() != null) {
					for (int depth2 = 0; depth2 < userPaness.get(depth1).getImagess().size(); depth2++) {
						putQueryParameter("UserPanes." + (depth1 + 1) + ".Images." + (depth2 + 1) + ".Width" , userPaness.get(depth1).getImagess().get(depth2).getWidth());
						putQueryParameter("UserPanes." + (depth1 + 1) + ".Images." + (depth2 + 1) + ".Height" , userPaness.get(depth1).getImagess().get(depth2).getHeight());
						putQueryParameter("UserPanes." + (depth1 + 1) + ".Images." + (depth2 + 1) + ".Y" , userPaness.get(depth1).getImagess().get(depth2).getY());
						putQueryParameter("UserPanes." + (depth1 + 1) + ".Images." + (depth2 + 1) + ".Url" , userPaness.get(depth1).getImagess().get(depth2).getUrl());
						putQueryParameter("UserPanes." + (depth1 + 1) + ".Images." + (depth2 + 1) + ".Display" , userPaness.get(depth1).getImagess().get(depth2).getDisplay());
						putQueryParameter("UserPanes." + (depth1 + 1) + ".Images." + (depth2 + 1) + ".ZOrder" , userPaness.get(depth1).getImagess().get(depth2).getZOrder());
						putQueryParameter("UserPanes." + (depth1 + 1) + ".Images." + (depth2 + 1) + ".X" , userPaness.get(depth1).getImagess().get(depth2).getX());
					}
				}
				putQueryParameter("UserPanes." + (depth1 + 1) + ".UserId" , userPaness.get(depth1).getUserId());
				if (userPaness.get(depth1).getTextss() != null) {
					for (int depth2 = 0; depth2 < userPaness.get(depth1).getTextss().size(); depth2++) {
						putQueryParameter("UserPanes." + (depth1 + 1) + ".Texts." + (depth2 + 1) + ".FontType" , userPaness.get(depth1).getTextss().get(depth2).getFontType());
						putQueryParameter("UserPanes." + (depth1 + 1) + ".Texts." + (depth2 + 1) + ".FontColor" , userPaness.get(depth1).getTextss().get(depth2).getFontColor());
						putQueryParameter("UserPanes." + (depth1 + 1) + ".Texts." + (depth2 + 1) + ".Y" , userPaness.get(depth1).getTextss().get(depth2).getY());
						putQueryParameter("UserPanes." + (depth1 + 1) + ".Texts." + (depth2 + 1) + ".Text" , userPaness.get(depth1).getTextss().get(depth2).getText());
						putQueryParameter("UserPanes." + (depth1 + 1) + ".Texts." + (depth2 + 1) + ".ZOrder" , userPaness.get(depth1).getTextss().get(depth2).getZOrder());
						putQueryParameter("UserPanes." + (depth1 + 1) + ".Texts." + (depth2 + 1) + ".X" , userPaness.get(depth1).getTextss().get(depth2).getX());
						putQueryParameter("UserPanes." + (depth1 + 1) + ".Texts." + (depth2 + 1) + ".FontSize" , userPaness.get(depth1).getTextss().get(depth2).getFontSize());
					}
				}
				putQueryParameter("UserPanes." + (depth1 + 1) + ".SourceType" , userPaness.get(depth1).getSourceType());
				putQueryParameter("UserPanes." + (depth1 + 1) + ".PaneId" , userPaness.get(depth1).getPaneId());
			}
		}	
	}

	public List<String> getSubSpecCameraUserss() {
		return this.subSpecCameraUserss;
	}

	public void setSubSpecCameraUserss(List<String> subSpecCameraUserss) {
		this.subSpecCameraUserss = subSpecCameraUserss;	
		if (subSpecCameraUserss != null) {
			for (int i = 0; i < subSpecCameraUserss.size(); i++) {
				putQueryParameter("SubSpecCameraUsers." + (i + 1) , subSpecCameraUserss.get(i));
			}
		}	
	}

	public List<Long> getLayoutIdss() {
		return this.layoutIdss;
	}

	public void setLayoutIdss(List<Long> layoutIdss) {
		this.layoutIdss = layoutIdss;	
		if (layoutIdss != null) {
			for (int i = 0; i < layoutIdss.size(); i++) {
				putQueryParameter("LayoutIds." + (i + 1) , layoutIdss.get(i));
			}
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

	public List<String> getUnsubSpecCameraUserss() {
		return this.unsubSpecCameraUserss;
	}

	public void setUnsubSpecCameraUserss(List<String> unsubSpecCameraUserss) {
		this.unsubSpecCameraUserss = unsubSpecCameraUserss;	
		if (unsubSpecCameraUserss != null) {
			for (int i = 0; i < unsubSpecCameraUserss.size(); i++) {
				putQueryParameter("UnsubSpecCameraUsers." + (i + 1) , unsubSpecCameraUserss.get(i));
			}
		}	
	}

	public List<String> getUnsubSpecAudioUserss() {
		return this.unsubSpecAudioUserss;
	}

	public void setUnsubSpecAudioUserss(List<String> unsubSpecAudioUserss) {
		this.unsubSpecAudioUserss = unsubSpecAudioUserss;	
		if (unsubSpecAudioUserss != null) {
			for (int i = 0; i < unsubSpecAudioUserss.size(); i++) {
				putQueryParameter("UnsubSpecAudioUsers." + (i + 1) , unsubSpecAudioUserss.get(i));
			}
		}	
	}

	public List<String> getUnsubSpecShareScreenUserss() {
		return this.unsubSpecShareScreenUserss;
	}

	public void setUnsubSpecShareScreenUserss(List<String> unsubSpecShareScreenUserss) {
		this.unsubSpecShareScreenUserss = unsubSpecShareScreenUserss;	
		if (unsubSpecShareScreenUserss != null) {
			for (int i = 0; i < unsubSpecShareScreenUserss.size(); i++) {
				putQueryParameter("UnsubSpecShareScreenUsers." + (i + 1) , unsubSpecShareScreenUserss.get(i));
			}
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

	public List<String> getSubSpecAudioUserss() {
		return this.subSpecAudioUserss;
	}

	public void setSubSpecAudioUserss(List<String> subSpecAudioUserss) {
		this.subSpecAudioUserss = subSpecAudioUserss;	
		if (subSpecAudioUserss != null) {
			for (int i = 0; i < subSpecAudioUserss.size(); i++) {
				putQueryParameter("SubSpecAudioUsers." + (i + 1) , subSpecAudioUserss.get(i));
			}
		}	
	}

	public List<String> getSubSpecShareScreenUserss() {
		return this.subSpecShareScreenUserss;
	}

	public void setSubSpecShareScreenUserss(List<String> subSpecShareScreenUserss) {
		this.subSpecShareScreenUserss = subSpecShareScreenUserss;	
		if (subSpecShareScreenUserss != null) {
			for (int i = 0; i < subSpecShareScreenUserss.size(); i++) {
				putQueryParameter("SubSpecShareScreenUsers." + (i + 1) , subSpecShareScreenUserss.get(i));
			}
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

		private List<Images> imagess;

		private String userId;

		private List<Texts> textss;

		private String sourceType;

		private Integer paneId;

		public List<Images> getImagess() {
			return this.imagess;
		}

		public void setImagess(List<Images> imagess) {
			this.imagess = imagess;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public List<Texts> getTextss() {
			return this.textss;
		}

		public void setTextss(List<Texts> textss) {
			this.textss = textss;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public Integer getPaneId() {
			return this.paneId;
		}

		public void setPaneId(Integer paneId) {
			this.paneId = paneId;
		}

		public static class Images {

			private Float width;

			private Float height;

			private Float y;

			private String url;

			private Integer display;

			private Integer zOrder;

			private Float x;

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

			public Float getY() {
				return this.y;
			}

			public void setY(Float y) {
				this.y = y;
			}

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

			public Integer getZOrder() {
				return this.zOrder;
			}

			public void setZOrder(Integer zOrder) {
				this.zOrder = zOrder;
			}

			public Float getX() {
				return this.x;
			}

			public void setX(Float x) {
				this.x = x;
			}
		}

		public static class Texts {

			private Integer fontType;

			private Integer fontColor;

			private Float y;

			private String text;

			private Integer zOrder;

			private Float x;

			private Integer fontSize;

			public Integer getFontType() {
				return this.fontType;
			}

			public void setFontType(Integer fontType) {
				this.fontType = fontType;
			}

			public Integer getFontColor() {
				return this.fontColor;
			}

			public void setFontColor(Integer fontColor) {
				this.fontColor = fontColor;
			}

			public Float getY() {
				return this.y;
			}

			public void setY(Float y) {
				this.y = y;
			}

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public Integer getZOrder() {
				return this.zOrder;
			}

			public void setZOrder(Integer zOrder) {
				this.zOrder = zOrder;
			}

			public Float getX() {
				return this.x;
			}

			public void setX(Float x) {
				this.x = x;
			}

			public Integer getFontSize() {
				return this.fontSize;
			}

			public void setFontSize(Integer fontSize) {
				this.fontSize = fontSize;
			}
		}
	}

	@Override
	public Class<UpdateRecordTaskResponse> getResponseClass() {
		return UpdateRecordTaskResponse.class;
	}

}
