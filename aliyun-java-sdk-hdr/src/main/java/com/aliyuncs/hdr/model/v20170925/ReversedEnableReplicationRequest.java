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

package com.aliyuncs.hdr.model.v20170925;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.hdr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ReversedEnableReplicationRequest extends RpcAcsRequest<ReversedEnableReplicationResponse> {
	
	public ReversedEnableReplicationRequest() {
		super("hdr", "2017-09-25", "ReversedEnableReplication", "hdr");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String replicationGateway;

	private Boolean replicationUseOriginalInstance;

	private String replicationNetMask;

	private String replicationDatastore;

	private String replicationLocation;

	private String recoveryNetwork;

	private String serverId;

	private String replicationInfrastructureId;

	private String replicationComputeResource;

	private String replicationNetwork;

	private String replicationDns;

	private Boolean replicationUseDhcp;

	private String replicationIpAddress;

	public String getReplicationGateway() {
		return this.replicationGateway;
	}

	public void setReplicationGateway(String replicationGateway) {
		this.replicationGateway = replicationGateway;
		if(replicationGateway != null){
			putQueryParameter("ReplicationGateway", replicationGateway);
		}
	}

	public Boolean getReplicationUseOriginalInstance() {
		return this.replicationUseOriginalInstance;
	}

	public void setReplicationUseOriginalInstance(Boolean replicationUseOriginalInstance) {
		this.replicationUseOriginalInstance = replicationUseOriginalInstance;
		if(replicationUseOriginalInstance != null){
			putQueryParameter("ReplicationUseOriginalInstance", replicationUseOriginalInstance.toString());
		}
	}

	public String getReplicationNetMask() {
		return this.replicationNetMask;
	}

	public void setReplicationNetMask(String replicationNetMask) {
		this.replicationNetMask = replicationNetMask;
		if(replicationNetMask != null){
			putQueryParameter("ReplicationNetMask", replicationNetMask);
		}
	}

	public String getReplicationDatastore() {
		return this.replicationDatastore;
	}

	public void setReplicationDatastore(String replicationDatastore) {
		this.replicationDatastore = replicationDatastore;
		if(replicationDatastore != null){
			putQueryParameter("ReplicationDatastore", replicationDatastore);
		}
	}

	public String getReplicationLocation() {
		return this.replicationLocation;
	}

	public void setReplicationLocation(String replicationLocation) {
		this.replicationLocation = replicationLocation;
		if(replicationLocation != null){
			putQueryParameter("ReplicationLocation", replicationLocation);
		}
	}

	public String getRecoveryNetwork() {
		return this.recoveryNetwork;
	}

	public void setRecoveryNetwork(String recoveryNetwork) {
		this.recoveryNetwork = recoveryNetwork;
		if(recoveryNetwork != null){
			putQueryParameter("RecoveryNetwork", recoveryNetwork);
		}
	}

	public String getServerId() {
		return this.serverId;
	}

	public void setServerId(String serverId) {
		this.serverId = serverId;
		if(serverId != null){
			putQueryParameter("ServerId", serverId);
		}
	}

	public String getReplicationInfrastructureId() {
		return this.replicationInfrastructureId;
	}

	public void setReplicationInfrastructureId(String replicationInfrastructureId) {
		this.replicationInfrastructureId = replicationInfrastructureId;
		if(replicationInfrastructureId != null){
			putQueryParameter("ReplicationInfrastructureId", replicationInfrastructureId);
		}
	}

	public String getReplicationComputeResource() {
		return this.replicationComputeResource;
	}

	public void setReplicationComputeResource(String replicationComputeResource) {
		this.replicationComputeResource = replicationComputeResource;
		if(replicationComputeResource != null){
			putQueryParameter("ReplicationComputeResource", replicationComputeResource);
		}
	}

	public String getReplicationNetwork() {
		return this.replicationNetwork;
	}

	public void setReplicationNetwork(String replicationNetwork) {
		this.replicationNetwork = replicationNetwork;
		if(replicationNetwork != null){
			putQueryParameter("ReplicationNetwork", replicationNetwork);
		}
	}

	public String getReplicationDns() {
		return this.replicationDns;
	}

	public void setReplicationDns(String replicationDns) {
		this.replicationDns = replicationDns;
		if(replicationDns != null){
			putQueryParameter("ReplicationDns", replicationDns);
		}
	}

	public Boolean getReplicationUseDhcp() {
		return this.replicationUseDhcp;
	}

	public void setReplicationUseDhcp(Boolean replicationUseDhcp) {
		this.replicationUseDhcp = replicationUseDhcp;
		if(replicationUseDhcp != null){
			putQueryParameter("ReplicationUseDhcp", replicationUseDhcp.toString());
		}
	}

	public String getReplicationIpAddress() {
		return this.replicationIpAddress;
	}

	public void setReplicationIpAddress(String replicationIpAddress) {
		this.replicationIpAddress = replicationIpAddress;
		if(replicationIpAddress != null){
			putQueryParameter("ReplicationIpAddress", replicationIpAddress);
		}
	}

	@Override
	public Class<ReversedEnableReplicationResponse> getResponseClass() {
		return ReversedEnableReplicationResponse.class;
	}

}
