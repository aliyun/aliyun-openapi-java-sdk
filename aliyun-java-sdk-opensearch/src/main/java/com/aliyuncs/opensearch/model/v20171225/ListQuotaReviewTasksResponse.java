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

package com.aliyuncs.opensearch.model.v20171225;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.opensearch.transform.v20171225.ListQuotaReviewTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListQuotaReviewTasksResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<ResultItem> result;

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

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private Integer id;

		private Integer appGroupId;

		private String appGroupName;

		private String appGroupType;

		private String oldSpec;

		private Integer oldComputeResource;

		private Integer oldDocSize;

		private String newSpec;

		private Integer newComputeResource;

		private Integer newSocSize;

		private String memo;

		private Boolean available;

		private Boolean pending;

		private Boolean approved;

		private String gmtCreate;

		private String gmtModified;

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Integer getAppGroupId() {
			return this.appGroupId;
		}

		public void setAppGroupId(Integer appGroupId) {
			this.appGroupId = appGroupId;
		}

		public String getAppGroupName() {
			return this.appGroupName;
		}

		public void setAppGroupName(String appGroupName) {
			this.appGroupName = appGroupName;
		}

		public String getAppGroupType() {
			return this.appGroupType;
		}

		public void setAppGroupType(String appGroupType) {
			this.appGroupType = appGroupType;
		}

		public String getOldSpec() {
			return this.oldSpec;
		}

		public void setOldSpec(String oldSpec) {
			this.oldSpec = oldSpec;
		}

		public Integer getOldComputeResource() {
			return this.oldComputeResource;
		}

		public void setOldComputeResource(Integer oldComputeResource) {
			this.oldComputeResource = oldComputeResource;
		}

		public Integer getOldDocSize() {
			return this.oldDocSize;
		}

		public void setOldDocSize(Integer oldDocSize) {
			this.oldDocSize = oldDocSize;
		}

		public String getNewSpec() {
			return this.newSpec;
		}

		public void setNewSpec(String newSpec) {
			this.newSpec = newSpec;
		}

		public Integer getNewComputeResource() {
			return this.newComputeResource;
		}

		public void setNewComputeResource(Integer newComputeResource) {
			this.newComputeResource = newComputeResource;
		}

		public Integer getNewSocSize() {
			return this.newSocSize;
		}

		public void setNewSocSize(Integer newSocSize) {
			this.newSocSize = newSocSize;
		}

		public String getMemo() {
			return this.memo;
		}

		public void setMemo(String memo) {
			this.memo = memo;
		}

		public Boolean getAvailable() {
			return this.available;
		}

		public void setAvailable(Boolean available) {
			this.available = available;
		}

		public Boolean getPending() {
			return this.pending;
		}

		public void setPending(Boolean pending) {
			this.pending = pending;
		}

		public Boolean getApproved() {
			return this.approved;
		}

		public void setApproved(Boolean approved) {
			this.approved = approved;
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
	}

	@Override
	public ListQuotaReviewTasksResponse getInstance(UnmarshallerContext context) {
		return	ListQuotaReviewTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
