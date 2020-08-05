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
import com.aliyuncs.sae.transform.v20190506.ListChangeOrdersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListChangeOrdersResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Boolean success;

	private String errorCode;

	private String traceId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

			private String appId;

			private Integer batchCount;

			private String batchType;

			private String changeOrderId;

			private String coType;

			private String coTypeCode;

			private String createTime;

			private String description;

			private String finishTime;

			private String groupId;

			private String pipelines;

			private String source;

			private Integer status;

			private String userId;

			private String createUserId;

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public Integer getBatchCount() {
				return this.batchCount;
			}

			public void setBatchCount(Integer batchCount) {
				this.batchCount = batchCount;
			}

			public String getBatchType() {
				return this.batchType;
			}

			public void setBatchType(String batchType) {
				this.batchType = batchType;
			}

			public String getChangeOrderId() {
				return this.changeOrderId;
			}

			public void setChangeOrderId(String changeOrderId) {
				this.changeOrderId = changeOrderId;
			}

			public String getCoType() {
				return this.coType;
			}

			public void setCoType(String coType) {
				this.coType = coType;
			}

			public String getCoTypeCode() {
				return this.coTypeCode;
			}

			public void setCoTypeCode(String coTypeCode) {
				this.coTypeCode = coTypeCode;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getFinishTime() {
				return this.finishTime;
			}

			public void setFinishTime(String finishTime) {
				this.finishTime = finishTime;
			}

			public String getGroupId() {
				return this.groupId;
			}

			public void setGroupId(String groupId) {
				this.groupId = groupId;
			}

			public String getPipelines() {
				return this.pipelines;
			}

			public void setPipelines(String pipelines) {
				this.pipelines = pipelines;
			}

			public String getSource() {
				return this.source;
			}

			public void setSource(String source) {
				this.source = source;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getCreateUserId() {
				return this.createUserId;
			}

			public void setCreateUserId(String createUserId) {
				this.createUserId = createUserId;
			}
		}
	}

	@Override
	public ListChangeOrdersResponse getInstance(UnmarshallerContext context) {
		return	ListChangeOrdersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
