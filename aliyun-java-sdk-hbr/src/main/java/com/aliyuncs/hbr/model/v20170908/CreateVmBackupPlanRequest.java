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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateVmBackupPlanRequest extends RpcAcsRequest<CreateVmBackupPlanResponse> {
	   

	private String diffSchedule;

	private String serverType;

	private String vaultId;

	private String fullSchedule;

	private String incSchedule;

	private List<BackupSources> backupSourcess;

	private String name;

	private Long retention;

	private Boolean runAfterCreated;
	public CreateVmBackupPlanRequest() {
		super("hbr", "2017-09-08", "CreateVmBackupPlan", "hbr");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDiffSchedule() {
		return this.diffSchedule;
	}

	public void setDiffSchedule(String diffSchedule) {
		this.diffSchedule = diffSchedule;
		if(diffSchedule != null){
			putQueryParameter("DiffSchedule", diffSchedule);
		}
	}

	public String getServerType() {
		return this.serverType;
	}

	public void setServerType(String serverType) {
		this.serverType = serverType;
		if(serverType != null){
			putQueryParameter("ServerType", serverType);
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

	public String getFullSchedule() {
		return this.fullSchedule;
	}

	public void setFullSchedule(String fullSchedule) {
		this.fullSchedule = fullSchedule;
		if(fullSchedule != null){
			putQueryParameter("FullSchedule", fullSchedule);
		}
	}

	public String getIncSchedule() {
		return this.incSchedule;
	}

	public void setIncSchedule(String incSchedule) {
		this.incSchedule = incSchedule;
		if(incSchedule != null){
			putQueryParameter("IncSchedule", incSchedule);
		}
	}

	public List<BackupSources> getBackupSourcess() {
		return this.backupSourcess;
	}

	public void setBackupSourcess(List<BackupSources> backupSourcess) {
		this.backupSourcess = backupSourcess;	
		if (backupSourcess != null) {
			for (int depth1 = 0; depth1 < backupSourcess.size(); depth1++) {
				putQueryParameter("BackupSources." + (depth1 + 1) + ".ClientId" , backupSourcess.get(depth1).getClientId());
				putQueryParameter("BackupSources." + (depth1 + 1) + ".VmId" , backupSourcess.get(depth1).getVmId());
				putQueryParameter("BackupSources." + (depth1 + 1) + ".UseHotAdd" , backupSourcess.get(depth1).getUseHotAdd());
				putQueryParameter("BackupSources." + (depth1 + 1) + ".Extra" , backupSourcess.get(depth1).getExtra());
				putQueryParameter("BackupSources." + (depth1 + 1) + ".VmInfo" , backupSourcess.get(depth1).getVmInfo());
				putQueryParameter("BackupSources." + (depth1 + 1) + ".HypervisorId" , backupSourcess.get(depth1).getHypervisorId());
				putQueryParameter("BackupSources." + (depth1 + 1) + ".VmName" , backupSourcess.get(depth1).getVmName());
				putQueryParameter("BackupSources." + (depth1 + 1) + ".ForceSilentSnapshot" , backupSourcess.get(depth1).getForceSilentSnapshot());
			}
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

	public Long getRetention() {
		return this.retention;
	}

	public void setRetention(Long retention) {
		this.retention = retention;
		if(retention != null){
			putQueryParameter("Retention", retention.toString());
		}
	}

	public Boolean getRunAfterCreated() {
		return this.runAfterCreated;
	}

	public void setRunAfterCreated(Boolean runAfterCreated) {
		this.runAfterCreated = runAfterCreated;
		if(runAfterCreated != null){
			putQueryParameter("RunAfterCreated", runAfterCreated.toString());
		}
	}

	public static class BackupSources {

		private String clientId;

		private String vmId;

		private Boolean useHotAdd;

		private String extra;

		private String vmInfo;

		private String hypervisorId;

		private String vmName;

		private Boolean forceSilentSnapshot;

		public String getClientId() {
			return this.clientId;
		}

		public void setClientId(String clientId) {
			this.clientId = clientId;
		}

		public String getVmId() {
			return this.vmId;
		}

		public void setVmId(String vmId) {
			this.vmId = vmId;
		}

		public Boolean getUseHotAdd() {
			return this.useHotAdd;
		}

		public void setUseHotAdd(Boolean useHotAdd) {
			this.useHotAdd = useHotAdd;
		}

		public String getExtra() {
			return this.extra;
		}

		public void setExtra(String extra) {
			this.extra = extra;
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
	public Class<CreateVmBackupPlanResponse> getResponseClass() {
		return CreateVmBackupPlanResponse.class;
	}

}
