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
public class ImportThingModelTslRequest extends RpcAcsRequest<ImportThingModelTslResponse> {
	   

	private String resourceGroupId;

	private String iotInstanceId;

	private String functionBlockName;

	private String productKey;

	private String tslUrl;

	private String tslStr;

	private String functionBlockId;
	public ImportThingModelTslRequest() {
		super("Iot", "2018-01-20", "ImportThingModelTsl", "iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getFunctionBlockName() {
		return this.functionBlockName;
	}

	public void setFunctionBlockName(String functionBlockName) {
		this.functionBlockName = functionBlockName;
		if(functionBlockName != null){
			putQueryParameter("FunctionBlockName", functionBlockName);
		}
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putQueryParameter("ProductKey", productKey);
		}
	}

	public String getTslUrl() {
		return this.tslUrl;
	}

	public void setTslUrl(String tslUrl) {
		this.tslUrl = tslUrl;
		if(tslUrl != null){
			putQueryParameter("TslUrl", tslUrl);
		}
	}

	public String getTslStr() {
		return this.tslStr;
	}

	public void setTslStr(String tslStr) {
		this.tslStr = tslStr;
		if(tslStr != null){
			putQueryParameter("TslStr", tslStr);
		}
	}

	public String getFunctionBlockId() {
		return this.functionBlockId;
	}

	public void setFunctionBlockId(String functionBlockId) {
		this.functionBlockId = functionBlockId;
		if(functionBlockId != null){
			putQueryParameter("FunctionBlockId", functionBlockId);
		}
	}

	@Override
	public Class<ImportThingModelTslResponse> getResponseClass() {
		return ImportThingModelTslResponse.class;
	}

}
