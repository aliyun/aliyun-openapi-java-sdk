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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeResourceDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeResourceDetailsResponse extends AcsResponse {

	private Long backupDataSize;

	private Long backupLogSize;

	private Long backupSize;

	private Long dbInstanceStorage;

	private String dbProxyInstanceName;

	private Long diskUsed;

	private String instanceStorageType;

	private String region;

	private String requestId;

	private String resourceGroupId;

	private String securityIPList;

	private String vSwitchId;

	private String vpcId;

	private List<RdsEcsSecurityGroupRelItem> rdsEcsSecurityGroupRel;

	public Long getBackupDataSize() {
		return this.backupDataSize;
	}

	public void setBackupDataSize(Long backupDataSize) {
		this.backupDataSize = backupDataSize;
	}

	public Long getBackupLogSize() {
		return this.backupLogSize;
	}

	public void setBackupLogSize(Long backupLogSize) {
		this.backupLogSize = backupLogSize;
	}

	public Long getBackupSize() {
		return this.backupSize;
	}

	public void setBackupSize(Long backupSize) {
		this.backupSize = backupSize;
	}

	public Long getDbInstanceStorage() {
		return this.dbInstanceStorage;
	}

	public void setDbInstanceStorage(Long dbInstanceStorage) {
		this.dbInstanceStorage = dbInstanceStorage;
	}

	public String getDbProxyInstanceName() {
		return this.dbProxyInstanceName;
	}

	public void setDbProxyInstanceName(String dbProxyInstanceName) {
		this.dbProxyInstanceName = dbProxyInstanceName;
	}

	public Long getDiskUsed() {
		return this.diskUsed;
	}

	public void setDiskUsed(Long diskUsed) {
		this.diskUsed = diskUsed;
	}

	public String getInstanceStorageType() {
		return this.instanceStorageType;
	}

	public void setInstanceStorageType(String instanceStorageType) {
		this.instanceStorageType = instanceStorageType;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public String getSecurityIPList() {
		return this.securityIPList;
	}

	public void setSecurityIPList(String securityIPList) {
		this.securityIPList = securityIPList;
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}

	public List<RdsEcsSecurityGroupRelItem> getRdsEcsSecurityGroupRel() {
		return this.rdsEcsSecurityGroupRel;
	}

	public void setRdsEcsSecurityGroupRel(List<RdsEcsSecurityGroupRelItem> rdsEcsSecurityGroupRel) {
		this.rdsEcsSecurityGroupRel = rdsEcsSecurityGroupRel;
	}

	public static class RdsEcsSecurityGroupRelItem {

		private String securityGroupName;

		public String getSecurityGroupName() {
			return this.securityGroupName;
		}

		public void setSecurityGroupName(String securityGroupName) {
			this.securityGroupName = securityGroupName;
		}
	}

	@Override
	public DescribeResourceDetailsResponse getInstance(UnmarshallerContext context) {
		return	DescribeResourceDetailsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
