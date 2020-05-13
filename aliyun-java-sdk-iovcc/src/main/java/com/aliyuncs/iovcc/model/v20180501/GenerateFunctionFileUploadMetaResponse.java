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
import com.aliyuncs.iovcc.transform.v20180501.GenerateFunctionFileUploadMetaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GenerateFunctionFileUploadMetaResponse extends AcsResponse {

	private String requestId;

	private UploadMeta uploadMeta;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public UploadMeta getUploadMeta() {
		return this.uploadMeta;
	}

	public void setUploadMeta(UploadMeta uploadMeta) {
		this.uploadMeta = uploadMeta;
	}

	public static class UploadMeta {

		private String securityToken;

		private String objectKey;

		private PostObjectPolicy postObjectPolicy;

		public String getSecurityToken() {
			return this.securityToken;
		}

		public void setSecurityToken(String securityToken) {
			this.securityToken = securityToken;
		}

		public String getObjectKey() {
			return this.objectKey;
		}

		public void setObjectKey(String objectKey) {
			this.objectKey = objectKey;
		}

		public PostObjectPolicy getPostObjectPolicy() {
			return this.postObjectPolicy;
		}

		public void setPostObjectPolicy(PostObjectPolicy postObjectPolicy) {
			this.postObjectPolicy = postObjectPolicy;
		}

		public static class PostObjectPolicy {

			private String accessId;

			private String expire;

			private String policy;

			private String signature;

			private String host;

			public String getAccessId() {
				return this.accessId;
			}

			public void setAccessId(String accessId) {
				this.accessId = accessId;
			}

			public String getExpire() {
				return this.expire;
			}

			public void setExpire(String expire) {
				this.expire = expire;
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
		}
	}

	@Override
	public GenerateFunctionFileUploadMetaResponse getInstance(UnmarshallerContext context) {
		return	GenerateFunctionFileUploadMetaResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
