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

package com.aliyuncs.cloudauth.model.v20180703;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class CompareFacesRequest extends RpcAcsRequest<CompareFacesResponse> {
	
	public CompareFacesRequest() {
		super("Cloudauth", "2018-07-03", "CompareFaces", "cloudauth");
		setProtocol(ProtocolType.HTTPS);
	}

	private String sourceImageType;

	private Long resourceOwnerId;

	private String sourceIp;

	private String targetImageType;

	private String sourceImageValue;

	private String targetImageValue;

	public String getSourceImageType() {
		return this.sourceImageType;
	}

	public void setSourceImageType(String sourceImageType) {
		this.sourceImageType = sourceImageType;
		if(sourceImageType != null){
			putQueryParameter("SourceImageType", sourceImageType);
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

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getTargetImageType() {
		return this.targetImageType;
	}

	public void setTargetImageType(String targetImageType) {
		this.targetImageType = targetImageType;
		if(targetImageType != null){
			putQueryParameter("TargetImageType", targetImageType);
		}
	}

	public String getSourceImageValue() {
		return this.sourceImageValue;
	}

	public void setSourceImageValue(String sourceImageValue) {
		this.sourceImageValue = sourceImageValue;
		if(sourceImageValue != null){
			putQueryParameter("SourceImageValue", sourceImageValue);
		}
	}

	public String getTargetImageValue() {
		return this.targetImageValue;
	}

	public void setTargetImageValue(String targetImageValue) {
		this.targetImageValue = targetImageValue;
		if(targetImageValue != null){
			putQueryParameter("TargetImageValue", targetImageValue);
		}
	}

	@Override
	public Class<CompareFacesResponse> getResponseClass() {
		return CompareFacesResponse.class;
	}

}
