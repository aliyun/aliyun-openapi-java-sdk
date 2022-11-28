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

package com.aliyuncs.cbn.model.v20170912;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cbn.transform.v20170912.ListTransitRouterCidrAllocationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTransitRouterCidrAllocationResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private Integer totalCount;

	private Integer maxResults;

	private List<TransitRouterCidrAllocation> transitRouterCidrAllocations;

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

	public List<TransitRouterCidrAllocation> getTransitRouterCidrAllocations() {
		return this.transitRouterCidrAllocations;
	}

	public void setTransitRouterCidrAllocations(List<TransitRouterCidrAllocation> transitRouterCidrAllocations) {
		this.transitRouterCidrAllocations = transitRouterCidrAllocations;
	}

	public static class TransitRouterCidrAllocation {

		private String transitRouterCidrId;

		private String allocatedCidrBlock;

		private String attachmentId;

		private String cidr;

		private String attachmentName;

		public String getTransitRouterCidrId() {
			return this.transitRouterCidrId;
		}

		public void setTransitRouterCidrId(String transitRouterCidrId) {
			this.transitRouterCidrId = transitRouterCidrId;
		}

		public String getAllocatedCidrBlock() {
			return this.allocatedCidrBlock;
		}

		public void setAllocatedCidrBlock(String allocatedCidrBlock) {
			this.allocatedCidrBlock = allocatedCidrBlock;
		}

		public String getAttachmentId() {
			return this.attachmentId;
		}

		public void setAttachmentId(String attachmentId) {
			this.attachmentId = attachmentId;
		}

		public String getCidr() {
			return this.cidr;
		}

		public void setCidr(String cidr) {
			this.cidr = cidr;
		}

		public String getAttachmentName() {
			return this.attachmentName;
		}

		public void setAttachmentName(String attachmentName) {
			this.attachmentName = attachmentName;
		}
	}

	@Override
	public ListTransitRouterCidrAllocationResponse getInstance(UnmarshallerContext context) {
		return	ListTransitRouterCidrAllocationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
