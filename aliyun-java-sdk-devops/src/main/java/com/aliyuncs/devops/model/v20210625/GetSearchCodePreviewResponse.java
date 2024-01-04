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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops.transform.v20210625.GetSearchCodePreviewResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSearchCodePreviewResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private Result result;

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

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String docId;

		private HighlightTextMap highlightTextMap;

		private Source source;

		public String getDocId() {
			return this.docId;
		}

		public void setDocId(String docId) {
			this.docId = docId;
		}

		public HighlightTextMap getHighlightTextMap() {
			return this.highlightTextMap;
		}

		public void setHighlightTextMap(HighlightTextMap highlightTextMap) {
			this.highlightTextMap = highlightTextMap;
		}

		public Source getSource() {
			return this.source;
		}

		public void setSource(Source source) {
			this.source = source;
		}

		public static class HighlightTextMap {

			private String organizationId;

			private String fileName;

			private String clob;

			public String getOrganizationId() {
				return this.organizationId;
			}

			public void setOrganizationId(String organizationId) {
				this.organizationId = organizationId;
			}

			public String getFileName() {
				return this.fileName;
			}

			public void setFileName(String fileName) {
				this.fileName = fileName;
			}

			public String getClob() {
				return this.clob;
			}

			public void setClob(String clob) {
				this.clob = clob;
			}
		}

		public static class Source {

			private String repoPath;

			private String fileName;

			private String filePath;

			private String language;

			private String checkinDate;

			private String branch;

			private String organizationId;

			public String getRepoPath() {
				return this.repoPath;
			}

			public void setRepoPath(String repoPath) {
				this.repoPath = repoPath;
			}

			public String getFileName() {
				return this.fileName;
			}

			public void setFileName(String fileName) {
				this.fileName = fileName;
			}

			public String getFilePath() {
				return this.filePath;
			}

			public void setFilePath(String filePath) {
				this.filePath = filePath;
			}

			public String getLanguage() {
				return this.language;
			}

			public void setLanguage(String language) {
				this.language = language;
			}

			public String getCheckinDate() {
				return this.checkinDate;
			}

			public void setCheckinDate(String checkinDate) {
				this.checkinDate = checkinDate;
			}

			public String getBranch() {
				return this.branch;
			}

			public void setBranch(String branch) {
				this.branch = branch;
			}

			public String getOrganizationId() {
				return this.organizationId;
			}

			public void setOrganizationId(String organizationId) {
				this.organizationId = organizationId;
			}
		}
	}

	@Override
	public GetSearchCodePreviewResponse getInstance(UnmarshallerContext context) {
		return	GetSearchCodePreviewResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
