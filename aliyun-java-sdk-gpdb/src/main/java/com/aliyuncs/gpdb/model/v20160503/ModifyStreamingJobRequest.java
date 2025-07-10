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

package com.aliyuncs.gpdb.model.v20160503;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyStreamingJobRequest extends RpcAcsRequest<ModifyStreamingJobResponse> {
	   

	private Boolean tryRun;

	private String jobDescription;

	private String destSchema;

	@SerializedName("destColumns")
	private List<String> destColumns;

	@SerializedName("updateColumns")
	private List<String> updateColumns;

	private String consistency;

	private Long jobId;

	private String password;

	private String destDatabase;

	private String dBInstanceId;

	@SerializedName("srcColumns")
	private List<String> srcColumns;

	private String jobConfig;

	@SerializedName("matchColumns")
	private List<String> matchColumns;

	private String destTable;

	private String groupName;

	private String fallbackOffset;

	private String writeMode;

	private Long errorLimitCount;

	private String account;
	public ModifyStreamingJobRequest() {
		super("gpdb", "2016-05-03", "ModifyStreamingJob", "gpdb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getTryRun() {
		return this.tryRun;
	}

	public void setTryRun(Boolean tryRun) {
		this.tryRun = tryRun;
		if(tryRun != null){
			putQueryParameter("TryRun", tryRun.toString());
		}
	}

	public String getJobDescription() {
		return this.jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
		if(jobDescription != null){
			putQueryParameter("JobDescription", jobDescription);
		}
	}

	public String getDestSchema() {
		return this.destSchema;
	}

	public void setDestSchema(String destSchema) {
		this.destSchema = destSchema;
		if(destSchema != null){
			putQueryParameter("DestSchema", destSchema);
		}
	}

	public List<String> getDestColumns() {
		return this.destColumns;
	}

	public void setDestColumns(List<String> destColumns) {
		this.destColumns = destColumns;	
		if (destColumns != null) {
			putQueryParameter("DestColumns" , new Gson().toJson(destColumns));
		}	
	}

	public List<String> getUpdateColumns() {
		return this.updateColumns;
	}

	public void setUpdateColumns(List<String> updateColumns) {
		this.updateColumns = updateColumns;	
		if (updateColumns != null) {
			putQueryParameter("UpdateColumns" , new Gson().toJson(updateColumns));
		}	
	}

	public String getConsistency() {
		return this.consistency;
	}

	public void setConsistency(String consistency) {
		this.consistency = consistency;
		if(consistency != null){
			putQueryParameter("Consistency", consistency);
		}
	}

	public Long getJobId() {
		return this.jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
		if(jobId != null){
			putQueryParameter("JobId", jobId.toString());
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

	public String getDestDatabase() {
		return this.destDatabase;
	}

	public void setDestDatabase(String destDatabase) {
		this.destDatabase = destDatabase;
		if(destDatabase != null){
			putQueryParameter("DestDatabase", destDatabase);
		}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public List<String> getSrcColumns() {
		return this.srcColumns;
	}

	public void setSrcColumns(List<String> srcColumns) {
		this.srcColumns = srcColumns;	
		if (srcColumns != null) {
			putQueryParameter("SrcColumns" , new Gson().toJson(srcColumns));
		}	
	}

	public String getJobConfig() {
		return this.jobConfig;
	}

	public void setJobConfig(String jobConfig) {
		this.jobConfig = jobConfig;
		if(jobConfig != null){
			putQueryParameter("JobConfig", jobConfig);
		}
	}

	public List<String> getMatchColumns() {
		return this.matchColumns;
	}

	public void setMatchColumns(List<String> matchColumns) {
		this.matchColumns = matchColumns;	
		if (matchColumns != null) {
			putQueryParameter("MatchColumns" , new Gson().toJson(matchColumns));
		}	
	}

	public String getDestTable() {
		return this.destTable;
	}

	public void setDestTable(String destTable) {
		this.destTable = destTable;
		if(destTable != null){
			putQueryParameter("DestTable", destTable);
		}
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
		if(groupName != null){
			putQueryParameter("GroupName", groupName);
		}
	}

	public String getFallbackOffset() {
		return this.fallbackOffset;
	}

	public void setFallbackOffset(String fallbackOffset) {
		this.fallbackOffset = fallbackOffset;
		if(fallbackOffset != null){
			putQueryParameter("FallbackOffset", fallbackOffset);
		}
	}

	public String getWriteMode() {
		return this.writeMode;
	}

	public void setWriteMode(String writeMode) {
		this.writeMode = writeMode;
		if(writeMode != null){
			putQueryParameter("WriteMode", writeMode);
		}
	}

	public Long getErrorLimitCount() {
		return this.errorLimitCount;
	}

	public void setErrorLimitCount(Long errorLimitCount) {
		this.errorLimitCount = errorLimitCount;
		if(errorLimitCount != null){
			putQueryParameter("ErrorLimitCount", errorLimitCount.toString());
		}
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
		if(account != null){
			putQueryParameter("Account", account);
		}
	}

	@Override
	public Class<ModifyStreamingJobResponse> getResponseClass() {
		return ModifyStreamingJobResponse.class;
	}

}
