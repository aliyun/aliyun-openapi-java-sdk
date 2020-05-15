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

package com.aliyuncs.hbase.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbase.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyBackupPlanConfigRequest extends RpcAcsRequest<ModifyBackupPlanConfigResponse> {
	   

	private String fullBackupCycle;

	private String tables;

	private String clusterId;

	private String minHFileBackupCount;

	private String nextFullBackupDate;
	public ModifyBackupPlanConfigRequest() {
		super("HBase", "2019-01-01", "ModifyBackupPlanConfig", "hbase");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFullBackupCycle() {
		return this.fullBackupCycle;
	}

	public void setFullBackupCycle(String fullBackupCycle) {
		this.fullBackupCycle = fullBackupCycle;
		if(fullBackupCycle != null){
			putQueryParameter("FullBackupCycle", fullBackupCycle);
		}
	}

	public String getTables() {
		return this.tables;
	}

	public void setTables(String tables) {
		this.tables = tables;
		if(tables != null){
			putQueryParameter("Tables", tables);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getMinHFileBackupCount() {
		return this.minHFileBackupCount;
	}

	public void setMinHFileBackupCount(String minHFileBackupCount) {
		this.minHFileBackupCount = minHFileBackupCount;
		if(minHFileBackupCount != null){
			putQueryParameter("MinHFileBackupCount", minHFileBackupCount);
		}
	}

	public String getNextFullBackupDate() {
		return this.nextFullBackupDate;
	}

	public void setNextFullBackupDate(String nextFullBackupDate) {
		this.nextFullBackupDate = nextFullBackupDate;
		if(nextFullBackupDate != null){
			putQueryParameter("NextFullBackupDate", nextFullBackupDate);
		}
	}

	@Override
	public Class<ModifyBackupPlanConfigResponse> getResponseClass() {
		return ModifyBackupPlanConfigResponse.class;
	}

}
