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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.CreateFileDetectUploadUrlResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateFileDetectUploadUrlResponse extends AcsResponse {

	private String requestId;

	private List<UploadUrList> uploadUrlList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<UploadUrList> getUploadUrlList() {
		return this.uploadUrlList;
	}

	public void setUploadUrlList(List<UploadUrList> uploadUrlList) {
		this.uploadUrlList = uploadUrlList;
	}

	public static class UploadUrList {

		private String publicUrl;

		private String internalUrl;

		private String expire;

		private Boolean fileExist;

		private String hashKey;

		private Context context;

		public String getPublicUrl() {
			return this.publicUrl;
		}

		public void setPublicUrl(String publicUrl) {
			this.publicUrl = publicUrl;
		}

		public String getInternalUrl() {
			return this.internalUrl;
		}

		public void setInternalUrl(String internalUrl) {
			this.internalUrl = internalUrl;
		}

		public String getExpire() {
			return this.expire;
		}

		public void setExpire(String expire) {
			this.expire = expire;
		}

		public Boolean getFileExist() {
			return this.fileExist;
		}

		public void setFileExist(Boolean fileExist) {
			this.fileExist = fileExist;
		}

		public String getHashKey() {
			return this.hashKey;
		}

		public void setHashKey(String hashKey) {
			this.hashKey = hashKey;
		}

		public Context getContext() {
			return this.context;
		}

		public void setContext(Context context) {
			this.context = context;
		}

		public static class Context {

			private String accessId;

			private String policy;

			private String signature;

			private String ossKey;

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

			public String getOssKey() {
				return this.ossKey;
			}

			public void setOssKey(String ossKey) {
				this.ossKey = ossKey;
			}
		}
	}

	@Override
	public CreateFileDetectUploadUrlResponse getInstance(UnmarshallerContext context) {
		return	CreateFileDetectUploadUrlResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
