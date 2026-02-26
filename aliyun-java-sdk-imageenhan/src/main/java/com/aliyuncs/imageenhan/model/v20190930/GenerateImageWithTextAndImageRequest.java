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
public class GenerateImageWithTextAndImageRequest extends RpcAcsRequest<GenerateImageWithTextAndImageResponse> {
	   

	private String resolution;

	private Integer number;

	private Float similarity;

	private String aspectRatioMode;

	private String text;

	private String refImageUrl;
	public GenerateImageWithTextAndImageRequest() {
		super("imageenhan", "2019-09-30", "GenerateImageWithTextAndImage", "imageenhan");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getResolution() {
		return this.resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
		if(resolution != null){
			putBodyParameter("Resolution", resolution);
		}
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
		if(number != null){
			putBodyParameter("Number", number.toString());
		}
	}

	public Float getSimilarity() {
		return this.similarity;
	}

	public void setSimilarity(Float similarity) {
		this.similarity = similarity;
		if(similarity != null){
			putBodyParameter("Similarity", similarity.toString());
		}
	}

	public String getAspectRatioMode() {
		return this.aspectRatioMode;
	}

	public void setAspectRatioMode(String aspectRatioMode) {
		this.aspectRatioMode = aspectRatioMode;
		if(aspectRatioMode != null){
			putBodyParameter("AspectRatioMode", aspectRatioMode);
		}
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
		if(text != null){
			putBodyParameter("Text", text);
		}
	}

	public String getRefImageUrl() {
		return this.refImageUrl;
	}

	public void setRefImageUrl(String refImageUrl) {
		this.refImageUrl = refImageUrl;
		if(refImageUrl != null){
			putBodyParameter("RefImageUrl", refImageUrl);
		}
	}

	@Override
	public Class<GenerateImageWithTextAndImageResponse> getResponseClass() {
		return GenerateImageWithTextAndImageResponse.class;
	}

}
