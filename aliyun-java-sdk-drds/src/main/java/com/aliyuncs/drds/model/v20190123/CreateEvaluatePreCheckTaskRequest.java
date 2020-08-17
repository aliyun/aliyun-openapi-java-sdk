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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.drds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateEvaluatePreCheckTaskRequest extends RpcAcsRequest<CreateEvaluatePreCheckTaskResponse> {
	   

	private Integer avgQpsGrowthScale;

	private String taskName;

	private Integer dataGrowthScale;

	private List<DbInfo> dbInfos;

	private Integer evaluateHours;
	public CreateEvaluatePreCheckTaskRequest() {
		super("Drds", "2019-01-23", "CreateEvaluatePreCheckTask", "Drds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getAvgQpsGrowthScale() {
		return this.avgQpsGrowthScale;
	}

	public void setAvgQpsGrowthScale(Integer avgQpsGrowthScale) {
		this.avgQpsGrowthScale = avgQpsGrowthScale;
		if(avgQpsGrowthScale != null){
			putQueryParameter("AvgQpsGrowthScale", avgQpsGrowthScale.toString());
		}
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
		if(taskName != null){
			putQueryParameter("TaskName", taskName);
		}
	}

	public Integer getDataGrowthScale() {
		return this.dataGrowthScale;
	}

	public void setDataGrowthScale(Integer dataGrowthScale) {
		this.dataGrowthScale = dataGrowthScale;
		if(dataGrowthScale != null){
			putQueryParameter("DataGrowthScale", dataGrowthScale.toString());
		}
	}

	public List<DbInfo> getDbInfos() {
		return this.dbInfos;
	}

	public void setDbInfos(List<DbInfo> dbInfos) {
		this.dbInfos = dbInfos;	
		if (dbInfos != null) {
			for (int depth1 = 0; depth1 < dbInfos.size(); depth1++) {
				putQueryParameter("DbInfo." + (depth1 + 1) + ".InstId" , dbInfos.get(depth1).getInstId());
				putQueryParameter("DbInfo." + (depth1 + 1) + ".DbPort" , dbInfos.get(depth1).getDbPort());
				putQueryParameter("DbInfo." + (depth1 + 1) + ".DbName" , dbInfos.get(depth1).getDbName());
				putQueryParameter("DbInfo." + (depth1 + 1) + ".DbPassword" , dbInfos.get(depth1).getDbPassword());
				putQueryParameter("DbInfo." + (depth1 + 1) + ".DbUser" , dbInfos.get(depth1).getDbUser());
			}
		}	
	}

	public Integer getEvaluateHours() {
		return this.evaluateHours;
	}

	public void setEvaluateHours(Integer evaluateHours) {
		this.evaluateHours = evaluateHours;
		if(evaluateHours != null){
			putQueryParameter("EvaluateHours", evaluateHours.toString());
		}
	}

	public static class DbInfo {

		private String instId;

		private String dbPort;

		private String dbName;

		private String dbPassword;

		private String dbUser;

		public String getInstId() {
			return this.instId;
		}

		public void setInstId(String instId) {
			this.instId = instId;
		}

		public String getDbPort() {
			return this.dbPort;
		}

		public void setDbPort(String dbPort) {
			this.dbPort = dbPort;
		}

		public String getDbName() {
			return this.dbName;
		}

		public void setDbName(String dbName) {
			this.dbName = dbName;
		}

		public String getDbPassword() {
			return this.dbPassword;
		}

		public void setDbPassword(String dbPassword) {
			this.dbPassword = dbPassword;
		}

		public String getDbUser() {
			return this.dbUser;
		}

		public void setDbUser(String dbUser) {
			this.dbUser = dbUser;
		}
	}

	@Override
	public Class<CreateEvaluatePreCheckTaskResponse> getResponseClass() {
		return CreateEvaluatePreCheckTaskResponse.class;
	}

}
