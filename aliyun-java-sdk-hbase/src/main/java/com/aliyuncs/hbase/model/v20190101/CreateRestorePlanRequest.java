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
public class CreateRestorePlanRequest extends RpcAcsRequest<CreateRestorePlanResponse> {
	   

	private String restoreToDate;

	private String tables;

	private Boolean restoreByCopy;

	private Boolean restoreAllTable;

	private String clusterId;

	private String targetClusterId;
	public CreateRestorePlanRequest() {
		super("HBase", "2019-01-01", "CreateRestorePlan", "hbase");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRestoreToDate() {
		return this.restoreToDate;
	}

	public void setRestoreToDate(String restoreToDate) {
		this.restoreToDate = restoreToDate;
		if(restoreToDate != null){
			putQueryParameter("RestoreToDate", restoreToDate);
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

	public Boolean getRestoreByCopy() {
		return this.restoreByCopy;
	}

	public void setRestoreByCopy(Boolean restoreByCopy) {
		this.restoreByCopy = restoreByCopy;
		if(restoreByCopy != null){
			putQueryParameter("RestoreByCopy", restoreByCopy.toString());
		}
	}

	public Boolean getRestoreAllTable() {
		return this.restoreAllTable;
	}

	public void setRestoreAllTable(Boolean restoreAllTable) {
		this.restoreAllTable = restoreAllTable;
		if(restoreAllTable != null){
			putQueryParameter("RestoreAllTable", restoreAllTable.toString());
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

	public String getTargetClusterId() {
		return this.targetClusterId;
	}

	public void setTargetClusterId(String targetClusterId) {
		this.targetClusterId = targetClusterId;
		if(targetClusterId != null){
			putQueryParameter("TargetClusterId", targetClusterId);
		}
	}

	@Override
	public Class<CreateRestorePlanResponse> getResponseClass() {
		return CreateRestorePlanResponse.class;
	}

}
