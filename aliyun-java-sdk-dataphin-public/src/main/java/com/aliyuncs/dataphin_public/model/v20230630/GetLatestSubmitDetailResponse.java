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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.GetLatestSubmitDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLatestSubmitDetailResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private SubmitDetailResult submitDetailResult;

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

	public SubmitDetailResult getSubmitDetailResult() {
		return this.submitDetailResult;
	}

	public void setSubmitDetailResult(SubmitDetailResult submitDetailResult) {
		this.submitDetailResult = submitDetailResult;
	}

	public static class SubmitDetailResult {

		private Long id;

		private String submitStatus;

		private String publishStatus;

		private String tag;

		private ReleaseObject releaseObject;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getSubmitStatus() {
			return this.submitStatus;
		}

		public void setSubmitStatus(String submitStatus) {
			this.submitStatus = submitStatus;
		}

		public String getPublishStatus() {
			return this.publishStatus;
		}

		public void setPublishStatus(String publishStatus) {
			this.publishStatus = publishStatus;
		}

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public ReleaseObject getReleaseObject() {
			return this.releaseObject;
		}

		public void setReleaseObject(ReleaseObject releaseObject) {
			this.releaseObject = releaseObject;
		}

		public static class ReleaseObject {

			private String objectVersion;

			private String changeType;

			private Long projectId;

			private String nodeId;

			private String submitComment;

			private SubmitObject submitObject;

			public String getObjectVersion() {
				return this.objectVersion;
			}

			public void setObjectVersion(String objectVersion) {
				this.objectVersion = objectVersion;
			}

			public String getChangeType() {
				return this.changeType;
			}

			public void setChangeType(String changeType) {
				this.changeType = changeType;
			}

			public Long getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Long projectId) {
				this.projectId = projectId;
			}

			public String getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(String nodeId) {
				this.nodeId = nodeId;
			}

			public String getSubmitComment() {
				return this.submitComment;
			}

			public void setSubmitComment(String submitComment) {
				this.submitComment = submitComment;
			}

			public SubmitObject getSubmitObject() {
				return this.submitObject;
			}

			public void setSubmitObject(SubmitObject submitObject) {
				this.submitObject = submitObject;
			}

			public static class SubmitObject {

				private String objectId;

				private String objectType;

				private String objectName;

				public String getObjectId() {
					return this.objectId;
				}

				public void setObjectId(String objectId) {
					this.objectId = objectId;
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
			}
		}
	}

	@Override
	public GetLatestSubmitDetailResponse getInstance(UnmarshallerContext context) {
		return	GetLatestSubmitDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
