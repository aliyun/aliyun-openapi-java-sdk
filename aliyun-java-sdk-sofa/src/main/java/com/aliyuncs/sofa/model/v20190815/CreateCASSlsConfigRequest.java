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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateCASSlsConfigRequest extends RpcAcsRequest<CreateCASSlsConfigResponse> {
	   

	private String configJsonStr;

	private String tenantId;

	private String slsRegionId;

	private String projectName;
	public CreateCASSlsConfigRequest() {
		super("SOFA", "2019-08-15", "CreateCASSlsConfig", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getConfigJsonStr() {
		return this.configJsonStr;
	}

	public void setConfigJsonStr(String configJsonStr) {
		this.configJsonStr = configJsonStr;
		if(configJsonStr != null){
			putBodyParameter("ConfigJsonStr", configJsonStr);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public String getSlsRegionId() {
		return this.slsRegionId;
	}

	public void setSlsRegionId(String slsRegionId) {
		this.slsRegionId = slsRegionId;
		if(slsRegionId != null){
			putBodyParameter("SlsRegionId", slsRegionId);
		}
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putBodyParameter("ProjectName", projectName);
		}
	}

	@Override
	public Class<CreateCASSlsConfigResponse> getResponseClass() {
		return CreateCASSlsConfigResponse.class;
	}

}
