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

package com.aliyuncs.hbr.model.v20170908;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateVaultReplicationRequest extends RpcAcsRequest<CreateVaultReplicationResponse> {
	   

	private String replicationSourceVaultId;

	private String replicationTargetVaultId;

	private String replicationSourceRegionId;
	public CreateVaultReplicationRequest() {
		super("hbr", "2017-09-08", "CreateVaultReplication", "hbr");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getReplicationSourceVaultId() {
		return this.replicationSourceVaultId;
	}

	public void setReplicationSourceVaultId(String replicationSourceVaultId) {
		this.replicationSourceVaultId = replicationSourceVaultId;
		if(replicationSourceVaultId != null){
			putQueryParameter("ReplicationSourceVaultId", replicationSourceVaultId);
		}
	}

	public String getReplicationTargetVaultId() {
		return this.replicationTargetVaultId;
	}

	public void setReplicationTargetVaultId(String replicationTargetVaultId) {
		this.replicationTargetVaultId = replicationTargetVaultId;
		if(replicationTargetVaultId != null){
			putQueryParameter("ReplicationTargetVaultId", replicationTargetVaultId);
		}
	}

	public String getReplicationSourceRegionId() {
		return this.replicationSourceRegionId;
	}

	public void setReplicationSourceRegionId(String replicationSourceRegionId) {
		this.replicationSourceRegionId = replicationSourceRegionId;
		if(replicationSourceRegionId != null){
			putQueryParameter("ReplicationSourceRegionId", replicationSourceRegionId);
		}
	}

	@Override
	public Class<CreateVaultReplicationResponse> getResponseClass() {
		return CreateVaultReplicationResponse.class;
	}

}
