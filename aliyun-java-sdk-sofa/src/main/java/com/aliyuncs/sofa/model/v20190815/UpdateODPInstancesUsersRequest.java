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
public class UpdateODPInstancesUsersRequest extends RpcAcsRequest<UpdateODPInstancesUsersResponse> {
	   

	private Boolean updatePrivileges;

	private String instanceId;

	private String userJsonStr;
	public UpdateODPInstancesUsersRequest() {
		super("SOFA", "2019-08-15", "UpdateODPInstancesUsers", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getUpdatePrivileges() {
		return this.updatePrivileges;
	}

	public void setUpdatePrivileges(Boolean updatePrivileges) {
		this.updatePrivileges = updatePrivileges;
		if(updatePrivileges != null){
			putBodyParameter("UpdatePrivileges", updatePrivileges.toString());
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

	public String getUserJsonStr() {
		return this.userJsonStr;
	}

	public void setUserJsonStr(String userJsonStr) {
		this.userJsonStr = userJsonStr;
		if(userJsonStr != null){
			putBodyParameter("UserJsonStr", userJsonStr);
		}
	}

	@Override
	public Class<UpdateODPInstancesUsersResponse> getResponseClass() {
		return UpdateODPInstancesUsersResponse.class;
	}

}
