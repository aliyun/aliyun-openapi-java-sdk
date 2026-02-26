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

package com.aliyuncs.dbfs.model.v20200418;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dbfs.transform.v20200418.DescribeInstanceTypesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceTypesResponse extends AcsResponse {

	private String requestId;

	private List<InstanceTypesItem> instanceTypes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<InstanceTypesItem> getInstanceTypes() {
		return this.instanceTypes;
	}

	public void setInstanceTypes(List<InstanceTypesItem> instanceTypes) {
		this.instanceTypes = instanceTypes;
	}

	public static class InstanceTypesItem {

		private String instanceTypeId;

		private Float cpuCoreCount;

		private Float memorySize;

		private String instanceTypeDescription;

		public String getInstanceTypeId() {
			return this.instanceTypeId;
		}

		public void setInstanceTypeId(String instanceTypeId) {
			this.instanceTypeId = instanceTypeId;
		}

		public Float getCpuCoreCount() {
			return this.cpuCoreCount;
		}

		public void setCpuCoreCount(Float cpuCoreCount) {
			this.cpuCoreCount = cpuCoreCount;
		}

		public Float getMemorySize() {
			return this.memorySize;
		}

		public void setMemorySize(Float memorySize) {
			this.memorySize = memorySize;
		}

		public String getInstanceTypeDescription() {
			return this.instanceTypeDescription;
		}

		public void setInstanceTypeDescription(String instanceTypeDescription) {
			this.instanceTypeDescription = instanceTypeDescription;
		}
	}

	@Override
	public DescribeInstanceTypesResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceTypesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
