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

package com.aliyuncs.codeup.model.v20200414;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.codeup.transform.v20200414.ListMergeRequestCommentsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMergeRequestCommentsResponse extends AcsResponse {

	private String errorCode;

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private Long total;

	private List<ResultItem> result;

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

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private Integer closed;

		private String createdAt;

		private Long id;

		private Boolean isDraft;

		private Long line;

		private String note;

		private Boolean outDated;

		private Long parentNoteId;

		private String path;

		private Long projectId;

		private String rangeContext;

		private String side;

		private String updatedAt;

		private Author author;

		public Integer getClosed() {
			return this.closed;
		}

		public void setClosed(Integer closed) {
			this.closed = closed;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Boolean getIsDraft() {
			return this.isDraft;
		}

		public void setIsDraft(Boolean isDraft) {
			this.isDraft = isDraft;
		}

		public Long getLine() {
			return this.line;
		}

		public void setLine(Long line) {
			this.line = line;
		}

		public String getNote() {
			return this.note;
		}

		public void setNote(String note) {
			this.note = note;
		}

		public Boolean getOutDated() {
			return this.outDated;
		}

		public void setOutDated(Boolean outDated) {
			this.outDated = outDated;
		}

		public Long getParentNoteId() {
			return this.parentNoteId;
		}

		public void setParentNoteId(Long parentNoteId) {
			this.parentNoteId = parentNoteId;
		}

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public String getRangeContext() {
			return this.rangeContext;
		}

		public void setRangeContext(String rangeContext) {
			this.rangeContext = rangeContext;
		}

		public String getSide() {
			return this.side;
		}

		public void setSide(String side) {
			this.side = side;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public Author getAuthor() {
			return this.author;
		}

		public void setAuthor(Author author) {
			this.author = author;
		}

		public static class Author {

			private String avatarUrl;

			private String email;

			private String externUserId;

			private Long id;

			private String name;

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

			public String getExternUserId() {
				return this.externUserId;
			}

			public void setExternUserId(String externUserId) {
				this.externUserId = externUserId;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public ListMergeRequestCommentsResponse getInstance(UnmarshallerContext context) {
		return	ListMergeRequestCommentsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
