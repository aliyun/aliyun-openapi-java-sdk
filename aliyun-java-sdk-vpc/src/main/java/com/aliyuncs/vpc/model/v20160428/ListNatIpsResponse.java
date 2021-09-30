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
import com.aliyuncs.vpc.transform.v20160428.ListNatIpsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListNatIpsResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private String totalCount;

	private String maxResults;

	private List<NatIp> natIps;

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

	public List<NatIp> getNatIps() {
		return this.natIps;
	}

	public void setNatIps(List<NatIp> natIps) {
		this.natIps = natIps;
	}

	public static class NatIp {

		private Boolean isDefault;

		private String natIp;

		private String natIpCidr;

		private String natIpId;

		private String natIpDescription;

		private String natGatewayId;

		private String natIpName;

		private String natIpStatus;

		private String regionId;

		public Boolean getIsDefault() {
			return this.isDefault;
		}

		public void setIsDefault(Boolean isDefault) {
			this.isDefault = isDefault;
		}

		public String getNatIp() {
			return this.natIp;
		}

		public void setNatIp(String natIp) {
			this.natIp = natIp;
		}

		public String getNatIpCidr() {
			return this.natIpCidr;
		}

		public void setNatIpCidr(String natIpCidr) {
			this.natIpCidr = natIpCidr;
		}

		public String getNatIpId() {
			return this.natIpId;
		}

		public void setNatIpId(String natIpId) {
			this.natIpId = natIpId;
		}

		public String getNatIpDescription() {
			return this.natIpDescription;
		}

		public void setNatIpDescription(String natIpDescription) {
			this.natIpDescription = natIpDescription;
		}

		public String getNatGatewayId() {
			return this.natGatewayId;
		}

		public void setNatGatewayId(String natGatewayId) {
			this.natGatewayId = natGatewayId;
		}

		public String getNatIpName() {
			return this.natIpName;
		}

		public void setNatIpName(String natIpName) {
			this.natIpName = natIpName;
		}

		public String getNatIpStatus() {
			return this.natIpStatus;
		}

		public void setNatIpStatus(String natIpStatus) {
			this.natIpStatus = natIpStatus;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
	}

	@Override
	public ListNatIpsResponse getInstance(UnmarshallerContext context) {
		return	ListNatIpsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
