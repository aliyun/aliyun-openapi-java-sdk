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

package com.aliyuncs.domain.model.v20180129;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain.transform.v20180129.QueryDomainGroupListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDomainGroupListResponse extends AcsResponse {

	private String requestId;

	private List<DomainGroup> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DomainGroup> getData() {
		return this.data;
	}

	public void setData(List<DomainGroup> data) {
		this.data = data;
	}

	public static class DomainGroup {

		private String domainGroupId;

		private String domainGroupName;

		private Integer totalNumber;

		private String creationDate;

		private String modificationDate;

		private String domainGroupStatus;

		private Boolean beingDeleted;

		public String getDomainGroupId() {
			return this.domainGroupId;
		}

		public void setDomainGroupId(String domainGroupId) {
			this.domainGroupId = domainGroupId;
		}

		public String getDomainGroupName() {
			return this.domainGroupName;
		}

		public void setDomainGroupName(String domainGroupName) {
			this.domainGroupName = domainGroupName;
		}

		public Integer getTotalNumber() {
			return this.totalNumber;
		}

		public void setTotalNumber(Integer totalNumber) {
			this.totalNumber = totalNumber;
		}

		public String getCreationDate() {
			return this.creationDate;
		}

		public void setCreationDate(String creationDate) {
			this.creationDate = creationDate;
		}

		public String getModificationDate() {
			return this.modificationDate;
		}

		public void setModificationDate(String modificationDate) {
			this.modificationDate = modificationDate;
		}

		public String getDomainGroupStatus() {
			return this.domainGroupStatus;
		}

		public void setDomainGroupStatus(String domainGroupStatus) {
			this.domainGroupStatus = domainGroupStatus;
		}

		public Boolean getBeingDeleted() {
			return this.beingDeleted;
		}

		public void setBeingDeleted(Boolean beingDeleted) {
			this.beingDeleted = beingDeleted;
		}
	}

	@Override
	public QueryDomainGroupListResponse getInstance(UnmarshallerContext context) {
		return	QueryDomainGroupListResponseUnmarshaller.unmarshall(this, context);
	}
}
