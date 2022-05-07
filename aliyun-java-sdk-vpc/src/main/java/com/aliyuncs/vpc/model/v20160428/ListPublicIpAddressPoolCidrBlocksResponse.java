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
import com.aliyuncs.vpc.transform.v20160428.ListPublicIpAddressPoolCidrBlocksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPublicIpAddressPoolCidrBlocksResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private Integer maxResults;

	private Integer totalCount;

	private List<PublicIpPoolCidrBlock> publicIpPoolCidrBlockList;

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

	public List<PublicIpPoolCidrBlock> getPublicIpPoolCidrBlockList() {
		return this.publicIpPoolCidrBlockList;
	}

	public void setPublicIpPoolCidrBlockList(List<PublicIpPoolCidrBlock> publicIpPoolCidrBlockList) {
		this.publicIpPoolCidrBlockList = publicIpPoolCidrBlockList;
	}

	public static class PublicIpPoolCidrBlock {

		private String publicIpAddressPoolId;

		private String cidrBlock;

		private String creationTime;

		private String status;

		private Integer usedIpNum;

		private Integer totalIpNum;

		public String getPublicIpAddressPoolId() {
			return this.publicIpAddressPoolId;
		}

		public void setPublicIpAddressPoolId(String publicIpAddressPoolId) {
			this.publicIpAddressPoolId = publicIpAddressPoolId;
		}

		public String getCidrBlock() {
			return this.cidrBlock;
		}

		public void setCidrBlock(String cidrBlock) {
			this.cidrBlock = cidrBlock;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getUsedIpNum() {
			return this.usedIpNum;
		}

		public void setUsedIpNum(Integer usedIpNum) {
			this.usedIpNum = usedIpNum;
		}

		public Integer getTotalIpNum() {
			return this.totalIpNum;
		}

		public void setTotalIpNum(Integer totalIpNum) {
			this.totalIpNum = totalIpNum;
		}
	}

	@Override
	public ListPublicIpAddressPoolCidrBlocksResponse getInstance(UnmarshallerContext context) {
		return	ListPublicIpAddressPoolCidrBlocksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
