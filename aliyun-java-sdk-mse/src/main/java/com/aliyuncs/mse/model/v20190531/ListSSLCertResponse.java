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

package com.aliyuncs.mse.model.v20190531;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mse.transform.v20190531.ListSSLCertResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSSLCertResponse extends AcsResponse {

	private String requestId;

	private Integer httpStatusCode;

	private String message;

	private Integer code;

	private Boolean success;

	private List<Domains> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Domains> getData() {
		return this.data;
	}

	public void setData(List<Domains> data) {
		this.data = data;
	}

	public static class Domains {

		private String certIdentifier;

		private String certName;

		private String commonName;

		private String sans;

		private String beforeDate;

		private String afterDate;

		private String algorithm;

		private String issuer;

		private String gmtBefore;

		private String gmtAfter;

		public String getCertIdentifier() {
			return this.certIdentifier;
		}

		public void setCertIdentifier(String certIdentifier) {
			this.certIdentifier = certIdentifier;
		}

		public String getCertName() {
			return this.certName;
		}

		public void setCertName(String certName) {
			this.certName = certName;
		}

		public String getCommonName() {
			return this.commonName;
		}

		public void setCommonName(String commonName) {
			this.commonName = commonName;
		}

		public String getSans() {
			return this.sans;
		}

		public void setSans(String sans) {
			this.sans = sans;
		}

		public String getBeforeDate() {
			return this.beforeDate;
		}

		public void setBeforeDate(String beforeDate) {
			this.beforeDate = beforeDate;
		}

		public String getAfterDate() {
			return this.afterDate;
		}

		public void setAfterDate(String afterDate) {
			this.afterDate = afterDate;
		}

		public String getAlgorithm() {
			return this.algorithm;
		}

		public void setAlgorithm(String algorithm) {
			this.algorithm = algorithm;
		}

		public String getIssuer() {
			return this.issuer;
		}

		public void setIssuer(String issuer) {
			this.issuer = issuer;
		}

		public String getGmtBefore() {
			return this.gmtBefore;
		}

		public void setGmtBefore(String gmtBefore) {
			this.gmtBefore = gmtBefore;
		}

		public String getGmtAfter() {
			return this.gmtAfter;
		}

		public void setGmtAfter(String gmtAfter) {
			this.gmtAfter = gmtAfter;
		}
	}

	@Override
	public ListSSLCertResponse getInstance(UnmarshallerContext context) {
		return	ListSSLCertResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
