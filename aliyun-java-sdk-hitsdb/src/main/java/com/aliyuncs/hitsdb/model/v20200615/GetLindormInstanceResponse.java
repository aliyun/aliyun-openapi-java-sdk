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

package com.aliyuncs.hitsdb.model.v20200615;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hitsdb.transform.v20200615.GetLindormInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLindormInstanceResponse extends AcsResponse {

	private String vpcId;

	private String vswitchId;

	private String createTime;

	private String payType;

	private String networkType;

	private String serviceType;

	private Boolean enableKms;

	private String diskUsage;

	private String diskCategory;

	private String requestId;

	private Integer coldStorage;

	private Long expiredMilliseconds;

	private Integer engineType;

	private String expireTime;

	private Boolean autoRenew;

	private String deletionProtection;

	private String instanceStorage;

	private Long aliUid;

	private String instanceId;

	private String regionId;

	private Boolean enableFS;

	private Long createMilliseconds;

	private String instanceAlias;

	private Boolean enableBDS;

	private Boolean enablePhoenix;

	private String diskThreshold;

	private String zoneId;

	private String instanceStatus;

	private Boolean enableCompute;

	private Boolean enableSSL;

	private Boolean enableCdc;

	private Boolean enableStream;

	private Boolean enableShs;

	private List<Engine> engineList;

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

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}

	public String getServiceType() {
		return this.serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public Boolean getEnableKms() {
		return this.enableKms;
	}

	public void setEnableKms(Boolean enableKms) {
		this.enableKms = enableKms;
	}

	public String getDiskUsage() {
		return this.diskUsage;
	}

	public void setDiskUsage(String diskUsage) {
		this.diskUsage = diskUsage;
	}

	public String getDiskCategory() {
		return this.diskCategory;
	}

	public void setDiskCategory(String diskCategory) {
		this.diskCategory = diskCategory;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getColdStorage() {
		return this.coldStorage;
	}

	public void setColdStorage(Integer coldStorage) {
		this.coldStorage = coldStorage;
	}

	public Long getExpiredMilliseconds() {
		return this.expiredMilliseconds;
	}

	public void setExpiredMilliseconds(Long expiredMilliseconds) {
		this.expiredMilliseconds = expiredMilliseconds;
	}

	public Integer getEngineType() {
		return this.engineType;
	}

	public void setEngineType(Integer engineType) {
		this.engineType = engineType;
	}

	public String getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public Boolean getAutoRenew() {
		return this.autoRenew;
	}

	public void setAutoRenew(Boolean autoRenew) {
		this.autoRenew = autoRenew;
	}

	public String getDeletionProtection() {
		return this.deletionProtection;
	}

	public void setDeletionProtection(String deletionProtection) {
		this.deletionProtection = deletionProtection;
	}

	public String getInstanceStorage() {
		return this.instanceStorage;
	}

	public void setInstanceStorage(String instanceStorage) {
		this.instanceStorage = instanceStorage;
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public Boolean getEnableFS() {
		return this.enableFS;
	}

	public void setEnableFS(Boolean enableFS) {
		this.enableFS = enableFS;
	}

	public Long getCreateMilliseconds() {
		return this.createMilliseconds;
	}

	public void setCreateMilliseconds(Long createMilliseconds) {
		this.createMilliseconds = createMilliseconds;
	}

	public String getInstanceAlias() {
		return this.instanceAlias;
	}

	public void setInstanceAlias(String instanceAlias) {
		this.instanceAlias = instanceAlias;
	}

	public Boolean getEnableBDS() {
		return this.enableBDS;
	}

	public void setEnableBDS(Boolean enableBDS) {
		this.enableBDS = enableBDS;
	}

	public Boolean getEnablePhoenix() {
		return this.enablePhoenix;
	}

	public void setEnablePhoenix(Boolean enablePhoenix) {
		this.enablePhoenix = enablePhoenix;
	}

	public String getDiskThreshold() {
		return this.diskThreshold;
	}

	public void setDiskThreshold(String diskThreshold) {
		this.diskThreshold = diskThreshold;
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

	public Boolean getEnableCompute() {
		return this.enableCompute;
	}

	public void setEnableCompute(Boolean enableCompute) {
		this.enableCompute = enableCompute;
	}

	public Boolean getEnableSSL() {
		return this.enableSSL;
	}

	public void setEnableSSL(Boolean enableSSL) {
		this.enableSSL = enableSSL;
	}

	public Boolean getEnableCdc() {
		return this.enableCdc;
	}

	public void setEnableCdc(Boolean enableCdc) {
		this.enableCdc = enableCdc;
	}

	public Boolean getEnableStream() {
		return this.enableStream;
	}

	public void setEnableStream(Boolean enableStream) {
		this.enableStream = enableStream;
	}

	public Boolean getEnableShs() {
		return this.enableShs;
	}

	public void setEnableShs(Boolean enableShs) {
		this.enableShs = enableShs;
	}

	public List<Engine> getEngineList() {
		return this.engineList;
	}

	public void setEngineList(List<Engine> engineList) {
		this.engineList = engineList;
	}

	public static class Engine {

		private String version;

		private String cpuCount;

		private String coreCount;

		private String engine;

		private String memorySize;

		private Boolean isLastVersion;

		private String latestVersion;

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getCpuCount() {
			return this.cpuCount;
		}

		public void setCpuCount(String cpuCount) {
			this.cpuCount = cpuCount;
		}

		public String getCoreCount() {
			return this.coreCount;
		}

		public void setCoreCount(String coreCount) {
			this.coreCount = coreCount;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getMemorySize() {
			return this.memorySize;
		}

		public void setMemorySize(String memorySize) {
			this.memorySize = memorySize;
		}

		public Boolean getIsLastVersion() {
			return this.isLastVersion;
		}

		public void setIsLastVersion(Boolean isLastVersion) {
			this.isLastVersion = isLastVersion;
		}

		public String getLatestVersion() {
			return this.latestVersion;
		}

		public void setLatestVersion(String latestVersion) {
			this.latestVersion = latestVersion;
		}
	}

	@Override
	public GetLindormInstanceResponse getInstance(UnmarshallerContext context) {
		return	GetLindormInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
