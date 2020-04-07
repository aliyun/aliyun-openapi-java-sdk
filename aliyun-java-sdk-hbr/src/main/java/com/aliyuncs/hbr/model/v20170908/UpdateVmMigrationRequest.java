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
public class UpdateVmMigrationRequest extends RpcAcsRequest<UpdateVmMigrationResponse> {
	   

	private String clientId;

	private String vmId;

	private String vaultId;

	private String vmSnapshotId;

	private String restoreId;

	private Boolean finished;

	private String token;

	private String planId;
	public UpdateVmMigrationRequest() {
		super("hbr", "2017-09-08", "UpdateVmMigration", "hbr");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
		if(clientId != null){
			putQueryParameter("ClientId", clientId);
		}
	}

	public String getVmId() {
		return this.vmId;
	}

	public void setVmId(String vmId) {
		this.vmId = vmId;
		if(vmId != null){
			putQueryParameter("VmId", vmId);
		}
	}

	public String getVaultId() {
		return this.vaultId;
	}

	public void setVaultId(String vaultId) {
		this.vaultId = vaultId;
		if(vaultId != null){
			putQueryParameter("VaultId", vaultId);
		}
	}

	public String getVmSnapshotId() {
		return this.vmSnapshotId;
	}

	public void setVmSnapshotId(String vmSnapshotId) {
		this.vmSnapshotId = vmSnapshotId;
		if(vmSnapshotId != null){
			putQueryParameter("VmSnapshotId", vmSnapshotId);
		}
	}

	public String getRestoreId() {
		return this.restoreId;
	}

	public void setRestoreId(String restoreId) {
		this.restoreId = restoreId;
		if(restoreId != null){
			putQueryParameter("RestoreId", restoreId);
		}
	}

	public Boolean getFinished() {
		return this.finished;
	}

	public void setFinished(Boolean finished) {
		this.finished = finished;
		if(finished != null){
			putQueryParameter("Finished", finished.toString());
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
		}
	}

	public String getPlanId() {
		return this.planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
		if(planId != null){
			putQueryParameter("PlanId", planId);
		}
	}

	@Override
	public Class<UpdateVmMigrationResponse> getResponseClass() {
		return UpdateVmMigrationResponse.class;
	}

}
