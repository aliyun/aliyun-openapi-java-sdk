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
import com.aliyuncs.devops.transform.v20210625.GetMergeRequestChangeTreeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMergeRequestChangeTreeResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorCode;

	private String errorMessage;

	private Result result;

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

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Long changedFilesCount;

		private Long totalAddLines;

		private Long totalDelLines;

		private List<ChangesetDTOS> changedFilesInfos;

		public Long getChangedFilesCount() {
			return this.changedFilesCount;
		}

		public void setChangedFilesCount(Long changedFilesCount) {
			this.changedFilesCount = changedFilesCount;
		}

		public Long getTotalAddLines() {
			return this.totalAddLines;
		}

		public void setTotalAddLines(Long totalAddLines) {
			this.totalAddLines = totalAddLines;
		}

		public Long getTotalDelLines() {
			return this.totalDelLines;
		}

		public void setTotalDelLines(Long totalDelLines) {
			this.totalDelLines = totalDelLines;
		}

		public List<ChangesetDTOS> getChangedFilesInfos() {
			return this.changedFilesInfos;
		}

		public void setChangedFilesInfos(List<ChangesetDTOS> changedFilesInfos) {
			this.changedFilesInfos = changedFilesInfos;
		}

		public static class ChangesetDTOS {

			private String newPath;

			private String oldPath;

			private Boolean newFile;

			private Boolean renamedFile;

			private Boolean deletedFile;

			private Boolean binaryFile;

			private Long addLines;

			private Long delLines;

			public String getNewPath() {
				return this.newPath;
			}

			public void setNewPath(String newPath) {
				this.newPath = newPath;
			}

			public String getOldPath() {
				return this.oldPath;
			}

			public void setOldPath(String oldPath) {
				this.oldPath = oldPath;
			}

			public Boolean getNewFile() {
				return this.newFile;
			}

			public void setNewFile(Boolean newFile) {
				this.newFile = newFile;
			}

			public Boolean getRenamedFile() {
				return this.renamedFile;
			}

			public void setRenamedFile(Boolean renamedFile) {
				this.renamedFile = renamedFile;
			}

			public Boolean getDeletedFile() {
				return this.deletedFile;
			}

			public void setDeletedFile(Boolean deletedFile) {
				this.deletedFile = deletedFile;
			}

			public Boolean getBinaryFile() {
				return this.binaryFile;
			}

			public void setBinaryFile(Boolean binaryFile) {
				this.binaryFile = binaryFile;
			}

			public Long getAddLines() {
				return this.addLines;
			}

			public void setAddLines(Long addLines) {
				this.addLines = addLines;
			}

			public Long getDelLines() {
				return this.delLines;
			}

			public void setDelLines(Long delLines) {
				this.delLines = delLines;
			}
		}
	}

	@Override
	public GetMergeRequestChangeTreeResponse getInstance(UnmarshallerContext context) {
		return	GetMergeRequestChangeTreeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
