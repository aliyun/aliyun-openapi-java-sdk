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

package com.aliyuncs.linkedmall.model.v20180116;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkedmall.transform.v20180116.QueryRefundApplicationDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryRefundApplicationDetailResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private RefundApplicationDetail refundApplicationDetail;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public RefundApplicationDetail getRefundApplicationDetail() {
		return this.refundApplicationDetail;
	}

	public void setRefundApplicationDetail(RefundApplicationDetail refundApplicationDetail) {
		this.refundApplicationDetail = refundApplicationDetail;
	}

	public static class RefundApplicationDetail {

		private Integer bizClaimType;

		private Integer orderLogisticsStatus;

		private Integer disputeStatus;

		private Integer returnGoodLogisticsStatus;

		private String lmOrderId;

		private String subLmOrderId;

		private Integer disputeType;

		private Long refundFee;

		private Long realRefundFee;

		private Integer returnGoodCount;

		private String disputeDesc;

		private String sellerAgreeMsg;

		private String sellerRefuseAgreementMessage;

		private String applyDisputeDesc;

		private String disputeCreateTime;

		private String disputeEndTime;

		private Long disputeId;

		private String refunderAddress;

		private String refunderName;

		private String refunderTel;

		private String refunderZipCode;

		private String sellerRefuseReason;

		private MaxRefundFeeData maxRefundFeeData;

		private ApplyReasonText applyReasonText;

		public Integer getBizClaimType() {
			return this.bizClaimType;
		}

		public void setBizClaimType(Integer bizClaimType) {
			this.bizClaimType = bizClaimType;
		}

		public Integer getOrderLogisticsStatus() {
			return this.orderLogisticsStatus;
		}

		public void setOrderLogisticsStatus(Integer orderLogisticsStatus) {
			this.orderLogisticsStatus = orderLogisticsStatus;
		}

		public Integer getDisputeStatus() {
			return this.disputeStatus;
		}

		public void setDisputeStatus(Integer disputeStatus) {
			this.disputeStatus = disputeStatus;
		}

		public Integer getReturnGoodLogisticsStatus() {
			return this.returnGoodLogisticsStatus;
		}

		public void setReturnGoodLogisticsStatus(Integer returnGoodLogisticsStatus) {
			this.returnGoodLogisticsStatus = returnGoodLogisticsStatus;
		}

		public String getLmOrderId() {
			return this.lmOrderId;
		}

		public void setLmOrderId(String lmOrderId) {
			this.lmOrderId = lmOrderId;
		}

		public String getSubLmOrderId() {
			return this.subLmOrderId;
		}

		public void setSubLmOrderId(String subLmOrderId) {
			this.subLmOrderId = subLmOrderId;
		}

		public Integer getDisputeType() {
			return this.disputeType;
		}

		public void setDisputeType(Integer disputeType) {
			this.disputeType = disputeType;
		}

		public Long getRefundFee() {
			return this.refundFee;
		}

		public void setRefundFee(Long refundFee) {
			this.refundFee = refundFee;
		}

		public Long getRealRefundFee() {
			return this.realRefundFee;
		}

		public void setRealRefundFee(Long realRefundFee) {
			this.realRefundFee = realRefundFee;
		}

		public Integer getReturnGoodCount() {
			return this.returnGoodCount;
		}

		public void setReturnGoodCount(Integer returnGoodCount) {
			this.returnGoodCount = returnGoodCount;
		}

		public String getDisputeDesc() {
			return this.disputeDesc;
		}

		public void setDisputeDesc(String disputeDesc) {
			this.disputeDesc = disputeDesc;
		}

		public String getSellerAgreeMsg() {
			return this.sellerAgreeMsg;
		}

		public void setSellerAgreeMsg(String sellerAgreeMsg) {
			this.sellerAgreeMsg = sellerAgreeMsg;
		}

		public String getSellerRefuseAgreementMessage() {
			return this.sellerRefuseAgreementMessage;
		}

		public void setSellerRefuseAgreementMessage(String sellerRefuseAgreementMessage) {
			this.sellerRefuseAgreementMessage = sellerRefuseAgreementMessage;
		}

		public String getApplyDisputeDesc() {
			return this.applyDisputeDesc;
		}

		public void setApplyDisputeDesc(String applyDisputeDesc) {
			this.applyDisputeDesc = applyDisputeDesc;
		}

		public String getDisputeCreateTime() {
			return this.disputeCreateTime;
		}

		public void setDisputeCreateTime(String disputeCreateTime) {
			this.disputeCreateTime = disputeCreateTime;
		}

		public String getDisputeEndTime() {
			return this.disputeEndTime;
		}

		public void setDisputeEndTime(String disputeEndTime) {
			this.disputeEndTime = disputeEndTime;
		}

		public Long getDisputeId() {
			return this.disputeId;
		}

		public void setDisputeId(Long disputeId) {
			this.disputeId = disputeId;
		}

		public String getRefunderAddress() {
			return this.refunderAddress;
		}

		public void setRefunderAddress(String refunderAddress) {
			this.refunderAddress = refunderAddress;
		}

		public String getRefunderName() {
			return this.refunderName;
		}

		public void setRefunderName(String refunderName) {
			this.refunderName = refunderName;
		}

		public String getRefunderTel() {
			return this.refunderTel;
		}

		public void setRefunderTel(String refunderTel) {
			this.refunderTel = refunderTel;
		}

		public String getRefunderZipCode() {
			return this.refunderZipCode;
		}

		public void setRefunderZipCode(String refunderZipCode) {
			this.refunderZipCode = refunderZipCode;
		}

		public String getSellerRefuseReason() {
			return this.sellerRefuseReason;
		}

		public void setSellerRefuseReason(String sellerRefuseReason) {
			this.sellerRefuseReason = sellerRefuseReason;
		}

		public MaxRefundFeeData getMaxRefundFeeData() {
			return this.maxRefundFeeData;
		}

		public void setMaxRefundFeeData(MaxRefundFeeData maxRefundFeeData) {
			this.maxRefundFeeData = maxRefundFeeData;
		}

		public ApplyReasonText getApplyReasonText() {
			return this.applyReasonText;
		}

		public void setApplyReasonText(ApplyReasonText applyReasonText) {
			this.applyReasonText = applyReasonText;
		}

		public static class MaxRefundFeeData {

			private Integer maxRefundFee;

			private Integer minRefundFee;

			public Integer getMaxRefundFee() {
				return this.maxRefundFee;
			}

			public void setMaxRefundFee(Integer maxRefundFee) {
				this.maxRefundFee = maxRefundFee;
			}

			public Integer getMinRefundFee() {
				return this.minRefundFee;
			}

			public void setMinRefundFee(Integer minRefundFee) {
				this.minRefundFee = minRefundFee;
			}
		}

		public static class ApplyReasonText {

			private Long reasonTextId;

			private String reasonTips;

			public Long getReasonTextId() {
				return this.reasonTextId;
			}

			public void setReasonTextId(Long reasonTextId) {
				this.reasonTextId = reasonTextId;
			}

			public String getReasonTips() {
				return this.reasonTips;
			}

			public void setReasonTips(String reasonTips) {
				this.reasonTips = reasonTips;
			}
		}
	}

	@Override
	public QueryRefundApplicationDetailResponse getInstance(UnmarshallerContext context) {
		return	QueryRefundApplicationDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
