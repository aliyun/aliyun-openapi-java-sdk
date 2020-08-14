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
public class CreateDBProxyEndpointAddressRequest extends RpcAcsRequest<CreateDBProxyEndpointAddressResponse> {
	   

	private String connectionStringPrefix;

	private String dBProxyConnectStringNetType;

	private String dBInstanceId;

	private String dBProxyNewConnectStringPort;

	private String vSwitchId;

	private String dBProxyEndpointId;

	private String vPCId;
	public CreateDBProxyEndpointAddressRequest() {
		super("Rds", "2014-08-15", "CreateDBProxyEndpointAddress", "rds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getConnectionStringPrefix() {
		return this.connectionStringPrefix;
	}

	public void setConnectionStringPrefix(String connectionStringPrefix) {
		this.connectionStringPrefix = connectionStringPrefix;
		if(connectionStringPrefix != null){
			putQueryParameter("ConnectionStringPrefix", connectionStringPrefix);
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

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
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

	public String getVPCId() {
		return this.vPCId;
	}

	public void setVPCId(String vPCId) {
		this.vPCId = vPCId;
		if(vPCId != null){
			putQueryParameter("VPCId", vPCId);
		}
	}

	@Override
	public Class<CreateDBProxyEndpointAddressResponse> getResponseClass() {
		return CreateDBProxyEndpointAddressResponse.class;
	}

}
