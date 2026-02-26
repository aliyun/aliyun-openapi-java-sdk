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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDBInstanceEndpointRequest extends RpcAcsRequest<ModifyDBInstanceEndpointResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String dBInstanceId;

	private String dBInstanceEndpointDescription;

	private String nodeItems;

	private String dBInstanceEndpointId;
	public ModifyDBInstanceEndpointRequest() {
		super("Rds", "2014-08-15", "ModifyDBInstanceEndpoint", "rds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public String getDBInstanceEndpointDescription() {
		return this.dBInstanceEndpointDescription;
	}

	public void setDBInstanceEndpointDescription(String dBInstanceEndpointDescription) {
		this.dBInstanceEndpointDescription = dBInstanceEndpointDescription;
		if(dBInstanceEndpointDescription != null){
			putQueryParameter("DBInstanceEndpointDescription", dBInstanceEndpointDescription);
		}
	}

	public String getNodeItems() {
		return this.nodeItems;
	}

	public void setNodeItems(String nodeItems) {
		this.nodeItems = nodeItems;
		if(nodeItems != null){
			putQueryParameter("NodeItems", nodeItems);
		}
	}

	public String getDBInstanceEndpointId() {
		return this.dBInstanceEndpointId;
	}

	public void setDBInstanceEndpointId(String dBInstanceEndpointId) {
		this.dBInstanceEndpointId = dBInstanceEndpointId;
		if(dBInstanceEndpointId != null){
			putQueryParameter("DBInstanceEndpointId", dBInstanceEndpointId);
		}
	}

	@Override
	public Class<ModifyDBInstanceEndpointResponse> getResponseClass() {
		return ModifyDBInstanceEndpointResponse.class;
	}

}
