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

package com.aliyuncs.cloudauth.model.v20201112;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudauth.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CompareFacesRequest extends RpcAcsRequest<CompareFacesResponse> {
	   

	private String targetImageUrl;

	private String sourceImageUrl;

	private String targetImageBase64;

	private String bizType;

	private String bizId;

	private String sourceImageBase64;
	public CompareFacesRequest() {
		super("Cloudauth", "2020-11-12", "CompareFaces", "cloudauth");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTargetImageUrl() {
		return this.targetImageUrl;
	}

	public void setTargetImageUrl(String targetImageUrl) {
		this.targetImageUrl = targetImageUrl;
		if(targetImageUrl != null){
			putBodyParameter("TargetImageUrl", targetImageUrl);
		}
	}

	public String getSourceImageUrl() {
		return this.sourceImageUrl;
	}

	public void setSourceImageUrl(String sourceImageUrl) {
		this.sourceImageUrl = sourceImageUrl;
		if(sourceImageUrl != null){
			putBodyParameter("SourceImageUrl", sourceImageUrl);
		}
	}

	public String getTargetImageBase64() {
		return this.targetImageBase64;
	}

	public void setTargetImageBase64(String targetImageBase64) {
		this.targetImageBase64 = targetImageBase64;
		if(targetImageBase64 != null){
			putBodyParameter("TargetImageBase64", targetImageBase64);
		}
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putBodyParameter("BizType", bizType);
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putBodyParameter("BizId", bizId);
		}
	}

	public String getSourceImageBase64() {
		return this.sourceImageBase64;
	}

	public void setSourceImageBase64(String sourceImageBase64) {
		this.sourceImageBase64 = sourceImageBase64;
		if(sourceImageBase64 != null){
			putBodyParameter("SourceImageBase64", sourceImageBase64);
		}
	}

	@Override
	public Class<CompareFacesResponse> getResponseClass() {
		return CompareFacesResponse.class;
	}

}
