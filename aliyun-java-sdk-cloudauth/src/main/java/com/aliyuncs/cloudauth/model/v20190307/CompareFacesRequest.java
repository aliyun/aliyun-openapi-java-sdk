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

package com.aliyuncs.cloudauth.model.v20190307;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudauth.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CompareFacesRequest extends RpcAcsRequest<CompareFacesResponse> {
	   

	private String sourceImageType;

	private Long resourceOwnerId;

	private String targetImageType;

	private String targetImageValue;

	private String sourceIp;

	private String sourceImageValue;
	public CompareFacesRequest() {
		super("Cloudauth", "2019-03-07", "CompareFaces");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSourceImageType() {
		return this.sourceImageType;
	}

	public void setSourceImageType(String sourceImageType) {
		this.sourceImageType = sourceImageType;
		if(sourceImageType != null){
			putBodyParameter("SourceImageType", sourceImageType);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getTargetImageType() {
		return this.targetImageType;
	}

	public void setTargetImageType(String targetImageType) {
		this.targetImageType = targetImageType;
		if(targetImageType != null){
			putBodyParameter("TargetImageType", targetImageType);
		}
	}

	public String getTargetImageValue() {
		return this.targetImageValue;
	}

	public void setTargetImageValue(String targetImageValue) {
		this.targetImageValue = targetImageValue;
		if(targetImageValue != null){
			putBodyParameter("TargetImageValue", targetImageValue);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getSourceImageValue() {
		return this.sourceImageValue;
	}

	public void setSourceImageValue(String sourceImageValue) {
		this.sourceImageValue = sourceImageValue;
		if(sourceImageValue != null){
			putBodyParameter("SourceImageValue", sourceImageValue);
		}
	}

	@Override
	public Class<CompareFacesResponse> getResponseClass() {
		return CompareFacesResponse.class;
	}

}
