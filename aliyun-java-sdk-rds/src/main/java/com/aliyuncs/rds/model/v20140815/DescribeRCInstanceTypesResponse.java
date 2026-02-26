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
import com.aliyuncs.rds.transform.v20140815.DescribeRCInstanceTypesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRCInstanceTypesResponse extends AcsResponse {

	private String requestId;

	private InstanceTypes instanceTypes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public InstanceTypes getInstanceTypes() {
		return this.instanceTypes;
	}

	public void setInstanceTypes(InstanceTypes instanceTypes) {
		this.instanceTypes = instanceTypes;
	}

	public static class InstanceTypes {

		private List<InstanceTypeItem> instanceType;

		public List<InstanceTypeItem> getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(List<InstanceTypeItem> instanceType) {
			this.instanceType = instanceType;
		}

		public static class InstanceTypeItem {

			private Integer cpuCoreCount;

			private String instanceTypeFamily;

			private String instanceTypeId;

			private Integer memorySize;

			public Integer getCpuCoreCount() {
				return this.cpuCoreCount;
			}

			public void setCpuCoreCount(Integer cpuCoreCount) {
				this.cpuCoreCount = cpuCoreCount;
			}

			public String getInstanceTypeFamily() {
				return this.instanceTypeFamily;
			}

			public void setInstanceTypeFamily(String instanceTypeFamily) {
				this.instanceTypeFamily = instanceTypeFamily;
			}

			public String getInstanceTypeId() {
				return this.instanceTypeId;
			}

			public void setInstanceTypeId(String instanceTypeId) {
				this.instanceTypeId = instanceTypeId;
			}

			public Integer getMemorySize() {
				return this.memorySize;
			}

			public void setMemorySize(Integer memorySize) {
				this.memorySize = memorySize;
			}
		}
	}

	@Override
	public DescribeRCInstanceTypesResponse getInstance(UnmarshallerContext context) {
		return	DescribeRCInstanceTypesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
