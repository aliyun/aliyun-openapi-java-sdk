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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsCreateChangePlanBatchRequest extends RpcAcsRequest<OpsCreateChangePlanBatchResponse> {
	   

	private String cluster;

	private String serverRole;

	private Integer batchNo;

	private String commitId;

	private Integer batchSize;

	private String tags;

	private String jobId;

	private String auditParamStr;

	private List<Group> groups;
	public OpsCreateChangePlanBatchRequest() {
		super("Ecsops", "2016-04-01", "OpsCreateChangePlanBatch", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getCluster() {
		return this.cluster;
	}

	public void setCluster(String cluster) {
		this.cluster = cluster;
		if(cluster != null){
			putQueryParameter("Cluster", cluster);
		}
	}

	public String getServerRole() {
		return this.serverRole;
	}

	public void setServerRole(String serverRole) {
		this.serverRole = serverRole;
		if(serverRole != null){
			putQueryParameter("ServerRole", serverRole);
		}
	}

	public Integer getBatchNo() {
		return this.batchNo;
	}

	public void setBatchNo(Integer batchNo) {
		this.batchNo = batchNo;
		if(batchNo != null){
			putQueryParameter("BatchNo", batchNo.toString());
		}
	}

	public String getCommitId() {
		return this.commitId;
	}

	public void setCommitId(String commitId) {
		this.commitId = commitId;
		if(commitId != null){
			putQueryParameter("CommitId", commitId);
		}
	}

	public Integer getBatchSize() {
		return this.batchSize;
	}

	public void setBatchSize(Integer batchSize) {
		this.batchSize = batchSize;
		if(batchSize != null){
			putQueryParameter("BatchSize", batchSize.toString());
		}
	}

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
		if(tags != null){
			putQueryParameter("Tags", tags);
		}
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
		if(jobId != null){
			putQueryParameter("JobId", jobId);
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	public List<Group> getGroups() {
		return this.groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;	
		if (groups != null) {
			for (int depth1 = 0; depth1 < groups.size(); depth1++) {
				putQueryParameter("Group." + (depth1 + 1) + ".FailedsStr" , groups.get(depth1).getFailedsStr());
				putQueryParameter("Group." + (depth1 + 1) + ".Compress" , groups.get(depth1).getCompress());
				putQueryParameter("Group." + (depth1 + 1) + ".SucceededsStr" , groups.get(depth1).getSucceededsStr());
				putQueryParameter("Group." + (depth1 + 1) + ".DoingsStr" , groups.get(depth1).getDoingsStr());
				putQueryParameter("Group." + (depth1 + 1) + ".WaitingsStr" , groups.get(depth1).getWaitingsStr());
				putQueryParameter("Group." + (depth1 + 1) + ".BuildId" , groups.get(depth1).getBuildId());
				putQueryParameter("Group." + (depth1 + 1) + ".GroupName" , groups.get(depth1).getGroupName());
			}
		}	
	}

	public static class Group {

		private String failedsStr;

		private Boolean compress;

		private String succeededsStr;

		private String doingsStr;

		private String waitingsStr;

		private String buildId;

		private String groupName;

		public String getFailedsStr() {
			return this.failedsStr;
		}

		public void setFailedsStr(String failedsStr) {
			this.failedsStr = failedsStr;
		}

		public Boolean getCompress() {
			return this.compress;
		}

		public void setCompress(Boolean compress) {
			this.compress = compress;
		}

		public String getSucceededsStr() {
			return this.succeededsStr;
		}

		public void setSucceededsStr(String succeededsStr) {
			this.succeededsStr = succeededsStr;
		}

		public String getDoingsStr() {
			return this.doingsStr;
		}

		public void setDoingsStr(String doingsStr) {
			this.doingsStr = doingsStr;
		}

		public String getWaitingsStr() {
			return this.waitingsStr;
		}

		public void setWaitingsStr(String waitingsStr) {
			this.waitingsStr = waitingsStr;
		}

		public String getBuildId() {
			return this.buildId;
		}

		public void setBuildId(String buildId) {
			this.buildId = buildId;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}
	}

	@Override
	public Class<OpsCreateChangePlanBatchResponse> getResponseClass() {
		return OpsCreateChangePlanBatchResponse.class;
	}

}
