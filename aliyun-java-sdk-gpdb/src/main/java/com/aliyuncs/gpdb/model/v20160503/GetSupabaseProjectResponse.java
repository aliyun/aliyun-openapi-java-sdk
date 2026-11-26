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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.GetSupabaseProjectResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSupabaseProjectResponse extends AcsResponse {

	private String dBSecurityIpList;

	private String dashboardUserName;

	private String eni;

	private String lightweight;

	private String projectName;

	private String diskPerformanceLevel;

	private String appliedIdleTimeHours;

	private String instanceVersion;

	private String privateConnectUrl;

	private String dashboardPassword;

	private String projectDescription;

	private String engine;

	private String publicConnectUrl;

	private String status;

	private String engineVersion;

	private String storageType;

	private String requestId;

	private String zoneId;

	private String createTime;

	private String vSwitchId;

	private String projectId;

	private Long storageSize;

	private String payType;

	private String projectSpec;

	private String vpcId;

	private String securityIpList;

	private String regionId;

	private String autoScale;

	public String getDBSecurityIpList() {
		return this.dBSecurityIpList;
	}

	public void setDBSecurityIpList(String dBSecurityIpList) {
		this.dBSecurityIpList = dBSecurityIpList;
	}

	public String getDashboardUserName() {
		return this.dashboardUserName;
	}

	public void setDashboardUserName(String dashboardUserName) {
		this.dashboardUserName = dashboardUserName;
	}

	public String getEni() {
		return this.eni;
	}

	public void setEni(String eni) {
		this.eni = eni;
	}

	public String getLightweight() {
		return this.lightweight;
	}

	public void setLightweight(String lightweight) {
		this.lightweight = lightweight;
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getDiskPerformanceLevel() {
		return this.diskPerformanceLevel;
	}

	public void setDiskPerformanceLevel(String diskPerformanceLevel) {
		this.diskPerformanceLevel = diskPerformanceLevel;
	}

	public String getAppliedIdleTimeHours() {
		return this.appliedIdleTimeHours;
	}

	public void setAppliedIdleTimeHours(String appliedIdleTimeHours) {
		this.appliedIdleTimeHours = appliedIdleTimeHours;
	}

	public String getInstanceVersion() {
		return this.instanceVersion;
	}

	public void setInstanceVersion(String instanceVersion) {
		this.instanceVersion = instanceVersion;
	}

	public String getPrivateConnectUrl() {
		return this.privateConnectUrl;
	}

	public void setPrivateConnectUrl(String privateConnectUrl) {
		this.privateConnectUrl = privateConnectUrl;
	}

	public String getDashboardPassword() {
		return this.dashboardPassword;
	}

	public void setDashboardPassword(String dashboardPassword) {
		this.dashboardPassword = dashboardPassword;
	}

	public String getProjectDescription() {
		return this.projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getPublicConnectUrl() {
		return this.publicConnectUrl;
	}

	public void setPublicConnectUrl(String publicConnectUrl) {
		this.publicConnectUrl = publicConnectUrl;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEngineVersion() {
		return this.engineVersion;
	}

	public void setEngineVersion(String engineVersion) {
		this.engineVersion = engineVersion;
	}

	public String getStorageType() {
		return this.storageType;
	}

	public void setStorageType(String storageType) {
		this.storageType = storageType;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public Long getStorageSize() {
		return this.storageSize;
	}

	public void setStorageSize(Long storageSize) {
		this.storageSize = storageSize;
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getProjectSpec() {
		return this.projectSpec;
	}

	public void setProjectSpec(String projectSpec) {
		this.projectSpec = projectSpec;
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}

	public String getSecurityIpList() {
		return this.securityIpList;
	}

	public void setSecurityIpList(String securityIpList) {
		this.securityIpList = securityIpList;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getAutoScale() {
		return this.autoScale;
	}

	public void setAutoScale(String autoScale) {
		this.autoScale = autoScale;
	}

	@Override
	public GetSupabaseProjectResponse getInstance(UnmarshallerContext context) {
		return	GetSupabaseProjectResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
