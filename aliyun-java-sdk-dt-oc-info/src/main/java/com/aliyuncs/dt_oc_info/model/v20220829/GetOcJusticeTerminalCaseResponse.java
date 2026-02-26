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
import com.aliyuncs.dt_oc_info.transform.v20220829.GetOcJusticeTerminalCaseResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOcJusticeTerminalCaseResponse extends AcsResponse {

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

		private String name;

		private String entName;

		private String filingDate;

		private String terminalNum;

		private String caseNum;

		private String court;

		private String terminateDate;

		private String execAmount;

		private String failPerformAmount;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEntName() {
			return this.entName;
		}

		public void setEntName(String entName) {
			this.entName = entName;
		}

		public String getFilingDate() {
			return this.filingDate;
		}

		public void setFilingDate(String filingDate) {
			this.filingDate = filingDate;
		}

		public String getTerminalNum() {
			return this.terminalNum;
		}

		public void setTerminalNum(String terminalNum) {
			this.terminalNum = terminalNum;
		}

		public String getCaseNum() {
			return this.caseNum;
		}

		public void setCaseNum(String caseNum) {
			this.caseNum = caseNum;
		}

		public String getCourt() {
			return this.court;
		}

		public void setCourt(String court) {
			this.court = court;
		}

		public String getTerminateDate() {
			return this.terminateDate;
		}

		public void setTerminateDate(String terminateDate) {
			this.terminateDate = terminateDate;
		}

		public String getExecAmount() {
			return this.execAmount;
		}

		public void setExecAmount(String execAmount) {
			this.execAmount = execAmount;
		}

		public String getFailPerformAmount() {
			return this.failPerformAmount;
		}

		public void setFailPerformAmount(String failPerformAmount) {
			this.failPerformAmount = failPerformAmount;
		}
	}

	@Override
	public GetOcJusticeTerminalCaseResponse getInstance(UnmarshallerContext context) {
		return	GetOcJusticeTerminalCaseResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
