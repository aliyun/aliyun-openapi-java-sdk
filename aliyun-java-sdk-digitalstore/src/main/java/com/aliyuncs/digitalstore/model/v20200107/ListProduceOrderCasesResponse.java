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
import com.aliyuncs.digitalstore.transform.v20200107.ListProduceOrderCasesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListProduceOrderCasesResponse extends AcsResponse {

	private Integer pageSize;

	private Integer totalCount;

	private Integer pageNumber;

	private String requestId;

	private Boolean success;

	private List<ProduceOrderCaseModel> produceOrderCases;

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

	public List<ProduceOrderCaseModel> getProduceOrderCases() {
		return this.produceOrderCases;
	}

	public void setProduceOrderCases(List<ProduceOrderCaseModel> produceOrderCases) {
		this.produceOrderCases = produceOrderCases;
	}

	public static class ProduceOrderCaseModel {

		private Integer bindingQuantity;

		private String caseCode;

		private String orderId;

		private Integer boxQuantity;

		private String caseId;

		private String encasementMode;

		public Integer getBindingQuantity() {
			return this.bindingQuantity;
		}

		public void setBindingQuantity(Integer bindingQuantity) {
			this.bindingQuantity = bindingQuantity;
		}

		public String getCaseCode() {
			return this.caseCode;
		}

		public void setCaseCode(String caseCode) {
			this.caseCode = caseCode;
		}

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public Integer getBoxQuantity() {
			return this.boxQuantity;
		}

		public void setBoxQuantity(Integer boxQuantity) {
			this.boxQuantity = boxQuantity;
		}

		public String getCaseId() {
			return this.caseId;
		}

		public void setCaseId(String caseId) {
			this.caseId = caseId;
		}

		public String getEncasementMode() {
			return this.encasementMode;
		}

		public void setEncasementMode(String encasementMode) {
			this.encasementMode = encasementMode;
		}
	}

	@Override
	public ListProduceOrderCasesResponse getInstance(UnmarshallerContext context) {
		return	ListProduceOrderCasesResponseUnmarshaller.unmarshall(this, context);
	}
}
