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
import com.aliyuncs.dt_oc_info.transform.v20220829.GetOcIpPatentResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOcIpPatentResponse extends AcsResponse {

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

		private String patentType;

		private String patentName;

		private String patentStatus;

		private String requestNum;

		private String requestDate;

		private String publicNum;

		private String publicDate;

		private String inventorList;

		private String patenteeList;

		private String cateNum;

		private String prioNum;

		private String prioDate;

		private String agency;

		private String agent;

		private String brief;

		private String mainClaim;

		public String getEntName() {
			return this.entName;
		}

		public void setEntName(String entName) {
			this.entName = entName;
		}

		public String getPatentType() {
			return this.patentType;
		}

		public void setPatentType(String patentType) {
			this.patentType = patentType;
		}

		public String getPatentName() {
			return this.patentName;
		}

		public void setPatentName(String patentName) {
			this.patentName = patentName;
		}

		public String getPatentStatus() {
			return this.patentStatus;
		}

		public void setPatentStatus(String patentStatus) {
			this.patentStatus = patentStatus;
		}

		public String getRequestNum() {
			return this.requestNum;
		}

		public void setRequestNum(String requestNum) {
			this.requestNum = requestNum;
		}

		public String getRequestDate() {
			return this.requestDate;
		}

		public void setRequestDate(String requestDate) {
			this.requestDate = requestDate;
		}

		public String getPublicNum() {
			return this.publicNum;
		}

		public void setPublicNum(String publicNum) {
			this.publicNum = publicNum;
		}

		public String getPublicDate() {
			return this.publicDate;
		}

		public void setPublicDate(String publicDate) {
			this.publicDate = publicDate;
		}

		public String getInventorList() {
			return this.inventorList;
		}

		public void setInventorList(String inventorList) {
			this.inventorList = inventorList;
		}

		public String getPatenteeList() {
			return this.patenteeList;
		}

		public void setPatenteeList(String patenteeList) {
			this.patenteeList = patenteeList;
		}

		public String getCateNum() {
			return this.cateNum;
		}

		public void setCateNum(String cateNum) {
			this.cateNum = cateNum;
		}

		public String getPrioNum() {
			return this.prioNum;
		}

		public void setPrioNum(String prioNum) {
			this.prioNum = prioNum;
		}

		public String getPrioDate() {
			return this.prioDate;
		}

		public void setPrioDate(String prioDate) {
			this.prioDate = prioDate;
		}

		public String getAgency() {
			return this.agency;
		}

		public void setAgency(String agency) {
			this.agency = agency;
		}

		public String getAgent() {
			return this.agent;
		}

		public void setAgent(String agent) {
			this.agent = agent;
		}

		public String getBrief() {
			return this.brief;
		}

		public void setBrief(String brief) {
			this.brief = brief;
		}

		public String getMainClaim() {
			return this.mainClaim;
		}

		public void setMainClaim(String mainClaim) {
			this.mainClaim = mainClaim;
		}
	}

	@Override
	public GetOcIpPatentResponse getInstance(UnmarshallerContext context) {
		return	GetOcIpPatentResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
