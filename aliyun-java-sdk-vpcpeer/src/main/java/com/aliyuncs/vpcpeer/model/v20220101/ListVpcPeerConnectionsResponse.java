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

package com.aliyuncs.vpcpeer.model.v20220101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpcpeer.transform.v20220101.ListVpcPeerConnectionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListVpcPeerConnectionsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer maxResults;

	private String nextToken;

	private List<VpcPeerConnectsItem> vpcPeerConnects;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<VpcPeerConnectsItem> getVpcPeerConnects() {
		return this.vpcPeerConnects;
	}

	public void setVpcPeerConnects(List<VpcPeerConnectsItem> vpcPeerConnects) {
		this.vpcPeerConnects = vpcPeerConnects;
	}

	public static class VpcPeerConnectsItem {

		private String instanceId;

		private String gmtCreate;

		private String gmtModified;

		private String name;

		private String description;

		private Long ownerId;

		private Long acceptingOwnerUid;

		private String regionId;

		private String acceptingRegionId;

		private Integer bandwidth;

		private String status;

		private String bizStatus;

		private String gmtExpired;

		private String resourceGroupId;

		private List<TagsItem> tags;

		private Vpc vpc;

		private AcceptingVpc acceptingVpc;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getOwnerId() {
			return this.ownerId;
		}

		public void setOwnerId(Long ownerId) {
			this.ownerId = ownerId;
		}

		public Long getAcceptingOwnerUid() {
			return this.acceptingOwnerUid;
		}

		public void setAcceptingOwnerUid(Long acceptingOwnerUid) {
			this.acceptingOwnerUid = acceptingOwnerUid;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getAcceptingRegionId() {
			return this.acceptingRegionId;
		}

		public void setAcceptingRegionId(String acceptingRegionId) {
			this.acceptingRegionId = acceptingRegionId;
		}

		public Integer getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Integer bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getBizStatus() {
			return this.bizStatus;
		}

		public void setBizStatus(String bizStatus) {
			this.bizStatus = bizStatus;
		}

		public String getGmtExpired() {
			return this.gmtExpired;
		}

		public void setGmtExpired(String gmtExpired) {
			this.gmtExpired = gmtExpired;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public List<TagsItem> getTags() {
			return this.tags;
		}

		public void setTags(List<TagsItem> tags) {
			this.tags = tags;
		}

		public Vpc getVpc() {
			return this.vpc;
		}

		public void setVpc(Vpc vpc) {
			this.vpc = vpc;
		}

		public AcceptingVpc getAcceptingVpc() {
			return this.acceptingVpc;
		}

		public void setAcceptingVpc(AcceptingVpc acceptingVpc) {
			this.acceptingVpc = acceptingVpc;
		}

		public static class TagsItem {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class Vpc {

			private String vpcId;

			private List<String> ipv4Cidrs;

			private List<String> ipv6Cidrs;

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public List<String> getIpv4Cidrs() {
				return this.ipv4Cidrs;
			}

			public void setIpv4Cidrs(List<String> ipv4Cidrs) {
				this.ipv4Cidrs = ipv4Cidrs;
			}

			public List<String> getIpv6Cidrs() {
				return this.ipv6Cidrs;
			}

			public void setIpv6Cidrs(List<String> ipv6Cidrs) {
				this.ipv6Cidrs = ipv6Cidrs;
			}
		}

		public static class AcceptingVpc {

			private String vpcId;

			private List<String> ipv4Cidrs1;

			private List<String> ipv6Cidrs2;

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public List<String> getIpv4Cidrs1() {
				return this.ipv4Cidrs1;
			}

			public void setIpv4Cidrs1(List<String> ipv4Cidrs1) {
				this.ipv4Cidrs1 = ipv4Cidrs1;
			}

			public List<String> getIpv6Cidrs2() {
				return this.ipv6Cidrs2;
			}

			public void setIpv6Cidrs2(List<String> ipv6Cidrs2) {
				this.ipv6Cidrs2 = ipv6Cidrs2;
			}
		}
	}

	@Override
	public ListVpcPeerConnectionsResponse getInstance(UnmarshallerContext context) {
		return	ListVpcPeerConnectionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
