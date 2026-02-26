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

package com.aliyuncs.retailadvqa.model.v20230417;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailadvqa.transform.v20230417.MemberAccountDetailPageQueryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class MemberAccountDetailPageQueryResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private String success;

	private String errorCode;

	private String errorMessage;

	private List<会员积分明细数据> data;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public List<会员积分明细数据> getData() {
		return this.data;
	}

	public void setData(List<会员积分明细数据> data) {
		this.data = data;
	}

	public static class 会员积分明细数据 {

		private String openMerchantId;

		private String outerMemberId;

		private Integer accountType;

		private String operateType;

		private String detailValue;

		private String accountBalance;

		private String channelCode;

		private String activityType;

		private String gmtCreate;

		private String gmtModified;

		private String remark;

		private String extra;

		public String getOpenMerchantId() {
			return this.openMerchantId;
		}

		public void setOpenMerchantId(String openMerchantId) {
			this.openMerchantId = openMerchantId;
		}

		public String getOuterMemberId() {
			return this.outerMemberId;
		}

		public void setOuterMemberId(String outerMemberId) {
			this.outerMemberId = outerMemberId;
		}

		public Integer getAccountType() {
			return this.accountType;
		}

		public void setAccountType(Integer accountType) {
			this.accountType = accountType;
		}

		public String getOperateType() {
			return this.operateType;
		}

		public void setOperateType(String operateType) {
			this.operateType = operateType;
		}

		public String getDetailValue() {
			return this.detailValue;
		}

		public void setDetailValue(String detailValue) {
			this.detailValue = detailValue;
		}

		public String getAccountBalance() {
			return this.accountBalance;
		}

		public void setAccountBalance(String accountBalance) {
			this.accountBalance = accountBalance;
		}

		public String getChannelCode() {
			return this.channelCode;
		}

		public void setChannelCode(String channelCode) {
			this.channelCode = channelCode;
		}

		public String getActivityType() {
			return this.activityType;
		}

		public void setActivityType(String activityType) {
			this.activityType = activityType;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public String getExtra() {
			return this.extra;
		}

		public void setExtra(String extra) {
			this.extra = extra;
		}
	}

	@Override
	public MemberAccountDetailPageQueryResponse getInstance(UnmarshallerContext context) {
		return	MemberAccountDetailPageQueryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
