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

package com.aliyuncs.devops.model.v20210625;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops.transform.v20210625.ListMergeRequestPatchSetsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMergeRequestPatchSetsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorCode;

	private String errorMessage;

	private List<ResultItem> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private Long patchSetNo;

		private String patchSetBizId;

		private String patchSetName;

		private String commitId;

		private String shortCommitId;

		private String relatedMergeItemType;

		private String createdAt;

		public Long getPatchSetNo() {
			return this.patchSetNo;
		}

		public void setPatchSetNo(Long patchSetNo) {
			this.patchSetNo = patchSetNo;
		}

		public String getPatchSetBizId() {
			return this.patchSetBizId;
		}

		public void setPatchSetBizId(String patchSetBizId) {
			this.patchSetBizId = patchSetBizId;
		}

		public String getPatchSetName() {
			return this.patchSetName;
		}

		public void setPatchSetName(String patchSetName) {
			this.patchSetName = patchSetName;
		}

		public String getCommitId() {
			return this.commitId;
		}

		public void setCommitId(String commitId) {
			this.commitId = commitId;
		}

		public String getShortCommitId() {
			return this.shortCommitId;
		}

		public void setShortCommitId(String shortCommitId) {
			this.shortCommitId = shortCommitId;
		}

		public String getRelatedMergeItemType() {
			return this.relatedMergeItemType;
		}

		public void setRelatedMergeItemType(String relatedMergeItemType) {
			this.relatedMergeItemType = relatedMergeItemType;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}
	}

	@Override
	public ListMergeRequestPatchSetsResponse getInstance(UnmarshallerContext context) {
		return	ListMergeRequestPatchSetsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
