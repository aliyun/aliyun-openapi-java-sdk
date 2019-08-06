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

package com.aliyuncs.drds.model.v20171016;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateDrdsDBRequest extends RpcAcsRequest<CreateDrdsDBResponse> {
	
	public CreateDrdsDBRequest() {
		super("Drds", "2017-10-16", "CreateDrdsDB", "drds");
	}

	private String encode;

	private String password;

	private String dbName;

	private String rdsInstances;

	private String drdsInstanceId;

	public String getEncode() {
		return this.encode;
	}

	public void setEncode(String encode) {
		this.encode = encode;
		if(encode != null){
			putQueryParameter("Encode", encode);
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

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
		if(dbName != null){
			putQueryParameter("DbName", dbName);
		}
	}

	public String getRdsInstances() {
		return this.rdsInstances;
	}

	public void setRdsInstances(String rdsInstances) {
		this.rdsInstances = rdsInstances;
		if(rdsInstances != null){
			putQueryParameter("RdsInstances", rdsInstances);
		}
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

	@Override
	public Class<CreateDrdsDBResponse> getResponseClass() {
		return CreateDrdsDBResponse.class;
	}

}
