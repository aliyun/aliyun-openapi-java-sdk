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
import com.aliyuncs.baas.transform.v20181221.DescribeAntChainDownloadPathsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAntChainDownloadPathsResponse extends AcsResponse {

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

		private String caCrtUrl;

		private String trustCaUrl;

		private String clientCrtUrl;

		private String sdkUrl;

		public String getCaCrtUrl() {
			return this.caCrtUrl;
		}

		public void setCaCrtUrl(String caCrtUrl) {
			this.caCrtUrl = caCrtUrl;
		}

		public String getTrustCaUrl() {
			return this.trustCaUrl;
		}

		public void setTrustCaUrl(String trustCaUrl) {
			this.trustCaUrl = trustCaUrl;
		}

		public String getClientCrtUrl() {
			return this.clientCrtUrl;
		}

		public void setClientCrtUrl(String clientCrtUrl) {
			this.clientCrtUrl = clientCrtUrl;
		}

		public String getSdkUrl() {
			return this.sdkUrl;
		}

		public void setSdkUrl(String sdkUrl) {
			this.sdkUrl = sdkUrl;
		}
	}

	@Override
	public DescribeAntChainDownloadPathsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAntChainDownloadPathsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
