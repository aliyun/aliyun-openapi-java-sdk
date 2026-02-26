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
import com.aliyuncs.dt_oc_info.transform.v20220829.GetOcTaxOverdueResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOcTaxOverdueResponse extends AcsResponse {

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

		private String entName;

		private String overdueType;

		private String entAddress;

		private String overdueAmount;

		private String legalName;

		private String taxpayerType;

		private String taxpayerNum;

		private String department;

		private String currOverdueAmount;

		private String publishDate;

		public String getEntName() {
			return this.entName;
		}

		public void setEntName(String entName) {
			this.entName = entName;
		}

		public String getOverdueType() {
			return this.overdueType;
		}

		public void setOverdueType(String overdueType) {
			this.overdueType = overdueType;
		}

		public String getEntAddress() {
			return this.entAddress;
		}

		public void setEntAddress(String entAddress) {
			this.entAddress = entAddress;
		}

		public String getOverdueAmount() {
			return this.overdueAmount;
		}

		public void setOverdueAmount(String overdueAmount) {
			this.overdueAmount = overdueAmount;
		}

		public String getLegalName() {
			return this.legalName;
		}

		public void setLegalName(String legalName) {
			this.legalName = legalName;
		}

		public String getTaxpayerType() {
			return this.taxpayerType;
		}

		public void setTaxpayerType(String taxpayerType) {
			this.taxpayerType = taxpayerType;
		}

		public String getTaxpayerNum() {
			return this.taxpayerNum;
		}

		public void setTaxpayerNum(String taxpayerNum) {
			this.taxpayerNum = taxpayerNum;
		}

		public String getDepartment() {
			return this.department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public String getCurrOverdueAmount() {
			return this.currOverdueAmount;
		}

		public void setCurrOverdueAmount(String currOverdueAmount) {
			this.currOverdueAmount = currOverdueAmount;
		}

		public String getPublishDate() {
			return this.publishDate;
		}

		public void setPublishDate(String publishDate) {
			this.publishDate = publishDate;
		}
	}

	@Override
	public GetOcTaxOverdueResponse getInstance(UnmarshallerContext context) {
		return	GetOcTaxOverdueResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
