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

package com.aliyuncs.hbase.model.v20190101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbase.transform.v20190101.DescribeServerlessClusterResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeServerlessClusterResponse extends AcsResponse {

	private String vpcId;

	private String status;

	private String innerEndpoint;

	private String createTime;

	private String payType;

	private String mainVersion;

	private String lockMode;

	private String hasUser;

	private String haType;

	private String requestId;

	private String updateStatus;

	private String reserverMaxQpsNum;

	private String instanceName;

	private String outerEndpoint;

	private String cuSize;

	private String expireTime;

	private String reserverMinQpsNum;

	private String autoRenew;

	private String diskSize;

	private String instanceId;

	private String isDeletionProtection;

	private String regionId;

	private String vSwitchId;

	private String clusterType;

	private String resourceGroupId;

	private String zoneId;

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getInnerEndpoint() {
		return this.innerEndpoint;
	}

	public void setInnerEndpoint(String innerEndpoint) {
		this.innerEndpoint = innerEndpoint;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getMainVersion() {
		return this.mainVersion;
	}

	public void setMainVersion(String mainVersion) {
		this.mainVersion = mainVersion;
	}

	public String getLockMode() {
		return this.lockMode;
	}

	public void setLockMode(String lockMode) {
		this.lockMode = lockMode;
	}

	public String getHasUser() {
		return this.hasUser;
	}

	public void setHasUser(String hasUser) {
		this.hasUser = hasUser;
	}

	public String getHaType() {
		return this.haType;
	}

	public void setHaType(String haType) {
		this.haType = haType;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getUpdateStatus() {
		return this.updateStatus;
	}

	public void setUpdateStatus(String updateStatus) {
		this.updateStatus = updateStatus;
	}

	public String getReserverMaxQpsNum() {
		return this.reserverMaxQpsNum;
	}

	public void setReserverMaxQpsNum(String reserverMaxQpsNum) {
		this.reserverMaxQpsNum = reserverMaxQpsNum;
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}

	public String getOuterEndpoint() {
		return this.outerEndpoint;
	}

	public void setOuterEndpoint(String outerEndpoint) {
		this.outerEndpoint = outerEndpoint;
	}

	public String getCuSize() {
		return this.cuSize;
	}

	public void setCuSize(String cuSize) {
		this.cuSize = cuSize;
	}

	public String getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getReserverMinQpsNum() {
		return this.reserverMinQpsNum;
	}

	public void setReserverMinQpsNum(String reserverMinQpsNum) {
		this.reserverMinQpsNum = reserverMinQpsNum;
	}

	public String getAutoRenew() {
		return this.autoRenew;
	}

	public void setAutoRenew(String autoRenew) {
		this.autoRenew = autoRenew;
	}

	public String getDiskSize() {
		return this.diskSize;
	}

	public void setDiskSize(String diskSize) {
		this.diskSize = diskSize;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getIsDeletionProtection() {
		return this.isDeletionProtection;
	}

	public void setIsDeletionProtection(String isDeletionProtection) {
		this.isDeletionProtection = isDeletionProtection;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
	}

	public String getClusterType() {
		return this.clusterType;
	}

	public void setClusterType(String clusterType) {
		this.clusterType = clusterType;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

	@Override
	public DescribeServerlessClusterResponse getInstance(UnmarshallerContext context) {
		return	DescribeServerlessClusterResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
