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
import com.aliyuncs.mhub.transform.v20170825.QueryAppSecurityInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAppSecurityInfoResponse extends AcsResponse {

	private String requestId;

	private AppSecurityInfo appSecurityInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AppSecurityInfo getAppSecurityInfo() {
		return this.appSecurityInfo;
	}

	public void setAppSecurityInfo(AppSecurityInfo appSecurityInfo) {
		this.appSecurityInfo = appSecurityInfo;
	}

	public static class AppSecurityInfo {

		private String appKey;

		private String appSecret;

		public String getAppKey() {
			return this.appKey;
		}

		public void setAppKey(String appKey) {
			this.appKey = appKey;
		}

		public String getAppSecret() {
			return this.appSecret;
		}

		public void setAppSecret(String appSecret) {
			this.appSecret = appSecret;
		}
	}

	@Override
	public QueryAppSecurityInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryAppSecurityInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
