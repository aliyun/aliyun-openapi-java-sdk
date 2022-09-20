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

package com.aliyuncs.threedvision.model.v20210131;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.threedvision.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class EstimateMonocularVideoDepthRequest extends RpcAcsRequest<EstimateMonocularVideoDepthResponse> {
	   

	private String sampleRate;

	private String videoURL;
	public EstimateMonocularVideoDepthRequest() {
		super("threedvision", "2021-01-31", "EstimateMonocularVideoDepth", "threedvision");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSampleRate() {
		return this.sampleRate;
	}

	public void setSampleRate(String sampleRate) {
		this.sampleRate = sampleRate;
		if(sampleRate != null){
			putBodyParameter("SampleRate", sampleRate);
		}
	}

	public String getVideoURL() {
		return this.videoURL;
	}

	public void setVideoURL(String videoURL) {
		this.videoURL = videoURL;
		if(videoURL != null){
			putBodyParameter("VideoURL", videoURL);
		}
	}

	@Override
	public Class<EstimateMonocularVideoDepthResponse> getResponseClass() {
		return EstimateMonocularVideoDepthResponse.class;
	}

}
