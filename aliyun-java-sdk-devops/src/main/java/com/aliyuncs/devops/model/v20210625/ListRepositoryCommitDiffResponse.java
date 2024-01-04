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
import com.aliyuncs.devops.transform.v20210625.ListRepositoryCommitDiffResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRepositoryCommitDiffResponse extends AcsResponse {

	private String errorMessage;

	private String requestId;

	private String errorCode;

	private Boolean success;

	private List<ResultItem> result;

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

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

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String oldId;

		private String newId;

		private Boolean isNewLfs;

		private Boolean isOldLfs;

		private String diff;

		private String newPath;

		private String oldPath;

		private String aMode;

		private String bMode;

		private Boolean newFile;

		private Boolean renamedFile;

		private Boolean deletedFile;

		private Boolean isBinary;

		public String getOldId() {
			return this.oldId;
		}

		public void setOldId(String oldId) {
			this.oldId = oldId;
		}

		public String getNewId() {
			return this.newId;
		}

		public void setNewId(String newId) {
			this.newId = newId;
		}

		public Boolean getIsNewLfs() {
			return this.isNewLfs;
		}

		public void setIsNewLfs(Boolean isNewLfs) {
			this.isNewLfs = isNewLfs;
		}

		public Boolean getIsOldLfs() {
			return this.isOldLfs;
		}

		public void setIsOldLfs(Boolean isOldLfs) {
			this.isOldLfs = isOldLfs;
		}

		public String getDiff() {
			return this.diff;
		}

		public void setDiff(String diff) {
			this.diff = diff;
		}

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

		public String getAMode() {
			return this.aMode;
		}

		public void setAMode(String aMode) {
			this.aMode = aMode;
		}

		public String getBMode() {
			return this.bMode;
		}

		public void setBMode(String bMode) {
			this.bMode = bMode;
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

		public Boolean getIsBinary() {
			return this.isBinary;
		}

		public void setIsBinary(Boolean isBinary) {
			this.isBinary = isBinary;
		}
	}

	@Override
	public ListRepositoryCommitDiffResponse getInstance(UnmarshallerContext context) {
		return	ListRepositoryCommitDiffResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
