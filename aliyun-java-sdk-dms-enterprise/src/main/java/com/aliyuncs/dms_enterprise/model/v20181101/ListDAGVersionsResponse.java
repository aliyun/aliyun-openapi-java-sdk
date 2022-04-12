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

package com.aliyuncs.dms_enterprise.model.v20181101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.ListDAGVersionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDAGVersionsResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private Integer totalCount;

	private List<DagVersion> dagVersionList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<DagVersion> getDagVersionList() {
		return this.dagVersionList;
	}

	public void setDagVersionList(List<DagVersion> dagVersionList) {
		this.dagVersionList = dagVersionList;
	}

	public static class DagVersion {

		private String dagName;

		private String dagOwnerId;

		private String dagOwnerNickName;

		private String versionComments;

		private Long versionId;

		private Long lastVersionId;

		public String getDagName() {
			return this.dagName;
		}

		public void setDagName(String dagName) {
			this.dagName = dagName;
		}

		public String getDagOwnerId() {
			return this.dagOwnerId;
		}

		public void setDagOwnerId(String dagOwnerId) {
			this.dagOwnerId = dagOwnerId;
		}

		public String getDagOwnerNickName() {
			return this.dagOwnerNickName;
		}

		public void setDagOwnerNickName(String dagOwnerNickName) {
			this.dagOwnerNickName = dagOwnerNickName;
		}

		public String getVersionComments() {
			return this.versionComments;
		}

		public void setVersionComments(String versionComments) {
			this.versionComments = versionComments;
		}

		public Long getVersionId() {
			return this.versionId;
		}

		public void setVersionId(Long versionId) {
			this.versionId = versionId;
		}

		public Long getLastVersionId() {
			return this.lastVersionId;
		}

		public void setLastVersionId(Long lastVersionId) {
			this.lastVersionId = lastVersionId;
		}
	}

	@Override
	public ListDAGVersionsResponse getInstance(UnmarshallerContext context) {
		return	ListDAGVersionsResponseUnmarshaller.unmarshall(this, context);
	}
}
