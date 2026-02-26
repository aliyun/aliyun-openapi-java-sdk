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

package com.aliyuncs.oceanbasepro.model.v20190901;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.oceanbasepro.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeRestorableTenantsRequest extends RpcAcsRequest<DescribeRestorableTenantsResponse> {
	   

	private String restoreMode;

	private String restoreObjectType;

	private Boolean isOnline;

	private Boolean isRemote;

	private String method;

	private String instanceId;

	private String setId;
	public DescribeRestorableTenantsRequest() {
		super("OceanBasePro", "2019-09-01", "DescribeRestorableTenants", "oceanbase");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRestoreMode() {
		return this.restoreMode;
	}

	public void setRestoreMode(String restoreMode) {
		this.restoreMode = restoreMode;
		if(restoreMode != null){
			putBodyParameter("RestoreMode", restoreMode);
		}
	}

	public String getRestoreObjectType() {
		return this.restoreObjectType;
	}

	public void setRestoreObjectType(String restoreObjectType) {
		this.restoreObjectType = restoreObjectType;
		if(restoreObjectType != null){
			putBodyParameter("RestoreObjectType", restoreObjectType);
		}
	}

	public Boolean getIsOnline() {
		return this.isOnline;
	}

	public void setIsOnline(Boolean isOnline) {
		this.isOnline = isOnline;
		if(isOnline != null){
			putBodyParameter("IsOnline", isOnline.toString());
		}
	}

	public Boolean getIsRemote() {
		return this.isRemote;
	}

	public void setIsRemote(Boolean isRemote) {
		this.isRemote = isRemote;
		if(isRemote != null){
			putBodyParameter("IsRemote", isRemote.toString());
		}
	}

	public String getBizMethod() {
		return this.method;
	}

	public void setBizMethod(String method) {
		this.method = method;
		if(method != null){
			putBodyParameter("Method", method);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getSetId() {
		return this.setId;
	}

	public void setSetId(String setId) {
		this.setId = setId;
		if(setId != null){
			putBodyParameter("SetId", setId);
		}
	}

	@Override
	public Class<DescribeRestorableTenantsResponse> getResponseClass() {
		return DescribeRestorableTenantsResponse.class;
	}

}
