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
public class EraseVideoSubtitlesRequest extends RpcAcsRequest<EraseVideoSubtitlesResponse> {
	   

	private Float bH;

	private String videoUrl;

	private Float bW;

	private Float bX;

	private Float bY;
	public EraseVideoSubtitlesRequest() {
		super("videoenhan", "2020-03-20", "EraseVideoSubtitles", "videoenhan");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Float getBH() {
		return this.bH;
	}

	public void setBH(Float bH) {
		this.bH = bH;
		if(bH != null){
			putBodyParameter("BH", bH.toString());
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

	public Float getBW() {
		return this.bW;
	}

	public void setBW(Float bW) {
		this.bW = bW;
		if(bW != null){
			putBodyParameter("BW", bW.toString());
		}
	}

	public Float getBX() {
		return this.bX;
	}

	public void setBX(Float bX) {
		this.bX = bX;
		if(bX != null){
			putBodyParameter("BX", bX.toString());
		}
	}

	public Float getBY() {
		return this.bY;
	}

	public void setBY(Float bY) {
		this.bY = bY;
		if(bY != null){
			putBodyParameter("BY", bY.toString());
		}
	}

	@Override
	public Class<EraseVideoSubtitlesResponse> getResponseClass() {
		return EraseVideoSubtitlesResponse.class;
	}

}
