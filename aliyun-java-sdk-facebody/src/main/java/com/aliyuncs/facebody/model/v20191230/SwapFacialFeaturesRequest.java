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
public class SwapFacialFeaturesRequest extends RpcAcsRequest<SwapFacialFeaturesResponse> {
	   

	private String targetImageURL;

	private String sourceImageData;

	private String sourceImageURL;

	private String targetImageData;

	private String editPart;
	public SwapFacialFeaturesRequest() {
		super("facebody", "2019-12-30", "SwapFacialFeatures", "facebody");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTargetImageURL() {
		return this.targetImageURL;
	}

	public void setTargetImageURL(String targetImageURL) {
		this.targetImageURL = targetImageURL;
		if(targetImageURL != null){
			putBodyParameter("TargetImageURL", targetImageURL);
		}
	}

	public String getSourceImageData() {
		return this.sourceImageData;
	}

	public void setSourceImageData(String sourceImageData) {
		this.sourceImageData = sourceImageData;
		if(sourceImageData != null){
			putBodyParameter("SourceImageData", sourceImageData);
		}
	}

	public String getSourceImageURL() {
		return this.sourceImageURL;
	}

	public void setSourceImageURL(String sourceImageURL) {
		this.sourceImageURL = sourceImageURL;
		if(sourceImageURL != null){
			putBodyParameter("SourceImageURL", sourceImageURL);
		}
	}

	public String getTargetImageData() {
		return this.targetImageData;
	}

	public void setTargetImageData(String targetImageData) {
		this.targetImageData = targetImageData;
		if(targetImageData != null){
			putBodyParameter("TargetImageData", targetImageData);
		}
	}

	public String getEditPart() {
		return this.editPart;
	}

	public void setEditPart(String editPart) {
		this.editPart = editPart;
		if(editPart != null){
			putBodyParameter("EditPart", editPart);
		}
	}

	@Override
	public Class<SwapFacialFeaturesResponse> getResponseClass() {
		return SwapFacialFeaturesResponse.class;
	}

}
