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

package com.aliyuncs.elasticsearch.model.v20170613;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.elasticsearch.transform.v20170613.CapacityPlanResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CapacityPlanResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String instanceCategory;

		private Boolean oversizedCluster;

		private List<ExtendConfigsItem> extendConfigs;

		private List<NodeConfigurationsItem> nodeConfigurations;

		public String getInstanceCategory() {
			return this.instanceCategory;
		}

		public void setInstanceCategory(String instanceCategory) {
			this.instanceCategory = instanceCategory;
		}

		public Boolean getOversizedCluster() {
			return this.oversizedCluster;
		}

		public void setOversizedCluster(Boolean oversizedCluster) {
			this.oversizedCluster = oversizedCluster;
		}

		public List<ExtendConfigsItem> getExtendConfigs() {
			return this.extendConfigs;
		}

		public void setExtendConfigs(List<ExtendConfigsItem> extendConfigs) {
			this.extendConfigs = extendConfigs;
		}

		public List<NodeConfigurationsItem> getNodeConfigurations() {
			return this.nodeConfigurations;
		}

		public void setNodeConfigurations(List<NodeConfigurationsItem> nodeConfigurations) {
			this.nodeConfigurations = nodeConfigurations;
		}

		public static class ExtendConfigsItem {

			private String configType;

			private Long disk;

			private String diskType;

			public String getConfigType() {
				return this.configType;
			}

			public void setConfigType(String configType) {
				this.configType = configType;
			}

			public Long getDisk() {
				return this.disk;
			}

			public void setDisk(Long disk) {
				this.disk = disk;
			}

			public String getDiskType() {
				return this.diskType;
			}

			public void setDiskType(String diskType) {
				this.diskType = diskType;
			}
		}

		public static class NodeConfigurationsItem {

			private Long amount;

			private Long cpu;

			private Long disk;

			private String diskType;

			private Long memory;

			private String nodeType;

			public Long getAmount() {
				return this.amount;
			}

			public void setAmount(Long amount) {
				this.amount = amount;
			}

			public Long getCpu() {
				return this.cpu;
			}

			public void setCpu(Long cpu) {
				this.cpu = cpu;
			}

			public Long getDisk() {
				return this.disk;
			}

			public void setDisk(Long disk) {
				this.disk = disk;
			}

			public String getDiskType() {
				return this.diskType;
			}

			public void setDiskType(String diskType) {
				this.diskType = diskType;
			}

			public Long getMemory() {
				return this.memory;
			}

			public void setMemory(Long memory) {
				this.memory = memory;
			}

			public String getNodeType() {
				return this.nodeType;
			}

			public void setNodeType(String nodeType) {
				this.nodeType = nodeType;
			}
		}
	}

	@Override
	public CapacityPlanResponse getInstance(UnmarshallerContext context) {
		return	CapacityPlanResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
