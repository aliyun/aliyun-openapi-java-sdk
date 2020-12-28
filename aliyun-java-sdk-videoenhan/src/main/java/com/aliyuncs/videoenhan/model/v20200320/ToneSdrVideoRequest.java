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
public class ToneSdrVideoRequest extends RpcAcsRequest<ToneSdrVideoResponse> {
	   

	private Integer bitrate;

	private String recolorModel;

	private String videoURL;
	public ToneSdrVideoRequest() {
		super("videoenhan", "2020-03-20", "ToneSdrVideo");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getBitrate() {
		return this.bitrate;
	}

	public void setBitrate(Integer bitrate) {
		this.bitrate = bitrate;
		if(bitrate != null){
			putBodyParameter("Bitrate", bitrate.toString());
		}
	}

	public String getRecolorModel() {
		return this.recolorModel;
	}

	public void setRecolorModel(String recolorModel) {
		this.recolorModel = recolorModel;
		if(recolorModel != null){
			putBodyParameter("RecolorModel", recolorModel);
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
	public Class<ToneSdrVideoResponse> getResponseClass() {
		return ToneSdrVideoResponse.class;
	}

}
