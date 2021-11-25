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

package com.aliyuncs.copyright.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.copyright.transform.v20190123.GetPatentPlanDetailListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPatentPlanDetailListResponse extends AcsResponse {

	private Integer pageNum;

	private Integer pageSize;

	private String requestId;

	private Boolean success;

	private Integer totalItemNum;

	private Integer totalPageNum;

	private List<DataItem> data;

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getTotalItemNum() {
		return this.totalItemNum;
	}

	public void setTotalItemNum(Integer totalItemNum) {
		this.totalItemNum = totalItemNum;
	}

	public Integer getTotalPageNum() {
		return this.totalPageNum;
	}

	public void setTotalPageNum(Integer totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String agency;

		private String applyNumber;

		private String bizId;

		private Integer discount;

		private String gmtExpireDate;

		private String name;

		private String owner;

		private String paidDate;

		private Integer payStatus;

		private Long planDetailId;

		private Long planId;

		private String planPayDate;

		private Integer soldStatus;

		private Integer type;

		private Boolean uidAgreement;

		private Integer year;

		private String patentStatus;

		private Boolean patentDiscard;

		private Integer label;

		private String endPayDate;

		public String getAgency() {
			return this.agency;
		}

		public void setAgency(String agency) {
			this.agency = agency;
		}

		public String getApplyNumber() {
			return this.applyNumber;
		}

		public void setApplyNumber(String applyNumber) {
			this.applyNumber = applyNumber;
		}

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public Integer getDiscount() {
			return this.discount;
		}

		public void setDiscount(Integer discount) {
			this.discount = discount;
		}

		public String getGmtExpireDate() {
			return this.gmtExpireDate;
		}

		public void setGmtExpireDate(String gmtExpireDate) {
			this.gmtExpireDate = gmtExpireDate;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getPaidDate() {
			return this.paidDate;
		}

		public void setPaidDate(String paidDate) {
			this.paidDate = paidDate;
		}

		public Integer getPayStatus() {
			return this.payStatus;
		}

		public void setPayStatus(Integer payStatus) {
			this.payStatus = payStatus;
		}

		public Long getPlanDetailId() {
			return this.planDetailId;
		}

		public void setPlanDetailId(Long planDetailId) {
			this.planDetailId = planDetailId;
		}

		public Long getPlanId() {
			return this.planId;
		}

		public void setPlanId(Long planId) {
			this.planId = planId;
		}

		public String getPlanPayDate() {
			return this.planPayDate;
		}

		public void setPlanPayDate(String planPayDate) {
			this.planPayDate = planPayDate;
		}

		public Integer getSoldStatus() {
			return this.soldStatus;
		}

		public void setSoldStatus(Integer soldStatus) {
			this.soldStatus = soldStatus;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public Boolean getUidAgreement() {
			return this.uidAgreement;
		}

		public void setUidAgreement(Boolean uidAgreement) {
			this.uidAgreement = uidAgreement;
		}

		public Integer getYear() {
			return this.year;
		}

		public void setYear(Integer year) {
			this.year = year;
		}

		public String getPatentStatus() {
			return this.patentStatus;
		}

		public void setPatentStatus(String patentStatus) {
			this.patentStatus = patentStatus;
		}

		public Boolean getPatentDiscard() {
			return this.patentDiscard;
		}

		public void setPatentDiscard(Boolean patentDiscard) {
			this.patentDiscard = patentDiscard;
		}

		public Integer getLabel() {
			return this.label;
		}

		public void setLabel(Integer label) {
			this.label = label;
		}

		public String getEndPayDate() {
			return this.endPayDate;
		}

		public void setEndPayDate(String endPayDate) {
			this.endPayDate = endPayDate;
		}
	}

	@Override
	public GetPatentPlanDetailListResponse getInstance(UnmarshallerContext context) {
		return	GetPatentPlanDetailListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
