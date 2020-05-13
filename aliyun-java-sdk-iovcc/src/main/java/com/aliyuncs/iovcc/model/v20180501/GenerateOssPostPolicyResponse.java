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
import com.aliyuncs.iovcc.transform.v20180501.GenerateOssPostPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GenerateOssPostPolicyResponse extends AcsResponse {

	private String requestId;

	private OssPostPolicy ossPostPolicy;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public OssPostPolicy getOssPostPolicy() {
		return this.ossPostPolicy;
	}

	public void setOssPostPolicy(OssPostPolicy ossPostPolicy) {
		this.ossPostPolicy = ossPostPolicy;
	}

	public static class OssPostPolicy {

		private String accessId;

		private String policy;

		private String signature;

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
	public GenerateOssPostPolicyResponse getInstance(UnmarshallerContext context) {
		return	GenerateOssPostPolicyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
