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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DescribeRefundPriceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRefundPriceResponse extends AcsResponse {

	private String requestId;

	private PriceInfo priceInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PriceInfo getPriceInfo() {
		return this.priceInfo;
	}

	public void setPriceInfo(PriceInfo priceInfo) {
		this.priceInfo = priceInfo;
	}

	public static class PriceInfo {

		private String currency;

		private Float refundFee;

		public String getCurrency() {
			return this.currency;
		}

		public void setCurrency(String currency) {
			this.currency = currency;
		}

		public Float getRefundFee() {
			return this.refundFee;
		}

		public void setRefundFee(Float refundFee) {
			this.refundFee = refundFee;
		}
	}

	@Override
	public DescribeRefundPriceResponse getInstance(UnmarshallerContext context) {
		return	DescribeRefundPriceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
