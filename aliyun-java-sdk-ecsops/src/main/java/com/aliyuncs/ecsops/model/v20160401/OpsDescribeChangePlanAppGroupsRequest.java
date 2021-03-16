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
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeChangePlanAppGroupsRequest extends RpcAcsRequest<OpsDescribeChangePlanAppGroupsResponse> {
	   

	private List<String> resourceTypes;

	private String serviceVersion;

	private String auditParamStr;
	public OpsDescribeChangePlanAppGroupsRequest() {
		super("Ecsops", "2016-04-01", "OpsDescribeChangePlanAppGroups", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getResourceTypes() {
		return this.resourceTypes;
	}

	public void setResourceTypes(List<String> resourceTypes) {
		this.resourceTypes = resourceTypes;	
		if (resourceTypes != null) {
			for (int i = 0; i < resourceTypes.size(); i++) {
				putQueryParameter("ResourceType." + (i + 1) , resourceTypes.get(i));
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
	public Class<OpsDescribeChangePlanAppGroupsResponse> getResponseClass() {
		return OpsDescribeChangePlanAppGroupsResponse.class;
	}

}
