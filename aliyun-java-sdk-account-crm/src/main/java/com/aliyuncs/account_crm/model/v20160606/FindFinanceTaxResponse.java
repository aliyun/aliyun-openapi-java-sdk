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

package com.aliyuncs.account_crm.model.v20160606;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.account_crm.transform.v20160606.FindFinanceTaxResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class FindFinanceTaxResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private FinanceVersion financeVersion;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public FinanceVersion getFinanceVersion() {
		return this.financeVersion;
	}

	public void setFinanceVersion(FinanceVersion financeVersion) {
		this.financeVersion = financeVersion;
	}

	public static class FinanceVersion {

		private String financeTaxCertificateImgName;

		private String version;

		private String financeTaxCertificateImgUrl;

		private String secondFinanceTaxCertificateImgUrl;

		private String tax;

		private String secondFinanceTax;

		private String secondFinanceTaxCertificateImgName;

		public String getFinanceTaxCertificateImgName() {
			return this.financeTaxCertificateImgName;
		}

		public void setFinanceTaxCertificateImgName(String financeTaxCertificateImgName) {
			this.financeTaxCertificateImgName = financeTaxCertificateImgName;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getFinanceTaxCertificateImgUrl() {
			return this.financeTaxCertificateImgUrl;
		}

		public void setFinanceTaxCertificateImgUrl(String financeTaxCertificateImgUrl) {
			this.financeTaxCertificateImgUrl = financeTaxCertificateImgUrl;
		}

		public String getSecondFinanceTaxCertificateImgUrl() {
			return this.secondFinanceTaxCertificateImgUrl;
		}

		public void setSecondFinanceTaxCertificateImgUrl(String secondFinanceTaxCertificateImgUrl) {
			this.secondFinanceTaxCertificateImgUrl = secondFinanceTaxCertificateImgUrl;
		}

		public String getTax() {
			return this.tax;
		}

		public void setTax(String tax) {
			this.tax = tax;
		}

		public String getSecondFinanceTax() {
			return this.secondFinanceTax;
		}

		public void setSecondFinanceTax(String secondFinanceTax) {
			this.secondFinanceTax = secondFinanceTax;
		}

		public String getSecondFinanceTaxCertificateImgName() {
			return this.secondFinanceTaxCertificateImgName;
		}

		public void setSecondFinanceTaxCertificateImgName(String secondFinanceTaxCertificateImgName) {
			this.secondFinanceTaxCertificateImgName = secondFinanceTaxCertificateImgName;
		}
	}

	@Override
	public FindFinanceTaxResponse getInstance(UnmarshallerContext context) {
		return	FindFinanceTaxResponseUnmarshaller.unmarshall(this, context);
	}
}
