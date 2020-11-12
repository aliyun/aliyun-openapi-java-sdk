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

package com.aliyuncs.openanalytics_open.model.v20180619;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.openanalytics_open.transform.v20180619.DescribeVirtualClusterV2ResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVirtualClusterV2Response extends AcsResponse {

	private String requestId;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String name;

		private String type;

		private String status;

		private String creatorId;

		private String createTime;

		private Float maxCpu;

		private String chargeType;

		private String minCpu;

		private List<UserNetWorkConfigListItem> userNetWorkConfigList;

		private SparkEngineConfig sparkEngineConfig;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreatorId() {
			return this.creatorId;
		}

		public void setCreatorId(String creatorId) {
			this.creatorId = creatorId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Float getMaxCpu() {
			return this.maxCpu;
		}

		public void setMaxCpu(Float maxCpu) {
			this.maxCpu = maxCpu;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getMinCpu() {
			return this.minCpu;
		}

		public void setMinCpu(String minCpu) {
			this.minCpu = minCpu;
		}

		public List<UserNetWorkConfigListItem> getUserNetWorkConfigList() {
			return this.userNetWorkConfigList;
		}

		public void setUserNetWorkConfigList(List<UserNetWorkConfigListItem> userNetWorkConfigList) {
			this.userNetWorkConfigList = userNetWorkConfigList;
		}

		public SparkEngineConfig getSparkEngineConfig() {
			return this.sparkEngineConfig;
		}

		public void setSparkEngineConfig(SparkEngineConfig sparkEngineConfig) {
			this.sparkEngineConfig = sparkEngineConfig;
		}

		public static class UserNetWorkConfigListItem {

			private String switchId;

			private String securityGroupId;

			private Long id;

			public String getSwitchId() {
				return this.switchId;
			}

			public void setSwitchId(String switchId) {
				this.switchId = switchId;
			}

			public String getSecurityGroupId() {
				return this.securityGroupId;
			}

			public void setSecurityGroupId(String securityGroupId) {
				this.securityGroupId = securityGroupId;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}
		}

		public static class SparkEngineConfig {

			private String sparkModuleReleaseName;

			private String defaultExecutorSpecName;

			private String defaultDriverSpecName;

			private Long defaultExecutorNumbers;

			private String sparkVersionDescription;

			public String getSparkModuleReleaseName() {
				return this.sparkModuleReleaseName;
			}

			public void setSparkModuleReleaseName(String sparkModuleReleaseName) {
				this.sparkModuleReleaseName = sparkModuleReleaseName;
			}

			public String getDefaultExecutorSpecName() {
				return this.defaultExecutorSpecName;
			}

			public void setDefaultExecutorSpecName(String defaultExecutorSpecName) {
				this.defaultExecutorSpecName = defaultExecutorSpecName;
			}

			public String getDefaultDriverSpecName() {
				return this.defaultDriverSpecName;
			}

			public void setDefaultDriverSpecName(String defaultDriverSpecName) {
				this.defaultDriverSpecName = defaultDriverSpecName;
			}

			public Long getDefaultExecutorNumbers() {
				return this.defaultExecutorNumbers;
			}

			public void setDefaultExecutorNumbers(Long defaultExecutorNumbers) {
				this.defaultExecutorNumbers = defaultExecutorNumbers;
			}

			public String getSparkVersionDescription() {
				return this.sparkVersionDescription;
			}

			public void setSparkVersionDescription(String sparkVersionDescription) {
				this.sparkVersionDescription = sparkVersionDescription;
			}
		}
	}

	@Override
	public DescribeVirtualClusterV2Response getInstance(UnmarshallerContext context) {
		return	DescribeVirtualClusterV2ResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
