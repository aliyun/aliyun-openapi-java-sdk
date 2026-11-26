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
public class CreateSnapshotRequest extends RpcAcsRequest<CreateSnapshotResponse> {
	   

	private String clientToken;

	private String lsn;

	private String projectId;

	private String snapshotTimestamp;
	public CreateSnapshotRequest() {
		super("gpdb", "2016-05-03", "CreateSnapshot", "GPDB");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getLsn() {
		return this.lsn;
	}

	public void setLsn(String lsn) {
		this.lsn = lsn;
		if(lsn != null){
			putQueryParameter("Lsn", lsn);
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

	public String getSnapshotTimestamp() {
		return this.snapshotTimestamp;
	}

	public void setSnapshotTimestamp(String snapshotTimestamp) {
		this.snapshotTimestamp = snapshotTimestamp;
		if(snapshotTimestamp != null){
			putQueryParameter("SnapshotTimestamp", snapshotTimestamp);
		}
	}

	@Override
	public Class<CreateSnapshotResponse> getResponseClass() {
		return CreateSnapshotResponse.class;
	}

}
