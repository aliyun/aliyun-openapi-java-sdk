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

package com.aliyuncs.drds.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20190123.DescribeCandidateInstanceListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCandidateInstanceListResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String region;

		private List<ListItem> list;

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public List<ListItem> getList() {
			return this.list;
		}

		public void setList(List<ListItem> list) {
			this.list = list;
		}

		public static class ListItem {

			private String region;

			private String instanceId;

			private String instanceName;

			private String instanceDescription;

			private Boolean isAccountFull;

			private Integer accountCount;

			private Boolean isDbFull;

			private Integer dbCount;

			private String securityIpList;

			private Boolean securityIpListNotBlank;

			private Boolean isInvalid;

			private String invalidReason;

			private Integer instanceNetType;

			private String networkType;

			private Boolean isNetTypeNotSupport;

			private Boolean isNetworkTypeNotSupport;

			private String type;

			private String connectUrl;

			private Integer port;

			private Integer status;

			private Integer readWeight;

			private Integer maxAccountCount;

			private Integer maxDbCount;

			private String subDomain;

			private String avz;

			private Boolean azoneIdNotMatch;

			private String regionName;

			private Integer accountType;

			private Integer supportUpgradeAccountType;

			private Boolean isAccountTypeNotSupport;

			private Integer maxConnections;

			private Integer lockMode;

			private Long dbInstanceMemory;

			private Integer dbInstanceStorage;

			private String vpcId;

			private String vswitchId;

			private Boolean usingNatIp;

			private String instanceStorage;

			private String engine;

			private String engineVersion;

			private String adminUser;

			private String adminPwd;

			private String vpcCloudDbInstanceId;

			private String category;

			private String dBInstanceStorageType;

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getInstanceName() {
				return this.instanceName;
			}

			public void setInstanceName(String instanceName) {
				this.instanceName = instanceName;
			}

			public String getInstanceDescription() {
				return this.instanceDescription;
			}

			public void setInstanceDescription(String instanceDescription) {
				this.instanceDescription = instanceDescription;
			}

			public Boolean getIsAccountFull() {
				return this.isAccountFull;
			}

			public void setIsAccountFull(Boolean isAccountFull) {
				this.isAccountFull = isAccountFull;
			}

			public Integer getAccountCount() {
				return this.accountCount;
			}

			public void setAccountCount(Integer accountCount) {
				this.accountCount = accountCount;
			}

			public Boolean getIsDbFull() {
				return this.isDbFull;
			}

			public void setIsDbFull(Boolean isDbFull) {
				this.isDbFull = isDbFull;
			}

			public Integer getDbCount() {
				return this.dbCount;
			}

			public void setDbCount(Integer dbCount) {
				this.dbCount = dbCount;
			}

			public String getSecurityIpList() {
				return this.securityIpList;
			}

			public void setSecurityIpList(String securityIpList) {
				this.securityIpList = securityIpList;
			}

			public Boolean getSecurityIpListNotBlank() {
				return this.securityIpListNotBlank;
			}

			public void setSecurityIpListNotBlank(Boolean securityIpListNotBlank) {
				this.securityIpListNotBlank = securityIpListNotBlank;
			}

			public Boolean getIsInvalid() {
				return this.isInvalid;
			}

			public void setIsInvalid(Boolean isInvalid) {
				this.isInvalid = isInvalid;
			}

			public String getInvalidReason() {
				return this.invalidReason;
			}

			public void setInvalidReason(String invalidReason) {
				this.invalidReason = invalidReason;
			}

			public Integer getInstanceNetType() {
				return this.instanceNetType;
			}

			public void setInstanceNetType(Integer instanceNetType) {
				this.instanceNetType = instanceNetType;
			}

			public String getNetworkType() {
				return this.networkType;
			}

			public void setNetworkType(String networkType) {
				this.networkType = networkType;
			}

			public Boolean getIsNetTypeNotSupport() {
				return this.isNetTypeNotSupport;
			}

			public void setIsNetTypeNotSupport(Boolean isNetTypeNotSupport) {
				this.isNetTypeNotSupport = isNetTypeNotSupport;
			}

			public Boolean getIsNetworkTypeNotSupport() {
				return this.isNetworkTypeNotSupport;
			}

			public void setIsNetworkTypeNotSupport(Boolean isNetworkTypeNotSupport) {
				this.isNetworkTypeNotSupport = isNetworkTypeNotSupport;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getConnectUrl() {
				return this.connectUrl;
			}

			public void setConnectUrl(String connectUrl) {
				this.connectUrl = connectUrl;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public Integer getReadWeight() {
				return this.readWeight;
			}

			public void setReadWeight(Integer readWeight) {
				this.readWeight = readWeight;
			}

			public Integer getMaxAccountCount() {
				return this.maxAccountCount;
			}

			public void setMaxAccountCount(Integer maxAccountCount) {
				this.maxAccountCount = maxAccountCount;
			}

			public Integer getMaxDbCount() {
				return this.maxDbCount;
			}

			public void setMaxDbCount(Integer maxDbCount) {
				this.maxDbCount = maxDbCount;
			}

			public String getSubDomain() {
				return this.subDomain;
			}

			public void setSubDomain(String subDomain) {
				this.subDomain = subDomain;
			}

			public String getAvz() {
				return this.avz;
			}

			public void setAvz(String avz) {
				this.avz = avz;
			}

			public Boolean getAzoneIdNotMatch() {
				return this.azoneIdNotMatch;
			}

			public void setAzoneIdNotMatch(Boolean azoneIdNotMatch) {
				this.azoneIdNotMatch = azoneIdNotMatch;
			}

			public String getRegionName() {
				return this.regionName;
			}

			public void setRegionName(String regionName) {
				this.regionName = regionName;
			}

			public Integer getAccountType() {
				return this.accountType;
			}

			public void setAccountType(Integer accountType) {
				this.accountType = accountType;
			}

			public Integer getSupportUpgradeAccountType() {
				return this.supportUpgradeAccountType;
			}

			public void setSupportUpgradeAccountType(Integer supportUpgradeAccountType) {
				this.supportUpgradeAccountType = supportUpgradeAccountType;
			}

			public Boolean getIsAccountTypeNotSupport() {
				return this.isAccountTypeNotSupport;
			}

			public void setIsAccountTypeNotSupport(Boolean isAccountTypeNotSupport) {
				this.isAccountTypeNotSupport = isAccountTypeNotSupport;
			}

			public Integer getMaxConnections() {
				return this.maxConnections;
			}

			public void setMaxConnections(Integer maxConnections) {
				this.maxConnections = maxConnections;
			}

			public Integer getLockMode() {
				return this.lockMode;
			}

			public void setLockMode(Integer lockMode) {
				this.lockMode = lockMode;
			}

			public Long getDbInstanceMemory() {
				return this.dbInstanceMemory;
			}

			public void setDbInstanceMemory(Long dbInstanceMemory) {
				this.dbInstanceMemory = dbInstanceMemory;
			}

			public Integer getDbInstanceStorage() {
				return this.dbInstanceStorage;
			}

			public void setDbInstanceStorage(Integer dbInstanceStorage) {
				this.dbInstanceStorage = dbInstanceStorage;
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

			public Boolean getUsingNatIp() {
				return this.usingNatIp;
			}

			public void setUsingNatIp(Boolean usingNatIp) {
				this.usingNatIp = usingNatIp;
			}

			public String getInstanceStorage() {
				return this.instanceStorage;
			}

			public void setInstanceStorage(String instanceStorage) {
				this.instanceStorage = instanceStorage;
			}

			public String getEngine() {
				return this.engine;
			}

			public void setEngine(String engine) {
				this.engine = engine;
			}

			public String getEngineVersion() {
				return this.engineVersion;
			}

			public void setEngineVersion(String engineVersion) {
				this.engineVersion = engineVersion;
			}

			public String getAdminUser() {
				return this.adminUser;
			}

			public void setAdminUser(String adminUser) {
				this.adminUser = adminUser;
			}

			public String getAdminPwd() {
				return this.adminPwd;
			}

			public void setAdminPwd(String adminPwd) {
				this.adminPwd = adminPwd;
			}

			public String getVpcCloudDbInstanceId() {
				return this.vpcCloudDbInstanceId;
			}

			public void setVpcCloudDbInstanceId(String vpcCloudDbInstanceId) {
				this.vpcCloudDbInstanceId = vpcCloudDbInstanceId;
			}

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public String getDBInstanceStorageType() {
				return this.dBInstanceStorageType;
			}

			public void setDBInstanceStorageType(String dBInstanceStorageType) {
				this.dBInstanceStorageType = dBInstanceStorageType;
			}
		}
	}

	@Override
	public DescribeCandidateInstanceListResponse getInstance(UnmarshallerContext context) {
		return	DescribeCandidateInstanceListResponseUnmarshaller.unmarshall(this, context);
	}
}
