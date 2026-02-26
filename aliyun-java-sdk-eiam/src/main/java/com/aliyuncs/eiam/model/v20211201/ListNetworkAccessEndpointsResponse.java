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

package com.aliyuncs.eiam.model.v20211201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eiam.transform.v20211201.ListNetworkAccessEndpointsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListNetworkAccessEndpointsResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private String nextToken;

	private List<NetworkAccessEndpoint> networkAccessEndpoints;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<NetworkAccessEndpoint> getNetworkAccessEndpoints() {
		return this.networkAccessEndpoints;
	}

	public void setNetworkAccessEndpoints(List<NetworkAccessEndpoint> networkAccessEndpoints) {
		this.networkAccessEndpoints = networkAccessEndpoints;
	}

	public static class NetworkAccessEndpoint {

		private String instanceId;

		private String networkAccessEndpointId;

		private String networkAccessEndpointName;

		private String vpcId;

		private String vpcRegionId;

		private String securityGroupId;

		private String status;

		private String networkAccessEndpointType;

		private Long createTime;

		private Long updateTime;

		private List<String> vSwitchIds;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getNetworkAccessEndpointId() {
			return this.networkAccessEndpointId;
		}

		public void setNetworkAccessEndpointId(String networkAccessEndpointId) {
			this.networkAccessEndpointId = networkAccessEndpointId;
		}

		public String getNetworkAccessEndpointName() {
			return this.networkAccessEndpointName;
		}

		public void setNetworkAccessEndpointName(String networkAccessEndpointName) {
			this.networkAccessEndpointName = networkAccessEndpointName;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVpcRegionId() {
			return this.vpcRegionId;
		}

		public void setVpcRegionId(String vpcRegionId) {
			this.vpcRegionId = vpcRegionId;
		}

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getNetworkAccessEndpointType() {
			return this.networkAccessEndpointType;
		}

		public void setNetworkAccessEndpointType(String networkAccessEndpointType) {
			this.networkAccessEndpointType = networkAccessEndpointType;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public List<String> getVSwitchIds() {
			return this.vSwitchIds;
		}

		public void setVSwitchIds(List<String> vSwitchIds) {
			this.vSwitchIds = vSwitchIds;
		}
	}

	@Override
	public ListNetworkAccessEndpointsResponse getInstance(UnmarshallerContext context) {
		return	ListNetworkAccessEndpointsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
