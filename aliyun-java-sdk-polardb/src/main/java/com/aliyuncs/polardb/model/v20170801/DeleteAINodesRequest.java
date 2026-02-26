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

package com.aliyuncs.polardb.model.v20170801;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteAINodesRequest extends RpcAcsRequest<DeleteAINodesResponse> {
	   

	private List<String> dBNodeIds;

	private String dBClusterId;
	public DeleteAINodesRequest() {
		super("polardb", "2017-08-01", "DeleteAINodes", "polardb");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getDBNodeIds() {
		return this.dBNodeIds;
	}

	public void setDBNodeIds(List<String> dBNodeIds) {
		this.dBNodeIds = dBNodeIds;	
		if (dBNodeIds != null) {
			for (int i = 0; i < dBNodeIds.size(); i++) {
				putQueryParameter("DBNodeId." + (i + 1) , dBNodeIds.get(i));
			}
		}	
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
		if(dBClusterId != null){
			putQueryParameter("DBClusterId", dBClusterId);
		}
	}

	@Override
	public Class<DeleteAINodesResponse> getResponseClass() {
		return DeleteAINodesResponse.class;
	}

}
