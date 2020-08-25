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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String completedAt;

	private String conclusion;

	private String context;

	private String createdAt;

	private String detailUrl;

	private String externalId;

	private Long id;

	private Long responseStatusCode;

	private String startedAt;

	private String status;

	private Long suiteId;

	private String summary;

	private String title;

	private String updateAt;

	private List<AnnotationsItem> annotations;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getCompletedAt() {
		return this.completedAt;
	}

	public void setCompletedAt(String completedAt) {
		this.completedAt = completedAt;
	}

	public String getConclusion() {
		return this.conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getContext() {
		return this.context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}

	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public String getExternalId() {
		return this.externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public String getStartedAt() {
		return this.startedAt;
	}

	public void setStartedAt(String startedAt) {
		this.startedAt = startedAt;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getSuiteId() {
		return this.suiteId;
	}

	public void setSuiteId(Long suiteId) {
		this.suiteId = suiteId;
	}

	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUpdateAt() {
		return this.updateAt;
	}

	public void setUpdateAt(String updateAt) {
		this.updateAt = updateAt;
	}

	public List<AnnotationsItem> getAnnotations() {
		return this.annotations;
	}

	public void setAnnotations(List<AnnotationsItem> annotations) {
		this.annotations = annotations;
	}

	public static class AnnotationsItem {

		private Long checkRunId;

		private String details;

		private Long endCol;

		private Long endLine;

		private Long id;

		private String level;

		private String message;

		private String path;

		private Long startCol;

		private Long startLine;

		private String title;

		public Long getCheckRunId() {
			return this.checkRunId;
		}

		public void setCheckRunId(Long checkRunId) {
			this.checkRunId = checkRunId;
		}

		public String getDetails() {
			return this.details;
		}

		public void setDetails(String details) {
			this.details = details;
		}

		public Long getEndCol() {
			return this.endCol;
		}

		public void setEndCol(Long endCol) {
			this.endCol = endCol;
		}

		public Long getEndLine() {
			return this.endLine;
		}

		public void setEndLine(Long endLine) {
			this.endLine = endLine;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public Long getStartCol() {
			return this.startCol;
		}

		public void setStartCol(Long startCol) {
			this.startCol = startCol;
		}

		public Long getStartLine() {
			return this.startLine;
		}

		public void setStartLine(Long startLine) {
			this.startLine = startLine;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}
	}

	@Override
	public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponse getInstance(UnmarshallerContext context) {
		return	UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
