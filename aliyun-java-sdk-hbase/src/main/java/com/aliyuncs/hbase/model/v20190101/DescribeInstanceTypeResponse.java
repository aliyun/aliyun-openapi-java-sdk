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

package com.aliyuncs.hbase.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbase.transform.v20190101.DescribeInstanceTypeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceTypeResponse extends AcsResponse {

	private String requestId;

	private List<InstanceTypeSpec> instanceTypeSpecList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<InstanceTypeSpec> getInstanceTypeSpecList() {
		return this.instanceTypeSpecList;
	}

	public void setInstanceTypeSpecList(List<InstanceTypeSpec> instanceTypeSpecList) {
		this.instanceTypeSpecList = instanceTypeSpecList;
	}

	public static class InstanceTypeSpec {

		private String instanceType;

		private Long cpuSize;

		private Long memSize;

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public Long getCpuSize() {
			return this.cpuSize;
		}

		public void setCpuSize(Long cpuSize) {
			this.cpuSize = cpuSize;
		}

		public Long getMemSize() {
			return this.memSize;
		}

		public void setMemSize(Long memSize) {
			this.memSize = memSize;
		}
	}

	@Override
	public DescribeInstanceTypeResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceTypeResponseUnmarshaller.unmarshall(this, context);
	}
}
