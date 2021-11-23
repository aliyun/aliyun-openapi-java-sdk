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
public class StartMPUTaskRequest extends RpcAcsRequest<StartMPUTaskResponse> {
	   

	private Integer payloadType;

	private List<UserPanes> userPaness;

	private Integer backgroundColor;

	private Integer reportVad;

	private String sourceType;

	private String taskId;

	private List<ClockWidgets> clockWidgetss;

	private List<String> unsubSpecCameraUserss;

	private Integer taskType;

	private List<String> unsubSpecAudioUserss;

	private Long vadInterval;

	private List<Watermarks> watermarkss;

	private Long ownerId;

	private List<String> subSpecAudioUserss;

	private Integer mediaEncode;

	private EnhancedParam enhancedParam;

	private Integer rtpExtInfo;

	private Integer cropMode;

	private List<String> subSpecCameraUserss;

	private List<Long> layoutIdss;

	private String streamURL;

	private Integer streamType;

	private List<String> unsubSpecShareScreenUserss;

	private List<String> subSpecShareScreenUserss;

	private List<String> subSpecUserss;

	private String appId;

	private List<Backgrounds> backgroundss;

	private Long timeStampRef;

	private Integer mixMode;

	private String channelId;
	public StartMPUTaskRequest() {
		super("rtc", "2018-01-11", "StartMPUTask");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getPayloadType() {
		return this.payloadType;
	}

	public void setPayloadType(Integer payloadType) {
		this.payloadType = payloadType;
		if(payloadType != null){
			putQueryParameter("PayloadType", payloadType.toString());
		}
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
				putQueryParameter("UserPanes." + (depth1 + 1) + ".SegmentType" , userPaness.get(depth1).getSegmentType());
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

	public Integer getBackgroundColor() {
		return this.backgroundColor;
	}

	public void setBackgroundColor(Integer backgroundColor) {
		this.backgroundColor = backgroundColor;
		if(backgroundColor != null){
			putQueryParameter("BackgroundColor", backgroundColor.toString());
		}
	}

	public Integer getReportVad() {
		return this.reportVad;
	}

	public void setReportVad(Integer reportVad) {
		this.reportVad = reportVad;
		if(reportVad != null){
			putQueryParameter("ReportVad", reportVad.toString());
		}
	}

	public String getSourceType() {
		return this.sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
		if(sourceType != null){
			putQueryParameter("SourceType", sourceType);
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

	public List<ClockWidgets> getClockWidgetss() {
		return this.clockWidgetss;
	}

	public void setClockWidgetss(List<ClockWidgets> clockWidgetss) {
		this.clockWidgetss = clockWidgetss;	
		if (clockWidgetss != null) {
			for (int depth1 = 0; depth1 < clockWidgetss.size(); depth1++) {
				putQueryParameter("ClockWidgets." + (depth1 + 1) + ".FontType" , clockWidgetss.get(depth1).getFontType());
				putQueryParameter("ClockWidgets." + (depth1 + 1) + ".FontColor" , clockWidgetss.get(depth1).getFontColor());
				putQueryParameter("ClockWidgets." + (depth1 + 1) + ".Y" , clockWidgetss.get(depth1).getY());
				putQueryParameter("ClockWidgets." + (depth1 + 1) + ".ZOrder" , clockWidgetss.get(depth1).getZOrder());
				putQueryParameter("ClockWidgets." + (depth1 + 1) + ".X" , clockWidgetss.get(depth1).getX());
				putQueryParameter("ClockWidgets." + (depth1 + 1) + ".FontSize" , clockWidgetss.get(depth1).getFontSize());
			}
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

	public Integer getTaskType() {
		return this.taskType;
	}

	public void setTaskType(Integer taskType) {
		this.taskType = taskType;
		if(taskType != null){
			putQueryParameter("TaskType", taskType.toString());
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

	public Long getVadInterval() {
		return this.vadInterval;
	}

	public void setVadInterval(Long vadInterval) {
		this.vadInterval = vadInterval;
		if(vadInterval != null){
			putQueryParameter("VadInterval", vadInterval.toString());
		}
	}

	public List<Watermarks> getWatermarkss() {
		return this.watermarkss;
	}

	public void setWatermarkss(List<Watermarks> watermarkss) {
		this.watermarkss = watermarkss;	
		if (watermarkss != null) {
			for (int depth1 = 0; depth1 < watermarkss.size(); depth1++) {
				putQueryParameter("Watermarks." + (depth1 + 1) + ".Alpha" , watermarkss.get(depth1).getAlpha());
				putQueryParameter("Watermarks." + (depth1 + 1) + ".Width" , watermarkss.get(depth1).getWidth());
				putQueryParameter("Watermarks." + (depth1 + 1) + ".Height" , watermarkss.get(depth1).getHeight());
				putQueryParameter("Watermarks." + (depth1 + 1) + ".Y" , watermarkss.get(depth1).getY());
				putQueryParameter("Watermarks." + (depth1 + 1) + ".Url" , watermarkss.get(depth1).getUrl());
				putQueryParameter("Watermarks." + (depth1 + 1) + ".Display" , watermarkss.get(depth1).getDisplay());
				putQueryParameter("Watermarks." + (depth1 + 1) + ".ZOrder" , watermarkss.get(depth1).getZOrder());
				putQueryParameter("Watermarks." + (depth1 + 1) + ".X" , watermarkss.get(depth1).getX());
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

	public Integer getMediaEncode() {
		return this.mediaEncode;
	}

	public void setMediaEncode(Integer mediaEncode) {
		this.mediaEncode = mediaEncode;
		if(mediaEncode != null){
			putQueryParameter("MediaEncode", mediaEncode.toString());
		}
	}

	public EnhancedParam getEnhancedParam() {
		return this.enhancedParam;
	}

	public void setEnhancedParam(EnhancedParam enhancedParam) {
		this.enhancedParam = enhancedParam;	
		if (enhancedParam != null) {
			
				putBodyParameter("EnhancedParam.EnablePortraitSegmentation" , enhancedParam.getEnablePortraitSegmentation());
				putBodyParameter("EnhancedParam.EnableVirtualConference" , enhancedParam.getEnableVirtualConference());
				putBodyParameter("EnhancedParam.EnableCartoonPortrait" , enhancedParam.getEnableCartoonPortrait());
				putBodyParameter("EnhancedParam.EnableVoiceChanger" , enhancedParam.getEnableVoiceChanger());
				putBodyParameter("EnhancedParam.EnableUserPaneBackground" , enhancedParam.getEnableUserPaneBackground());
				putBodyParameter("EnhancedParam.BackgroundPath" , enhancedParam.getBackgroundPath());
		}	
	}

	public Integer getRtpExtInfo() {
		return this.rtpExtInfo;
	}

	public void setRtpExtInfo(Integer rtpExtInfo) {
		this.rtpExtInfo = rtpExtInfo;
		if(rtpExtInfo != null){
			putQueryParameter("RtpExtInfo", rtpExtInfo.toString());
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

	public String getStreamURL() {
		return this.streamURL;
	}

	public void setStreamURL(String streamURL) {
		this.streamURL = streamURL;
		if(streamURL != null){
			putQueryParameter("StreamURL", streamURL);
		}
	}

	public Integer getStreamType() {
		return this.streamType;
	}

	public void setStreamType(Integer streamType) {
		this.streamType = streamType;
		if(streamType != null){
			putQueryParameter("StreamType", streamType.toString());
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

	public List<Backgrounds> getBackgroundss() {
		return this.backgroundss;
	}

	public void setBackgroundss(List<Backgrounds> backgroundss) {
		this.backgroundss = backgroundss;	
		if (backgroundss != null) {
			for (int depth1 = 0; depth1 < backgroundss.size(); depth1++) {
				putQueryParameter("Backgrounds." + (depth1 + 1) + ".Width" , backgroundss.get(depth1).getWidth());
				putQueryParameter("Backgrounds." + (depth1 + 1) + ".Height" , backgroundss.get(depth1).getHeight());
				putQueryParameter("Backgrounds." + (depth1 + 1) + ".Y" , backgroundss.get(depth1).getY());
				putQueryParameter("Backgrounds." + (depth1 + 1) + ".Url" , backgroundss.get(depth1).getUrl());
				putQueryParameter("Backgrounds." + (depth1 + 1) + ".Display" , backgroundss.get(depth1).getDisplay());
				putQueryParameter("Backgrounds." + (depth1 + 1) + ".ZOrder" , backgroundss.get(depth1).getZOrder());
				putQueryParameter("Backgrounds." + (depth1 + 1) + ".X" , backgroundss.get(depth1).getX());
			}
		}	
	}

	public Long getTimeStampRef() {
		return this.timeStampRef;
	}

	public void setTimeStampRef(Long timeStampRef) {
		this.timeStampRef = timeStampRef;
		if(timeStampRef != null){
			putQueryParameter("TimeStampRef", timeStampRef.toString());
		}
	}

	public Integer getMixMode() {
		return this.mixMode;
	}

	public void setMixMode(Integer mixMode) {
		this.mixMode = mixMode;
		if(mixMode != null){
			putQueryParameter("MixMode", mixMode.toString());
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

		private Integer segmentType;

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

		public Integer getSegmentType() {
			return this.segmentType;
		}

		public void setSegmentType(Integer segmentType) {
			this.segmentType = segmentType;
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

	public static class ClockWidgets {

		private Integer fontType;

		private Integer fontColor;

		private Float y;

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

	public static class Watermarks {

		private Float alpha;

		private Float width;

		private Float height;

		private Float y;

		private String url;

		private Integer display;

		private Integer zOrder;

		private Float x;

		public Float getAlpha() {
			return this.alpha;
		}

		public void setAlpha(Float alpha) {
			this.alpha = alpha;
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

	public static class EnhancedParam {

		private Boolean enablePortraitSegmentation;

		private Boolean enableVirtualConference;

		private Boolean enableCartoonPortrait;

		private Boolean enableVoiceChanger;

		private Boolean enableUserPaneBackground;

		private String backgroundPath;

		public Boolean getEnablePortraitSegmentation() {
			return this.enablePortraitSegmentation;
		}

		public void setEnablePortraitSegmentation(Boolean enablePortraitSegmentation) {
			this.enablePortraitSegmentation = enablePortraitSegmentation;
		}

		public Boolean getEnableVirtualConference() {
			return this.enableVirtualConference;
		}

		public void setEnableVirtualConference(Boolean enableVirtualConference) {
			this.enableVirtualConference = enableVirtualConference;
		}

		public Boolean getEnableCartoonPortrait() {
			return this.enableCartoonPortrait;
		}

		public void setEnableCartoonPortrait(Boolean enableCartoonPortrait) {
			this.enableCartoonPortrait = enableCartoonPortrait;
		}

		public Boolean getEnableVoiceChanger() {
			return this.enableVoiceChanger;
		}

		public void setEnableVoiceChanger(Boolean enableVoiceChanger) {
			this.enableVoiceChanger = enableVoiceChanger;
		}

		public Boolean getEnableUserPaneBackground() {
			return this.enableUserPaneBackground;
		}

		public void setEnableUserPaneBackground(Boolean enableUserPaneBackground) {
			this.enableUserPaneBackground = enableUserPaneBackground;
		}

		public String getBackgroundPath() {
			return this.backgroundPath;
		}

		public void setBackgroundPath(String backgroundPath) {
			this.backgroundPath = backgroundPath;
		}
	}

	public static class Backgrounds {

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

	@Override
	public Class<StartMPUTaskResponse> getResponseClass() {
		return StartMPUTaskResponse.class;
	}

}
