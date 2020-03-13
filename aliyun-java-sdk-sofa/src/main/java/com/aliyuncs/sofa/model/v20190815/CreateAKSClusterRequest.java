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
public class CreateAKSClusterRequest extends RpcAcsRequest<CreateAKSClusterResponse> {
	   

	private String workspace;

	private List<NodeSpecs> nodeSpecss;

	private Long maxPodAmountPerNode;

	private String podIpRange;

	private String existingVpcId;

	private Boolean enableLogging;

	private Boolean enableMonitoring;

	private String alsProjectName;

	private List<ZoneToVswitchIds> zoneToVswitchIdss;

	private String clusterPackageSuitVersionName;

	private String serviceIpRange;

	private String userLoginName;

	private String existingSecuredGroupIds;

	private String displayName;

	private String name;

	private String alsProjectHowCreate;

	private Boolean enableSofaMesh;

	private String operatorName;
	public CreateAKSClusterRequest() {
		super("SOFA", "2019-08-15", "CreateAKSCluster", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<NodeSpecs> getNodeSpecss() {
		return this.nodeSpecss;
	}

	public void setNodeSpecss(List<NodeSpecs> nodeSpecss) {
		this.nodeSpecss = nodeSpecss;	
		if (nodeSpecss != null) {
			for (int depth1 = 0; depth1 < nodeSpecss.size(); depth1++) {
				putBodyParameter("NodeSpecs." + (depth1 + 1) + ".Amount" , nodeSpecss.get(depth1).getAmount());
				putBodyParameter("NodeSpecs." + (depth1 + 1) + ".Password" , nodeSpecss.get(depth1).getPassword());
				putBodyParameter("NodeSpecs." + (depth1 + 1) + ".DataDiskSize" , nodeSpecss.get(depth1).getDataDiskSize());
				putBodyParameter("NodeSpecs." + (depth1 + 1) + ".DataDiskSpecId" , nodeSpecss.get(depth1).getDataDiskSpecId());
				putBodyParameter("NodeSpecs." + (depth1 + 1) + ".SecurityGroupId" , nodeSpecss.get(depth1).getSecurityGroupId());
				putBodyParameter("NodeSpecs." + (depth1 + 1) + ".SystemDiskSize" , nodeSpecss.get(depth1).getSystemDiskSize());
				putBodyParameter("NodeSpecs." + (depth1 + 1) + ".ZoneId" , nodeSpecss.get(depth1).getZoneId());
				putBodyParameter("NodeSpecs." + (depth1 + 1) + ".NamePrefix" , nodeSpecss.get(depth1).getNamePrefix());
				putBodyParameter("NodeSpecs." + (depth1 + 1) + ".Cell" , nodeSpecss.get(depth1).getCell());
				putBodyParameter("NodeSpecs." + (depth1 + 1) + ".ComputerSpecId" , nodeSpecss.get(depth1).getComputerSpecId());
				putBodyParameter("NodeSpecs." + (depth1 + 1) + ".VswicthId" , nodeSpecss.get(depth1).getVswicthId());
				putBodyParameter("NodeSpecs." + (depth1 + 1) + ".SystemDiskSpecId" , nodeSpecss.get(depth1).getSystemDiskSpecId());
			}
		}	
	}

	public Long getMaxPodAmountPerNode() {
		return this.maxPodAmountPerNode;
	}

	public void setMaxPodAmountPerNode(Long maxPodAmountPerNode) {
		this.maxPodAmountPerNode = maxPodAmountPerNode;
		if(maxPodAmountPerNode != null){
			putBodyParameter("MaxPodAmountPerNode", maxPodAmountPerNode.toString());
		}
	}

	public String getPodIpRange() {
		return this.podIpRange;
	}

	public void setPodIpRange(String podIpRange) {
		this.podIpRange = podIpRange;
		if(podIpRange != null){
			putBodyParameter("PodIpRange", podIpRange);
		}
	}

	public String getExistingVpcId() {
		return this.existingVpcId;
	}

	public void setExistingVpcId(String existingVpcId) {
		this.existingVpcId = existingVpcId;
		if(existingVpcId != null){
			putBodyParameter("ExistingVpcId", existingVpcId);
		}
	}

	public Boolean getEnableLogging() {
		return this.enableLogging;
	}

	public void setEnableLogging(Boolean enableLogging) {
		this.enableLogging = enableLogging;
		if(enableLogging != null){
			putBodyParameter("EnableLogging", enableLogging.toString());
		}
	}

	public Boolean getEnableMonitoring() {
		return this.enableMonitoring;
	}

	public void setEnableMonitoring(Boolean enableMonitoring) {
		this.enableMonitoring = enableMonitoring;
		if(enableMonitoring != null){
			putBodyParameter("EnableMonitoring", enableMonitoring.toString());
		}
	}

	public String getAlsProjectName() {
		return this.alsProjectName;
	}

	public void setAlsProjectName(String alsProjectName) {
		this.alsProjectName = alsProjectName;
		if(alsProjectName != null){
			putBodyParameter("AlsProjectName", alsProjectName);
		}
	}

	public List<ZoneToVswitchIds> getZoneToVswitchIdss() {
		return this.zoneToVswitchIdss;
	}

	public void setZoneToVswitchIdss(List<ZoneToVswitchIds> zoneToVswitchIdss) {
		this.zoneToVswitchIdss = zoneToVswitchIdss;	
		if (zoneToVswitchIdss != null) {
			for (int depth1 = 0; depth1 < zoneToVswitchIdss.size(); depth1++) {
				putBodyParameter("ZoneToVswitchIds." + (depth1 + 1) + ".VswitchId" , zoneToVswitchIdss.get(depth1).getVswitchId());
				putBodyParameter("ZoneToVswitchIds." + (depth1 + 1) + ".ZoneId" , zoneToVswitchIdss.get(depth1).getZoneId());
			}
		}	
	}

	public String getClusterPackageSuitVersionName() {
		return this.clusterPackageSuitVersionName;
	}

	public void setClusterPackageSuitVersionName(String clusterPackageSuitVersionName) {
		this.clusterPackageSuitVersionName = clusterPackageSuitVersionName;
		if(clusterPackageSuitVersionName != null){
			putBodyParameter("ClusterPackageSuitVersionName", clusterPackageSuitVersionName);
		}
	}

	public String getServiceIpRange() {
		return this.serviceIpRange;
	}

	public void setServiceIpRange(String serviceIpRange) {
		this.serviceIpRange = serviceIpRange;
		if(serviceIpRange != null){
			putBodyParameter("ServiceIpRange", serviceIpRange);
		}
	}

	public String getUserLoginName() {
		return this.userLoginName;
	}

	public void setUserLoginName(String userLoginName) {
		this.userLoginName = userLoginName;
		if(userLoginName != null){
			putBodyParameter("UserLoginName", userLoginName);
		}
	}

	public String getExistingSecuredGroupIds() {
		return this.existingSecuredGroupIds;
	}

	public void setExistingSecuredGroupIds(String existingSecuredGroupIds) {
		this.existingSecuredGroupIds = existingSecuredGroupIds;
		if(existingSecuredGroupIds != null){
			putBodyParameter("ExistingSecuredGroupIds", existingSecuredGroupIds);
		}
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
		if(displayName != null){
			putBodyParameter("DisplayName", displayName);
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

	public String getAlsProjectHowCreate() {
		return this.alsProjectHowCreate;
	}

	public void setAlsProjectHowCreate(String alsProjectHowCreate) {
		this.alsProjectHowCreate = alsProjectHowCreate;
		if(alsProjectHowCreate != null){
			putBodyParameter("AlsProjectHowCreate", alsProjectHowCreate);
		}
	}

	public Boolean getEnableSofaMesh() {
		return this.enableSofaMesh;
	}

	public void setEnableSofaMesh(Boolean enableSofaMesh) {
		this.enableSofaMesh = enableSofaMesh;
		if(enableSofaMesh != null){
			putBodyParameter("EnableSofaMesh", enableSofaMesh.toString());
		}
	}

	public String getOperatorName() {
		return this.operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
		if(operatorName != null){
			putBodyParameter("OperatorName", operatorName);
		}
	}

	public static class NodeSpecs {

		private Long amount;

		private String password;

		private Long dataDiskSize;

		private String dataDiskSpecId;

		private String securityGroupId;

		private Long systemDiskSize;

		private String zoneId;

		private String namePrefix;

		private String cell;

		private String computerSpecId;

		private String vswicthId;

		private String systemDiskSpecId;

		public Long getAmount() {
			return this.amount;
		}

		public void setAmount(Long amount) {
			this.amount = amount;
		}

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Long getDataDiskSize() {
			return this.dataDiskSize;
		}

		public void setDataDiskSize(Long dataDiskSize) {
			this.dataDiskSize = dataDiskSize;
		}

		public String getDataDiskSpecId() {
			return this.dataDiskSpecId;
		}

		public void setDataDiskSpecId(String dataDiskSpecId) {
			this.dataDiskSpecId = dataDiskSpecId;
		}

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}

		public Long getSystemDiskSize() {
			return this.systemDiskSize;
		}

		public void setSystemDiskSize(Long systemDiskSize) {
			this.systemDiskSize = systemDiskSize;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getNamePrefix() {
			return this.namePrefix;
		}

		public void setNamePrefix(String namePrefix) {
			this.namePrefix = namePrefix;
		}

		public String getCell() {
			return this.cell;
		}

		public void setCell(String cell) {
			this.cell = cell;
		}

		public String getComputerSpecId() {
			return this.computerSpecId;
		}

		public void setComputerSpecId(String computerSpecId) {
			this.computerSpecId = computerSpecId;
		}

		public String getVswicthId() {
			return this.vswicthId;
		}

		public void setVswicthId(String vswicthId) {
			this.vswicthId = vswicthId;
		}

		public String getSystemDiskSpecId() {
			return this.systemDiskSpecId;
		}

		public void setSystemDiskSpecId(String systemDiskSpecId) {
			this.systemDiskSpecId = systemDiskSpecId;
		}
	}

	public static class ZoneToVswitchIds {

		private String vswitchId;

		private String zoneId;

		public String getVswitchId() {
			return this.vswitchId;
		}

		public void setVswitchId(String vswitchId) {
			this.vswitchId = vswitchId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}
	}

	@Override
	public Class<CreateAKSClusterResponse> getResponseClass() {
		return CreateAKSClusterResponse.class;
	}

}
