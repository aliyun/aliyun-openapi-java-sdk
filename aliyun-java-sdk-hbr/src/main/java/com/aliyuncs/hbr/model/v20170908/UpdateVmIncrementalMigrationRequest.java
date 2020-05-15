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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateVmIncrementalMigrationRequest extends RpcAcsRequest<UpdateVmIncrementalMigrationResponse> {
	   

	private Boolean applying;

	private String vaultId;

	private String vmId;

	private Boolean applied;

	private String applyErrorMessage;

	private String vmSnapshotId;

	private String source;

	private String syncId;

	private String planId;
	public UpdateVmIncrementalMigrationRequest() {
		super("hbr", "2017-09-08", "UpdateVmIncrementalMigration", "hbr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getApplying() {
		return this.applying;
	}

	public void setApplying(Boolean applying) {
		this.applying = applying;
		if(applying != null){
			putQueryParameter("Applying", applying.toString());
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

	public String getVmId() {
		return this.vmId;
	}

	public void setVmId(String vmId) {
		this.vmId = vmId;
		if(vmId != null){
			putQueryParameter("VmId", vmId);
		}
	}

	public Boolean getApplied() {
		return this.applied;
	}

	public void setApplied(Boolean applied) {
		this.applied = applied;
		if(applied != null){
			putQueryParameter("Applied", applied.toString());
		}
	}

	public String getApplyErrorMessage() {
		return this.applyErrorMessage;
	}

	public void setApplyErrorMessage(String applyErrorMessage) {
		this.applyErrorMessage = applyErrorMessage;
		if(applyErrorMessage != null){
			putQueryParameter("ApplyErrorMessage", applyErrorMessage);
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

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putQueryParameter("Source", source);
		}
	}

	public String getSyncId() {
		return this.syncId;
	}

	public void setSyncId(String syncId) {
		this.syncId = syncId;
		if(syncId != null){
			putQueryParameter("SyncId", syncId);
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
	public Class<UpdateVmIncrementalMigrationResponse> getResponseClass() {
		return UpdateVmIncrementalMigrationResponse.class;
	}

}
