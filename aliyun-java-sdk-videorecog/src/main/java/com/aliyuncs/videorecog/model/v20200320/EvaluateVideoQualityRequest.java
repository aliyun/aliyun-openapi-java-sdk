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

package com.aliyuncs.videorecog.model.v20200320;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.videorecog.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class EvaluateVideoQualityRequest extends RpcAcsRequest<EvaluateVideoQualityResponse> {
	   

	private String mode;

	private String videoUrl;
	public EvaluateVideoQualityRequest() {
		super("videorecog", "2020-03-20", "EvaluateVideoQuality", "videorecog");
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

	@Override
	public Class<EvaluateVideoQualityResponse> getResponseClass() {
		return EvaluateVideoQualityResponse.class;
	}

}
