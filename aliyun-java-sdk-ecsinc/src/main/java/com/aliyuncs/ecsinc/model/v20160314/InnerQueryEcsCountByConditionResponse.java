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

package com.aliyuncs.ecsinc.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsinc.transform.v20160314.InnerQueryEcsCountByConditionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerQueryEcsCountByConditionResponse extends AcsResponse {

	private String requestId;

	private Integer ecsTotalCount;

	private String timestamp;

	private List<InstanceCountModel> instanceCountModelsL1;

	private List<DiskCountModel> diskCountModelsL1;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getEcsTotalCount() {
		return this.ecsTotalCount;
	}

	public void setEcsTotalCount(Integer ecsTotalCount) {
		this.ecsTotalCount = ecsTotalCount;
	}

	public String getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public List<InstanceCountModel> getInstanceCountModelsL1() {
		return this.instanceCountModelsL1;
	}

	public void setInstanceCountModelsL1(List<InstanceCountModel> instanceCountModelsL1) {
		this.instanceCountModelsL1 = instanceCountModelsL1;
	}

	public List<DiskCountModel> getDiskCountModelsL1() {
		return this.diskCountModelsL1;
	}

	public void setDiskCountModelsL1(List<DiskCountModel> diskCountModelsL1) {
		this.diskCountModelsL1 = diskCountModelsL1;
	}

	public static class InstanceCountModel {

		private String ecsStatus;

		private String expiredTime;

		private String instanceType;

		private Integer cpu;

		private Integer mem;

		private String regionId;

		private String zoneId;

		private String imageId;

		private String chargeType;

		private String creationTime;

		private Integer count;

		private String imageOsType;

		private String imageOsName;

		private List<InstanceCountModel1> instanceCountModelsL2;

		public String getEcsStatus() {
			return this.ecsStatus;
		}

		public void setEcsStatus(String ecsStatus) {
			this.ecsStatus = ecsStatus;
		}

		public String getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(String expiredTime) {
			this.expiredTime = expiredTime;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public Integer getCpu() {
			return this.cpu;
		}

		public void setCpu(Integer cpu) {
			this.cpu = cpu;
		}

		public Integer getMem() {
			return this.mem;
		}

		public void setMem(Integer mem) {
			this.mem = mem;
		}

		public String getBizRegionId() {
			return this.regionId;
		}

		public void setBizRegionId(String regionId) {
			this.regionId = regionId;
		}

		/**
		 * @deprecated use getBizRegionId instead of this.
		 */
		@Deprecated
		public String getRegionId() {
			return this.regionId;
		}

		/**
		 * @deprecated use setBizRegionId instead of this.
		 */
		@Deprecated
		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public String getImageOsType() {
			return this.imageOsType;
		}

		public void setImageOsType(String imageOsType) {
			this.imageOsType = imageOsType;
		}

		public String getImageOsName() {
			return this.imageOsName;
		}

		public void setImageOsName(String imageOsName) {
			this.imageOsName = imageOsName;
		}

		public List<InstanceCountModel1> getInstanceCountModelsL2() {
			return this.instanceCountModelsL2;
		}

		public void setInstanceCountModelsL2(List<InstanceCountModel1> instanceCountModelsL2) {
			this.instanceCountModelsL2 = instanceCountModelsL2;
		}

		public static class InstanceCountModel1 {

			private String ecsStatus;

			private String expiredTime;

			private String instanceType;

			private Integer cpu;

			private Integer mem;

			private String regionId;

			private String zoneId;

			private String imageId;

			private String chargeType;

			private String creationTime;

			private Integer count;

			private String imageOsType;

			private String imageOsName;

			private List<InstanceCountModel2> instanceCountModelsL3;

			public String getEcsStatus() {
				return this.ecsStatus;
			}

			public void setEcsStatus(String ecsStatus) {
				this.ecsStatus = ecsStatus;
			}

			public String getExpiredTime() {
				return this.expiredTime;
			}

			public void setExpiredTime(String expiredTime) {
				this.expiredTime = expiredTime;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public Integer getCpu() {
				return this.cpu;
			}

			public void setCpu(Integer cpu) {
				this.cpu = cpu;
			}

			public Integer getMem() {
				return this.mem;
			}

			public void setMem(Integer mem) {
				this.mem = mem;
			}

			public String getBizRegionId() {
				return this.regionId;
			}

			public void setBizRegionId(String regionId) {
				this.regionId = regionId;
			}

			/**
			 * @deprecated use getBizRegionId instead of this.
			 */
			@Deprecated
			public String getRegionId() {
				return this.regionId;
			}

			/**
			 * @deprecated use setBizRegionId instead of this.
			 */
			@Deprecated
			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public String getImageId() {
				return this.imageId;
			}

			public void setImageId(String imageId) {
				this.imageId = imageId;
			}

			public String getChargeType() {
				return this.chargeType;
			}

			public void setChargeType(String chargeType) {
				this.chargeType = chargeType;
			}

			public String getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(String creationTime) {
				this.creationTime = creationTime;
			}

			public Integer getCount() {
				return this.count;
			}

			public void setCount(Integer count) {
				this.count = count;
			}

			public String getImageOsType() {
				return this.imageOsType;
			}

			public void setImageOsType(String imageOsType) {
				this.imageOsType = imageOsType;
			}

			public String getImageOsName() {
				return this.imageOsName;
			}

			public void setImageOsName(String imageOsName) {
				this.imageOsName = imageOsName;
			}

			public List<InstanceCountModel2> getInstanceCountModelsL3() {
				return this.instanceCountModelsL3;
			}

			public void setInstanceCountModelsL3(List<InstanceCountModel2> instanceCountModelsL3) {
				this.instanceCountModelsL3 = instanceCountModelsL3;
			}

			public static class InstanceCountModel2 {

				private String ecsStatus;

				private String expiredTime;

				private String instanceType;

				private Integer cpu;

				private Integer mem;

				private String regionId;

				private String zoneId;

				private String imageId;

				private String chargeType;

				private String creationTime;

				private Integer count;

				private String imageOsType;

				private String imageOsName;

				public String getEcsStatus() {
					return this.ecsStatus;
				}

				public void setEcsStatus(String ecsStatus) {
					this.ecsStatus = ecsStatus;
				}

				public String getExpiredTime() {
					return this.expiredTime;
				}

				public void setExpiredTime(String expiredTime) {
					this.expiredTime = expiredTime;
				}

				public String getInstanceType() {
					return this.instanceType;
				}

				public void setInstanceType(String instanceType) {
					this.instanceType = instanceType;
				}

				public Integer getCpu() {
					return this.cpu;
				}

				public void setCpu(Integer cpu) {
					this.cpu = cpu;
				}

				public Integer getMem() {
					return this.mem;
				}

				public void setMem(Integer mem) {
					this.mem = mem;
				}

				public String getBizRegionId() {
					return this.regionId;
				}

				public void setBizRegionId(String regionId) {
					this.regionId = regionId;
				}

				/**
				 * @deprecated use getBizRegionId instead of this.
				 */
				@Deprecated
				public String getRegionId() {
					return this.regionId;
				}

				/**
				 * @deprecated use setBizRegionId instead of this.
				 */
				@Deprecated
				public void setRegionId(String regionId) {
					this.regionId = regionId;
				}

				public String getZoneId() {
					return this.zoneId;
				}

				public void setZoneId(String zoneId) {
					this.zoneId = zoneId;
				}

				public String getImageId() {
					return this.imageId;
				}

				public void setImageId(String imageId) {
					this.imageId = imageId;
				}

				public String getChargeType() {
					return this.chargeType;
				}

				public void setChargeType(String chargeType) {
					this.chargeType = chargeType;
				}

				public String getCreationTime() {
					return this.creationTime;
				}

				public void setCreationTime(String creationTime) {
					this.creationTime = creationTime;
				}

				public Integer getCount() {
					return this.count;
				}

				public void setCount(Integer count) {
					this.count = count;
				}

				public String getImageOsType() {
					return this.imageOsType;
				}

				public void setImageOsType(String imageOsType) {
					this.imageOsType = imageOsType;
				}

				public String getImageOsName() {
					return this.imageOsName;
				}

				public void setImageOsName(String imageOsName) {
					this.imageOsName = imageOsName;
				}
			}
		}
	}

	public static class DiskCountModel {

		private Integer diskSize;

		private String diskCategory;

		private String diskType;

		private String zoneId;

		private Integer count;

		private List<DiskCountModel3> diskCountModelsL2;

		public Integer getDiskSize() {
			return this.diskSize;
		}

		public void setDiskSize(Integer diskSize) {
			this.diskSize = diskSize;
		}

		public String getDiskCategory() {
			return this.diskCategory;
		}

		public void setDiskCategory(String diskCategory) {
			this.diskCategory = diskCategory;
		}

		public String getDiskType() {
			return this.diskType;
		}

		public void setDiskType(String diskType) {
			this.diskType = diskType;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public List<DiskCountModel3> getDiskCountModelsL2() {
			return this.diskCountModelsL2;
		}

		public void setDiskCountModelsL2(List<DiskCountModel3> diskCountModelsL2) {
			this.diskCountModelsL2 = diskCountModelsL2;
		}

		public static class DiskCountModel3 {

			private Integer diskSize;

			private String diskCategory;

			private String diskType;

			private String zoneId;

			private Integer count;

			private List<DiskCountModel4> diskCountModelsL3;

			public Integer getDiskSize() {
				return this.diskSize;
			}

			public void setDiskSize(Integer diskSize) {
				this.diskSize = diskSize;
			}

			public String getDiskCategory() {
				return this.diskCategory;
			}

			public void setDiskCategory(String diskCategory) {
				this.diskCategory = diskCategory;
			}

			public String getDiskType() {
				return this.diskType;
			}

			public void setDiskType(String diskType) {
				this.diskType = diskType;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public Integer getCount() {
				return this.count;
			}

			public void setCount(Integer count) {
				this.count = count;
			}

			public List<DiskCountModel4> getDiskCountModelsL3() {
				return this.diskCountModelsL3;
			}

			public void setDiskCountModelsL3(List<DiskCountModel4> diskCountModelsL3) {
				this.diskCountModelsL3 = diskCountModelsL3;
			}

			public static class DiskCountModel4 {

				private Integer diskSize;

				private String diskCategory;

				private String diskType;

				private String zoneId;

				private Integer count;

				public Integer getDiskSize() {
					return this.diskSize;
				}

				public void setDiskSize(Integer diskSize) {
					this.diskSize = diskSize;
				}

				public String getDiskCategory() {
					return this.diskCategory;
				}

				public void setDiskCategory(String diskCategory) {
					this.diskCategory = diskCategory;
				}

				public String getDiskType() {
					return this.diskType;
				}

				public void setDiskType(String diskType) {
					this.diskType = diskType;
				}

				public String getZoneId() {
					return this.zoneId;
				}

				public void setZoneId(String zoneId) {
					this.zoneId = zoneId;
				}

				public Integer getCount() {
					return this.count;
				}

				public void setCount(Integer count) {
					this.count = count;
				}
			}
		}
	}

	@Override
	public InnerQueryEcsCountByConditionResponse getInstance(UnmarshallerContext context) {
		return	InnerQueryEcsCountByConditionResponseUnmarshaller.unmarshall(this, context);
	}
}
