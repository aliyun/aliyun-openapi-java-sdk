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
public class RestoreSnapshotRequest extends RpcAcsRequest<RestoreSnapshotResponse> {
	   

	private String restoredLsn;

	private String clientToken;

	private Boolean finalizeRestore;

	private String restoredBranchName;

	private String projectId;

	private String targetBranchId;
	public RestoreSnapshotRequest() {
		super("gpdb", "2016-05-03", "RestoreSnapshot", "GPDB");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRestoredLsn() {
		return this.restoredLsn;
	}

	public void setRestoredLsn(String restoredLsn) {
		this.restoredLsn = restoredLsn;
		if(restoredLsn != null){
			putQueryParameter("RestoredLsn", restoredLsn);
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

	public Boolean getFinalizeRestore() {
		return this.finalizeRestore;
	}

	public void setFinalizeRestore(Boolean finalizeRestore) {
		this.finalizeRestore = finalizeRestore;
		if(finalizeRestore != null){
			putQueryParameter("FinalizeRestore", finalizeRestore.toString());
		}
	}

	public String getRestoredBranchName() {
		return this.restoredBranchName;
	}

	public void setRestoredBranchName(String restoredBranchName) {
		this.restoredBranchName = restoredBranchName;
		if(restoredBranchName != null){
			putQueryParameter("RestoredBranchName", restoredBranchName);
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

	public String getTargetBranchId() {
		return this.targetBranchId;
	}

	public void setTargetBranchId(String targetBranchId) {
		this.targetBranchId = targetBranchId;
		if(targetBranchId != null){
			putQueryParameter("TargetBranchId", targetBranchId);
		}
	}

	@Override
	public Class<RestoreSnapshotResponse> getResponseClass() {
		return RestoreSnapshotResponse.class;
	}

}
