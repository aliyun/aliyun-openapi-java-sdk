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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.facebody.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class VerifyFaceMaskRequest extends RpcAcsRequest<VerifyFaceMaskResponse> {
	   

	private String refData;

	private String imageData;

	private String imageURL;

	private String refUrl;
	public VerifyFaceMaskRequest() {
		super("facebody", "2019-12-30", "VerifyFaceMask", "facebody");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRefData() {
		return this.refData;
	}

	public void setRefData(String refData) {
		this.refData = refData;
		if(refData != null){
			putBodyParameter("RefData", refData);
		}
	}

	public String getImageData() {
		return this.imageData;
	}

	public void setImageData(String imageData) {
		this.imageData = imageData;
		if(imageData != null){
			putBodyParameter("ImageData", imageData);
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

	public String getRefUrl() {
		return this.refUrl;
	}

	public void setRefUrl(String refUrl) {
		this.refUrl = refUrl;
		if(refUrl != null){
			putBodyParameter("RefUrl", refUrl);
		}
	}

	@Override
	public Class<VerifyFaceMaskResponse> getResponseClass() {
		return VerifyFaceMaskResponse.class;
	}

}
