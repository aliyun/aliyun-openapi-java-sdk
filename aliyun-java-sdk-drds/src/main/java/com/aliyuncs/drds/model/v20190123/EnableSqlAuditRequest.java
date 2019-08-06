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
public class EnableSqlAuditRequest extends RpcAcsRequest<EnableSqlAuditResponse> {
	
	public EnableSqlAuditRequest() {
		super("Drds", "2019-01-23", "EnableSqlAudit", "drds");
	}

	private String recallStartTimestamp;

	private String dbName;

	private Boolean isRecall;

	private String drdsInstanceId;

	private String recallEndTimestamp;

	public String getRecallStartTimestamp() {
		return this.recallStartTimestamp;
	}

	public void setRecallStartTimestamp(String recallStartTimestamp) {
		this.recallStartTimestamp = recallStartTimestamp;
		if(recallStartTimestamp != null){
			putQueryParameter("RecallStartTimestamp", recallStartTimestamp);
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

	public Boolean getIsRecall() {
		return this.isRecall;
	}

	public void setIsRecall(Boolean isRecall) {
		this.isRecall = isRecall;
		if(isRecall != null){
			putQueryParameter("IsRecall", isRecall.toString());
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

	public String getRecallEndTimestamp() {
		return this.recallEndTimestamp;
	}

	public void setRecallEndTimestamp(String recallEndTimestamp) {
		this.recallEndTimestamp = recallEndTimestamp;
		if(recallEndTimestamp != null){
			putQueryParameter("RecallEndTimestamp", recallEndTimestamp);
		}
	}

	@Override
	public Class<EnableSqlAuditResponse> getResponseClass() {
		return EnableSqlAuditResponse.class;
	}

}
