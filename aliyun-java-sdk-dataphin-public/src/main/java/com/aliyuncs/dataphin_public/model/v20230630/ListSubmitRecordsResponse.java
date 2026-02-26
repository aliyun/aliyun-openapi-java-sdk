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

package com.aliyuncs.dataphin_public.model.v20230630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.ListSubmitRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSubmitRecordsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private ListResult listResult;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ListResult getListResult() {
		return this.listResult;
	}

	public void setListResult(ListResult listResult) {
		this.listResult = listResult;
	}

	public static class ListResult {

		private Integer totalCount;

		private List<SubmitRecordInfo> data;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<SubmitRecordInfo> getData() {
			return this.data;
		}

		public void setData(List<SubmitRecordInfo> data) {
			this.data = data;
		}

		public static class SubmitRecordInfo {

			private Long id;

			private String projectId;

			private String submitter;

			private String submitterName;

			private String gmtCreate;

			private String gmtModify;

			private Integer changeType;

			private String objectType;

			private String objectName;

			private String objectId;

			private String nodeId;

			private String objectVersion;

			private String submitComment;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getProjectId() {
				return this.projectId;
			}

			public void setProjectId(String projectId) {
				this.projectId = projectId;
			}

			public String getSubmitter() {
				return this.submitter;
			}

			public void setSubmitter(String submitter) {
				this.submitter = submitter;
			}

			public String getSubmitterName() {
				return this.submitterName;
			}

			public void setSubmitterName(String submitterName) {
				this.submitterName = submitterName;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getGmtModify() {
				return this.gmtModify;
			}

			public void setGmtModify(String gmtModify) {
				this.gmtModify = gmtModify;
			}

			public Integer getChangeType() {
				return this.changeType;
			}

			public void setChangeType(Integer changeType) {
				this.changeType = changeType;
			}

			public String getObjectType() {
				return this.objectType;
			}

			public void setObjectType(String objectType) {
				this.objectType = objectType;
			}

			public String getObjectName() {
				return this.objectName;
			}

			public void setObjectName(String objectName) {
				this.objectName = objectName;
			}

			public String getObjectId() {
				return this.objectId;
			}

			public void setObjectId(String objectId) {
				this.objectId = objectId;
			}

			public String getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(String nodeId) {
				this.nodeId = nodeId;
			}

			public String getObjectVersion() {
				return this.objectVersion;
			}

			public void setObjectVersion(String objectVersion) {
				this.objectVersion = objectVersion;
			}

			public String getSubmitComment() {
				return this.submitComment;
			}

			public void setSubmitComment(String submitComment) {
				this.submitComment = submitComment;
			}
		}
	}

	@Override
	public ListSubmitRecordsResponse getInstance(UnmarshallerContext context) {
		return	ListSubmitRecordsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
