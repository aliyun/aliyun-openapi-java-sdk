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

package com.aliyuncs.companyreg.model.v20190508;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.companyreg.transform.v20190508.ListBookkeepingSubjectBalancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListBookkeepingSubjectBalancesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private Boolean success;

	private String errorMsg;

	private List<BookkeepingSubjectBalancesItem> bookkeepingSubjectBalances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public List<BookkeepingSubjectBalancesItem> getBookkeepingSubjectBalances() {
		return this.bookkeepingSubjectBalances;
	}

	public void setBookkeepingSubjectBalances(List<BookkeepingSubjectBalancesItem> bookkeepingSubjectBalances) {
		this.bookkeepingSubjectBalances = bookkeepingSubjectBalances;
	}

	public static class BookkeepingSubjectBalancesItem {

		private String bizId;

		private String parentBizId;

		private String parentSubjectCode;

		private String subjectCode;

		private String subjectName;

		private Float startDebitValue;

		private Float startCreditValue;

		private Float currentDebitValue;

		private Float currentCreditValue;

		private Float endDebitValue;

		private Float endCreditValue;

		private Float yearDebitValue;

		private Float yearCreditValue;

		private String subjectLevel;

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getParentBizId() {
			return this.parentBizId;
		}

		public void setParentBizId(String parentBizId) {
			this.parentBizId = parentBizId;
		}

		public String getParentSubjectCode() {
			return this.parentSubjectCode;
		}

		public void setParentSubjectCode(String parentSubjectCode) {
			this.parentSubjectCode = parentSubjectCode;
		}

		public String getSubjectCode() {
			return this.subjectCode;
		}

		public void setSubjectCode(String subjectCode) {
			this.subjectCode = subjectCode;
		}

		public String getSubjectName() {
			return this.subjectName;
		}

		public void setSubjectName(String subjectName) {
			this.subjectName = subjectName;
		}

		public Float getStartDebitValue() {
			return this.startDebitValue;
		}

		public void setStartDebitValue(Float startDebitValue) {
			this.startDebitValue = startDebitValue;
		}

		public Float getStartCreditValue() {
			return this.startCreditValue;
		}

		public void setStartCreditValue(Float startCreditValue) {
			this.startCreditValue = startCreditValue;
		}

		public Float getCurrentDebitValue() {
			return this.currentDebitValue;
		}

		public void setCurrentDebitValue(Float currentDebitValue) {
			this.currentDebitValue = currentDebitValue;
		}

		public Float getCurrentCreditValue() {
			return this.currentCreditValue;
		}

		public void setCurrentCreditValue(Float currentCreditValue) {
			this.currentCreditValue = currentCreditValue;
		}

		public Float getEndDebitValue() {
			return this.endDebitValue;
		}

		public void setEndDebitValue(Float endDebitValue) {
			this.endDebitValue = endDebitValue;
		}

		public Float getEndCreditValue() {
			return this.endCreditValue;
		}

		public void setEndCreditValue(Float endCreditValue) {
			this.endCreditValue = endCreditValue;
		}

		public Float getYearDebitValue() {
			return this.yearDebitValue;
		}

		public void setYearDebitValue(Float yearDebitValue) {
			this.yearDebitValue = yearDebitValue;
		}

		public Float getYearCreditValue() {
			return this.yearCreditValue;
		}

		public void setYearCreditValue(Float yearCreditValue) {
			this.yearCreditValue = yearCreditValue;
		}

		public String getSubjectLevel() {
			return this.subjectLevel;
		}

		public void setSubjectLevel(String subjectLevel) {
			this.subjectLevel = subjectLevel;
		}
	}

	@Override
	public ListBookkeepingSubjectBalancesResponse getInstance(UnmarshallerContext context) {
		return	ListBookkeepingSubjectBalancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
