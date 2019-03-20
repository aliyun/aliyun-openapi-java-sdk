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

package com.aliyuncs.httpdns.model.v20160201;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.httpdns.transform.v20160201.GetResolveCountSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetResolveCountSummaryResponse extends AcsResponse {

	private String requestId;

	private ResolveSummary resolveSummary;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ResolveSummary getResolveSummary() {
		return this.resolveSummary;
	}

	public void setResolveSummary(ResolveSummary resolveSummary) {
		this.resolveSummary = resolveSummary;
	}

	public static class ResolveSummary {

		private Long http;

		private Long https;

		private Long http6;

		private Long https6;

		public Long getHttp() {
			return this.http;
		}

		public void setHttp(Long http) {
			this.http = http;
		}

		public Long getHttps() {
			return this.https;
		}

		public void setHttps(Long https) {
			this.https = https;
		}

		public Long getHttp6() {
			return this.http6;
		}

		public void setHttp6(Long http6) {
			this.http6 = http6;
		}

		public Long getHttps6() {
			return this.https6;
		}

		public void setHttps6(Long https6) {
			this.https6 = https6;
		}
	}

	@Override
	public GetResolveCountSummaryResponse getInstance(UnmarshallerContext context) {
		return	GetResolveCountSummaryResponseUnmarshaller.unmarshall(this, context);
	}
}
