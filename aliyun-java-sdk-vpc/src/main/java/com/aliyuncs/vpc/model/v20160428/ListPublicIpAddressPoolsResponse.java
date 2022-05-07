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
import com.aliyuncs.vpc.transform.v20160428.ListPublicIpAddressPoolsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPublicIpAddressPoolsResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private Integer maxResults;

	private Integer totalCount;

	private List<PublicIpAddressPool> publicIpAddressPoolList;

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<PublicIpAddressPool> getPublicIpAddressPoolList() {
		return this.publicIpAddressPoolList;
	}

	public void setPublicIpAddressPoolList(List<PublicIpAddressPool> publicIpAddressPoolList) {
		this.publicIpAddressPoolList = publicIpAddressPoolList;
	}

	public static class PublicIpAddressPool {

		private String publicIpAddressPoolId;

		private String regionId;

		private String creationTime;

		private String isp;

		private String name;

		private String status;

		private String description;

		private Integer totalIpNum;

		private Integer usedIpNum;

		private Boolean ipAddressRemaining;

		private Boolean userType;

		private List<PublicIpCidrBlock> publicIpCidrBlockList;

		public String getPublicIpAddressPoolId() {
			return this.publicIpAddressPoolId;
		}

		public void setPublicIpAddressPoolId(String publicIpAddressPoolId) {
			this.publicIpAddressPoolId = publicIpAddressPoolId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getIsp() {
			return this.isp;
		}

		public void setIsp(String isp) {
			this.isp = isp;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getTotalIpNum() {
			return this.totalIpNum;
		}

		public void setTotalIpNum(Integer totalIpNum) {
			this.totalIpNum = totalIpNum;
		}

		public Integer getUsedIpNum() {
			return this.usedIpNum;
		}

		public void setUsedIpNum(Integer usedIpNum) {
			this.usedIpNum = usedIpNum;
		}

		public Boolean getIpAddressRemaining() {
			return this.ipAddressRemaining;
		}

		public void setIpAddressRemaining(Boolean ipAddressRemaining) {
			this.ipAddressRemaining = ipAddressRemaining;
		}

		public Boolean getUserType() {
			return this.userType;
		}

		public void setUserType(Boolean userType) {
			this.userType = userType;
		}

		public List<PublicIpCidrBlock> getPublicIpCidrBlockList() {
			return this.publicIpCidrBlockList;
		}

		public void setPublicIpCidrBlockList(List<PublicIpCidrBlock> publicIpCidrBlockList) {
			this.publicIpCidrBlockList = publicIpCidrBlockList;
		}

		public static class PublicIpCidrBlock {

			private String cidrBlock;

			private String status;

			private Integer totalIpNum;

			private Integer usedIpNum;

			private String creationTime;

			public String getCidrBlock() {
				return this.cidrBlock;
			}

			public void setCidrBlock(String cidrBlock) {
				this.cidrBlock = cidrBlock;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Integer getTotalIpNum() {
				return this.totalIpNum;
			}

			public void setTotalIpNum(Integer totalIpNum) {
				this.totalIpNum = totalIpNum;
			}

			public Integer getUsedIpNum() {
				return this.usedIpNum;
			}

			public void setUsedIpNum(Integer usedIpNum) {
				this.usedIpNum = usedIpNum;
			}

			public String getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(String creationTime) {
				this.creationTime = creationTime;
			}
		}
	}

	@Override
	public ListPublicIpAddressPoolsResponse getInstance(UnmarshallerContext context) {
		return	ListPublicIpAddressPoolsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
