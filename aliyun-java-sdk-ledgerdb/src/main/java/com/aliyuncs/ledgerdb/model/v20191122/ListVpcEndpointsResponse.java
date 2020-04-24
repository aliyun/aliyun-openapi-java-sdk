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

package com.aliyuncs.ledgerdb.model.v20191122;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ledgerdb.transform.v20191122.ListVpcEndpointsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListVpcEndpointsResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private Integer maxResults;

	private List<VpcEndpoint> vpcEndpoints;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<VpcEndpoint> getVpcEndpoints() {
		return this.vpcEndpoints;
	}

	public void setVpcEndpoints(List<VpcEndpoint> vpcEndpoints) {
		this.vpcEndpoints = vpcEndpoints;
	}

	public static class VpcEndpoint {

		private String vpcEndpointId;

		private String ledgerId;

		private String memberId;

		private String regionId;

		private String vpcId;

		private String vSwitchId;

		private String address;

		private Long createTime;

		private String status;

		public String getVpcEndpointId() {
			return this.vpcEndpointId;
		}

		public void setVpcEndpointId(String vpcEndpointId) {
			this.vpcEndpointId = vpcEndpointId;
		}

		public String getLedgerId() {
			return this.ledgerId;
		}

		public void setLedgerId(String ledgerId) {
			this.ledgerId = ledgerId;
		}

		public String getMemberId() {
			return this.memberId;
		}

		public void setMemberId(String memberId) {
			this.memberId = memberId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public ListVpcEndpointsResponse getInstance(UnmarshallerContext context) {
		return	ListVpcEndpointsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
