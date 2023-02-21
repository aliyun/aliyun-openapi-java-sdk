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
import com.aliyuncs.dt_oc_info.transform.v20220829.GetOcOperationBiddingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOcOperationBiddingResponse extends AcsResponse {

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

		private String bidTitle;

		private String bidType;

		private String regionName;

		private String bidIndustry;

		private String publicDate;

		private String projectNum;

		private String projectName;

		private String projectAmount;

		private String tenderEntName;

		private String agentEntName;

		private String winnerEntName;

		private String content;

		private String infoType;

		private String subType;

		private String openingTime;

		public String getEntName() {
			return this.entName;
		}

		public void setEntName(String entName) {
			this.entName = entName;
		}

		public String getBidTitle() {
			return this.bidTitle;
		}

		public void setBidTitle(String bidTitle) {
			this.bidTitle = bidTitle;
		}

		public String getBidType() {
			return this.bidType;
		}

		public void setBidType(String bidType) {
			this.bidType = bidType;
		}

		public String getRegionName() {
			return this.regionName;
		}

		public void setRegionName(String regionName) {
			this.regionName = regionName;
		}

		public String getBidIndustry() {
			return this.bidIndustry;
		}

		public void setBidIndustry(String bidIndustry) {
			this.bidIndustry = bidIndustry;
		}

		public String getPublicDate() {
			return this.publicDate;
		}

		public void setPublicDate(String publicDate) {
			this.publicDate = publicDate;
		}

		public String getProjectNum() {
			return this.projectNum;
		}

		public void setProjectNum(String projectNum) {
			this.projectNum = projectNum;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getProjectAmount() {
			return this.projectAmount;
		}

		public void setProjectAmount(String projectAmount) {
			this.projectAmount = projectAmount;
		}

		public String getTenderEntName() {
			return this.tenderEntName;
		}

		public void setTenderEntName(String tenderEntName) {
			this.tenderEntName = tenderEntName;
		}

		public String getAgentEntName() {
			return this.agentEntName;
		}

		public void setAgentEntName(String agentEntName) {
			this.agentEntName = agentEntName;
		}

		public String getWinnerEntName() {
			return this.winnerEntName;
		}

		public void setWinnerEntName(String winnerEntName) {
			this.winnerEntName = winnerEntName;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getInfoType() {
			return this.infoType;
		}

		public void setInfoType(String infoType) {
			this.infoType = infoType;
		}

		public String getSubType() {
			return this.subType;
		}

		public void setSubType(String subType) {
			this.subType = subType;
		}

		public String getOpeningTime() {
			return this.openingTime;
		}

		public void setOpeningTime(String openingTime) {
			this.openingTime = openingTime;
		}
	}

	@Override
	public GetOcOperationBiddingResponse getInstance(UnmarshallerContext context) {
		return	GetOcOperationBiddingResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
