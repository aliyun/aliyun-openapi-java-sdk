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
public class SubmitRollbackTaskRequest extends RpcAcsRequest<SubmitRollbackTaskResponse> {
	
	public SubmitRollbackTaskRequest() {
		super("Drds", "2019-01-23", "SubmitRollbackTask");
	}

	private String jobId;

	private String dbName;

	private String parentJobId;

	private String drdsInstanceId;

	private String expandType;

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
		if(jobId != null){
			putQueryParameter("JobId", jobId);
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

	public String getParentJobId() {
		return this.parentJobId;
	}

	public void setParentJobId(String parentJobId) {
		this.parentJobId = parentJobId;
		if(parentJobId != null){
			putQueryParameter("ParentJobId", parentJobId);
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

	public String getExpandType() {
		return this.expandType;
	}

	public void setExpandType(String expandType) {
		this.expandType = expandType;
		if(expandType != null){
			putQueryParameter("ExpandType", expandType);
		}
	}

	@Override
	public Class<SubmitRollbackTaskResponse> getResponseClass() {
		return SubmitRollbackTaskResponse.class;
	}

}
