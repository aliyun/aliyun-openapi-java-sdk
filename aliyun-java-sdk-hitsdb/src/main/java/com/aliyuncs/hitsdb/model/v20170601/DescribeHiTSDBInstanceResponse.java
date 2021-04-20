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

package com.aliyuncs.hitsdb.model.v20170601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hitsdb.transform.v20170601.DescribeHiTSDBInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHiTSDBInstanceResponse extends AcsResponse {

	private String requestId;

	private String instanceId;

	private String instanceAlias;

	private String instanceDescription;

	private String regionId;

	private String zoneId;

	private String instanceStatus;

	private String chargeType;

	private String networkType;

	private String gmtCreated;

	private String gmtExpire;

	private String instanceClass;

	private String maxTimelineLimit;

	private String instanceStorage;

	private String instanceTps;

	private String reverseVpcIp;

	private String reverseVpcPort;

	private String vpcId;

	private String vswitchId;

	private String connectionString;

	private String publicConnectionString;

	private String autoRenew;

	private String engineType;

	private String cpuNumber;

	private String memSize;

	private Integer series;

	private String rDSStatus;

	private String diskCategory;

	private String status;

	private String paymentType;

	private Long createTime;

	private Long expiredTime;

	private List<SecurityIp> securityIpList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getInstanceAlias() {
		return this.instanceAlias;
	}

	public void setInstanceAlias(String instanceAlias) {
		this.instanceAlias = instanceAlias;
	}

	public String getInstanceDescription() {
		return this.instanceDescription;
	}

	public void setInstanceDescription(String instanceDescription) {
		this.instanceDescription = instanceDescription;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

	public String getInstanceStatus() {
		return this.instanceStatus;
	}

	public void setInstanceStatus(String instanceStatus) {
		this.instanceStatus = instanceStatus;
	}

	public String getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}

	public String getGmtCreated() {
		return this.gmtCreated;
	}

	public void setGmtCreated(String gmtCreated) {
		this.gmtCreated = gmtCreated;
	}

	public String getGmtExpire() {
		return this.gmtExpire;
	}

	public void setGmtExpire(String gmtExpire) {
		this.gmtExpire = gmtExpire;
	}

	public String getInstanceClass() {
		return this.instanceClass;
	}

	public void setInstanceClass(String instanceClass) {
		this.instanceClass = instanceClass;
	}

	public String getMaxTimelineLimit() {
		return this.maxTimelineLimit;
	}

	public void setMaxTimelineLimit(String maxTimelineLimit) {
		this.maxTimelineLimit = maxTimelineLimit;
	}

	public String getInstanceStorage() {
		return this.instanceStorage;
	}

	public void setInstanceStorage(String instanceStorage) {
		this.instanceStorage = instanceStorage;
	}

	public String getInstanceTps() {
		return this.instanceTps;
	}

	public void setInstanceTps(String instanceTps) {
		this.instanceTps = instanceTps;
	}

	public String getReverseVpcIp() {
		return this.reverseVpcIp;
	}

	public void setReverseVpcIp(String reverseVpcIp) {
		this.reverseVpcIp = reverseVpcIp;
	}

	public String getReverseVpcPort() {
		return this.reverseVpcPort;
	}

	public void setReverseVpcPort(String reverseVpcPort) {
		this.reverseVpcPort = reverseVpcPort;
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}

	public String getVswitchId() {
		return this.vswitchId;
	}

	public void setVswitchId(String vswitchId) {
		this.vswitchId = vswitchId;
	}

	public String getConnectionString() {
		return this.connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	public String getPublicConnectionString() {
		return this.publicConnectionString;
	}

	public void setPublicConnectionString(String publicConnectionString) {
		this.publicConnectionString = publicConnectionString;
	}

	public String getAutoRenew() {
		return this.autoRenew;
	}

	public void setAutoRenew(String autoRenew) {
		this.autoRenew = autoRenew;
	}

	public String getEngineType() {
		return this.engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public String getCpuNumber() {
		return this.cpuNumber;
	}

	public void setCpuNumber(String cpuNumber) {
		this.cpuNumber = cpuNumber;
	}

	public String getMemSize() {
		return this.memSize;
	}

	public void setMemSize(String memSize) {
		this.memSize = memSize;
	}

	public Integer getSeries() {
		return this.series;
	}

	public void setSeries(Integer series) {
		this.series = series;
	}

	public String getRDSStatus() {
		return this.rDSStatus;
	}

	public void setRDSStatus(String rDSStatus) {
		this.rDSStatus = rDSStatus;
	}

	public String getDiskCategory() {
		return this.diskCategory;
	}

	public void setDiskCategory(String diskCategory) {
		this.diskCategory = diskCategory;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public Long getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public Long getExpiredTime() {
		return this.expiredTime;
	}

	public void setExpiredTime(Long expiredTime) {
		this.expiredTime = expiredTime;
	}

	public List<SecurityIp> getSecurityIpList() {
		return this.securityIpList;
	}

	public void setSecurityIpList(List<SecurityIp> securityIpList) {
		this.securityIpList = securityIpList;
	}

	public static class SecurityIp {

		private String ip;

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}
	}

	@Override
	public DescribeHiTSDBInstanceResponse getInstance(UnmarshallerContext context) {
		return	DescribeHiTSDBInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
