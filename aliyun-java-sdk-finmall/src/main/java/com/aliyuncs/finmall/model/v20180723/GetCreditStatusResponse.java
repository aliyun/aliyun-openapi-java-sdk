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

package com.aliyuncs.finmall.model.v20180723;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.finmall.transform.v20180723.GetCreditStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCreditStatusResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String status;

		private String createTime;

		private String productId;

		private String fundPartyId;

		private String tradeDataId;

		private String creditApproveComment;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getProductId() {
			return this.productId;
		}

		public void setProductId(String productId) {
			this.productId = productId;
		}

		public String getFundPartyId() {
			return this.fundPartyId;
		}

		public void setFundPartyId(String fundPartyId) {
			this.fundPartyId = fundPartyId;
		}

		public String getTradeDataId() {
			return this.tradeDataId;
		}

		public void setTradeDataId(String tradeDataId) {
			this.tradeDataId = tradeDataId;
		}

		public String getCreditApproveComment() {
			return this.creditApproveComment;
		}

		public void setCreditApproveComment(String creditApproveComment) {
			this.creditApproveComment = creditApproveComment;
		}
	}

	@Override
	public GetCreditStatusResponse getInstance(UnmarshallerContext context) {
		return	GetCreditStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
