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
public class CreateMigrationJobRequest extends RpcAcsRequest<CreateMigrationJobResponse> {
	   

	private String clientToken;

	private String ownerId;

	private String region;

	private String migrationJobClass;
	public CreateMigrationJobRequest() {
		super("Dts", "2018-08-01", "CreateMigrationJob", "dts");
		setMethod(MethodType.POST);
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

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	public String getMigrationJobClass() {
		return this.migrationJobClass;
	}

	public void setMigrationJobClass(String migrationJobClass) {
		this.migrationJobClass = migrationJobClass;
		if(migrationJobClass != null){
			putQueryParameter("MigrationJobClass", migrationJobClass);
		}
	}

	@Override
	public Class<CreateMigrationJobResponse> getResponseClass() {
		return CreateMigrationJobResponse.class;
	}

}
