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

package com.aliyuncs.digitalstore.model.v20200107;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.digitalstore.transform.v20200107.ListApplicationOrderCasesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListApplicationOrderCasesResponse extends AcsResponse {

	private Integer pageSize;

	private Integer totalCount;

	private Integer pageNumber;

	private String requestId;

	private Boolean success;

	private List<ApplyOrderCaseModel> applyOrderCases;

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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
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

	public List<ApplyOrderCaseModel> getApplyOrderCases() {
		return this.applyOrderCases;
	}

	public void setApplyOrderCases(List<ApplyOrderCaseModel> applyOrderCases) {
		this.applyOrderCases = applyOrderCases;
	}

	public static class ApplyOrderCaseModel {

		private String createDate;

		private String status;

		private String orderCaseId;

		private Integer productTotal;

		private String caseCode;

		private Integer receivedQuantity;

		private String updateDate;

		private String orderId;

		private String caseId;

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getOrderCaseId() {
			return this.orderCaseId;
		}

		public void setOrderCaseId(String orderCaseId) {
			this.orderCaseId = orderCaseId;
		}

		public Integer getProductTotal() {
			return this.productTotal;
		}

		public void setProductTotal(Integer productTotal) {
			this.productTotal = productTotal;
		}

		public String getCaseCode() {
			return this.caseCode;
		}

		public void setCaseCode(String caseCode) {
			this.caseCode = caseCode;
		}

		public Integer getReceivedQuantity() {
			return this.receivedQuantity;
		}

		public void setReceivedQuantity(Integer receivedQuantity) {
			this.receivedQuantity = receivedQuantity;
		}

		public String getUpdateDate() {
			return this.updateDate;
		}

		public void setUpdateDate(String updateDate) {
			this.updateDate = updateDate;
		}

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public String getCaseId() {
			return this.caseId;
		}

		public void setCaseId(String caseId) {
			this.caseId = caseId;
		}
	}

	@Override
	public ListApplicationOrderCasesResponse getInstance(UnmarshallerContext context) {
		return	ListApplicationOrderCasesResponseUnmarshaller.unmarshall(this, context);
	}
}
