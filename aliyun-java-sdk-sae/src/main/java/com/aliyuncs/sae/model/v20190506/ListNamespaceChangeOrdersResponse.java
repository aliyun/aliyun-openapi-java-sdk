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

package com.aliyuncs.sae.model.v20190506;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sae.transform.v20190506.ListNamespaceChangeOrdersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListNamespaceChangeOrdersResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private Boolean success;

	private String code;

	private String message;

	private String traceId;

	private Data data;

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

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer currentPage;

		private Integer pageSize;

		private Integer totalSize;

		private List<ChangeOrder> changeOrderList;

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalSize() {
			return this.totalSize;
		}

		public void setTotalSize(Integer totalSize) {
			this.totalSize = totalSize;
		}

		public List<ChangeOrder> getChangeOrderList() {
			return this.changeOrderList;
		}

		public void setChangeOrderList(List<ChangeOrder> changeOrderList) {
			this.changeOrderList = changeOrderList;
		}

		public static class ChangeOrder {

			private Integer status;

			private String finishTime;

			private String namespaceId;

			private String createTime;

			private String userId;

			private String source;

			private String createUserId;

			private Integer batchCount;

			private String coTypeCode;

			private String changeOrderId;

			private String batchType;

			private String description;

			private String groupId;

			private String coType;

			private String pipelines;

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getFinishTime() {
				return this.finishTime;
			}

			public void setFinishTime(String finishTime) {
				this.finishTime = finishTime;
			}

			public String getNamespaceId() {
				return this.namespaceId;
			}

			public void setNamespaceId(String namespaceId) {
				this.namespaceId = namespaceId;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getSource() {
				return this.source;
			}

			public void setSource(String source) {
				this.source = source;
			}

			public String getCreateUserId() {
				return this.createUserId;
			}

			public void setCreateUserId(String createUserId) {
				this.createUserId = createUserId;
			}

			public Integer getBatchCount() {
				return this.batchCount;
			}

			public void setBatchCount(Integer batchCount) {
				this.batchCount = batchCount;
			}

			public String getCoTypeCode() {
				return this.coTypeCode;
			}

			public void setCoTypeCode(String coTypeCode) {
				this.coTypeCode = coTypeCode;
			}

			public String getChangeOrderId() {
				return this.changeOrderId;
			}

			public void setChangeOrderId(String changeOrderId) {
				this.changeOrderId = changeOrderId;
			}

			public String getBatchType() {
				return this.batchType;
			}

			public void setBatchType(String batchType) {
				this.batchType = batchType;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getGroupId() {
				return this.groupId;
			}

			public void setGroupId(String groupId) {
				this.groupId = groupId;
			}

			public String getCoType() {
				return this.coType;
			}

			public void setCoType(String coType) {
				this.coType = coType;
			}

			public String getPipelines() {
				return this.pipelines;
			}

			public void setPipelines(String pipelines) {
				this.pipelines = pipelines;
			}
		}
	}

	@Override
	public ListNamespaceChangeOrdersResponse getInstance(UnmarshallerContext context) {
		return	ListNamespaceChangeOrdersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
