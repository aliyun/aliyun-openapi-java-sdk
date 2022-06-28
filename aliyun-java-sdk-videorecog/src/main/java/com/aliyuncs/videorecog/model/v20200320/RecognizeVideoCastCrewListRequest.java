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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.videorecog.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RecognizeVideoCastCrewListRequest extends RpcAcsRequest<RecognizeVideoCastCrewListResponse> {
	   

	@SerializedName("params")
	private List<Params> params;

	private String registerUrl;

	private String videoUrl;
	public RecognizeVideoCastCrewListRequest() {
		super("videorecog", "2020-03-20", "RecognizeVideoCastCrewList", "videorecog");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Params> getParams() {
		return this.params;
	}

	public void setParams(List<Params> params) {
		this.params = params;	
		if (params != null) {
			putBodyParameter("Params" , new Gson().toJson(params));
		}	
	}

	public String getRegisterUrl() {
		return this.registerUrl;
	}

	public void setRegisterUrl(String registerUrl) {
		this.registerUrl = registerUrl;
		if(registerUrl != null){
			putBodyParameter("RegisterUrl", registerUrl);
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

	public static class Params {

		@SerializedName("Type")
		private String type;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	@Override
	public Class<RecognizeVideoCastCrewListResponse> getResponseClass() {
		return RecognizeVideoCastCrewListResponse.class;
	}

}
