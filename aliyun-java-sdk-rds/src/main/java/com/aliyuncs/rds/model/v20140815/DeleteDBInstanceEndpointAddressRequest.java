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
public class DeleteDBInstanceEndpointAddressRequest extends RpcAcsRequest<DeleteDBInstanceEndpointAddressResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String connectionString;

	private String dBInstanceId;

	private String dBInstanceEndpointId;
	public DeleteDBInstanceEndpointAddressRequest() {
		super("Rds", "2014-08-15", "DeleteDBInstanceEndpointAddress", "rds");
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

	public String getConnectionString() {
		return this.connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
		if(connectionString != null){
			putBodyParameter("ConnectionString", connectionString);
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

	public String getDBInstanceEndpointId() {
		return this.dBInstanceEndpointId;
	}

	public void setDBInstanceEndpointId(String dBInstanceEndpointId) {
		this.dBInstanceEndpointId = dBInstanceEndpointId;
		if(dBInstanceEndpointId != null){
			putBodyParameter("DBInstanceEndpointId", dBInstanceEndpointId);
		}
	}

	@Override
	public Class<DeleteDBInstanceEndpointAddressResponse> getResponseClass() {
		return DeleteDBInstanceEndpointAddressResponse.class;
	}

}
