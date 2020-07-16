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
import com.aliyuncs.openanalytics_open.transform.v20180619.DescribeVirtualClusterResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVirtualClusterResponse extends AcsResponse {

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

		private String sparkEngineModuleName;

		private String defaultExecutorSpecName;

		private String defaultDriverSpecName;

		private Long defaultExecutorNumbers;

		private String sparkVersionDescription;

		private Float maxCpu;

		private Float maxMemory;

		private Float maxCpuLimit;

		private Float maxMemoryLimit;

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

		public String getSparkEngineModuleName() {
			return this.sparkEngineModuleName;
		}

		public void setSparkEngineModuleName(String sparkEngineModuleName) {
			this.sparkEngineModuleName = sparkEngineModuleName;
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

		public Float getMaxCpu() {
			return this.maxCpu;
		}

		public void setMaxCpu(Float maxCpu) {
			this.maxCpu = maxCpu;
		}

		public Float getMaxMemory() {
			return this.maxMemory;
		}

		public void setMaxMemory(Float maxMemory) {
			this.maxMemory = maxMemory;
		}

		public Float getMaxCpuLimit() {
			return this.maxCpuLimit;
		}

		public void setMaxCpuLimit(Float maxCpuLimit) {
			this.maxCpuLimit = maxCpuLimit;
		}

		public Float getMaxMemoryLimit() {
			return this.maxMemoryLimit;
		}

		public void setMaxMemoryLimit(Float maxMemoryLimit) {
			this.maxMemoryLimit = maxMemoryLimit;
		}
	}

	@Override
	public DescribeVirtualClusterResponse getInstance(UnmarshallerContext context) {
		return	DescribeVirtualClusterResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
