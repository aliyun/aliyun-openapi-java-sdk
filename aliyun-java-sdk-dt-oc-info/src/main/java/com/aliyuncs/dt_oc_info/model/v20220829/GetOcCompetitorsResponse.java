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
import com.aliyuncs.dt_oc_info.transform.v20220829.GetOcCompetitorsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOcCompetitorsResponse extends AcsResponse {

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

		private String competitionProductName;

		private String competitionEntName;

		private String competitionWebsite;

		private String competitionTag;

		private String competitionLogoUrl;

		private String competitionIntroduction;

		private String competitionBrandIntroduction;

		private String competitionEntFinTurn;

		private String competitionEntAddress;

		private String competitionEntEsDate;

		public String getEntName() {
			return this.entName;
		}

		public void setEntName(String entName) {
			this.entName = entName;
		}

		public String getCompetitionProductName() {
			return this.competitionProductName;
		}

		public void setCompetitionProductName(String competitionProductName) {
			this.competitionProductName = competitionProductName;
		}

		public String getCompetitionEntName() {
			return this.competitionEntName;
		}

		public void setCompetitionEntName(String competitionEntName) {
			this.competitionEntName = competitionEntName;
		}

		public String getCompetitionWebsite() {
			return this.competitionWebsite;
		}

		public void setCompetitionWebsite(String competitionWebsite) {
			this.competitionWebsite = competitionWebsite;
		}

		public String getCompetitionTag() {
			return this.competitionTag;
		}

		public void setCompetitionTag(String competitionTag) {
			this.competitionTag = competitionTag;
		}

		public String getCompetitionLogoUrl() {
			return this.competitionLogoUrl;
		}

		public void setCompetitionLogoUrl(String competitionLogoUrl) {
			this.competitionLogoUrl = competitionLogoUrl;
		}

		public String getCompetitionIntroduction() {
			return this.competitionIntroduction;
		}

		public void setCompetitionIntroduction(String competitionIntroduction) {
			this.competitionIntroduction = competitionIntroduction;
		}

		public String getCompetitionBrandIntroduction() {
			return this.competitionBrandIntroduction;
		}

		public void setCompetitionBrandIntroduction(String competitionBrandIntroduction) {
			this.competitionBrandIntroduction = competitionBrandIntroduction;
		}

		public String getCompetitionEntFinTurn() {
			return this.competitionEntFinTurn;
		}

		public void setCompetitionEntFinTurn(String competitionEntFinTurn) {
			this.competitionEntFinTurn = competitionEntFinTurn;
		}

		public String getCompetitionEntAddress() {
			return this.competitionEntAddress;
		}

		public void setCompetitionEntAddress(String competitionEntAddress) {
			this.competitionEntAddress = competitionEntAddress;
		}

		public String getCompetitionEntEsDate() {
			return this.competitionEntEsDate;
		}

		public void setCompetitionEntEsDate(String competitionEntEsDate) {
			this.competitionEntEsDate = competitionEntEsDate;
		}
	}

	@Override
	public GetOcCompetitorsResponse getInstance(UnmarshallerContext context) {
		return	GetOcCompetitorsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
