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

package com.aliyuncs.mhub.model.v20170825;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mhub.transform.v20170825.VerifyCertResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class VerifyCertResponse extends AcsResponse {

	private String requestId;

	private String parseMessage;

	private CertInfo certInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getParseMessage() {
		return this.parseMessage;
	}

	public void setParseMessage(String parseMessage) {
		this.parseMessage = parseMessage;
	}

	public CertInfo getCertInfo() {
		return this.certInfo;
	}

	public void setCertInfo(CertInfo certInfo) {
		this.certInfo = certInfo;
	}

	public static class CertInfo {

		private String appName;

		private String certType;

		private String certMode;

		private String expirationDate;

		private String generateDate;

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getCertType() {
			return this.certType;
		}

		public void setCertType(String certType) {
			this.certType = certType;
		}

		public String getCertMode() {
			return this.certMode;
		}

		public void setCertMode(String certMode) {
			this.certMode = certMode;
		}

		public String getExpirationDate() {
			return this.expirationDate;
		}

		public void setExpirationDate(String expirationDate) {
			this.expirationDate = expirationDate;
		}

		public String getGenerateDate() {
			return this.generateDate;
		}

		public void setGenerateDate(String generateDate) {
			this.generateDate = generateDate;
		}
	}

	@Override
	public VerifyCertResponse getInstance(UnmarshallerContext context) {
		return	VerifyCertResponseUnmarshaller.unmarshall(this, context);
	}
}
