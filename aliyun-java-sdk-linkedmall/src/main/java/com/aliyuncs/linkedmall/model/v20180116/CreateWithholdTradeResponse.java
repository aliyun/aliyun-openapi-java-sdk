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
import com.aliyuncs.linkedmall.transform.v20180116.CreateWithholdTradeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateWithholdTradeResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private WithholdTradeResponse withholdTradeResponse;

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

	public WithholdTradeResponse getWithholdTradeResponse() {
		return this.withholdTradeResponse;
	}

	public void setWithholdTradeResponse(WithholdTradeResponse withholdTradeResponse) {
		this.withholdTradeResponse = withholdTradeResponse;
	}

	public static class WithholdTradeResponse {

		private String outRequestNo;

		private String outTradeNo;

		private String tradeNo;

		private String paymentDate;

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

		public String getPaymentDate() {
			return this.paymentDate;
		}

		public void setPaymentDate(String paymentDate) {
			this.paymentDate = paymentDate;
		}
	}

	@Override
	public CreateWithholdTradeResponse getInstance(UnmarshallerContext context) {
		return	CreateWithholdTradeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
