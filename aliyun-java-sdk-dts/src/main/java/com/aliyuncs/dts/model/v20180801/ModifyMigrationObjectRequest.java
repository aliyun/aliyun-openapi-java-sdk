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

package com.aliyuncs.dts.model.v20180801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyMigrationObjectRequest extends RpcAcsRequest<ModifyMigrationObjectResponse> {
	   

	private String migrationObject;

	private String clientToken;

	private String migrationJobId;

	private String ownerId;
	public ModifyMigrationObjectRequest() {
		super("Dts", "2018-08-01", "ModifyMigrationObject", "dts");
		setMethod(MethodType.POST);
	}

	public String getMigrationObject() {
		return this.migrationObject;
	}

	public void setMigrationObject(String migrationObject) {
		this.migrationObject = migrationObject;
		if(migrationObject != null){
			putQueryParameter("MigrationObject", migrationObject);
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

	public String getMigrationJobId() {
		return this.migrationJobId;
	}

	public void setMigrationJobId(String migrationJobId) {
		this.migrationJobId = migrationJobId;
		if(migrationJobId != null){
			putQueryParameter("MigrationJobId", migrationJobId);
		}
	}

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId);
		}
	}

	@Override
	public Class<ModifyMigrationObjectResponse> getResponseClass() {
		return ModifyMigrationObjectResponse.class;
	}

}
