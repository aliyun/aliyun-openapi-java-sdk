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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddLiveAISubtitleRequest extends RpcAcsRequest<AddLiveAISubtitleResponse> {
	   

	private String srcLanguage;

	private String description;

	private String fontName;

	private String subtitleName;

	private Float fontSizeNormalized;

	private String fontColor;

	private Boolean showSourceLan;

	@SerializedName("positionNormalized")
	private List<Float> positionNormalized;

	private Float borderWidthNormalized;

	private Integer maxLines;

	private String height;

	private Integer wordPerLine;

	private Long ownerId;

	private Float bgWidthNormalized;

	private String bgColor;

	private String dstLanguage;

	private String width;

	private String copyFrom;
	public AddLiveAISubtitleRequest() {
		super("live", "2016-11-01", "AddLiveAISubtitle", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSrcLanguage() {
		return this.srcLanguage;
	}

	public void setSrcLanguage(String srcLanguage) {
		this.srcLanguage = srcLanguage;
		if(srcLanguage != null){
			putQueryParameter("SrcLanguage", srcLanguage);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getFontName() {
		return this.fontName;
	}

	public void setFontName(String fontName) {
		this.fontName = fontName;
		if(fontName != null){
			putQueryParameter("FontName", fontName);
		}
	}

	public String getSubtitleName() {
		return this.subtitleName;
	}

	public void setSubtitleName(String subtitleName) {
		this.subtitleName = subtitleName;
		if(subtitleName != null){
			putQueryParameter("SubtitleName", subtitleName);
		}
	}

	public Float getFontSizeNormalized() {
		return this.fontSizeNormalized;
	}

	public void setFontSizeNormalized(Float fontSizeNormalized) {
		this.fontSizeNormalized = fontSizeNormalized;
		if(fontSizeNormalized != null){
			putQueryParameter("FontSizeNormalized", fontSizeNormalized.toString());
		}
	}

	public String getFontColor() {
		return this.fontColor;
	}

	public void setFontColor(String fontColor) {
		this.fontColor = fontColor;
		if(fontColor != null){
			putQueryParameter("FontColor", fontColor);
		}
	}

	public Boolean getShowSourceLan() {
		return this.showSourceLan;
	}

	public void setShowSourceLan(Boolean showSourceLan) {
		this.showSourceLan = showSourceLan;
		if(showSourceLan != null){
			putQueryParameter("ShowSourceLan", showSourceLan.toString());
		}
	}

	public List<Float> getPositionNormalized() {
		return this.positionNormalized;
	}

	public void setPositionNormalized(List<Float> positionNormalized) {
		this.positionNormalized = positionNormalized;	
		if (positionNormalized != null) {
			putQueryParameter("PositionNormalized" , new Gson().toJson(positionNormalized));
		}	
	}

	public Float getBorderWidthNormalized() {
		return this.borderWidthNormalized;
	}

	public void setBorderWidthNormalized(Float borderWidthNormalized) {
		this.borderWidthNormalized = borderWidthNormalized;
		if(borderWidthNormalized != null){
			putQueryParameter("BorderWidthNormalized", borderWidthNormalized.toString());
		}
	}

	public Integer getMaxLines() {
		return this.maxLines;
	}

	public void setMaxLines(Integer maxLines) {
		this.maxLines = maxLines;
		if(maxLines != null){
			putQueryParameter("MaxLines", maxLines.toString());
		}
	}

	public String getHeight() {
		return this.height;
	}

	public void setHeight(String height) {
		this.height = height;
		if(height != null){
			putQueryParameter("Height", height);
		}
	}

	public Integer getWordPerLine() {
		return this.wordPerLine;
	}

	public void setWordPerLine(Integer wordPerLine) {
		this.wordPerLine = wordPerLine;
		if(wordPerLine != null){
			putQueryParameter("WordPerLine", wordPerLine.toString());
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

	public Float getBgWidthNormalized() {
		return this.bgWidthNormalized;
	}

	public void setBgWidthNormalized(Float bgWidthNormalized) {
		this.bgWidthNormalized = bgWidthNormalized;
		if(bgWidthNormalized != null){
			putQueryParameter("BgWidthNormalized", bgWidthNormalized.toString());
		}
	}

	public String getBgColor() {
		return this.bgColor;
	}

	public void setBgColor(String bgColor) {
		this.bgColor = bgColor;
		if(bgColor != null){
			putQueryParameter("BgColor", bgColor);
		}
	}

	public String getDstLanguage() {
		return this.dstLanguage;
	}

	public void setDstLanguage(String dstLanguage) {
		this.dstLanguage = dstLanguage;
		if(dstLanguage != null){
			putQueryParameter("DstLanguage", dstLanguage);
		}
	}

	public String getWidth() {
		return this.width;
	}

	public void setWidth(String width) {
		this.width = width;
		if(width != null){
			putQueryParameter("Width", width);
		}
	}

	public String getCopyFrom() {
		return this.copyFrom;
	}

	public void setCopyFrom(String copyFrom) {
		this.copyFrom = copyFrom;
		if(copyFrom != null){
			putQueryParameter("CopyFrom", copyFrom);
		}
	}

	@Override
	public Class<AddLiveAISubtitleResponse> getResponseClass() {
		return AddLiveAISubtitleResponse.class;
	}

}
