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

package com.aliyuncs.emas_appmonitor.model.v20190611;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.emas_appmonitor.transform.v20190611.GetAppFilePolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAppFilePolicyResponse extends AcsResponse {

	private String requestId;

	private OSSPolicy oSSPolicy;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public OSSPolicy getOSSPolicy() {
		return this.oSSPolicy;
	}

	public void setOSSPolicy(OSSPolicy oSSPolicy) {
		this.oSSPolicy = oSSPolicy;
	}

	public static class OSSPolicy {

		private String accessId;

		private String directory;

		private String expireSecond;

		private String fileId;

		private String host;

		private String policy;

		private String signature;

		public String getAccessId() {
			return this.accessId;
		}

		public void setAccessId(String accessId) {
			this.accessId = accessId;
		}

		public String getDirectory() {
			return this.directory;
		}

		public void setDirectory(String directory) {
			this.directory = directory;
		}

		public String getExpireSecond() {
			return this.expireSecond;
		}

		public void setExpireSecond(String expireSecond) {
			this.expireSecond = expireSecond;
		}

		public String getFileId() {
			return this.fileId;
		}

		public void setFileId(String fileId) {
			this.fileId = fileId;
		}

		public String getHost() {
			return this.host;
		}

		public void setHost(String host) {
			this.host = host;
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
	}

	@Override
	public GetAppFilePolicyResponse getInstance(UnmarshallerContext context) {
		return	GetAppFilePolicyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
