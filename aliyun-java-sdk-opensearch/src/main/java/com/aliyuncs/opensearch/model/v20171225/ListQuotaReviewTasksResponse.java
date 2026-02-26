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

	private Integer totalCount;

	private String requestId;

	private List<ResultItem> result;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private Integer oldDocSize;

		private Boolean pending;

		private String memo;

		private Boolean approved;

		private String oldSpec;

		private Integer oldComputeResource;

		private String appGroupType;

		private Boolean available;

		private String gmtCreate;

		private Integer newSocSize;

		private Integer id;

		private Integer appGroupId;

		private Integer newComputeResource;

		private String appGroupName;

		private String gmtModified;

		private String newSpec;

		public Integer getOldDocSize() {
			return this.oldDocSize;
		}

		public void setOldDocSize(Integer oldDocSize) {
			this.oldDocSize = oldDocSize;
		}

		public Boolean getPending() {
			return this.pending;
		}

		public void setPending(Boolean pending) {
			this.pending = pending;
		}

		public String getMemo() {
			return this.memo;
		}

		public void setMemo(String memo) {
			this.memo = memo;
		}

		public Boolean getApproved() {
			return this.approved;
		}

		public void setApproved(Boolean approved) {
			this.approved = approved;
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

		public String getAppGroupType() {
			return this.appGroupType;
		}

		public void setAppGroupType(String appGroupType) {
			this.appGroupType = appGroupType;
		}

		public Boolean getAvailable() {
			return this.available;
		}

		public void setAvailable(Boolean available) {
			this.available = available;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Integer getNewSocSize() {
			return this.newSocSize;
		}

		public void setNewSocSize(Integer newSocSize) {
			this.newSocSize = newSocSize;
		}

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

		public Integer getNewComputeResource() {
			return this.newComputeResource;
		}

		public void setNewComputeResource(Integer newComputeResource) {
			this.newComputeResource = newComputeResource;
		}

		public String getAppGroupName() {
			return this.appGroupName;
		}

		public void setAppGroupName(String appGroupName) {
			this.appGroupName = appGroupName;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getNewSpec() {
			return this.newSpec;
		}

		public void setNewSpec(String newSpec) {
			this.newSpec = newSpec;
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
