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
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifySecurityIpsRequest extends RpcAcsRequest<ModifySecurityIpsResponse> {
	
	public ModifySecurityIpsRequest() {
		super("gpdb", "2016-05-03", "ModifySecurityIps", "gpdb");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String securityIPList;

	private String dBInstanceIPArrayName;

	private String dBInstanceIPArrayAttribute;

	private String dBInstanceId;

	public String getSecurityIPList() {
		return this.securityIPList;
	}

	public void setSecurityIPList(String securityIPList) {
		this.securityIPList = securityIPList;
		if(securityIPList != null){
			putQueryParameter("SecurityIPList", securityIPList);
		}
	}

	public String getDBInstanceIPArrayName() {
		return this.dBInstanceIPArrayName;
	}

	public void setDBInstanceIPArrayName(String dBInstanceIPArrayName) {
		this.dBInstanceIPArrayName = dBInstanceIPArrayName;
		if(dBInstanceIPArrayName != null){
			putQueryParameter("DBInstanceIPArrayName", dBInstanceIPArrayName);
		}
	}

	public String getDBInstanceIPArrayAttribute() {
		return this.dBInstanceIPArrayAttribute;
	}

	public void setDBInstanceIPArrayAttribute(String dBInstanceIPArrayAttribute) {
		this.dBInstanceIPArrayAttribute = dBInstanceIPArrayAttribute;
		if(dBInstanceIPArrayAttribute != null){
			putQueryParameter("DBInstanceIPArrayAttribute", dBInstanceIPArrayAttribute);
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

	@Override
	public Class<ModifySecurityIpsResponse> getResponseClass() {
		return ModifySecurityIpsResponse.class;
	}

}
