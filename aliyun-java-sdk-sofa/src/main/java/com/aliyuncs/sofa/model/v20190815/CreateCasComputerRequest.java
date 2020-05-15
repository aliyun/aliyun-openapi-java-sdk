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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateCasComputerRequest extends RpcAcsRequest<CreateCasComputerResponse> {
	   

	private String specId;

	private String workspace;

	private String securityGroupSequence;

	private String description;

	private String cellId;

	private String systemDiskType;

	private String password;

	private List<DataDisks> dataDiskss;

	private Long instanceCount;

	private String zone;

	private String commonImageSequence;

	private Long systemDiskSize;

	private String imageSequence;

	private String appServiceId;

	private String vSwitchId;

	private String appId;

	private String name;
	public CreateCasComputerRequest() {
		super("SOFA", "2019-08-15", "CreateCasComputer", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSpecId() {
		return this.specId;
	}

	public void setSpecId(String specId) {
		this.specId = specId;
		if(specId != null){
			putBodyParameter("SpecId", specId);
		}
	}

	public String getWorkspace() {
		return this.workspace;
	}

	public void setWorkspace(String workspace) {
		this.workspace = workspace;
		if(workspace != null){
			putBodyParameter("Workspace", workspace);
		}
	}

	public String getSecurityGroupSequence() {
		return this.securityGroupSequence;
	}

	public void setSecurityGroupSequence(String securityGroupSequence) {
		this.securityGroupSequence = securityGroupSequence;
		if(securityGroupSequence != null){
			putBodyParameter("SecurityGroupSequence", securityGroupSequence);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getCellId() {
		return this.cellId;
	}

	public void setCellId(String cellId) {
		this.cellId = cellId;
		if(cellId != null){
			putBodyParameter("CellId", cellId);
		}
	}

	public String getSystemDiskType() {
		return this.systemDiskType;
	}

	public void setSystemDiskType(String systemDiskType) {
		this.systemDiskType = systemDiskType;
		if(systemDiskType != null){
			putBodyParameter("SystemDiskType", systemDiskType);
		}
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putBodyParameter("Password", password);
		}
	}

	public List<DataDisks> getDataDiskss() {
		return this.dataDiskss;
	}

	public void setDataDiskss(List<DataDisks> dataDiskss) {
		this.dataDiskss = dataDiskss;	
		if (dataDiskss != null) {
			for (int depth1 = 0; depth1 < dataDiskss.size(); depth1++) {
				putBodyParameter("DataDisks." + (depth1 + 1) + ".SpecId" , dataDiskss.get(depth1).getSpecId());
				putBodyParameter("DataDisks." + (depth1 + 1) + ".Size" , dataDiskss.get(depth1).getSize());
				putBodyParameter("DataDisks." + (depth1 + 1) + ".Device" , dataDiskss.get(depth1).getDevice());
				putBodyParameter("DataDisks." + (depth1 + 1) + ".SnapshotSequence" , dataDiskss.get(depth1).getSnapshotSequence());
			}
		}	
	}

	public Long getInstanceCount() {
		return this.instanceCount;
	}

	public void setInstanceCount(Long instanceCount) {
		this.instanceCount = instanceCount;
		if(instanceCount != null){
			putBodyParameter("InstanceCount", instanceCount.toString());
		}
	}

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
		if(zone != null){
			putBodyParameter("Zone", zone);
		}
	}

	public String getCommonImageSequence() {
		return this.commonImageSequence;
	}

	public void setCommonImageSequence(String commonImageSequence) {
		this.commonImageSequence = commonImageSequence;
		if(commonImageSequence != null){
			putBodyParameter("CommonImageSequence", commonImageSequence);
		}
	}

	public Long getSystemDiskSize() {
		return this.systemDiskSize;
	}

	public void setSystemDiskSize(Long systemDiskSize) {
		this.systemDiskSize = systemDiskSize;
		if(systemDiskSize != null){
			putBodyParameter("SystemDiskSize", systemDiskSize.toString());
		}
	}

	public String getImageSequence() {
		return this.imageSequence;
	}

	public void setImageSequence(String imageSequence) {
		this.imageSequence = imageSequence;
		if(imageSequence != null){
			putBodyParameter("ImageSequence", imageSequence);
		}
	}

	public String getAppServiceId() {
		return this.appServiceId;
	}

	public void setAppServiceId(String appServiceId) {
		this.appServiceId = appServiceId;
		if(appServiceId != null){
			putBodyParameter("AppServiceId", appServiceId);
		}
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putBodyParameter("VSwitchId", vSwitchId);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putBodyParameter("AppId", appId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public static class DataDisks {

		private String specId;

		private Long size;

		private String device;

		private String snapshotSequence;

		public String getSpecId() {
			return this.specId;
		}

		public void setSpecId(String specId) {
			this.specId = specId;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public String getDevice() {
			return this.device;
		}

		public void setDevice(String device) {
			this.device = device;
		}

		public String getSnapshotSequence() {
			return this.snapshotSequence;
		}

		public void setSnapshotSequence(String snapshotSequence) {
			this.snapshotSequence = snapshotSequence;
		}
	}

	@Override
	public Class<CreateCasComputerResponse> getResponseClass() {
		return CreateCasComputerResponse.class;
	}

}
