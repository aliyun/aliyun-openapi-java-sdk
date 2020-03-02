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

package com.aliyuncs.alikafka.model.v20190916;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alikafka.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateAllowedIpRequest extends RpcAcsRequest<UpdateAllowedIpResponse> {
	   

	private String portRange;

	private String allowedListIp;

	private String updateType;

	private String allowedListType;

	private String instanceId;
	public UpdateAllowedIpRequest() {
		super("alikafka", "2019-09-16", "UpdateAllowedIp", "alikafka");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPortRange() {
		return this.portRange;
	}

	public void setPortRange(String portRange) {
		this.portRange = portRange;
		if(portRange != null){
			putQueryParameter("PortRange", portRange);
		}
	}

	public String getAllowedListIp() {
		return this.allowedListIp;
	}

	public void setAllowedListIp(String allowedListIp) {
		this.allowedListIp = allowedListIp;
		if(allowedListIp != null){
			putQueryParameter("AllowedListIp", allowedListIp);
		}
	}

	public String getUpdateType() {
		return this.updateType;
	}

	public void setUpdateType(String updateType) {
		this.updateType = updateType;
		if(updateType != null){
			putQueryParameter("UpdateType", updateType);
		}
	}

	public String getAllowedListType() {
		return this.allowedListType;
	}

	public void setAllowedListType(String allowedListType) {
		this.allowedListType = allowedListType;
		if(allowedListType != null){
			putQueryParameter("AllowedListType", allowedListType);
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

	@Override
	public Class<UpdateAllowedIpResponse> getResponseClass() {
		return UpdateAllowedIpResponse.class;
	}

}
