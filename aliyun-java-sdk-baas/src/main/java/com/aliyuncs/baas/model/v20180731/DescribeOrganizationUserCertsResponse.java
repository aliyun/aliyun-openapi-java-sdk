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

package com.aliyuncs.baas.model.v20180731;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.baas.transform.v20180731.DescribeOrganizationUserCertsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOrganizationUserCertsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer errorCode;

	private String dynamicCode;

	private String dynamicMessage;

	private Result result;

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

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private List<Certificate> certificates;

		private KeyPair keyPair;

		public List<Certificate> getCertificates() {
			return this.certificates;
		}

		public void setCertificates(List<Certificate> certificates) {
			this.certificates = certificates;
		}

		public KeyPair getKeyPair() {
			return this.keyPair;
		}

		public void setKeyPair(KeyPair keyPair) {
			this.keyPair = keyPair;
		}

		public static class Certificate {

			private String scope;

			private String name;

			private String subject;

			private String issuer;

			private String validFrom;

			private String validTo;

			private String certData;

			public String getScope() {
				return this.scope;
			}

			public void setScope(String scope) {
				this.scope = scope;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getSubject() {
				return this.subject;
			}

			public void setSubject(String subject) {
				this.subject = subject;
			}

			public String getIssuer() {
				return this.issuer;
			}

			public void setIssuer(String issuer) {
				this.issuer = issuer;
			}

			public String getValidFrom() {
				return this.validFrom;
			}

			public void setValidFrom(String validFrom) {
				this.validFrom = validFrom;
			}

			public String getValidTo() {
				return this.validTo;
			}

			public void setValidTo(String validTo) {
				this.validTo = validTo;
			}

			public String getCertData() {
				return this.certData;
			}

			public void setCertData(String certData) {
				this.certData = certData;
			}
		}

		public static class KeyPair {

			private String privateKey;

			private String publicKey;

			public String getPrivateKey() {
				return this.privateKey;
			}

			public void setPrivateKey(String privateKey) {
				this.privateKey = privateKey;
			}

			public String getPublicKey() {
				return this.publicKey;
			}

			public void setPublicKey(String publicKey) {
				this.publicKey = publicKey;
			}
		}
	}

	@Override
	public DescribeOrganizationUserCertsResponse getInstance(UnmarshallerContext context) {
		return	DescribeOrganizationUserCertsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
