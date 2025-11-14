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

package com.aliyuncs.mpaas.model.v20201028;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mpaas.transform.v20201028.ListMdsCubeTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMdsCubeTasksResponse extends AcsResponse {

	private String resultMessage;

	private String resultCode;

	private String requestId;

	private ResultContent resultContent;

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ResultContent getResultContent() {
		return this.resultContent;
	}

	public void setResultContent(ResultContent resultContent) {
		this.resultContent = resultContent;
	}

	public static class ResultContent {

		private String requestId;

		private Data data;

		public String getRequestId() {
			return this.requestId;
		}

		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}

		public Data getData() {
			return this.data;
		}

		public void setData(Data data) {
			this.data = data;
		}

		public static class Data {

			private String requestId;

			private String errorCode;

			private Boolean success;

			private String resultMsg;

			private List<ContentItem> content;

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

			public Boolean getSuccess() {
				return this.success;
			}

			public void setSuccess(Boolean success) {
				this.success = success;
			}

			public String getResultMsg() {
				return this.resultMsg;
			}

			public void setResultMsg(String resultMsg) {
				this.resultMsg = resultMsg;
			}

			public List<ContentItem> getContent() {
				return this.content;
			}

			public void setContent(List<ContentItem> content) {
				this.content = content;
			}

			public static class ContentItem {

				private Integer publishMode;

				private String appCode;

				private String resourceVersion;

				private Integer greyNum;

				private String greyConfigInfo;

				private String gmtModified;

				private String greyEndtimeData;

				private Integer publishType;

				private Integer taskStatus;

				private String whitelistIds;

				private String gmtCreate;

				private String taskDesc;

				private String operator;

				private Long templateResourceId;

				private String templateId;

				private Long id;

				public Integer getPublishMode() {
					return this.publishMode;
				}

				public void setPublishMode(Integer publishMode) {
					this.publishMode = publishMode;
				}

				public String getAppCode() {
					return this.appCode;
				}

				public void setAppCode(String appCode) {
					this.appCode = appCode;
				}

				public String getResourceVersion() {
					return this.resourceVersion;
				}

				public void setResourceVersion(String resourceVersion) {
					this.resourceVersion = resourceVersion;
				}

				public Integer getGreyNum() {
					return this.greyNum;
				}

				public void setGreyNum(Integer greyNum) {
					this.greyNum = greyNum;
				}

				public String getGreyConfigInfo() {
					return this.greyConfigInfo;
				}

				public void setGreyConfigInfo(String greyConfigInfo) {
					this.greyConfigInfo = greyConfigInfo;
				}

				public String getGmtModified() {
					return this.gmtModified;
				}

				public void setGmtModified(String gmtModified) {
					this.gmtModified = gmtModified;
				}

				public String getGreyEndtimeData() {
					return this.greyEndtimeData;
				}

				public void setGreyEndtimeData(String greyEndtimeData) {
					this.greyEndtimeData = greyEndtimeData;
				}

				public Integer getPublishType() {
					return this.publishType;
				}

				public void setPublishType(Integer publishType) {
					this.publishType = publishType;
				}

				public Integer getTaskStatus() {
					return this.taskStatus;
				}

				public void setTaskStatus(Integer taskStatus) {
					this.taskStatus = taskStatus;
				}

				public String getWhitelistIds() {
					return this.whitelistIds;
				}

				public void setWhitelistIds(String whitelistIds) {
					this.whitelistIds = whitelistIds;
				}

				public String getGmtCreate() {
					return this.gmtCreate;
				}

				public void setGmtCreate(String gmtCreate) {
					this.gmtCreate = gmtCreate;
				}

				public String getTaskDesc() {
					return this.taskDesc;
				}

				public void setTaskDesc(String taskDesc) {
					this.taskDesc = taskDesc;
				}

				public String getOperator() {
					return this.operator;
				}

				public void setOperator(String operator) {
					this.operator = operator;
				}

				public Long getTemplateResourceId() {
					return this.templateResourceId;
				}

				public void setTemplateResourceId(Long templateResourceId) {
					this.templateResourceId = templateResourceId;
				}

				public String getTemplateId() {
					return this.templateId;
				}

				public void setTemplateId(String templateId) {
					this.templateId = templateId;
				}

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}
			}
		}
	}

	@Override
	public ListMdsCubeTasksResponse getInstance(UnmarshallerContext context) {
		return	ListMdsCubeTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
