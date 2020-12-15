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
public class ModifyDbProxyInstanceSslRequest extends RpcAcsRequest<ModifyDbProxyInstanceSslResponse> {
	   

	private String dbProxySslEnabled;

	private String dbProxyConnectString;

	private String dbInstanceId;

	private String dbProxyEndpointId;
	public ModifyDbProxyInstanceSslRequest() {
		super("Rds", "2014-08-15", "ModifyDbProxyInstanceSsl", "rds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDbProxySslEnabled() {
		return this.dbProxySslEnabled;
	}

	public void setDbProxySslEnabled(String dbProxySslEnabled) {
		this.dbProxySslEnabled = dbProxySslEnabled;
		if(dbProxySslEnabled != null){
			putQueryParameter("DbProxySslEnabled", dbProxySslEnabled);
		}
	}

	public String getDbProxyConnectString() {
		return this.dbProxyConnectString;
	}

	public void setDbProxyConnectString(String dbProxyConnectString) {
		this.dbProxyConnectString = dbProxyConnectString;
		if(dbProxyConnectString != null){
			putQueryParameter("DbProxyConnectString", dbProxyConnectString);
		}
	}

	public String getDbInstanceId() {
		return this.dbInstanceId;
	}

	public void setDbInstanceId(String dbInstanceId) {
		this.dbInstanceId = dbInstanceId;
		if(dbInstanceId != null){
			putQueryParameter("DbInstanceId", dbInstanceId);
		}
	}

	public String getDbProxyEndpointId() {
		return this.dbProxyEndpointId;
	}

	public void setDbProxyEndpointId(String dbProxyEndpointId) {
		this.dbProxyEndpointId = dbProxyEndpointId;
		if(dbProxyEndpointId != null){
			putQueryParameter("DbProxyEndpointId", dbProxyEndpointId);
		}
	}

	@Override
	public Class<ModifyDbProxyInstanceSslResponse> getResponseClass() {
		return ModifyDbProxyInstanceSslResponse.class;
	}

}
