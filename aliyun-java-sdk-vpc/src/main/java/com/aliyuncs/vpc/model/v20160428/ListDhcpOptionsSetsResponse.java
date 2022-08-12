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
import com.aliyuncs.vpc.transform.v20160428.ListDhcpOptionsSetsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDhcpOptionsSetsResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<DhcpOptionsSet> dhcpOptionsSets;

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

	public List<DhcpOptionsSet> getDhcpOptionsSets() {
		return this.dhcpOptionsSets;
	}

	public void setDhcpOptionsSets(List<DhcpOptionsSet> dhcpOptionsSets) {
		this.dhcpOptionsSets = dhcpOptionsSets;
	}

	public static class DhcpOptionsSet {

		private String dhcpOptionsSetDescription;

		private String status;

		private String dhcpOptionsSetId;

		private String dhcpOptionsSetName;

		private Integer associateVpcCount;

		private Long ownerId;

		private DhcpOptions dhcpOptions;

		public String getDhcpOptionsSetDescription() {
			return this.dhcpOptionsSetDescription;
		}

		public void setDhcpOptionsSetDescription(String dhcpOptionsSetDescription) {
			this.dhcpOptionsSetDescription = dhcpOptionsSetDescription;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDhcpOptionsSetId() {
			return this.dhcpOptionsSetId;
		}

		public void setDhcpOptionsSetId(String dhcpOptionsSetId) {
			this.dhcpOptionsSetId = dhcpOptionsSetId;
		}

		public String getDhcpOptionsSetName() {
			return this.dhcpOptionsSetName;
		}

		public void setDhcpOptionsSetName(String dhcpOptionsSetName) {
			this.dhcpOptionsSetName = dhcpOptionsSetName;
		}

		public Integer getAssociateVpcCount() {
			return this.associateVpcCount;
		}

		public void setAssociateVpcCount(Integer associateVpcCount) {
			this.associateVpcCount = associateVpcCount;
		}

		public Long getOwnerId() {
			return this.ownerId;
		}

		public void setOwnerId(Long ownerId) {
			this.ownerId = ownerId;
		}

		public DhcpOptions getDhcpOptions() {
			return this.dhcpOptions;
		}

		public void setDhcpOptions(DhcpOptions dhcpOptions) {
			this.dhcpOptions = dhcpOptions;
		}

		public static class DhcpOptions {

			private String domainNameServers;

			private String domainName;

			private String leaseTime;

			private String ipv6LeaseTime;

			public String getDomainNameServers() {
				return this.domainNameServers;
			}

			public void setDomainNameServers(String domainNameServers) {
				this.domainNameServers = domainNameServers;
			}

			public String getDomainName() {
				return this.domainName;
			}

			public void setDomainName(String domainName) {
				this.domainName = domainName;
			}

			public String getLeaseTime() {
				return this.leaseTime;
			}

			public void setLeaseTime(String leaseTime) {
				this.leaseTime = leaseTime;
			}

			public String getIpv6LeaseTime() {
				return this.ipv6LeaseTime;
			}

			public void setIpv6LeaseTime(String ipv6LeaseTime) {
				this.ipv6LeaseTime = ipv6LeaseTime;
			}
		}
	}

	@Override
	public ListDhcpOptionsSetsResponse getInstance(UnmarshallerContext context) {
		return	ListDhcpOptionsSetsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
