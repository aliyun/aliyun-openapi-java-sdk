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
public class AddLiveStreamWatermarkRequest extends RpcAcsRequest<AddLiveStreamWatermarkResponse> {
	   

	private Float yOffset;

	private String pictureUrl;

	private String description;

	private Integer type;

	private Integer height;

	private Float xOffset;

	private Long ownerId;

	private Integer refWidth;

	private Integer transparency;

	private String domain;

	private String name;

	private String offsetCorner;

	private Integer refHeight;
	public AddLiveStreamWatermarkRequest() {
		super("live", "2016-11-01", "AddLiveStreamWatermark", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Float getYOffset() {
		return this.yOffset;
	}

	public void setYOffset(Float yOffset) {
		this.yOffset = yOffset;
		if(yOffset != null){
			putQueryParameter("YOffset", yOffset.toString());
		}
	}

	public String getPictureUrl() {
		return this.pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
		if(pictureUrl != null){
			putQueryParameter("PictureUrl", pictureUrl);
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

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type.toString());
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

	public Float getXOffset() {
		return this.xOffset;
	}

	public void setXOffset(Float xOffset) {
		this.xOffset = xOffset;
		if(xOffset != null){
			putQueryParameter("XOffset", xOffset.toString());
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

	public Integer getRefWidth() {
		return this.refWidth;
	}

	public void setRefWidth(Integer refWidth) {
		this.refWidth = refWidth;
		if(refWidth != null){
			putQueryParameter("RefWidth", refWidth.toString());
		}
	}

	public Integer getTransparency() {
		return this.transparency;
	}

	public void setTransparency(Integer transparency) {
		this.transparency = transparency;
		if(transparency != null){
			putQueryParameter("Transparency", transparency.toString());
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getOffsetCorner() {
		return this.offsetCorner;
	}

	public void setOffsetCorner(String offsetCorner) {
		this.offsetCorner = offsetCorner;
		if(offsetCorner != null){
			putQueryParameter("OffsetCorner", offsetCorner);
		}
	}

	public Integer getRefHeight() {
		return this.refHeight;
	}

	public void setRefHeight(Integer refHeight) {
		this.refHeight = refHeight;
		if(refHeight != null){
			putQueryParameter("RefHeight", refHeight.toString());
		}
	}

	@Override
	public Class<AddLiveStreamWatermarkResponse> getResponseClass() {
		return AddLiveStreamWatermarkResponse.class;
	}

}
