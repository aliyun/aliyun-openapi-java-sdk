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

package com.aliyuncs.cccxspaceinner.model.v20191227;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cccxspaceinner.transform.v20191227.PageQueryTicketResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PageQueryTicketResponse extends AcsResponse {

	private String message;

	private String code;

	private Boolean success;

	private Data data;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer totalResults;

		private Integer currentPage;

		private Long pageSize;

		private List<ListItem> list;

		public Integer getTotalResults() {
			return this.totalResults;
		}

		public void setTotalResults(Integer totalResults) {
			this.totalResults = totalResults;
		}

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public List<ListItem> getList() {
			return this.list;
		}

		public void setList(List<ListItem> list) {
			this.list = list;
		}

		public static class ListItem {

			private Long caseId;

			private Long gmtCreate;

			private String srType;

			private Long gmtModified;

			private String questionInfo;

			private String caseStatus;

			private String extAttrs;

			private Long id;

			public Long getCaseId() {
				return this.caseId;
			}

			public void setCaseId(Long caseId) {
				this.caseId = caseId;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getSrType() {
				return this.srType;
			}

			public void setSrType(String srType) {
				this.srType = srType;
			}

			public Long getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(Long gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getQuestionInfo() {
				return this.questionInfo;
			}

			public void setQuestionInfo(String questionInfo) {
				this.questionInfo = questionInfo;
			}

			public String getCaseStatus() {
				return this.caseStatus;
			}

			public void setCaseStatus(String caseStatus) {
				this.caseStatus = caseStatus;
			}

			public String getExtAttrs() {
				return this.extAttrs;
			}

			public void setExtAttrs(String extAttrs) {
				this.extAttrs = extAttrs;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}
		}
	}

	@Override
	public PageQueryTicketResponse getInstance(UnmarshallerContext context) {
		return	PageQueryTicketResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
