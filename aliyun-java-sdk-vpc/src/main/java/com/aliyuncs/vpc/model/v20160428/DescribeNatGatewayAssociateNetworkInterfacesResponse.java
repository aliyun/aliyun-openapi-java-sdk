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
import com.aliyuncs.vpc.transform.v20160428.DescribeNatGatewayAssociateNetworkInterfacesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNatGatewayAssociateNetworkInterfacesResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private Integer maxResults;

	private String natGatewayId;

	private Integer totalCount;

	private Integer count;

	private List<AssociateNetworkInterface> associateNetworkInterfaces;

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

	public String getNatGatewayId() {
		return this.natGatewayId;
	}

	public void setNatGatewayId(String natGatewayId) {
		this.natGatewayId = natGatewayId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<AssociateNetworkInterface> getAssociateNetworkInterfaces() {
		return this.associateNetworkInterfaces;
	}

	public void setAssociateNetworkInterfaces(List<AssociateNetworkInterface> associateNetworkInterfaces) {
		this.associateNetworkInterfaces = associateNetworkInterfaces;
	}

	public static class AssociateNetworkInterface {

		private String networkInterfaceId;

		private String resourceId;

		private String resourceType;

		private String resourceOwnerId;

		private String tunnelIndex;

		private String resourceVpcId;

		private List<IPv4Set> iPv4Sets;

		public String getNetworkInterfaceId() {
			return this.networkInterfaceId;
		}

		public void setNetworkInterfaceId(String networkInterfaceId) {
			this.networkInterfaceId = networkInterfaceId;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getResourceOwnerId() {
			return this.resourceOwnerId;
		}

		public void setResourceOwnerId(String resourceOwnerId) {
			this.resourceOwnerId = resourceOwnerId;
		}

		public String getTunnelIndex() {
			return this.tunnelIndex;
		}

		public void setTunnelIndex(String tunnelIndex) {
			this.tunnelIndex = tunnelIndex;
		}

		public String getResourceVpcId() {
			return this.resourceVpcId;
		}

		public void setResourceVpcId(String resourceVpcId) {
			this.resourceVpcId = resourceVpcId;
		}

		public List<IPv4Set> getIPv4Sets() {
			return this.iPv4Sets;
		}

		public void setIPv4Sets(List<IPv4Set> iPv4Sets) {
			this.iPv4Sets = iPv4Sets;
		}

		public static class IPv4Set {

			private String iPv4Address;

			private Boolean primary;

			public String getIPv4Address() {
				return this.iPv4Address;
			}

			public void setIPv4Address(String iPv4Address) {
				this.iPv4Address = iPv4Address;
			}

			public Boolean getPrimary() {
				return this.primary;
			}

			public void setPrimary(Boolean primary) {
				this.primary = primary;
			}
		}
	}

	@Override
	public DescribeNatGatewayAssociateNetworkInterfacesResponse getInstance(UnmarshallerContext context) {
		return	DescribeNatGatewayAssociateNetworkInterfacesResponseUnmarshaller.unmarshall(this, context);
	}
}
