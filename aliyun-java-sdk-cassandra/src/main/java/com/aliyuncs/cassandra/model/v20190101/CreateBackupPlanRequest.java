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

package com.aliyuncs.cassandra.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cassandra.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateBackupPlanRequest extends RpcAcsRequest<CreateBackupPlanResponse> {
	   

	private Integer retentionPeriod;

	private String dataCenterId;

	private Boolean active;

	private String clusterId;

	private String backupTime;

	private String backupPeriod;
	public CreateBackupPlanRequest() {
		super("Cassandra", "2019-01-01", "CreateBackupPlan", "Cassandra");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getRetentionPeriod() {
		return this.retentionPeriod;
	}

	public void setRetentionPeriod(Integer retentionPeriod) {
		this.retentionPeriod = retentionPeriod;
		if(retentionPeriod != null){
			putQueryParameter("RetentionPeriod", retentionPeriod.toString());
		}
	}

	public String getDataCenterId() {
		return this.dataCenterId;
	}

	public void setDataCenterId(String dataCenterId) {
		this.dataCenterId = dataCenterId;
		if(dataCenterId != null){
			putQueryParameter("DataCenterId", dataCenterId);
		}
	}

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
		if(active != null){
			putQueryParameter("Active", active.toString());
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

	public String getBackupTime() {
		return this.backupTime;
	}

	public void setBackupTime(String backupTime) {
		this.backupTime = backupTime;
		if(backupTime != null){
			putQueryParameter("BackupTime", backupTime);
		}
	}

	public String getBackupPeriod() {
		return this.backupPeriod;
	}

	public void setBackupPeriod(String backupPeriod) {
		this.backupPeriod = backupPeriod;
		if(backupPeriod != null){
			putQueryParameter("BackupPeriod", backupPeriod);
		}
	}

	@Override
	public Class<CreateBackupPlanResponse> getResponseClass() {
		return CreateBackupPlanResponse.class;
	}

}
