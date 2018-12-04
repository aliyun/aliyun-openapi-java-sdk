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

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.baas.transform.v20180731.DownloadAllResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DownloadAllResponse extends AcsResponse {

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

		private String certUrl;

		private String bizviewUrl;

		private String sdkUrl;

		public String getCertUrl() {
			return this.certUrl;
		}

		public void setCertUrl(String certUrl) {
			this.certUrl = certUrl;
		}

		public String getBizviewUrl() {
			return this.bizviewUrl;
		}

		public void setBizviewUrl(String bizviewUrl) {
			this.bizviewUrl = bizviewUrl;
		}

		public String getSdkUrl() {
			return this.sdkUrl;
		}

		public void setSdkUrl(String sdkUrl) {
			this.sdkUrl = sdkUrl;
		}
	}

	@Override
	public DownloadAllResponse getInstance(UnmarshallerContext context) {
		return	DownloadAllResponseUnmarshaller.unmarshall(this, context);
	}
}
