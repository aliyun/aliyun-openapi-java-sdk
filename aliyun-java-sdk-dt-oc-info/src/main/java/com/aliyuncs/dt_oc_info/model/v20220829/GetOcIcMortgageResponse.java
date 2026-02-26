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

package com.aliyuncs.dt_oc_info.model.v20220829;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dt_oc_info.transform.v20220829.GetOcIcMortgageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOcIcMortgageResponse extends AcsResponse {

	private String code;

	private Boolean success;

	private String message;

	private Integer totalNum;

	private Integer pageIndex;

	private Integer pageNum;

	private String requestId;

	private List<DataItem> data;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getTotalNum() {
		return this.totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public Integer getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String onecompId;

		private String number;

		private String regDate;

		private String department;

		private String mortgageesName;

		private String identifyType;

		private String identifyNo;

		private String debitType;

		private String debitAmount;

		private String debitPeriod;

		private String debitScope;

		private String guarantees;

		private String status;

		private String publicDate;

		public String getOnecompId() {
			return this.onecompId;
		}

		public void setOnecompId(String onecompId) {
			this.onecompId = onecompId;
		}

		public String getNumber() {
			return this.number;
		}

		public void setNumber(String number) {
			this.number = number;
		}

		public String getRegDate() {
			return this.regDate;
		}

		public void setRegDate(String regDate) {
			this.regDate = regDate;
		}

		public String getDepartment() {
			return this.department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public String getMortgageesName() {
			return this.mortgageesName;
		}

		public void setMortgageesName(String mortgageesName) {
			this.mortgageesName = mortgageesName;
		}

		public String getIdentifyType() {
			return this.identifyType;
		}

		public void setIdentifyType(String identifyType) {
			this.identifyType = identifyType;
		}

		public String getIdentifyNo() {
			return this.identifyNo;
		}

		public void setIdentifyNo(String identifyNo) {
			this.identifyNo = identifyNo;
		}

		public String getDebitType() {
			return this.debitType;
		}

		public void setDebitType(String debitType) {
			this.debitType = debitType;
		}

		public String getDebitAmount() {
			return this.debitAmount;
		}

		public void setDebitAmount(String debitAmount) {
			this.debitAmount = debitAmount;
		}

		public String getDebitPeriod() {
			return this.debitPeriod;
		}

		public void setDebitPeriod(String debitPeriod) {
			this.debitPeriod = debitPeriod;
		}

		public String getDebitScope() {
			return this.debitScope;
		}

		public void setDebitScope(String debitScope) {
			this.debitScope = debitScope;
		}

		public String getGuarantees() {
			return this.guarantees;
		}

		public void setGuarantees(String guarantees) {
			this.guarantees = guarantees;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getPublicDate() {
			return this.publicDate;
		}

		public void setPublicDate(String publicDate) {
			this.publicDate = publicDate;
		}
	}

	@Override
	public GetOcIcMortgageResponse getInstance(UnmarshallerContext context) {
		return	GetOcIcMortgageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
