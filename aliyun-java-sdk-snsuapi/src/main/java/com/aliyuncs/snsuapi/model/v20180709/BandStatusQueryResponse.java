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

package com.aliyuncs.snsuapi.model.v20180709;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.snsuapi.transform.v20180709.BandStatusQueryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BandStatusQueryResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private ResultModule resultModule;

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

	public ResultModule getResultModule() {
		return this.resultModule;
	}

	public void setResultModule(ResultModule resultModule) {
		this.resultModule = resultModule;
	}

	public static class ResultModule {

		private Integer downloadTarget;

		private Integer uploadTarget;

		public Integer getDownloadTarget() {
			return this.downloadTarget;
		}

		public void setDownloadTarget(Integer downloadTarget) {
			this.downloadTarget = downloadTarget;
		}

		public Integer getUploadTarget() {
			return this.uploadTarget;
		}

		public void setUploadTarget(Integer uploadTarget) {
			this.uploadTarget = uploadTarget;
		}
	}

	@Override
	public BandStatusQueryResponse getInstance(UnmarshallerContext context) {
		return	BandStatusQueryResponseUnmarshaller.unmarshall(this, context);
	}
}
