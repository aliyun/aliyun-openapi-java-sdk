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

package com.aliyuncs.green.model.v20170823;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.green.transform.v20170823.DescribeAuditContentResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAuditContentResponse extends AcsResponse {

	private String requestId;

	private Integer pageSize;

	private Integer currentPage;

	private Integer totalCount;

	private List<AuditContent> auditContentList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<AuditContent> getAuditContentList() {
		return this.auditContentList;
	}

	public void setAuditContentList(List<AuditContent> auditContentList) {
		this.auditContentList = auditContentList;
	}

	public static class AuditContent {

		private String taskId;

		private String dataId;

		private String bizType;

		private String content;

		private String url;

		private String newUrl;

		private String thumbnail;

		private String requestTime;

		private String scanFinishedTime;

		private Integer audit;

		private String auditResult;

		private String suggestion;

		private Long id;

		private List<Result> results;

		private List<FrameResult> frameResults;

		private List<String> auditIllegalReasons;

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getDataId() {
			return this.dataId;
		}

		public void setDataId(String dataId) {
			this.dataId = dataId;
		}

		public String getBizType() {
			return this.bizType;
		}

		public void setBizType(String bizType) {
			this.bizType = bizType;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getBizUrl() {
			return this.url;
		}

		public void setBizUrl(String url) {
			this.url = url;
		}

		/**
		 * @deprecated use getBizUrl instead of this.
		 */
		@Deprecated
		public String getUrl() {
			return this.url;
		}

		/**
		 * @deprecated use setBizUrl instead of this.
		 */
		@Deprecated
		public void setUrl(String url) {
			this.url = url;
		}

		public String getNewUrl() {
			return this.newUrl;
		}

		public void setNewUrl(String newUrl) {
			this.newUrl = newUrl;
		}

		public String getThumbnail() {
			return this.thumbnail;
		}

		public void setThumbnail(String thumbnail) {
			this.thumbnail = thumbnail;
		}

		public String getRequestTime() {
			return this.requestTime;
		}

		public void setRequestTime(String requestTime) {
			this.requestTime = requestTime;
		}

		public String getScanFinishedTime() {
			return this.scanFinishedTime;
		}

		public void setScanFinishedTime(String scanFinishedTime) {
			this.scanFinishedTime = scanFinishedTime;
		}

		public Integer getAudit() {
			return this.audit;
		}

		public void setAudit(Integer audit) {
			this.audit = audit;
		}

		public String getAuditResult() {
			return this.auditResult;
		}

		public void setAuditResult(String auditResult) {
			this.auditResult = auditResult;
		}

		public String getSuggestion() {
			return this.suggestion;
		}

		public void setSuggestion(String suggestion) {
			this.suggestion = suggestion;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public List<Result> getResults() {
			return this.results;
		}

		public void setResults(List<Result> results) {
			this.results = results;
		}

		public List<FrameResult> getFrameResults() {
			return this.frameResults;
		}

		public void setFrameResults(List<FrameResult> frameResults) {
			this.frameResults = frameResults;
		}

		public List<String> getAuditIllegalReasons() {
			return this.auditIllegalReasons;
		}

		public void setAuditIllegalReasons(List<String> auditIllegalReasons) {
			this.auditIllegalReasons = auditIllegalReasons;
		}

		public static class Result {

			private String suggestion;

			private String label;

			private String scene;

			public String getSuggestion() {
				return this.suggestion;
			}

			public void setSuggestion(String suggestion) {
				this.suggestion = suggestion;
			}

			public String getLabel() {
				return this.label;
			}

			public void setLabel(String label) {
				this.label = label;
			}

			public String getScene() {
				return this.scene;
			}

			public void setScene(String scene) {
				this.scene = scene;
			}
		}

		public static class FrameResult {

			private String url;

			private Integer offset;

			public String getBizUrl() {
				return this.url;
			}

			public void setBizUrl(String url) {
				this.url = url;
			}

			/**
			 * @deprecated use getBizUrl instead of this.
			 */
			@Deprecated
			public String getUrl() {
				return this.url;
			}

			/**
			 * @deprecated use setBizUrl instead of this.
			 */
			@Deprecated
			public void setUrl(String url) {
				this.url = url;
			}

			public Integer getOffset() {
				return this.offset;
			}

			public void setOffset(Integer offset) {
				this.offset = offset;
			}
		}
	}

	@Override
	public DescribeAuditContentResponse getInstance(UnmarshallerContext context) {
		return	DescribeAuditContentResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
