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
import com.aliyuncs.cccxspaceinner.transform.v20191227.QueryTicketActionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTicketActionResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Data data;

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

		private Integer pageSize;

		private Integer currentPage;

		private Integer totalResults;

		private List<ListItem> list;

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

		public Integer getTotalResults() {
			return this.totalResults;
		}

		public void setTotalResults(Integer totalResults) {
			this.totalResults = totalResults;
		}

		public List<ListItem> getList() {
			return this.list;
		}

		public void setList(List<ListItem> list) {
			this.list = list;
		}

		public static class ListItem {

			private Long operator;

			private Integer operatorRole;

			private Integer hideType;

			private String memo;

			private Long bizId;

			private String bizIdStr;

			private Integer bizType;

			private Long bizTenantId;

			private Long acceptor;

			private Integer acceptorRole;

			private Integer actionType;

			private Integer actionCode;

			private Integer buId;

			private Long taskId;

			private Long buyerId;

			public Long getOperator() {
				return this.operator;
			}

			public void setOperator(Long operator) {
				this.operator = operator;
			}

			public Integer getOperatorRole() {
				return this.operatorRole;
			}

			public void setOperatorRole(Integer operatorRole) {
				this.operatorRole = operatorRole;
			}

			public Integer getHideType() {
				return this.hideType;
			}

			public void setHideType(Integer hideType) {
				this.hideType = hideType;
			}

			public String getMemo() {
				return this.memo;
			}

			public void setMemo(String memo) {
				this.memo = memo;
			}

			public Long getBizId() {
				return this.bizId;
			}

			public void setBizId(Long bizId) {
				this.bizId = bizId;
			}

			public String getBizIdStr() {
				return this.bizIdStr;
			}

			public void setBizIdStr(String bizIdStr) {
				this.bizIdStr = bizIdStr;
			}

			public Integer getBizType() {
				return this.bizType;
			}

			public void setBizType(Integer bizType) {
				this.bizType = bizType;
			}

			public Long getBizTenantId() {
				return this.bizTenantId;
			}

			public void setBizTenantId(Long bizTenantId) {
				this.bizTenantId = bizTenantId;
			}

			public Long getAcceptor() {
				return this.acceptor;
			}

			public void setAcceptor(Long acceptor) {
				this.acceptor = acceptor;
			}

			public Integer getAcceptorRole() {
				return this.acceptorRole;
			}

			public void setAcceptorRole(Integer acceptorRole) {
				this.acceptorRole = acceptorRole;
			}

			public Integer getActionType() {
				return this.actionType;
			}

			public void setActionType(Integer actionType) {
				this.actionType = actionType;
			}

			public Integer getActionCode() {
				return this.actionCode;
			}

			public void setActionCode(Integer actionCode) {
				this.actionCode = actionCode;
			}

			public Integer getBuId() {
				return this.buId;
			}

			public void setBuId(Integer buId) {
				this.buId = buId;
			}

			public Long getTaskId() {
				return this.taskId;
			}

			public void setTaskId(Long taskId) {
				this.taskId = taskId;
			}

			public Long getBuyerId() {
				return this.buyerId;
			}

			public void setBuyerId(Long buyerId) {
				this.buyerId = buyerId;
			}
		}
	}

	@Override
	public QueryTicketActionResponse getInstance(UnmarshallerContext context) {
		return	QueryTicketActionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
