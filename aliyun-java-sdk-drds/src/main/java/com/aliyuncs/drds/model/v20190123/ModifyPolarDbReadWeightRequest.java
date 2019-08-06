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

/**
 * @author auto create
 * @version 
 */
public class ModifyPolarDbReadWeightRequest extends RpcAcsRequest<ModifyPolarDbReadWeightResponse> {
	
	public ModifyPolarDbReadWeightRequest() {
		super("Drds", "2019-01-23", "ModifyPolarDbReadWeight", "drds");
	}

	private String dbName;

	private String dbInstanceId;

	private String weights;

	private String drdsInstanceId;

	private String dbNodeIds;

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
		if(dbName != null){
			putQueryParameter("DbName", dbName);
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

	public String getWeights() {
		return this.weights;
	}

	public void setWeights(String weights) {
		this.weights = weights;
		if(weights != null){
			putQueryParameter("Weights", weights);
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

	public String getDbNodeIds() {
		return this.dbNodeIds;
	}

	public void setDbNodeIds(String dbNodeIds) {
		this.dbNodeIds = dbNodeIds;
		if(dbNodeIds != null){
			putQueryParameter("DbNodeIds", dbNodeIds);
		}
	}

	@Override
	public Class<ModifyPolarDbReadWeightResponse> getResponseClass() {
		return ModifyPolarDbReadWeightResponse.class;
	}

}
