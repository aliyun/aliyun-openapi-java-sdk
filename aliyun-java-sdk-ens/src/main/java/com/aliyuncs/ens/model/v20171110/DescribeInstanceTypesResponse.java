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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.DescribeInstanceTypesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceTypesResponse extends AcsResponse {

	private Integer code;

	private String requestId;

	private List<InstanceType> instanceTypes;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<InstanceType> getInstanceTypes() {
		return this.instanceTypes;
	}

	public void setInstanceTypes(List<InstanceType> instanceTypes) {
		this.instanceTypes = instanceTypes;
	}

	public static class InstanceType {

		private Integer cpuCoreCount;

		private String instanceTypeId;

		private String instanceTypeName;

		private Integer memorySize;

		public Integer getCpuCoreCount() {
			return this.cpuCoreCount;
		}

		public void setCpuCoreCount(Integer cpuCoreCount) {
			this.cpuCoreCount = cpuCoreCount;
		}

		public String getInstanceTypeId() {
			return this.instanceTypeId;
		}

		public void setInstanceTypeId(String instanceTypeId) {
			this.instanceTypeId = instanceTypeId;
		}

		public String getInstanceTypeName() {
			return this.instanceTypeName;
		}

		public void setInstanceTypeName(String instanceTypeName) {
			this.instanceTypeName = instanceTypeName;
		}

		public Integer getMemorySize() {
			return this.memorySize;
		}

		public void setMemorySize(Integer memorySize) {
			this.memorySize = memorySize;
		}
	}

	@Override
	public DescribeInstanceTypesResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceTypesResponseUnmarshaller.unmarshall(this, context);
	}
}
