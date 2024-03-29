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

package com.aliyuncs.waf_openapi.model.v20190910;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.waf_openapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeProtectionModuleCodeConfigRequest extends RpcAcsRequest<DescribeProtectionModuleCodeConfigResponse> {
	   

	private String resourceGroupId;

	private Integer codeValue;

	private String instanceId;

	private Integer codeType;
	public DescribeProtectionModuleCodeConfigRequest() {
		super("waf-openapi", "2019-09-10", "DescribeProtectionModuleCodeConfig", "waf");
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

	public Integer getCodeValue() {
		return this.codeValue;
	}

	public void setCodeValue(Integer codeValue) {
		this.codeValue = codeValue;
		if(codeValue != null){
			putQueryParameter("CodeValue", codeValue.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public Integer getCodeType() {
		return this.codeType;
	}

	public void setCodeType(Integer codeType) {
		this.codeType = codeType;
		if(codeType != null){
			putQueryParameter("CodeType", codeType.toString());
		}
	}

	@Override
	public Class<DescribeProtectionModuleCodeConfigResponse> getResponseClass() {
		return DescribeProtectionModuleCodeConfigResponse.class;
	}

}
