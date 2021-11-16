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
import com.aliyuncs.elasticsearch.transform.v20170613.ListApmResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListApmResponse extends AcsResponse {

	private String requestId;

	private List<返回结果> result;

	private Headers headers;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<返回结果> getResult() {
		return this.result;
	}

	public void setResult(List<返回结果> result) {
		this.result = result;
	}

	public Headers getHeaders() {
		return this.headers;
	}

	public void setHeaders(Headers headers) {
		this.headers = headers;
	}

	public static class 返回结果 {

		private String createdAt;

		private Long deployedReplica;

		private String description;

		private String instanceId;

		private Long nodeAmount;

		private String outputES;

		private String outputESUserName;

		private String ownerId;

		private String paymentType;

		private String region;

		private Long replica;

		private String resourceSpec;

		private String status;

		private String version;

		private String vpcId;

		private String vsArea;

		private String vswitchId;

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public Long getDeployedReplica() {
			return this.deployedReplica;
		}

		public void setDeployedReplica(Long deployedReplica) {
			this.deployedReplica = deployedReplica;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getNodeAmount() {
			return this.nodeAmount;
		}

		public void setNodeAmount(Long nodeAmount) {
			this.nodeAmount = nodeAmount;
		}

		public String getOutputES() {
			return this.outputES;
		}

		public void setOutputES(String outputES) {
			this.outputES = outputES;
		}

		public String getOutputESUserName() {
			return this.outputESUserName;
		}

		public void setOutputESUserName(String outputESUserName) {
			this.outputESUserName = outputESUserName;
		}

		public String getOwnerId() {
			return this.ownerId;
		}

		public void setOwnerId(String ownerId) {
			this.ownerId = ownerId;
		}

		public String getPaymentType() {
			return this.paymentType;
		}

		public void setPaymentType(String paymentType) {
			this.paymentType = paymentType;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public Long getReplica() {
			return this.replica;
		}

		public void setReplica(Long replica) {
			this.replica = replica;
		}

		public String getResourceSpec() {
			return this.resourceSpec;
		}

		public void setResourceSpec(String resourceSpec) {
			this.resourceSpec = resourceSpec;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVsArea() {
			return this.vsArea;
		}

		public void setVsArea(String vsArea) {
			this.vsArea = vsArea;
		}

		public String getVswitchId() {
			return this.vswitchId;
		}

		public void setVswitchId(String vswitchId) {
			this.vswitchId = vswitchId;
		}
	}

	public static class Headers {

		private Long xTotalCount;

		public Long getXTotalCount() {
			return this.xTotalCount;
		}

		public void setXTotalCount(Long xTotalCount) {
			this.xTotalCount = xTotalCount;
		}
	}

	@Override
	public ListApmResponse getInstance(UnmarshallerContext context) {
		return	ListApmResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
