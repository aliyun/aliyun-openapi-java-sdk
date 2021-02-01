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
public class ExtractPedestrianFeatureAttributeRequest extends RpcAcsRequest<ExtractPedestrianFeatureAttributeResponse> {
	   

	private List<UrlList> urlLists;

	private String mode;

	private String imageURL;
	public ExtractPedestrianFeatureAttributeRequest() {
		super("facebody", "2019-12-30", "ExtractPedestrianFeatureAttribute", "facebody");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<UrlList> getUrlLists() {
		return this.urlLists;
	}

	public void setUrlLists(List<UrlList> urlLists) {
		this.urlLists = urlLists;	
		if (urlLists != null) {
			for (int depth1 = 0; depth1 < urlLists.size(); depth1++) {
				putBodyParameter("UrlList." + (depth1 + 1) + ".Url" , urlLists.get(depth1).getUrl());
			}
		}	
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

	public String getImageURL() {
		return this.imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
		if(imageURL != null){
			putBodyParameter("ImageURL", imageURL);
		}
	}

	public static class UrlList {

		private String url;

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}
	}

	@Override
	public Class<ExtractPedestrianFeatureAttributeResponse> getResponseClass() {
		return ExtractPedestrianFeatureAttributeResponse.class;
	}

}
