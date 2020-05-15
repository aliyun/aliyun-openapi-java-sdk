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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateVmMigrationPlanRequest extends RpcAcsRequest<CreateVmMigrationPlanResponse> {
	   

	private String restoreOptions;

	private List<MigrationSources> migrationSourcess;

	private String vaultId;

	private String mode;

	private String incrementalSyncSchedule;

	private Long delay;

	private String name;
	public CreateVmMigrationPlanRequest() {
		super("hbr", "2017-09-08", "CreateVmMigrationPlan", "hbr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRestoreOptions() {
		return this.restoreOptions;
	}

	public void setRestoreOptions(String restoreOptions) {
		this.restoreOptions = restoreOptions;
		if(restoreOptions != null){
			putQueryParameter("RestoreOptions", restoreOptions);
		}
	}

	public List<MigrationSources> getMigrationSourcess() {
		return this.migrationSourcess;
	}

	public void setMigrationSourcess(List<MigrationSources> migrationSourcess) {
		this.migrationSourcess = migrationSourcess;	
		if (migrationSourcess != null) {
			for (int depth1 = 0; depth1 < migrationSourcess.size(); depth1++) {
				putQueryParameter("MigrationSources." + (depth1 + 1) + ".RestoreOptions" , migrationSourcess.get(depth1).getRestoreOptions());
				putQueryParameter("MigrationSources." + (depth1 + 1) + ".VmId" , migrationSourcess.get(depth1).getVmId());
				putQueryParameter("MigrationSources." + (depth1 + 1) + ".Extra" , migrationSourcess.get(depth1).getExtra());
				putQueryParameter("MigrationSources." + (depth1 + 1) + ".HypervisorType" , migrationSourcess.get(depth1).getHypervisorType());
				putQueryParameter("MigrationSources." + (depth1 + 1) + ".VmInfo" , migrationSourcess.get(depth1).getVmInfo());
				putQueryParameter("MigrationSources." + (depth1 + 1) + ".HypervisorId" , migrationSourcess.get(depth1).getHypervisorId());
				putQueryParameter("MigrationSources." + (depth1 + 1) + ".VmName" , migrationSourcess.get(depth1).getVmName());
				putQueryParameter("MigrationSources." + (depth1 + 1) + ".ForceSilentSnapshot" , migrationSourcess.get(depth1).getForceSilentSnapshot());
			}
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

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
		if(mode != null){
			putQueryParameter("Mode", mode);
		}
	}

	public String getIncrementalSyncSchedule() {
		return this.incrementalSyncSchedule;
	}

	public void setIncrementalSyncSchedule(String incrementalSyncSchedule) {
		this.incrementalSyncSchedule = incrementalSyncSchedule;
		if(incrementalSyncSchedule != null){
			putQueryParameter("IncrementalSyncSchedule", incrementalSyncSchedule);
		}
	}

	public Long getDelay() {
		return this.delay;
	}

	public void setDelay(Long delay) {
		this.delay = delay;
		if(delay != null){
			putQueryParameter("Delay", delay.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public static class MigrationSources {

		private String restoreOptions;

		private String vmId;

		private String extra;

		private String hypervisorType;

		private String vmInfo;

		private String hypervisorId;

		private String vmName;

		private Boolean forceSilentSnapshot;

		public String getRestoreOptions() {
			return this.restoreOptions;
		}

		public void setRestoreOptions(String restoreOptions) {
			this.restoreOptions = restoreOptions;
		}

		public String getVmId() {
			return this.vmId;
		}

		public void setVmId(String vmId) {
			this.vmId = vmId;
		}

		public String getExtra() {
			return this.extra;
		}

		public void setExtra(String extra) {
			this.extra = extra;
		}

		public String getHypervisorType() {
			return this.hypervisorType;
		}

		public void setHypervisorType(String hypervisorType) {
			this.hypervisorType = hypervisorType;
		}

		public String getVmInfo() {
			return this.vmInfo;
		}

		public void setVmInfo(String vmInfo) {
			this.vmInfo = vmInfo;
		}

		public String getHypervisorId() {
			return this.hypervisorId;
		}

		public void setHypervisorId(String hypervisorId) {
			this.hypervisorId = hypervisorId;
		}

		public String getVmName() {
			return this.vmName;
		}

		public void setVmName(String vmName) {
			this.vmName = vmName;
		}

		public Boolean getForceSilentSnapshot() {
			return this.forceSilentSnapshot;
		}

		public void setForceSilentSnapshot(Boolean forceSilentSnapshot) {
			this.forceSilentSnapshot = forceSilentSnapshot;
		}
	}

	@Override
	public Class<CreateVmMigrationPlanResponse> getResponseClass() {
		return CreateVmMigrationPlanResponse.class;
	}

}
