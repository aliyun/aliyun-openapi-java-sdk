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
import com.aliyuncs.digitalstore.transform.v20200107.ListOutboundOrderCasesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListOutboundOrderCasesResponse extends AcsResponse {

	private Integer pageSize;

	private Integer totalCount;

	private Integer pageNumber;

	private String requestId;

	private Boolean success;

	private List<CaseBiz> cases;

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

	public List<CaseBiz> getCases() {
		return this.cases;
	}

	public void setCases(List<CaseBiz> cases) {
		this.cases = cases;
	}

	public static class CaseBiz {

		private String id;

		private String operateQuantity;

		private String caseCode;

		private String caseStatus;

		private Boolean beConfirmInboundCase;

		private Boolean beConfirmOutboundCase;

		private Boolean applyStatus;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getOperateQuantity() {
			return this.operateQuantity;
		}

		public void setOperateQuantity(String operateQuantity) {
			this.operateQuantity = operateQuantity;
		}

		public String getCaseCode() {
			return this.caseCode;
		}

		public void setCaseCode(String caseCode) {
			this.caseCode = caseCode;
		}

		public String getCaseStatus() {
			return this.caseStatus;
		}

		public void setCaseStatus(String caseStatus) {
			this.caseStatus = caseStatus;
		}

		public Boolean getBeConfirmInboundCase() {
			return this.beConfirmInboundCase;
		}

		public void setBeConfirmInboundCase(Boolean beConfirmInboundCase) {
			this.beConfirmInboundCase = beConfirmInboundCase;
		}

		public Boolean getBeConfirmOutboundCase() {
			return this.beConfirmOutboundCase;
		}

		public void setBeConfirmOutboundCase(Boolean beConfirmOutboundCase) {
			this.beConfirmOutboundCase = beConfirmOutboundCase;
		}

		public Boolean getApplyStatus() {
			return this.applyStatus;
		}

		public void setApplyStatus(Boolean applyStatus) {
			this.applyStatus = applyStatus;
		}
	}

	@Override
	public ListOutboundOrderCasesResponse getInstance(UnmarshallerContext context) {
		return	ListOutboundOrderCasesResponseUnmarshaller.unmarshall(this, context);
	}
}
