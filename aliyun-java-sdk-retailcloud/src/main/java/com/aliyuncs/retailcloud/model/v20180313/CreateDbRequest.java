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

package com.aliyuncs.retailcloud.model.v20180313;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.retailcloud.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDbRequest extends RpcAcsRequest<CreateDbResponse> {
	   

	private String dbName;

	private String dbInstanceId;

	private String dbDescription;

	private String characterSetName;
	public CreateDbRequest() {
		super("retailcloud", "2018-03-13", "CreateDb", "retailcloud");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
		if(dbName != null){
			putBodyParameter("DbName", dbName);
		}
	}

	public String getDbInstanceId() {
		return this.dbInstanceId;
	}

	public void setDbInstanceId(String dbInstanceId) {
		this.dbInstanceId = dbInstanceId;
		if(dbInstanceId != null){
			putBodyParameter("DbInstanceId", dbInstanceId);
		}
	}

	public String getDbDescription() {
		return this.dbDescription;
	}

	public void setDbDescription(String dbDescription) {
		this.dbDescription = dbDescription;
		if(dbDescription != null){
			putBodyParameter("DbDescription", dbDescription);
		}
	}

	public String getCharacterSetName() {
		return this.characterSetName;
	}

	public void setCharacterSetName(String characterSetName) {
		this.characterSetName = characterSetName;
		if(characterSetName != null){
			putBodyParameter("CharacterSetName", characterSetName);
		}
	}

	@Override
	public Class<CreateDbResponse> getResponseClass() {
		return CreateDbResponse.class;
	}

}
