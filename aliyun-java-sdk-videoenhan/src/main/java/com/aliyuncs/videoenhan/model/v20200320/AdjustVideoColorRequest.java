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
public class AdjustVideoColorRequest extends RpcAcsRequest<AdjustVideoColorResponse> {
	   

	private String mode;

	private String videoUrl;

	private String videoBitrate;

	private String videoCodec;

	private String videoFormat;
	public AdjustVideoColorRequest() {
		super("videoenhan", "2020-03-20", "AdjustVideoColor", "videoenhan");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
		if(mode != null){
			putBodyParameter("Mode", mode);
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

	public String getVideoBitrate() {
		return this.videoBitrate;
	}

	public void setVideoBitrate(String videoBitrate) {
		this.videoBitrate = videoBitrate;
		if(videoBitrate != null){
			putBodyParameter("VideoBitrate", videoBitrate);
		}
	}

	public String getVideoCodec() {
		return this.videoCodec;
	}

	public void setVideoCodec(String videoCodec) {
		this.videoCodec = videoCodec;
		if(videoCodec != null){
			putBodyParameter("VideoCodec", videoCodec);
		}
	}

	public String getVideoFormat() {
		return this.videoFormat;
	}

	public void setVideoFormat(String videoFormat) {
		this.videoFormat = videoFormat;
		if(videoFormat != null){
			putBodyParameter("VideoFormat", videoFormat);
		}
	}

	@Override
	public Class<AdjustVideoColorResponse> getResponseClass() {
		return AdjustVideoColorResponse.class;
	}

}
