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

package com.aliyuncs.gpdb.model.v20160503;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDBInstanceSSLRequest extends RpcAcsRequest<ModifyDBInstanceSSLResponse> {
	   

	private String connectionString;

	private String dBInstanceId;

	private Integer sSLEnabled;
	public ModifyDBInstanceSSLRequest() {
		super("gpdb", "2016-05-03", "ModifyDBInstanceSSL", "gpdb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public Integer getSSLEnabled() {
		return this.sSLEnabled;
	}

	public void setSSLEnabled(Integer sSLEnabled) {
		this.sSLEnabled = sSLEnabled;
		if(sSLEnabled != null){
			putQueryParameter("SSLEnabled", sSLEnabled.toString());
		}
	}

	@Override
	public Class<ModifyDBInstanceSSLResponse> getResponseClass() {
		return ModifyDBInstanceSSLResponse.class;
	}

}
