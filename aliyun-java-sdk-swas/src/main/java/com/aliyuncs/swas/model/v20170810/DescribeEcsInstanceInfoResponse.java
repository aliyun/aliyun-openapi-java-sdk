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

package com.aliyuncs.swas.model.v20170810;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.swas.transform.v20170810.DescribeEcsInstanceInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEcsInstanceInfoResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String instanceId;

		private String instanceName;

		private String innerIpAddress;

		private String publicIpAddress;

		private String status;

		private Long instanceOwnerId;

		private String originalInstanceId;

		private String originalVpcId;

		private String originalRegionId;

		private Long originalOwnerId;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getInnerIpAddress() {
			return this.innerIpAddress;
		}

		public void setInnerIpAddress(String innerIpAddress) {
			this.innerIpAddress = innerIpAddress;
		}

		public String getPublicIpAddress() {
			return this.publicIpAddress;
		}

		public void setPublicIpAddress(String publicIpAddress) {
			this.publicIpAddress = publicIpAddress;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getInstanceOwnerId() {
			return this.instanceOwnerId;
		}

		public void setInstanceOwnerId(Long instanceOwnerId) {
			this.instanceOwnerId = instanceOwnerId;
		}

		public String getOriginalInstanceId() {
			return this.originalInstanceId;
		}

		public void setOriginalInstanceId(String originalInstanceId) {
			this.originalInstanceId = originalInstanceId;
		}

		public String getOriginalVpcId() {
			return this.originalVpcId;
		}

		public void setOriginalVpcId(String originalVpcId) {
			this.originalVpcId = originalVpcId;
		}

		public String getOriginalRegionId() {
			return this.originalRegionId;
		}

		public void setOriginalRegionId(String originalRegionId) {
			this.originalRegionId = originalRegionId;
		}

		public Long getOriginalOwnerId() {
			return this.originalOwnerId;
		}

		public void setOriginalOwnerId(Long originalOwnerId) {
			this.originalOwnerId = originalOwnerId;
		}
	}

	@Override
	public DescribeEcsInstanceInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeEcsInstanceInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
