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
import com.aliyuncs.vpc.transform.v20160428.GetVpcPrefixListAssociationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetVpcPrefixListAssociationsResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private Long totalCount;

	private Long count;

	private List<PrefixListAssociations> prefixListAssociation;

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

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getCount() {
		return this.count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public List<PrefixListAssociations> getPrefixListAssociation() {
		return this.prefixListAssociation;
	}

	public void setPrefixListAssociation(List<PrefixListAssociations> prefixListAssociation) {
		this.prefixListAssociation = prefixListAssociation;
	}

	public static class PrefixListAssociations {

		private String prefixListId;

		private String resourceId;

		private String resourceType;

		private String ownerId;

		private String status;

		private String reason;

		private String regionId;

		private String resourceUid;

		private String cidrList;

		public String getPrefixListId() {
			return this.prefixListId;
		}

		public void setPrefixListId(String prefixListId) {
			this.prefixListId = prefixListId;
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

		public String getOwnerId() {
			return this.ownerId;
		}

		public void setOwnerId(String ownerId) {
			this.ownerId = ownerId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getResourceUid() {
			return this.resourceUid;
		}

		public void setResourceUid(String resourceUid) {
			this.resourceUid = resourceUid;
		}

		public String getCidrList() {
			return this.cidrList;
		}

		public void setCidrList(String cidrList) {
			this.cidrList = cidrList;
		}
	}

	@Override
	public GetVpcPrefixListAssociationsResponse getInstance(UnmarshallerContext context) {
		return	GetVpcPrefixListAssociationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
