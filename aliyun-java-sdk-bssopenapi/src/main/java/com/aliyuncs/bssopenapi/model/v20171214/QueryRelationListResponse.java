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

package com.aliyuncs.bssopenapi.model.v20171214;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.bssopenapi.transform.v20171214.QueryRelationListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryRelationListResponse extends AcsResponse {

	private String code;

	private String requestId;

	private Boolean success;

	private String message;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

		private Integer pageNum;

		private Integer pageSize;

		private Integer totalCount;

		private List<FinancialRelationInfoListItem> financialRelationInfoList;

		public Integer getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Integer pageNum) {
			this.pageNum = pageNum;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<FinancialRelationInfoListItem> getFinancialRelationInfoList() {
			return this.financialRelationInfoList;
		}

		public void setFinancialRelationInfoList(List<FinancialRelationInfoListItem> financialRelationInfoList) {
			this.financialRelationInfoList = financialRelationInfoList;
		}

		public static class FinancialRelationInfoListItem {

			private Long relationId;

			private String accountType;

			private Long accountId;

			private String accountName;

			private String accountNickName;

			private String relationType;

			private String state;

			private String setupTime;

			private String startTime;

			private String endTime;

			public Long getRelationId() {
				return this.relationId;
			}

			public void setRelationId(Long relationId) {
				this.relationId = relationId;
			}

			public String getAccountType() {
				return this.accountType;
			}

			public void setAccountType(String accountType) {
				this.accountType = accountType;
			}

			public Long getAccountId() {
				return this.accountId;
			}

			public void setAccountId(Long accountId) {
				this.accountId = accountId;
			}

			public String getAccountName() {
				return this.accountName;
			}

			public void setAccountName(String accountName) {
				this.accountName = accountName;
			}

			public String getAccountNickName() {
				return this.accountNickName;
			}

			public void setAccountNickName(String accountNickName) {
				this.accountNickName = accountNickName;
			}

			public String getRelationType() {
				return this.relationType;
			}

			public void setRelationType(String relationType) {
				this.relationType = relationType;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getSetupTime() {
				return this.setupTime;
			}

			public void setSetupTime(String setupTime) {
				this.setupTime = setupTime;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}
		}
	}

	@Override
	public QueryRelationListResponse getInstance(UnmarshallerContext context) {
		return	QueryRelationListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
