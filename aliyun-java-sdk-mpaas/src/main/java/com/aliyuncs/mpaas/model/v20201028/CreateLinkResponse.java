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

package com.aliyuncs.mpaas.model.v20201028;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mpaas.transform.v20201028.CreateLinkResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateLinkResponse extends AcsResponse {

	private String requestId;

	private String resultMessage;

	private String resultCode;

	private ResultContent resultContent;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public ResultContent getResultContent() {
		return this.resultContent;
	}

	public void setResultContent(ResultContent resultContent) {
		this.resultContent = resultContent;
	}

	public static class ResultContent {

		private String target;

		private String data;

		private String version;

		public String getTarget() {
			return this.target;
		}

		public void setTarget(String target) {
			this.target = target;
		}

		public String getData() {
			return this.data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}
	}

	@Override
	public CreateLinkResponse getInstance(UnmarshallerContext context) {
		return	CreateLinkResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
