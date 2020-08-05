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
import com.aliyuncs.linkedmall.transform.v20180116.QueryAgreementResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAgreementResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private QueryAgreementResponse1 queryAgreementResponse1;

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

	public QueryAgreementResponse1 getQueryAgreementResponse1() {
		return this.queryAgreementResponse1;
	}

	public void setQueryAgreementResponse1(QueryAgreementResponse1 queryAgreementResponse1) {
		this.queryAgreementResponse1 = queryAgreementResponse1;
	}

	public static class QueryAgreementResponse1 {

		private String validTime;

		private String invalidTime;

		private String agreementNo;

		private String status;

		private String signTime;

		private String externalAgreementNo;

		public String getValidTime() {
			return this.validTime;
		}

		public void setValidTime(String validTime) {
			this.validTime = validTime;
		}

		public String getInvalidTime() {
			return this.invalidTime;
		}

		public void setInvalidTime(String invalidTime) {
			this.invalidTime = invalidTime;
		}

		public String getAgreementNo() {
			return this.agreementNo;
		}

		public void setAgreementNo(String agreementNo) {
			this.agreementNo = agreementNo;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getSignTime() {
			return this.signTime;
		}

		public void setSignTime(String signTime) {
			this.signTime = signTime;
		}

		public String getExternalAgreementNo() {
			return this.externalAgreementNo;
		}

		public void setExternalAgreementNo(String externalAgreementNo) {
			this.externalAgreementNo = externalAgreementNo;
		}
	}

	@Override
	public QueryAgreementResponse getInstance(UnmarshallerContext context) {
		return	QueryAgreementResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
