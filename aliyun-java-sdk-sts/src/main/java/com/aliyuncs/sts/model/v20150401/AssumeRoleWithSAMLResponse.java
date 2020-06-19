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

package com.aliyuncs.sts.model.v20150401;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sts.transform.v20150401.AssumeRoleWithSAMLResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AssumeRoleWithSAMLResponse extends AcsResponse {

	private String requestId;

	private Credentials credentials;

	private AssumedRoleUser assumedRoleUser;

	private SAMLAssertionInfo sAMLAssertionInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Credentials getCredentials() {
		return this.credentials;
	}

	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}

	public AssumedRoleUser getAssumedRoleUser() {
		return this.assumedRoleUser;
	}

	public void setAssumedRoleUser(AssumedRoleUser assumedRoleUser) {
		this.assumedRoleUser = assumedRoleUser;
	}

	public SAMLAssertionInfo getSAMLAssertionInfo() {
		return this.sAMLAssertionInfo;
	}

	public void setSAMLAssertionInfo(SAMLAssertionInfo sAMLAssertionInfo) {
		this.sAMLAssertionInfo = sAMLAssertionInfo;
	}

	public static class Credentials {

		private String securityToken;

		private String accessKeySecret;

		private String accessKeyId;

		private String expiration;

		public String getSecurityToken() {
			return this.securityToken;
		}

		public void setSecurityToken(String securityToken) {
			this.securityToken = securityToken;
		}

		public String getAccessKeySecret() {
			return this.accessKeySecret;
		}

		public void setAccessKeySecret(String accessKeySecret) {
			this.accessKeySecret = accessKeySecret;
		}

		public String getAccessKeyId() {
			return this.accessKeyId;
		}

		public void setAccessKeyId(String accessKeyId) {
			this.accessKeyId = accessKeyId;
		}

		public String getExpiration() {
			return this.expiration;
		}

		public void setExpiration(String expiration) {
			this.expiration = expiration;
		}
	}

	public static class AssumedRoleUser {

		private String arn;

		private String assumedRoleId;

		public String getArn() {
			return this.arn;
		}

		public void setArn(String arn) {
			this.arn = arn;
		}

		public String getAssumedRoleId() {
			return this.assumedRoleId;
		}

		public void setAssumedRoleId(String assumedRoleId) {
			this.assumedRoleId = assumedRoleId;
		}
	}

	public static class SAMLAssertionInfo {

		private String subjectType;

		private String subject;

		private String recipient;

		private String issuer;

		public String getSubjectType() {
			return this.subjectType;
		}

		public void setSubjectType(String subjectType) {
			this.subjectType = subjectType;
		}

		public String getSubject() {
			return this.subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}

		public String getRecipient() {
			return this.recipient;
		}

		public void setRecipient(String recipient) {
			this.recipient = recipient;
		}

		public String getIssuer() {
			return this.issuer;
		}

		public void setIssuer(String issuer) {
			this.issuer = issuer;
		}
	}

	@Override
	public AssumeRoleWithSAMLResponse getInstance(UnmarshallerContext context) {
		return	AssumeRoleWithSAMLResponseUnmarshaller.unmarshall(this, context);
	}
}
