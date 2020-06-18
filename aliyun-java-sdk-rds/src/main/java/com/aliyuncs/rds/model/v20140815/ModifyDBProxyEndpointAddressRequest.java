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
public class ModifyDBProxyEndpointAddressRequest extends RpcAcsRequest<ModifyDBProxyEndpointAddressResponse> {
	   

	private Long resourceOwnerId;

	private String dBProxyConnectStringNetType;

	private String dBInstanceId;

	private String dBProxyNewConnectStringPort;

	private String resourceOwnerAccount;

	private Long ownerId;

	private String dBProxyEndpointId;

	private String dBProxyNewConnectString;
	public ModifyDBProxyEndpointAddressRequest() {
		super("Rds", "2014-08-15", "ModifyDBProxyEndpointAddress", "rds");
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

	public String getDBProxyConnectStringNetType() {
		return this.dBProxyConnectStringNetType;
	}

	public void setDBProxyConnectStringNetType(String dBProxyConnectStringNetType) {
		this.dBProxyConnectStringNetType = dBProxyConnectStringNetType;
		if(dBProxyConnectStringNetType != null){
			putQueryParameter("DBProxyConnectStringNetType", dBProxyConnectStringNetType);
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

	public String getDBProxyNewConnectStringPort() {
		return this.dBProxyNewConnectStringPort;
	}

	public void setDBProxyNewConnectStringPort(String dBProxyNewConnectStringPort) {
		this.dBProxyNewConnectStringPort = dBProxyNewConnectStringPort;
		if(dBProxyNewConnectStringPort != null){
			putQueryParameter("DBProxyNewConnectStringPort", dBProxyNewConnectStringPort);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getDBProxyEndpointId() {
		return this.dBProxyEndpointId;
	}

	public void setDBProxyEndpointId(String dBProxyEndpointId) {
		this.dBProxyEndpointId = dBProxyEndpointId;
		if(dBProxyEndpointId != null){
			putQueryParameter("DBProxyEndpointId", dBProxyEndpointId);
		}
	}

	public String getDBProxyNewConnectString() {
		return this.dBProxyNewConnectString;
	}

	public void setDBProxyNewConnectString(String dBProxyNewConnectString) {
		this.dBProxyNewConnectString = dBProxyNewConnectString;
		if(dBProxyNewConnectString != null){
			putQueryParameter("DBProxyNewConnectString", dBProxyNewConnectString);
		}
	}

	@Override
	public Class<ModifyDBProxyEndpointAddressResponse> getResponseClass() {
		return ModifyDBProxyEndpointAddressResponse.class;
	}

}
