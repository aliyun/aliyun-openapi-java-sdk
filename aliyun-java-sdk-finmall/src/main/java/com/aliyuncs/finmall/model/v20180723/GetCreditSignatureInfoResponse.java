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
import com.aliyuncs.finmall.transform.v20180723.GetCreditSignatureInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCreditSignatureInfoResponse extends AcsResponse {

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

		private String creditId;

		private String agreementId;

		private String agreementNo;

		private String agreementTitle;

		private String signType;

		private String agreementSigners;

		private String agreementPath;

		private String signState;

		public String getCreditId() {
			return this.creditId;
		}

		public void setCreditId(String creditId) {
			this.creditId = creditId;
		}

		public String getAgreementId() {
			return this.agreementId;
		}

		public void setAgreementId(String agreementId) {
			this.agreementId = agreementId;
		}

		public String getAgreementNo() {
			return this.agreementNo;
		}

		public void setAgreementNo(String agreementNo) {
			this.agreementNo = agreementNo;
		}

		public String getAgreementTitle() {
			return this.agreementTitle;
		}

		public void setAgreementTitle(String agreementTitle) {
			this.agreementTitle = agreementTitle;
		}

		public String getSignType() {
			return this.signType;
		}

		public void setSignType(String signType) {
			this.signType = signType;
		}

		public String getAgreementSigners() {
			return this.agreementSigners;
		}

		public void setAgreementSigners(String agreementSigners) {
			this.agreementSigners = agreementSigners;
		}

		public String getAgreementPath() {
			return this.agreementPath;
		}

		public void setAgreementPath(String agreementPath) {
			this.agreementPath = agreementPath;
		}

		public String getSignState() {
			return this.signState;
		}

		public void setSignState(String signState) {
			this.signState = signState;
		}
	}

	@Override
	public GetCreditSignatureInfoResponse getInstance(UnmarshallerContext context) {
		return	GetCreditSignatureInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
