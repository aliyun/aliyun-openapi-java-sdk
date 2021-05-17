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

package com.aliyuncs.onsmqtt.model.v20200420;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.onsmqtt.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BatchQuerySessionByClientIdsRequest extends RpcAcsRequest<BatchQuerySessionByClientIdsResponse> {
	   

	private List<String> clientIdLists;

	private String instanceId;
	public BatchQuerySessionByClientIdsRequest() {
		super("OnsMqtt", "2020-04-20", "BatchQuerySessionByClientIds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getClientIdLists() {
		return this.clientIdLists;
	}

	public void setClientIdLists(List<String> clientIdLists) {
		this.clientIdLists = clientIdLists;	
		if (clientIdLists != null) {
			for (int i = 0; i < clientIdLists.size(); i++) {
				putQueryParameter("ClientIdList." + (i + 1) , clientIdLists.get(i));
			}
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
	public Class<BatchQuerySessionByClientIdsResponse> getResponseClass() {
		return BatchQuerySessionByClientIdsResponse.class;
	}

}
