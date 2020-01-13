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
import com.aliyuncs.rds.transform.v20140815.DescribeDBInstancesOverviewResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstancesOverviewResponse extends AcsResponse {

	private String requestId;

	private List<RegionModel> regions;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RegionModel> getRegions() {
		return this.regions;
	}

	public void setRegions(List<RegionModel> regions) {
		this.regions = regions;
	}

	public static class RegionModel {

		private String region;

		private String engineCount;

		private Integer totalCount;

		private List<TypeModel> typeModels;

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getEngineCount() {
			return this.engineCount;
		}

		public void setEngineCount(String engineCount) {
			this.engineCount = engineCount;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<TypeModel> getTypeModels() {
			return this.typeModels;
		}

		public void setTypeModels(List<TypeModel> typeModels) {
			this.typeModels = typeModels;
		}

		public static class TypeModel {

			private String instanceDateType;

			private Integer count;

			private List<InstanceModel> instanceModels;

			public String getInstanceDateType() {
				return this.instanceDateType;
			}

			public void setInstanceDateType(String instanceDateType) {
				this.instanceDateType = instanceDateType;
			}

			public Integer getCount() {
				return this.count;
			}

			public void setCount(Integer count) {
				this.count = count;
			}

			public List<InstanceModel> getInstanceModels() {
				return this.instanceModels;
			}

			public void setInstanceModels(List<InstanceModel> instanceModels) {
				this.instanceModels = instanceModels;
			}

			public static class InstanceModel {

				private String dBInstanceId;

				private String region;

				private String zoneId;

				private String engine;

				private String payType;

				private String createdTime;

				private String expireTime;

				private String lockMode;

				private String dBInstanceStatus;

				public String getDBInstanceId() {
					return this.dBInstanceId;
				}

				public void setDBInstanceId(String dBInstanceId) {
					this.dBInstanceId = dBInstanceId;
				}

				public String getRegion() {
					return this.region;
				}

				public void setRegion(String region) {
					this.region = region;
				}

				public String getZoneId() {
					return this.zoneId;
				}

				public void setZoneId(String zoneId) {
					this.zoneId = zoneId;
				}

				public String getEngine() {
					return this.engine;
				}

				public void setEngine(String engine) {
					this.engine = engine;
				}

				public String getPayType() {
					return this.payType;
				}

				public void setPayType(String payType) {
					this.payType = payType;
				}

				public String getCreatedTime() {
					return this.createdTime;
				}

				public void setCreatedTime(String createdTime) {
					this.createdTime = createdTime;
				}

				public String getExpireTime() {
					return this.expireTime;
				}

				public void setExpireTime(String expireTime) {
					this.expireTime = expireTime;
				}

				public String getLockMode() {
					return this.lockMode;
				}

				public void setLockMode(String lockMode) {
					this.lockMode = lockMode;
				}

				public String getDBInstanceStatus() {
					return this.dBInstanceStatus;
				}

				public void setDBInstanceStatus(String dBInstanceStatus) {
					this.dBInstanceStatus = dBInstanceStatus;
				}
			}
		}
	}

	@Override
	public DescribeDBInstancesOverviewResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstancesOverviewResponseUnmarshaller.unmarshall(this, context);
	}
}
