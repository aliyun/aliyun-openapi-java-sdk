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
import com.aliyuncs.linkedmall.transform.v20180116.RefundOrderResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RefundOrderResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private RefundResponse refundResponse;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public RefundResponse getRefundResponse() {
		return this.refundResponse;
	}

	public void setRefundResponse(RefundResponse refundResponse) {
		this.refundResponse = refundResponse;
	}

	public static class RefundResponse {

		private String outRequestNo;

		private String outTradeNo;

		private String tradeNo;

		private String fundChange;

		private String gmtRefundPay;

		public String getOutRequestNo() {
			return this.outRequestNo;
		}

		public void setOutRequestNo(String outRequestNo) {
			this.outRequestNo = outRequestNo;
		}

		public String getOutTradeNo() {
			return this.outTradeNo;
		}

		public void setOutTradeNo(String outTradeNo) {
			this.outTradeNo = outTradeNo;
		}

		public String getTradeNo() {
			return this.tradeNo;
		}

		public void setTradeNo(String tradeNo) {
			this.tradeNo = tradeNo;
		}

		public String getFundChange() {
			return this.fundChange;
		}

		public void setFundChange(String fundChange) {
			this.fundChange = fundChange;
		}

		public String getGmtRefundPay() {
			return this.gmtRefundPay;
		}

		public void setGmtRefundPay(String gmtRefundPay) {
			this.gmtRefundPay = gmtRefundPay;
		}
	}

	@Override
	public RefundOrderResponse getInstance(UnmarshallerContext context) {
		return	RefundOrderResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
