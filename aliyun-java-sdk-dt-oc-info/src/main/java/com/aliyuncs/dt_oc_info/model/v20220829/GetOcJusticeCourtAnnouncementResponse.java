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
import com.aliyuncs.dt_oc_info.transform.v20220829.GetOcJusticeCourtAnnouncementResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOcJusticeCourtAnnouncementResponse extends AcsResponse {

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

		private String causeAction;

		private String caseNum;

		private String hearingDate;

		private String department;

		private String court;

		private String tribunal;

		private String judge;

		private String title;

		private String party;

		public String getCauseAction() {
			return this.causeAction;
		}

		public void setCauseAction(String causeAction) {
			this.causeAction = causeAction;
		}

		public String getCaseNum() {
			return this.caseNum;
		}

		public void setCaseNum(String caseNum) {
			this.caseNum = caseNum;
		}

		public String getHearingDate() {
			return this.hearingDate;
		}

		public void setHearingDate(String hearingDate) {
			this.hearingDate = hearingDate;
		}

		public String getDepartment() {
			return this.department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public String getCourt() {
			return this.court;
		}

		public void setCourt(String court) {
			this.court = court;
		}

		public String getTribunal() {
			return this.tribunal;
		}

		public void setTribunal(String tribunal) {
			this.tribunal = tribunal;
		}

		public String getJudge() {
			return this.judge;
		}

		public void setJudge(String judge) {
			this.judge = judge;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getParty() {
			return this.party;
		}

		public void setParty(String party) {
			this.party = party;
		}
	}

	@Override
	public GetOcJusticeCourtAnnouncementResponse getInstance(UnmarshallerContext context) {
		return	GetOcJusticeCourtAnnouncementResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
