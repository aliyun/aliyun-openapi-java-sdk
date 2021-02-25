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
public class AddRecordTemplateRequest extends RpcAcsRequest<AddRecordTemplateResponse> {
	   

	private List<String> formatss;

	private String ossFilePrefix;

	private Integer backgroundColor;

	private String taskProfile;

	private List<Long> layoutIdss;

	private List<ClockWidgets> clockWidgetss;

	private String ossBucket;

	private Integer delayStopTime;

	private Integer fileSplitInterval;

	private String mnsQueue;

	private String httpCallbackUrl;

	private List<Watermarks> watermarkss;

	private Long ownerId;

	private String appId;

	private List<Backgrounds> backgroundss;

	private String name;

	private Integer mediaEncode;
	public AddRecordTemplateRequest() {
		super("rtc", "2018-01-11", "AddRecordTemplate", "rtc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getFormatss() {
		return this.formatss;
	}

	public void setFormatss(List<String> formatss) {
		this.formatss = formatss;	
		if (formatss != null) {
			for (int i = 0; i < formatss.size(); i++) {
				putQueryParameter("Formats." + (i + 1) , formatss.get(i));
			}
		}	
	}

	public String getOssFilePrefix() {
		return this.ossFilePrefix;
	}

	public void setOssFilePrefix(String ossFilePrefix) {
		this.ossFilePrefix = ossFilePrefix;
		if(ossFilePrefix != null){
			putQueryParameter("OssFilePrefix", ossFilePrefix);
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

	public String getTaskProfile() {
		return this.taskProfile;
	}

	public void setTaskProfile(String taskProfile) {
		this.taskProfile = taskProfile;
		if(taskProfile != null){
			putQueryParameter("TaskProfile", taskProfile);
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

	public List<ClockWidgets> getClockWidgetss() {
		return this.clockWidgetss;
	}

	public void setClockWidgetss(List<ClockWidgets> clockWidgetss) {
		this.clockWidgetss = clockWidgetss;	
		if (clockWidgetss != null) {
			for (int depth1 = 0; depth1 < clockWidgetss.size(); depth1++) {
				putQueryParameter("ClockWidgets." + (depth1 + 1) + ".X" , clockWidgetss.get(depth1).getX());
				putQueryParameter("ClockWidgets." + (depth1 + 1) + ".Y" , clockWidgetss.get(depth1).getY());
				putQueryParameter("ClockWidgets." + (depth1 + 1) + ".FontType" , clockWidgetss.get(depth1).getFontType());
				putQueryParameter("ClockWidgets." + (depth1 + 1) + ".FontSize" , clockWidgetss.get(depth1).getFontSize());
				putQueryParameter("ClockWidgets." + (depth1 + 1) + ".FontColor" , clockWidgetss.get(depth1).getFontColor());
				putQueryParameter("ClockWidgets." + (depth1 + 1) + ".ZOrder" , clockWidgetss.get(depth1).getZOrder());
			}
		}	
	}

	public String getOssBucket() {
		return this.ossBucket;
	}

	public void setOssBucket(String ossBucket) {
		this.ossBucket = ossBucket;
		if(ossBucket != null){
			putQueryParameter("OssBucket", ossBucket);
		}
	}

	public Integer getDelayStopTime() {
		return this.delayStopTime;
	}

	public void setDelayStopTime(Integer delayStopTime) {
		this.delayStopTime = delayStopTime;
		if(delayStopTime != null){
			putQueryParameter("DelayStopTime", delayStopTime.toString());
		}
	}

	public Integer getFileSplitInterval() {
		return this.fileSplitInterval;
	}

	public void setFileSplitInterval(Integer fileSplitInterval) {
		this.fileSplitInterval = fileSplitInterval;
		if(fileSplitInterval != null){
			putQueryParameter("FileSplitInterval", fileSplitInterval.toString());
		}
	}

	public String getMnsQueue() {
		return this.mnsQueue;
	}

	public void setMnsQueue(String mnsQueue) {
		this.mnsQueue = mnsQueue;
		if(mnsQueue != null){
			putQueryParameter("MnsQueue", mnsQueue);
		}
	}

	public String getHttpCallbackUrl() {
		return this.httpCallbackUrl;
	}

	public void setHttpCallbackUrl(String httpCallbackUrl) {
		this.httpCallbackUrl = httpCallbackUrl;
		if(httpCallbackUrl != null){
			putQueryParameter("HttpCallbackUrl", httpCallbackUrl);
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
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

	public static class ClockWidgets {

		private Float x;

		private Float y;

		private Integer fontType;

		private Integer fontSize;

		private Integer fontColor;

		private Integer zOrder;

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
	public Class<AddRecordTemplateResponse> getResponseClass() {
		return AddRecordTemplateResponse.class;
	}

}
