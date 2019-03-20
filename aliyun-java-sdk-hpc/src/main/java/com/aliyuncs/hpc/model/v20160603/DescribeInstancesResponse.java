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

package com.aliyuncs.hpc.model.v20160603;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hpc.transform.v20160603.DescribeInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstancesResponse extends AcsResponse {

	private String requestId;

	private List<Instance> instances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Instance> getInstances() {
		return this.instances;
	}

	public void setInstances(List<Instance> instances) {
		this.instances = instances;
	}

	public static class Instance {

		private String instanceId;

		private String instanceType;

		private String packageId;

		private String status;

		private String innerIpAddress;

		private String jumpserverStatus;

		private String jumpserverInnerIpAddress;

		private String jumpServerPublicIpAddress;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getPackageId() {
			return this.packageId;
		}

		public void setPackageId(String packageId) {
			this.packageId = packageId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getInnerIpAddress() {
			return this.innerIpAddress;
		}

		public void setInnerIpAddress(String innerIpAddress) {
			this.innerIpAddress = innerIpAddress;
		}

		public String getJumpserverStatus() {
			return this.jumpserverStatus;
		}

		public void setJumpserverStatus(String jumpserverStatus) {
			this.jumpserverStatus = jumpserverStatus;
		}

		public String getJumpserverInnerIpAddress() {
			return this.jumpserverInnerIpAddress;
		}

		public void setJumpserverInnerIpAddress(String jumpserverInnerIpAddress) {
			this.jumpserverInnerIpAddress = jumpserverInnerIpAddress;
		}

		public String getJumpServerPublicIpAddress() {
			return this.jumpServerPublicIpAddress;
		}

		public void setJumpServerPublicIpAddress(String jumpServerPublicIpAddress) {
			this.jumpServerPublicIpAddress = jumpServerPublicIpAddress;
		}
	}

	@Override
	public DescribeInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
