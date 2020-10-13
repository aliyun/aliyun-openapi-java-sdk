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
public class UpdateMPULayoutRequest extends RpcAcsRequest<UpdateMPULayoutResponse> {
	   

	private List<UserPanes> userPaness;

	private Integer backgroundColor;

	private Integer cropMode;

	private List<Long> layoutIdss;

	private String taskId;

	private List<Watermarks> watermarkss;

	private Long ownerId;

	private String appId;

	private List<Backgrounds> backgroundss;
	public UpdateMPULayoutRequest() {
		super("rtc", "2018-01-11", "UpdateMPULayout", "rtc");
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

	public Integer getBackgroundColor() {
		return this.backgroundColor;
	}

	public void setBackgroundColor(Integer backgroundColor) {
		this.backgroundColor = backgroundColor;
		if(backgroundColor != null){
			putQueryParameter("BackgroundColor", backgroundColor.toString());
		}
	}

	public Integer getCropMode() {
		return this.cropMode;
	}

	public void setCropMode(Integer cropMode) {
		this.cropMode = cropMode;
		if(cropMode != null){
			putQueryParameter("CropMode", cropMode.toString());
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

	public List<Watermarks> getWatermarkss() {
		return this.watermarkss;
	}

	public void setWatermarkss(List<Watermarks> watermarkss) {
		this.watermarkss = watermarkss;	
		if (watermarkss != null) {
			for (int depth1 = 0; depth1 < watermarkss.size(); depth1++) {
				putQueryParameter("Watermarks." + (depth1 + 1) + ".Url" , watermarkss.get(depth1).getUrl());
				putQueryParameter("Watermarks." + (depth1 + 1) + ".Alpha" , watermarkss.get(depth1).getAlpha());
				putQueryParameter("Watermarks." + (depth1 + 1) + ".Display" , watermarkss.get(depth1).getDisplay());
				putQueryParameter("Watermarks." + (depth1 + 1) + ".X" , watermarkss.get(depth1).getX());
				putQueryParameter("Watermarks." + (depth1 + 1) + ".Y" , watermarkss.get(depth1).getY());
				putQueryParameter("Watermarks." + (depth1 + 1) + ".Width" , watermarkss.get(depth1).getWidth());
				putQueryParameter("Watermarks." + (depth1 + 1) + ".Height" , watermarkss.get(depth1).getHeight());
				putQueryParameter("Watermarks." + (depth1 + 1) + ".ZOrder" , watermarkss.get(depth1).getZOrder());
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

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public List<Backgrounds> getBackgroundss() {
		return this.backgroundss;
	}

	public void setBackgroundss(List<Backgrounds> backgroundss) {
		this.backgroundss = backgroundss;	
		if (backgroundss != null) {
			for (int depth1 = 0; depth1 < backgroundss.size(); depth1++) {
				putQueryParameter("Backgrounds." + (depth1 + 1) + ".Url" , backgroundss.get(depth1).getUrl());
				putQueryParameter("Backgrounds." + (depth1 + 1) + ".Display" , backgroundss.get(depth1).getDisplay());
				putQueryParameter("Backgrounds." + (depth1 + 1) + ".X" , backgroundss.get(depth1).getX());
				putQueryParameter("Backgrounds." + (depth1 + 1) + ".Y" , backgroundss.get(depth1).getY());
				putQueryParameter("Backgrounds." + (depth1 + 1) + ".Width" , backgroundss.get(depth1).getWidth());
				putQueryParameter("Backgrounds." + (depth1 + 1) + ".Height" , backgroundss.get(depth1).getHeight());
				putQueryParameter("Backgrounds." + (depth1 + 1) + ".ZOrder" , backgroundss.get(depth1).getZOrder());
			}
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

	public static class Watermarks {

		private String url;

		private Float alpha;

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

		public Float getAlpha() {
			return this.alpha;
		}

		public void setAlpha(Float alpha) {
			this.alpha = alpha;
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

	public static class Backgrounds {

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

	@Override
	public Class<UpdateMPULayoutResponse> getResponseClass() {
		return UpdateMPULayoutResponse.class;
	}

}
