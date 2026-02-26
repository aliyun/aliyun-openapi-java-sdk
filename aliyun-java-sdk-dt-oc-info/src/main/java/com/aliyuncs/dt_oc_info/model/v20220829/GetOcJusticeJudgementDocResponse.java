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
import com.aliyuncs.dt_oc_info.transform.v20220829.GetOcJusticeJudgementDocResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOcJusticeJudgementDocResponse extends AcsResponse {

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

		private String title;

		private String caseNum;

		private String role;

		private String judgeResult;

		private String judgeDate;

		private String publicDate;

		private String causeAction;

		private String caseType;

		private String court;

		private String subAmount;

		private String caseFlow;

		private String party;

		private String plaintiff;

		private String defendant;

		private String judgeType;

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getCaseNum() {
			return this.caseNum;
		}

		public void setCaseNum(String caseNum) {
			this.caseNum = caseNum;
		}

		public String getRole() {
			return this.role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getJudgeResult() {
			return this.judgeResult;
		}

		public void setJudgeResult(String judgeResult) {
			this.judgeResult = judgeResult;
		}

		public String getJudgeDate() {
			return this.judgeDate;
		}

		public void setJudgeDate(String judgeDate) {
			this.judgeDate = judgeDate;
		}

		public String getPublicDate() {
			return this.publicDate;
		}

		public void setPublicDate(String publicDate) {
			this.publicDate = publicDate;
		}

		public String getCauseAction() {
			return this.causeAction;
		}

		public void setCauseAction(String causeAction) {
			this.causeAction = causeAction;
		}

		public String getCaseType() {
			return this.caseType;
		}

		public void setCaseType(String caseType) {
			this.caseType = caseType;
		}

		public String getCourt() {
			return this.court;
		}

		public void setCourt(String court) {
			this.court = court;
		}

		public String getSubAmount() {
			return this.subAmount;
		}

		public void setSubAmount(String subAmount) {
			this.subAmount = subAmount;
		}

		public String getCaseFlow() {
			return this.caseFlow;
		}

		public void setCaseFlow(String caseFlow) {
			this.caseFlow = caseFlow;
		}

		public String getParty() {
			return this.party;
		}

		public void setParty(String party) {
			this.party = party;
		}

		public String getPlaintiff() {
			return this.plaintiff;
		}

		public void setPlaintiff(String plaintiff) {
			this.plaintiff = plaintiff;
		}

		public String getDefendant() {
			return this.defendant;
		}

		public void setDefendant(String defendant) {
			this.defendant = defendant;
		}

		public String getJudgeType() {
			return this.judgeType;
		}

		public void setJudgeType(String judgeType) {
			this.judgeType = judgeType;
		}
	}

	@Override
	public GetOcJusticeJudgementDocResponse getInstance(UnmarshallerContext context) {
		return	GetOcJusticeJudgementDocResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
