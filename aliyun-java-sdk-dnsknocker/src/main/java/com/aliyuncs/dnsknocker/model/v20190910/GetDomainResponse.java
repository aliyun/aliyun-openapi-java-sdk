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

package com.aliyuncs.dnsknocker.model.v20190910;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dnsknocker.transform.v20190910.GetDomainResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDomainResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String success;

	private String transactionId;

	private List<Data> domain;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public List<Data> getBizDomain() {
		return this.domain;
	}

	public void setBizDomain(List<Data> domain) {
		this.domain = domain;
	}

	/**
	 * @deprecated use getBizDomain instead of this.
	 */
	@Deprecated
	public List<Data> getDomain() {
		return this.domain;
	}

	/**
	 * @deprecated use setBizDomain instead of this.
	 */
	@Deprecated
	public void setDomain(List<Data> domain) {
		this.domain = domain;
	}

	public static class Data {

		private String domainName;

		private String exists;

		private String message;

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getExists() {
			return this.exists;
		}

		public void setExists(String exists) {
			this.exists = exists;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	}

	@Override
	public GetDomainResponse getInstance(UnmarshallerContext context) {
		return	GetDomainResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
