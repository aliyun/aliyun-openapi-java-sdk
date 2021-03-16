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
import com.aliyuncs.cccxspaceinner.transform.v20191227.QueryTicketResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTicketResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long pageSize;

		private Integer totalResults;

		private Integer currentPage;

		private List<ListItem> list;

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

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

		public List<ListItem> getList() {
			return this.list;
		}

		public void setList(List<ListItem> list) {
			this.list = list;
		}

		public static class ListItem {

			private Long id;

			private String questionInfo;

			private String caseStatus;

			private String srType;

			private String extAttrs;

			private Long gmtCreate;

			private Long gmtModified;

			private Long caseId;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
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

			public String getSrType() {
				return this.srType;
			}

			public void setSrType(String srType) {
				this.srType = srType;
			}

			public String getExtAttrs() {
				return this.extAttrs;
			}

			public void setExtAttrs(String extAttrs) {
				this.extAttrs = extAttrs;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Long getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(Long gmtModified) {
				this.gmtModified = gmtModified;
			}

			public Long getCaseId() {
				return this.caseId;
			}

			public void setCaseId(Long caseId) {
				this.caseId = caseId;
			}
		}
	}

	@Override
	public QueryTicketResponse getInstance(UnmarshallerContext context) {
		return	QueryTicketResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
