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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.drds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class EnableSqlAuditRequest extends RpcAcsRequest<EnableSqlAuditResponse> {
	   

	private String recallStartTimestamp;

	private String drdsInstanceId;

	private String dbName;

	private Boolean isRecall;

	private String recallEndTimestamp;
	public EnableSqlAuditRequest() {
		super("Drds", "2019-01-23", "EnableSqlAudit", "Drds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRecallStartTimestamp() {
		return this.recallStartTimestamp;
	}

	public void setRecallStartTimestamp(String recallStartTimestamp) {
		this.recallStartTimestamp = recallStartTimestamp;
		if(recallStartTimestamp != null){
			putQueryParameter("RecallStartTimestamp", recallStartTimestamp);
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
