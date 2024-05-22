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

package com.aliyuncs.polardbx.model.v20200202;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardbx.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDBInstanceConnectionStringRequest extends RpcAcsRequest<ModifyDBInstanceConnectionStringResponse> {
	   

	private String dBInstanceName;

	private String connectionString;

	private String newPort;

	private String newPrefix;
	public ModifyDBInstanceConnectionStringRequest() {
		super("polardbx", "2020-02-02", "ModifyDBInstanceConnectionString", "polardbx");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDBInstanceName() {
		return this.dBInstanceName;
	}

	public void setDBInstanceName(String dBInstanceName) {
		this.dBInstanceName = dBInstanceName;
		if(dBInstanceName != null){
			putQueryParameter("DBInstanceName", dBInstanceName);
		}
	}

	public String getConnectionString() {
		return this.connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
		if(connectionString != null){
			putQueryParameter("ConnectionString", connectionString);
		}
	}

	public String getNewPort() {
		return this.newPort;
	}

	public void setNewPort(String newPort) {
		this.newPort = newPort;
		if(newPort != null){
			putQueryParameter("NewPort", newPort);
		}
	}

	public String getNewPrefix() {
		return this.newPrefix;
	}

	public void setNewPrefix(String newPrefix) {
		this.newPrefix = newPrefix;
		if(newPrefix != null){
			putQueryParameter("NewPrefix", newPrefix);
		}
	}

	@Override
	public Class<ModifyDBInstanceConnectionStringResponse> getResponseClass() {
		return ModifyDBInstanceConnectionStringResponse.class;
	}

}
