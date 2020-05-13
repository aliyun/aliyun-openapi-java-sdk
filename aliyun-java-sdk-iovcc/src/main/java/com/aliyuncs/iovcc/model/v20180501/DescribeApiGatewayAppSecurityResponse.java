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

package com.aliyuncs.iovcc.model.v20180501;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iovcc.transform.v20180501.DescribeApiGatewayAppSecurityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeApiGatewayAppSecurityResponse extends AcsResponse {

	private String requestId;

	private ApiGatewayAppSecurity apiGatewayAppSecurity;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ApiGatewayAppSecurity getApiGatewayAppSecurity() {
		return this.apiGatewayAppSecurity;
	}

	public void setApiGatewayAppSecurity(ApiGatewayAppSecurity apiGatewayAppSecurity) {
		this.apiGatewayAppSecurity = apiGatewayAppSecurity;
	}

	public static class ApiGatewayAppSecurity {

		private String gatewayAppId;

		private String gatewayAppKey;

		private String gatewayAppSecret;

		private Long gmtCreate;

		private Long gmtModified;

		public String getGatewayAppId() {
			return this.gatewayAppId;
		}

		public void setGatewayAppId(String gatewayAppId) {
			this.gatewayAppId = gatewayAppId;
		}

		public String getGatewayAppKey() {
			return this.gatewayAppKey;
		}

		public void setGatewayAppKey(String gatewayAppKey) {
			this.gatewayAppKey = gatewayAppKey;
		}

		public String getGatewayAppSecret() {
			return this.gatewayAppSecret;
		}

		public void setGatewayAppSecret(String gatewayAppSecret) {
			this.gatewayAppSecret = gatewayAppSecret;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}
	}

	@Override
	public DescribeApiGatewayAppSecurityResponse getInstance(UnmarshallerContext context) {
		return	DescribeApiGatewayAppSecurityResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
