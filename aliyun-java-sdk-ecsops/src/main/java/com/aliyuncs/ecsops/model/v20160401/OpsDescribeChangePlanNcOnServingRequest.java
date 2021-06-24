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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeChangePlanNcOnServingRequest extends RpcAcsRequest<OpsDescribeChangePlanNcOnServingResponse> {
	   

	private String resourcesType;

	private List<String> resources;

	private String serviceVersion;

	private String auditParamStr;
	public OpsDescribeChangePlanNcOnServingRequest() {
		super("Ecsops", "2016-04-01", "OpsDescribeChangePlanNcOnServing", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getResourcesType() {
		return this.resourcesType;
	}

	public void setResourcesType(String resourcesType) {
		this.resourcesType = resourcesType;
		if(resourcesType != null){
			putQueryParameter("ResourcesType", resourcesType);
		}
	}

	public List<String> getResources() {
		return this.resources;
	}

	public void setResources(List<String> resources) {
		this.resources = resources;	
		if (resources != null) {
			for (int i = 0; i < resources.size(); i++) {
				putQueryParameter("Resource." + (i + 1) , resources.get(i));
			}
		}	
	}

	public String getServiceVersion() {
		return this.serviceVersion;
	}

	public void setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
		if(serviceVersion != null){
			putQueryParameter("ServiceVersion", serviceVersion);
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsDescribeChangePlanNcOnServingResponse> getResponseClass() {
		return OpsDescribeChangePlanNcOnServingResponse.class;
	}

}
