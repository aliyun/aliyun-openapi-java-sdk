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

package com.aliyuncs.workbench_ide.model.v20200814;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.workbench_ide.transform.v20200814.UploadProduceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UploadProduceResponse extends AcsResponse {

	private Integer resultNo;

	private String resultMessage;

	private String requestId;

	private Data data;

	public Integer getResultNo() {
		return this.resultNo;
	}

	public void setResultNo(Integer resultNo) {
		this.resultNo = resultNo;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String uploadUrl;

		private String fileUrl;

		private Map<Object,Object> headers;

		public String getUploadUrl() {
			return this.uploadUrl;
		}

		public void setUploadUrl(String uploadUrl) {
			this.uploadUrl = uploadUrl;
		}

		public String getFileUrl() {
			return this.fileUrl;
		}

		public void setFileUrl(String fileUrl) {
			this.fileUrl = fileUrl;
		}

		public Map<Object,Object> getHeaders() {
			return this.headers;
		}

		public void setHeaders(Map<Object,Object> headers) {
			this.headers = headers;
		}
	}

	@Override
	public UploadProduceResponse getInstance(UnmarshallerContext context) {
		return	UploadProduceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
