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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeChangePlanBatchRequest extends RpcAcsRequest<OpsDescribeChangePlanBatchResponse> {
	   

	private String cluster;

	private String serverRole;

	private Integer batchNo;

	private String commitId;

	private String serviceVersion;

	private String auditParamStr;
	public OpsDescribeChangePlanBatchRequest() {
		super("Ecsops", "2016-04-01", "OpsDescribeChangePlanBatch", "ecsops");
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

	public String getServiceVersion() {
		return this.serviceVersion;
	}

	public void setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
		if(serviceVersion != null){
			putQueryParameter("ServiceVersion", serviceVersion);
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

	@Override
	public Class<OpsDescribeChangePlanBatchResponse> getResponseClass() {
		return OpsDescribeChangePlanBatchResponse.class;
	}

}
