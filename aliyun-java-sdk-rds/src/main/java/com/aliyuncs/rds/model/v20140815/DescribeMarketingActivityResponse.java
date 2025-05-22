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
import com.aliyuncs.rds.transform.v20140815.DescribeMarketingActivityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMarketingActivityResponse extends AcsResponse {

	private Long aliUid;

	private String bid;

	private String regionId;

	private String requestId;

	private List<ItemsItem> items;

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
	}

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ItemsItem> getItems() {
		return this.items;
	}

	public void setItems(List<ItemsItem> items) {
		this.items = items;
	}

	public static class ItemsItem {

		private String category;

		private String chargeType;

		private String classCode;

		private String classGroup;

		private String cpu;

		private Integer diskSize;

		private String engine;

		private String engineVersion;

		private String instanceId;

		private String instanceName;

		private Integer maxConnections;

		private Integer maxIombps;

		private Integer maxIops;

		private Long memory;

		private String storageType;

		private String upgradeCategory;

		private String upgradeClassCode;

		private String upgradeClassGroup;

		private String upgradeCpu;

		private String upgradeDescContent;

		private Integer upgradeDiskSize;

		private Integer upgradeMaxConnections;

		private Integer upgradeMaxIombps;

		private Integer upgradeMaxIops;

		private Long upgradeMemory;

		private String upgradeReferencePrice;

		private String upgradeStorageType;

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getClassCode() {
			return this.classCode;
		}

		public void setClassCode(String classCode) {
			this.classCode = classCode;
		}

		public String getClassGroup() {
			return this.classGroup;
		}

		public void setClassGroup(String classGroup) {
			this.classGroup = classGroup;
		}

		public String getCpu() {
			return this.cpu;
		}

		public void setCpu(String cpu) {
			this.cpu = cpu;
		}

		public Integer getDiskSize() {
			return this.diskSize;
		}

		public void setDiskSize(Integer diskSize) {
			this.diskSize = diskSize;
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

		public Integer getMaxConnections() {
			return this.maxConnections;
		}

		public void setMaxConnections(Integer maxConnections) {
			this.maxConnections = maxConnections;
		}

		public Integer getMaxIombps() {
			return this.maxIombps;
		}

		public void setMaxIombps(Integer maxIombps) {
			this.maxIombps = maxIombps;
		}

		public Integer getMaxIops() {
			return this.maxIops;
		}

		public void setMaxIops(Integer maxIops) {
			this.maxIops = maxIops;
		}

		public Long getMemory() {
			return this.memory;
		}

		public void setMemory(Long memory) {
			this.memory = memory;
		}

		public String getStorageType() {
			return this.storageType;
		}

		public void setStorageType(String storageType) {
			this.storageType = storageType;
		}

		public String getUpgradeCategory() {
			return this.upgradeCategory;
		}

		public void setUpgradeCategory(String upgradeCategory) {
			this.upgradeCategory = upgradeCategory;
		}

		public String getUpgradeClassCode() {
			return this.upgradeClassCode;
		}

		public void setUpgradeClassCode(String upgradeClassCode) {
			this.upgradeClassCode = upgradeClassCode;
		}

		public String getUpgradeClassGroup() {
			return this.upgradeClassGroup;
		}

		public void setUpgradeClassGroup(String upgradeClassGroup) {
			this.upgradeClassGroup = upgradeClassGroup;
		}

		public String getUpgradeCpu() {
			return this.upgradeCpu;
		}

		public void setUpgradeCpu(String upgradeCpu) {
			this.upgradeCpu = upgradeCpu;
		}

		public String getUpgradeDescContent() {
			return this.upgradeDescContent;
		}

		public void setUpgradeDescContent(String upgradeDescContent) {
			this.upgradeDescContent = upgradeDescContent;
		}

		public Integer getUpgradeDiskSize() {
			return this.upgradeDiskSize;
		}

		public void setUpgradeDiskSize(Integer upgradeDiskSize) {
			this.upgradeDiskSize = upgradeDiskSize;
		}

		public Integer getUpgradeMaxConnections() {
			return this.upgradeMaxConnections;
		}

		public void setUpgradeMaxConnections(Integer upgradeMaxConnections) {
			this.upgradeMaxConnections = upgradeMaxConnections;
		}

		public Integer getUpgradeMaxIombps() {
			return this.upgradeMaxIombps;
		}

		public void setUpgradeMaxIombps(Integer upgradeMaxIombps) {
			this.upgradeMaxIombps = upgradeMaxIombps;
		}

		public Integer getUpgradeMaxIops() {
			return this.upgradeMaxIops;
		}

		public void setUpgradeMaxIops(Integer upgradeMaxIops) {
			this.upgradeMaxIops = upgradeMaxIops;
		}

		public Long getUpgradeMemory() {
			return this.upgradeMemory;
		}

		public void setUpgradeMemory(Long upgradeMemory) {
			this.upgradeMemory = upgradeMemory;
		}

		public String getUpgradeReferencePrice() {
			return this.upgradeReferencePrice;
		}

		public void setUpgradeReferencePrice(String upgradeReferencePrice) {
			this.upgradeReferencePrice = upgradeReferencePrice;
		}

		public String getUpgradeStorageType() {
			return this.upgradeStorageType;
		}

		public void setUpgradeStorageType(String upgradeStorageType) {
			this.upgradeStorageType = upgradeStorageType;
		}
	}

	@Override
	public DescribeMarketingActivityResponse getInstance(UnmarshallerContext context) {
		return	DescribeMarketingActivityResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
