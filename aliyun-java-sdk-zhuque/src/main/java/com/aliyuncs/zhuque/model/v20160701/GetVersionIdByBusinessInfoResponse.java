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

package com.aliyuncs.zhuque.model.v20160701;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.zhuque.transform.v20160701.GetVersionIdByBusinessInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetVersionIdByBusinessInfoResponse extends AcsResponse {

	private String requestId;

	private String result;

	private String message;

	private VersionId versionId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public VersionId getVersionId() {
		return this.versionId;
	}

	public void setVersionId(VersionId versionId) {
		this.versionId = versionId;
	}

	public static class VersionId {

		private String versionId;

		public String getVersionId() {
			return this.versionId;
		}

		public void setVersionId(String versionId) {
			this.versionId = versionId;
		}
	}

	@Override
	public GetVersionIdByBusinessInfoResponse getInstance(UnmarshallerContext context) {
		return	GetVersionIdByBusinessInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
