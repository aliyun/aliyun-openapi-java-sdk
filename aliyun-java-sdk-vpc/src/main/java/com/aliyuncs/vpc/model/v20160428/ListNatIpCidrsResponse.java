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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.ListNatIpCidrsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListNatIpCidrsResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private String totalCount;

	private String maxResults;

	private List<NatIpCidr> natIpCidrs;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(String maxResults) {
		this.maxResults = maxResults;
	}

	public List<NatIpCidr> getNatIpCidrs() {
		return this.natIpCidrs;
	}

	public void setNatIpCidrs(List<NatIpCidr> natIpCidrs) {
		this.natIpCidrs = natIpCidrs;
	}

	public static class NatIpCidr {

		private String creationTime;

		private String natIpCidrId;

		private Boolean isDefault;

		private String natIpCidrStatus;

		private String natIpCidrName;

		private String natIpCidr;

		private String natGatewayId;

		private String natIpCidrDescription;

		private String regionId;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getNatIpCidrId() {
			return this.natIpCidrId;
		}

		public void setNatIpCidrId(String natIpCidrId) {
			this.natIpCidrId = natIpCidrId;
		}

		public Boolean getIsDefault() {
			return this.isDefault;
		}

		public void setIsDefault(Boolean isDefault) {
			this.isDefault = isDefault;
		}

		public String getNatIpCidrStatus() {
			return this.natIpCidrStatus;
		}

		public void setNatIpCidrStatus(String natIpCidrStatus) {
			this.natIpCidrStatus = natIpCidrStatus;
		}

		public String getNatIpCidrName() {
			return this.natIpCidrName;
		}

		public void setNatIpCidrName(String natIpCidrName) {
			this.natIpCidrName = natIpCidrName;
		}

		public String getNatIpCidr() {
			return this.natIpCidr;
		}

		public void setNatIpCidr(String natIpCidr) {
			this.natIpCidr = natIpCidr;
		}

		public String getNatGatewayId() {
			return this.natGatewayId;
		}

		public void setNatGatewayId(String natGatewayId) {
			this.natGatewayId = natGatewayId;
		}

		public String getNatIpCidrDescription() {
			return this.natIpCidrDescription;
		}

		public void setNatIpCidrDescription(String natIpCidrDescription) {
			this.natIpCidrDescription = natIpCidrDescription;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
	}

	@Override
	public ListNatIpCidrsResponse getInstance(UnmarshallerContext context) {
		return	ListNatIpCidrsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
