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

package com.aliyuncs.videoenhan.model.v20200320;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.videoenhan.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ChangeVideoSizeRequest extends RpcAcsRequest<ChangeVideoSizeResponse> {
	   

	private Integer height;

	private Integer b;

	private String fillType;

	private Integer g;

	private String cropType;

	private Integer r;

	private String videoUrl;

	private Integer width;

	private Float tightness;
	public ChangeVideoSizeRequest() {
		super("videoenhan", "2020-03-20", "ChangeVideoSize");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getHeight() {
		return this.height;
	}

	public void setHeight(Integer height) {
		this.height = height;
		if(height != null){
			putBodyParameter("Height", height.toString());
		}
	}

	public Integer getB() {
		return this.b;
	}

	public void setB(Integer b) {
		this.b = b;
		if(b != null){
			putBodyParameter("B", b.toString());
		}
	}

	public String getFillType() {
		return this.fillType;
	}

	public void setFillType(String fillType) {
		this.fillType = fillType;
		if(fillType != null){
			putBodyParameter("FillType", fillType);
		}
	}

	public Integer getG() {
		return this.g;
	}

	public void setG(Integer g) {
		this.g = g;
		if(g != null){
			putBodyParameter("G", g.toString());
		}
	}

	public String getCropType() {
		return this.cropType;
	}

	public void setCropType(String cropType) {
		this.cropType = cropType;
		if(cropType != null){
			putBodyParameter("CropType", cropType);
		}
	}

	public Integer getR() {
		return this.r;
	}

	public void setR(Integer r) {
		this.r = r;
		if(r != null){
			putBodyParameter("R", r.toString());
		}
	}

	public String getVideoUrl() {
		return this.videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
		if(videoUrl != null){
			putBodyParameter("VideoUrl", videoUrl);
		}
	}

	public Integer getWidth() {
		return this.width;
	}

	public void setWidth(Integer width) {
		this.width = width;
		if(width != null){
			putBodyParameter("Width", width.toString());
		}
	}

	public Float getTightness() {
		return this.tightness;
	}

	public void setTightness(Float tightness) {
		this.tightness = tightness;
		if(tightness != null){
			putBodyParameter("Tightness", tightness.toString());
		}
	}

	@Override
	public Class<ChangeVideoSizeResponse> getResponseClass() {
		return ChangeVideoSizeResponse.class;
	}

}
