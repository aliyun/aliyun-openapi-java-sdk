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

package com.aliyuncs.retailbot.model.v20210224;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailbot.transform.v20210224.GetOssTokenResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOssTokenResponse extends AcsResponse {

	private WebUpoadPolicy webUpoadPolicy;

	public WebUpoadPolicy getWebUpoadPolicy() {
		return this.webUpoadPolicy;
	}

	public void setWebUpoadPolicy(WebUpoadPolicy webUpoadPolicy) {
		this.webUpoadPolicy = webUpoadPolicy;
	}

	public static class WebUpoadPolicy {

		private String accessId;

		private String policy;

		private String signature;

		private String dir;

		private String host;

		private String expire;

		public String getAccessId() {
			return this.accessId;
		}

		public void setAccessId(String accessId) {
			this.accessId = accessId;
		}

		public String getPolicy() {
			return this.policy;
		}

		public void setPolicy(String policy) {
			this.policy = policy;
		}

		public String getSignature() {
			return this.signature;
		}

		public void setSignature(String signature) {
			this.signature = signature;
		}

		public String getDir() {
			return this.dir;
		}

		public void setDir(String dir) {
			this.dir = dir;
		}

		public String getHost() {
			return this.host;
		}

		public void setHost(String host) {
			this.host = host;
		}

		public String getExpire() {
			return this.expire;
		}

		public void setExpire(String expire) {
			this.expire = expire;
		}
	}

	@Override
	public GetOssTokenResponse getInstance(UnmarshallerContext context) {
		return	GetOssTokenResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
