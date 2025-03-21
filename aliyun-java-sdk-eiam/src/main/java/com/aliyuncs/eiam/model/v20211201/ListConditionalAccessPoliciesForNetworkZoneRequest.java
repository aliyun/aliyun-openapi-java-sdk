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

package com.aliyuncs.eiam.model.v20211201;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListConditionalAccessPoliciesForNetworkZoneRequest extends RpcAcsRequest<ListConditionalAccessPoliciesForNetworkZoneResponse> {
	   

	private String networkZoneId;

	private String instanceId;
	public ListConditionalAccessPoliciesForNetworkZoneRequest() {
		super("Eiam", "2021-12-01", "ListConditionalAccessPoliciesForNetworkZone", "eiam");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getNetworkZoneId() {
		return this.networkZoneId;
	}

	public void setNetworkZoneId(String networkZoneId) {
		this.networkZoneId = networkZoneId;
		if(networkZoneId != null){
			putQueryParameter("NetworkZoneId", networkZoneId);
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
	public Class<ListConditionalAccessPoliciesForNetworkZoneResponse> getResponseClass() {
		return ListConditionalAccessPoliciesForNetworkZoneResponse.class;
	}

}
