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

package com.aliyuncs.mpaas.model.v20190821;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mpaas.transform.v20190821.GetMcubeFileTokenResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMcubeFileTokenResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private GetFileTokenResult getFileTokenResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public GetFileTokenResult getGetFileTokenResult() {
		return this.getFileTokenResult;
	}

	public void setGetFileTokenResult(GetFileTokenResult getFileTokenResult) {
		this.getFileTokenResult = getFileTokenResult;
	}

	public static class GetFileTokenResult {

		private String resultMsg;

		private Boolean success;

		private FileToken fileToken;

		public String getResultMsg() {
			return this.resultMsg;
		}

		public void setResultMsg(String resultMsg) {
			this.resultMsg = resultMsg;
		}

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public FileToken getFileToken() {
			return this.fileToken;
		}

		public void setFileToken(FileToken fileToken) {
			this.fileToken = fileToken;
		}

		public static class FileToken {

			private String accessid;

			private String dir;

			private String expire;

			private String host;

			private String policy;

			private String signature;

			public String getAccessid() {
				return this.accessid;
			}

			public void setAccessid(String accessid) {
				this.accessid = accessid;
			}

			public String getDir() {
				return this.dir;
			}

			public void setDir(String dir) {
				this.dir = dir;
			}

			public String getExpire() {
				return this.expire;
			}

			public void setExpire(String expire) {
				this.expire = expire;
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
	}

	@Override
	public GetMcubeFileTokenResponse getInstance(UnmarshallerContext context) {
		return	GetMcubeFileTokenResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
