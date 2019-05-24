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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkedmall.transform.v20180116.InitApplyRefundResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InitApplyRefundResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private String subLmOrderId;

	private InitApplyRefundData initApplyRefundData;

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

	public String getSubLmOrderId() {
		return this.subLmOrderId;
	}

	public void setSubLmOrderId(String subLmOrderId) {
		this.subLmOrderId = subLmOrderId;
	}

	public InitApplyRefundData getInitApplyRefundData() {
		return this.initApplyRefundData;
	}

	public void setInitApplyRefundData(InitApplyRefundData initApplyRefundData) {
		this.initApplyRefundData = initApplyRefundData;
	}

	public static class InitApplyRefundData {

		private Integer bizClaimType;

		private Boolean mainOrderRefund;

		private List<RefundReasonListItem> refundReasonList;

		private MaxRefundFeeData maxRefundFeeData;

		public Integer getBizClaimType() {
			return this.bizClaimType;
		}

		public void setBizClaimType(Integer bizClaimType) {
			this.bizClaimType = bizClaimType;
		}

		public Boolean getMainOrderRefund() {
			return this.mainOrderRefund;
		}

		public void setMainOrderRefund(Boolean mainOrderRefund) {
			this.mainOrderRefund = mainOrderRefund;
		}

		public List<RefundReasonListItem> getRefundReasonList() {
			return this.refundReasonList;
		}

		public void setRefundReasonList(List<RefundReasonListItem> refundReasonList) {
			this.refundReasonList = refundReasonList;
		}

		public MaxRefundFeeData getMaxRefundFeeData() {
			return this.maxRefundFeeData;
		}

		public void setMaxRefundFeeData(MaxRefundFeeData maxRefundFeeData) {
			this.maxRefundFeeData = maxRefundFeeData;
		}

		public static class RefundReasonListItem {

			private Long reasonTextId;

			private String reasonTips;

			private Boolean proofRequired;

			private Boolean refundDescRequired;

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

			public Boolean getProofRequired() {
				return this.proofRequired;
			}

			public void setProofRequired(Boolean proofRequired) {
				this.proofRequired = proofRequired;
			}

			public Boolean getRefundDescRequired() {
				return this.refundDescRequired;
			}

			public void setRefundDescRequired(Boolean refundDescRequired) {
				this.refundDescRequired = refundDescRequired;
			}
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
	}

	@Override
	public InitApplyRefundResponse getInstance(UnmarshallerContext context) {
		return	InitApplyRefundResponseUnmarshaller.unmarshall(this, context);
	}
}
