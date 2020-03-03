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

package com.aliyuncs.drds.model.v20190123;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.drds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateInstanceAccountRequest extends RpcAcsRequest<CreateInstanceAccountResponse> {
	   

	private String drdsInstanceId;

	private String password;

	private String accountName;

	private List<DbPrivilege> dbPrivileges;
	public CreateInstanceAccountRequest() {
		super("Drds", "2019-01-23", "CreateInstanceAccount", "Drds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDrdsInstanceId() {
		return this.drdsInstanceId;
	}

	public void setDrdsInstanceId(String drdsInstanceId) {
		this.drdsInstanceId = drdsInstanceId;
		if(drdsInstanceId != null){
			putQueryParameter("DrdsInstanceId", drdsInstanceId);
		}
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putQueryParameter("Password", password);
		}
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
		if(accountName != null){
			putQueryParameter("AccountName", accountName);
		}
	}

	public List<DbPrivilege> getDbPrivileges() {
		return this.dbPrivileges;
	}

	public void setDbPrivileges(List<DbPrivilege> dbPrivileges) {
		this.dbPrivileges = dbPrivileges;	
		if (dbPrivileges != null) {
			for (int depth1 = 0; depth1 < dbPrivileges.size(); depth1++) {
				putQueryParameter("DbPrivilege." + (depth1 + 1) + ".DbName" , dbPrivileges.get(depth1).getDbName());
				putQueryParameter("DbPrivilege." + (depth1 + 1) + ".Privilege" , dbPrivileges.get(depth1).getPrivilege());
			}
		}	
	}

	public static class DbPrivilege {

		private String dbName;

		private String privilege;

		public String getDbName() {
			return this.dbName;
		}

		public void setDbName(String dbName) {
			this.dbName = dbName;
		}

		public String getPrivilege() {
			return this.privilege;
		}

		public void setPrivilege(String privilege) {
			this.privilege = privilege;
		}
	}

	@Override
	public Class<CreateInstanceAccountResponse> getResponseClass() {
		return CreateInstanceAccountResponse.class;
	}

}
