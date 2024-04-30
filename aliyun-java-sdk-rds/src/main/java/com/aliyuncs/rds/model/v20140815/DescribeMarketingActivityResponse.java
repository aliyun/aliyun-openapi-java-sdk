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

	private String requestId;

	private Long aliUid;

	private String regionId;

	private String bid;

	private List<ItemsItem> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public List<ItemsItem> getItems() {
		return this.items;
	}

	public void setItems(List<ItemsItem> items) {
		this.items = items;
	}

	public static class ItemsItem {

		private String instanceId;

		private String instanceName;

		private String classCode;

		private Integer diskSize;

		private Long memory;

		private String cpu;

		private String category;

		private String storageType;

		private String classGroup;

		private Integer maxIombps;

		private Integer maxIops;

		private Integer maxConnections;

		private String upgradeClassCode;

		private Integer upgradeDiskSize;

		private Long upgradeMemory;

		private String upgradeCpu;

		private String upgradeCategory;

		private String upgradeStorageType;

		private String upgradeClassGroup;

		private Integer upgradeMaxIombps;

		private Integer upgradeMaxIops;

		private Integer upgradeMaxConnections;

		private String upgradeDescContent;

		private String upgradeReferencePrice;

		private String chargeType;

		private String engine;

		private String engineVersion;

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

		public String getClassCode() {
			return this.classCode;
		}

		public void setClassCode(String classCode) {
			this.classCode = classCode;
		}

		public Integer getDiskSize() {
			return this.diskSize;
		}

		public void setDiskSize(Integer diskSize) {
			this.diskSize = diskSize;
		}

		public Long getMemory() {
			return this.memory;
		}

		public void setMemory(Long memory) {
			this.memory = memory;
		}

		public String getCpu() {
			return this.cpu;
		}

		public void setCpu(String cpu) {
			this.cpu = cpu;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getStorageType() {
			return this.storageType;
		}

		public void setStorageType(String storageType) {
			this.storageType = storageType;
		}

		public String getClassGroup() {
			return this.classGroup;
		}

		public void setClassGroup(String classGroup) {
			this.classGroup = classGroup;
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

		public Integer getMaxConnections() {
			return this.maxConnections;
		}

		public void setMaxConnections(Integer maxConnections) {
			this.maxConnections = maxConnections;
		}

		public String getUpgradeClassCode() {
			return this.upgradeClassCode;
		}

		public void setUpgradeClassCode(String upgradeClassCode) {
			this.upgradeClassCode = upgradeClassCode;
		}

		public Integer getUpgradeDiskSize() {
			return this.upgradeDiskSize;
		}

		public void setUpgradeDiskSize(Integer upgradeDiskSize) {
			this.upgradeDiskSize = upgradeDiskSize;
		}

		public Long getUpgradeMemory() {
			return this.upgradeMemory;
		}

		public void setUpgradeMemory(Long upgradeMemory) {
			this.upgradeMemory = upgradeMemory;
		}

		public String getUpgradeCpu() {
			return this.upgradeCpu;
		}

		public void setUpgradeCpu(String upgradeCpu) {
			this.upgradeCpu = upgradeCpu;
		}

		public String getUpgradeCategory() {
			return this.upgradeCategory;
		}

		public void setUpgradeCategory(String upgradeCategory) {
			this.upgradeCategory = upgradeCategory;
		}

		public String getUpgradeStorageType() {
			return this.upgradeStorageType;
		}

		public void setUpgradeStorageType(String upgradeStorageType) {
			this.upgradeStorageType = upgradeStorageType;
		}

		public String getUpgradeClassGroup() {
			return this.upgradeClassGroup;
		}

		public void setUpgradeClassGroup(String upgradeClassGroup) {
			this.upgradeClassGroup = upgradeClassGroup;
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

		public Integer getUpgradeMaxConnections() {
			return this.upgradeMaxConnections;
		}

		public void setUpgradeMaxConnections(Integer upgradeMaxConnections) {
			this.upgradeMaxConnections = upgradeMaxConnections;
		}

		public String getUpgradeDescContent() {
			return this.upgradeDescContent;
		}

		public void setUpgradeDescContent(String upgradeDescContent) {
			this.upgradeDescContent = upgradeDescContent;
		}

		public String getUpgradeReferencePrice() {
			return this.upgradeReferencePrice;
		}

		public void setUpgradeReferencePrice(String upgradeReferencePrice) {
			this.upgradeReferencePrice = upgradeReferencePrice;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
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
