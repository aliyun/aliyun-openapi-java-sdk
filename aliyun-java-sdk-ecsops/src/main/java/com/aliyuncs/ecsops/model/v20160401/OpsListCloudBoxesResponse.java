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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsListCloudBoxesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsListCloudBoxesResponse extends AcsResponse {

	private Integer totalCount;

	private String nextToken;

	private String requestId;

	private List<CloudBoxSet> cloudBoxSets;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CloudBoxSet> getCloudBoxSets() {
		return this.cloudBoxSets;
	}

	public void setCloudBoxSets(List<CloudBoxSet> cloudBoxSets) {
		this.cloudBoxSets = cloudBoxSets;
	}

	public static class CloudBoxSet {

		private String status;

		private String cloudBoxId;

		private String description;

		private String zoneId;

		private String cloudBoxSiteId;

		private String cloudBoxName;

		private List<String> businessStatus;

		private CloudBoxCapacity cloudBoxCapacity;

		private LifecycleAttribute lifecycleAttribute;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCloudBoxId() {
			return this.cloudBoxId;
		}

		public void setCloudBoxId(String cloudBoxId) {
			this.cloudBoxId = cloudBoxId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getCloudBoxSiteId() {
			return this.cloudBoxSiteId;
		}

		public void setCloudBoxSiteId(String cloudBoxSiteId) {
			this.cloudBoxSiteId = cloudBoxSiteId;
		}

		public String getCloudBoxName() {
			return this.cloudBoxName;
		}

		public void setCloudBoxName(String cloudBoxName) {
			this.cloudBoxName = cloudBoxName;
		}

		public List<String> getBusinessStatus() {
			return this.businessStatus;
		}

		public void setBusinessStatus(List<String> businessStatus) {
			this.businessStatus = businessStatus;
		}

		public CloudBoxCapacity getCloudBoxCapacity() {
			return this.cloudBoxCapacity;
		}

		public void setCloudBoxCapacity(CloudBoxCapacity cloudBoxCapacity) {
			this.cloudBoxCapacity = cloudBoxCapacity;
		}

		public LifecycleAttribute getLifecycleAttribute() {
			return this.lifecycleAttribute;
		}

		public void setLifecycleAttribute(LifecycleAttribute lifecycleAttribute) {
			this.lifecycleAttribute = lifecycleAttribute;
		}

		public static class CloudBoxCapacity {

			private Float blockStorageCapacity;

			private List<EcsCapacitySet> ecsCapacitySets;

			public Float getBlockStorageCapacity() {
				return this.blockStorageCapacity;
			}

			public void setBlockStorageCapacity(Float blockStorageCapacity) {
				this.blockStorageCapacity = blockStorageCapacity;
			}

			public List<EcsCapacitySet> getEcsCapacitySets() {
				return this.ecsCapacitySets;
			}

			public void setEcsCapacitySets(List<EcsCapacitySet> ecsCapacitySets) {
				this.ecsCapacitySets = ecsCapacitySets;
			}

			public static class EcsCapacitySet {

				private Integer instanceTypeCount;

				private String instanceTypeName;

				private String instanceTypeFamily;

				public Integer getInstanceTypeCount() {
					return this.instanceTypeCount;
				}

				public void setInstanceTypeCount(Integer instanceTypeCount) {
					this.instanceTypeCount = instanceTypeCount;
				}

				public String getInstanceTypeName() {
					return this.instanceTypeName;
				}

				public void setInstanceTypeName(String instanceTypeName) {
					this.instanceTypeName = instanceTypeName;
				}

				public String getInstanceTypeFamily() {
					return this.instanceTypeFamily;
				}

				public void setInstanceTypeFamily(String instanceTypeFamily) {
					this.instanceTypeFamily = instanceTypeFamily;
				}
			}
		}

		public static class LifecycleAttribute {

			private String expiredTime;

			private String startServiceTime;

			public String getExpiredTime() {
				return this.expiredTime;
			}

			public void setExpiredTime(String expiredTime) {
				this.expiredTime = expiredTime;
			}

			public String getStartServiceTime() {
				return this.startServiceTime;
			}

			public void setStartServiceTime(String startServiceTime) {
				this.startServiceTime = startServiceTime;
			}
		}
	}

	@Override
	public OpsListCloudBoxesResponse getInstance(UnmarshallerContext context) {
		return	OpsListCloudBoxesResponseUnmarshaller.unmarshall(this, context);
	}
}
