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
import com.aliyuncs.devops.transform.v20210625.ListMergeRequestFilesReadsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMergeRequestFilesReadsResponse extends AcsResponse {

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

		private String oldFilePath;

		private String newFilePath;

		private Boolean newFile;

		private String renamedFile;

		private String deletedFile;

		private List<Read_users> readUsers;

		public String getOldFilePath() {
			return this.oldFilePath;
		}

		public void setOldFilePath(String oldFilePath) {
			this.oldFilePath = oldFilePath;
		}

		public String getNewFilePath() {
			return this.newFilePath;
		}

		public void setNewFilePath(String newFilePath) {
			this.newFilePath = newFilePath;
		}

		public Boolean getNewFile() {
			return this.newFile;
		}

		public void setNewFile(Boolean newFile) {
			this.newFile = newFile;
		}

		public String getRenamedFile() {
			return this.renamedFile;
		}

		public void setRenamedFile(String renamedFile) {
			this.renamedFile = renamedFile;
		}

		public String getDeletedFile() {
			return this.deletedFile;
		}

		public void setDeletedFile(String deletedFile) {
			this.deletedFile = deletedFile;
		}

		public List<Read_users> getReadUsers() {
			return this.readUsers;
		}

		public void setReadUsers(List<Read_users> readUsers) {
			this.readUsers = readUsers;
		}

		public static class Read_users {

			private String aliyunPk;

			private String name;

			private String username;

			private String state;

			private String avatarUrl;

			private String email;

			public String getAliyunPk() {
				return this.aliyunPk;
			}

			public void setAliyunPk(String aliyunPk) {
				this.aliyunPk = aliyunPk;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getUsername() {
				return this.username;
			}

			public void setUsername(String username) {
				this.username = username;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getAvatarUrl() {
				return this.avatarUrl;
			}

			public void setAvatarUrl(String avatarUrl) {
				this.avatarUrl = avatarUrl;
			}

			public String getEmail() {
				return this.email;
			}

			public void setEmail(String email) {
				this.email = email;
			}
		}
	}

	@Override
	public ListMergeRequestFilesReadsResponse getInstance(UnmarshallerContext context) {
		return	ListMergeRequestFilesReadsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
