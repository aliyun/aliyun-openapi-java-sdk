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

package com.aliyuncs.imageenhan.model.v20190930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.imageenhan.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GenerateSuperResolutionImageRequest extends RpcAcsRequest<GenerateSuperResolutionImageResponse> {
	   

	private Integer scale;

	private String userData;

	private String outputFormat;

	private String imageUrl;

	private Integer outputQuality;
	public GenerateSuperResolutionImageRequest() {
		super("imageenhan", "2019-09-30", "GenerateSuperResolutionImage", "imageenhan");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getScale() {
		return this.scale;
	}

	public void setScale(Integer scale) {
		this.scale = scale;
		if(scale != null){
			putBodyParameter("Scale", scale.toString());
		}
	}

	public String getUserData() {
		return this.userData;
	}

	public void setUserData(String userData) {
		this.userData = userData;
		if(userData != null){
			putBodyParameter("UserData", userData);
		}
	}

	public String getOutputFormat() {
		return this.outputFormat;
	}

	public void setOutputFormat(String outputFormat) {
		this.outputFormat = outputFormat;
		if(outputFormat != null){
			putBodyParameter("OutputFormat", outputFormat);
		}
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
		if(imageUrl != null){
			putBodyParameter("ImageUrl", imageUrl);
		}
	}

	public Integer getOutputQuality() {
		return this.outputQuality;
	}

	public void setOutputQuality(Integer outputQuality) {
		this.outputQuality = outputQuality;
		if(outputQuality != null){
			putBodyParameter("OutputQuality", outputQuality.toString());
		}
	}

	@Override
	public Class<GenerateSuperResolutionImageResponse> getResponseClass() {
		return GenerateSuperResolutionImageResponse.class;
	}

}
