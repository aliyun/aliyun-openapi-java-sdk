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
import com.aliyuncs.dt_oc_info.transform.v20220829.GetOcIcSimpleCancelResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOcIcSimpleCancelResponse extends AcsResponse {

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

		private String socialCreditCode;

		private String department;

		private String noticePeriod;

		private String scaProposer;

		private String scaDate;

		private String scaContent;

		private String scaResult;

		private String scaResultDate;

		public String getEntName() {
			return this.entName;
		}

		public void setEntName(String entName) {
			this.entName = entName;
		}

		public String getSocialCreditCode() {
			return this.socialCreditCode;
		}

		public void setSocialCreditCode(String socialCreditCode) {
			this.socialCreditCode = socialCreditCode;
		}

		public String getDepartment() {
			return this.department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public String getNoticePeriod() {
			return this.noticePeriod;
		}

		public void setNoticePeriod(String noticePeriod) {
			this.noticePeriod = noticePeriod;
		}

		public String getScaProposer() {
			return this.scaProposer;
		}

		public void setScaProposer(String scaProposer) {
			this.scaProposer = scaProposer;
		}

		public String getScaDate() {
			return this.scaDate;
		}

		public void setScaDate(String scaDate) {
			this.scaDate = scaDate;
		}

		public String getScaContent() {
			return this.scaContent;
		}

		public void setScaContent(String scaContent) {
			this.scaContent = scaContent;
		}

		public String getScaResult() {
			return this.scaResult;
		}

		public void setScaResult(String scaResult) {
			this.scaResult = scaResult;
		}

		public String getScaResultDate() {
			return this.scaResultDate;
		}

		public void setScaResultDate(String scaResultDate) {
			this.scaResultDate = scaResultDate;
		}
	}

	@Override
	public GetOcIcSimpleCancelResponse getInstance(UnmarshallerContext context) {
		return	GetOcIcSimpleCancelResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
