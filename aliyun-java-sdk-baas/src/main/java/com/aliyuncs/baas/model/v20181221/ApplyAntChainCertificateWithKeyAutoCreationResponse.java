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

package com.aliyuncs.baas.model.v20181221;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.baas.transform.v20181221.ApplyAntChainCertificateWithKeyAutoCreationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ApplyAntChainCertificateWithKeyAutoCreationResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String privateKey;

		private DownloadPath downloadPath;

		public String getPrivateKey() {
			return this.privateKey;
		}

		public void setPrivateKey(String privateKey) {
			this.privateKey = privateKey;
		}

		public DownloadPath getDownloadPath() {
			return this.downloadPath;
		}

		public void setDownloadPath(DownloadPath downloadPath) {
			this.downloadPath = downloadPath;
		}

		public static class DownloadPath {

			private String clientCrtUrl;

			private String trustCaUrl;

			private String caCrtUrl;

			private String sdkUrl;

			public String getClientCrtUrl() {
				return this.clientCrtUrl;
			}

			public void setClientCrtUrl(String clientCrtUrl) {
				this.clientCrtUrl = clientCrtUrl;
			}

			public String getTrustCaUrl() {
				return this.trustCaUrl;
			}

			public void setTrustCaUrl(String trustCaUrl) {
				this.trustCaUrl = trustCaUrl;
			}

			public String getCaCrtUrl() {
				return this.caCrtUrl;
			}

			public void setCaCrtUrl(String caCrtUrl) {
				this.caCrtUrl = caCrtUrl;
			}

			public String getSdkUrl() {
				return this.sdkUrl;
			}

			public void setSdkUrl(String sdkUrl) {
				this.sdkUrl = sdkUrl;
			}
		}
	}

	@Override
	public ApplyAntChainCertificateWithKeyAutoCreationResponse getInstance(UnmarshallerContext context) {
		return	ApplyAntChainCertificateWithKeyAutoCreationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
