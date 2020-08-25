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

package com.aliyuncs.facebody.model.v20191230;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.facebody.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RecognizeActionRequest extends RpcAcsRequest<RecognizeActionResponse> {
	   

	private List<URLList> uRLLists;

	private Integer type;

	private String videoUrl;
	public RecognizeActionRequest() {
		super("facebody", "2019-12-30", "RecognizeAction", "facebody");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<URLList> getURLLists() {
		return this.uRLLists;
	}

	public void setURLLists(List<URLList> uRLLists) {
		this.uRLLists = uRLLists;	
		if (uRLLists != null) {
			for (int depth1 = 0; depth1 < uRLLists.size(); depth1++) {
				putBodyParameter("URLList." + (depth1 + 1) + ".URL" , uRLLists.get(depth1).getURL());
			}
		}	
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type.toString());
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

	public static class URLList {

		private String uRL;

		public String getURL() {
			return this.uRL;
		}

		public void setURL(String uRL) {
			this.uRL = uRL;
		}
	}

	@Override
	public Class<RecognizeActionResponse> getResponseClass() {
		return RecognizeActionResponse.class;
	}

}
