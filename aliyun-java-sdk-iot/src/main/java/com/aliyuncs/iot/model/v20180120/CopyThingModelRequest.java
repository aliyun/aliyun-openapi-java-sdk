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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CopyThingModelRequest extends RpcAcsRequest<CopyThingModelResponse> {
	   

	private String sourceProductKey;

	private String targetProductKey;

	private String resourceGroupId;

	private String iotInstanceId;

	private String sourceModelVersion;
	public CopyThingModelRequest() {
		super("Iot", "2018-01-20", "CopyThingModel", "Iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSourceProductKey() {
		return this.sourceProductKey;
	}

	public void setSourceProductKey(String sourceProductKey) {
		this.sourceProductKey = sourceProductKey;
		if(sourceProductKey != null){
			putQueryParameter("SourceProductKey", sourceProductKey);
		}
	}

	public String getTargetProductKey() {
		return this.targetProductKey;
	}

	public void setTargetProductKey(String targetProductKey) {
		this.targetProductKey = targetProductKey;
		if(targetProductKey != null){
			putQueryParameter("TargetProductKey", targetProductKey);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
		}
	}

	public String getSourceModelVersion() {
		return this.sourceModelVersion;
	}

	public void setSourceModelVersion(String sourceModelVersion) {
		this.sourceModelVersion = sourceModelVersion;
		if(sourceModelVersion != null){
			putQueryParameter("SourceModelVersion", sourceModelVersion);
		}
	}

	@Override
	public Class<CopyThingModelResponse> getResponseClass() {
		return CopyThingModelResponse.class;
	}

}
