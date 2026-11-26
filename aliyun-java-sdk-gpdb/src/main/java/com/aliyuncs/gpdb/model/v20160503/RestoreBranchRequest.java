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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RestoreBranchRequest extends RpcAcsRequest<RestoreBranchResponse> {
	   

	private String branchId;

	private String sourceBranchId;

	private String clientToken;

	private String sourceBranchLsn;

	private String projectId;

	private String preserveUnderName;

	private String sourceBranchTimestamp;
	public RestoreBranchRequest() {
		super("gpdb", "2016-05-03", "RestoreBranch", "GPDB");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBranchId() {
		return this.branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
		if(branchId != null){
			putQueryParameter("BranchId", branchId);
		}
	}

	public String getSourceBranchId() {
		return this.sourceBranchId;
	}

	public void setSourceBranchId(String sourceBranchId) {
		this.sourceBranchId = sourceBranchId;
		if(sourceBranchId != null){
			putQueryParameter("SourceBranchId", sourceBranchId);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getSourceBranchLsn() {
		return this.sourceBranchLsn;
	}

	public void setSourceBranchLsn(String sourceBranchLsn) {
		this.sourceBranchLsn = sourceBranchLsn;
		if(sourceBranchLsn != null){
			putQueryParameter("SourceBranchLsn", sourceBranchLsn);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId);
		}
	}

	public String getPreserveUnderName() {
		return this.preserveUnderName;
	}

	public void setPreserveUnderName(String preserveUnderName) {
		this.preserveUnderName = preserveUnderName;
		if(preserveUnderName != null){
			putQueryParameter("PreserveUnderName", preserveUnderName);
		}
	}

	public String getSourceBranchTimestamp() {
		return this.sourceBranchTimestamp;
	}

	public void setSourceBranchTimestamp(String sourceBranchTimestamp) {
		this.sourceBranchTimestamp = sourceBranchTimestamp;
		if(sourceBranchTimestamp != null){
			putQueryParameter("SourceBranchTimestamp", sourceBranchTimestamp);
		}
	}

	@Override
	public Class<RestoreBranchResponse> getResponseClass() {
		return RestoreBranchResponse.class;
	}

}
