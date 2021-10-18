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

package com.aliyuncs.waf_openapi.model.v20180117;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.waf_openapi.transform.v20180117.DescribeDomainConfigStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainConfigStatusResponse extends AcsResponse {

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

		private String wafTaskId;

		private Integer status;

		private DomainConfig domainConfig;

		public String getWafTaskId() {
			return this.wafTaskId;
		}

		public void setWafTaskId(String wafTaskId) {
			this.wafTaskId = wafTaskId;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public DomainConfig getDomainConfig() {
			return this.domainConfig;
		}

		public void setDomainConfig(DomainConfig domainConfig) {
			this.domainConfig = domainConfig;
		}

		public static class DomainConfig {

			private String configStatus;

			public String getConfigStatus() {
				return this.configStatus;
			}

			public void setConfigStatus(String configStatus) {
				this.configStatus = configStatus;
			}
		}
	}

	@Override
	public DescribeDomainConfigStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainConfigStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
