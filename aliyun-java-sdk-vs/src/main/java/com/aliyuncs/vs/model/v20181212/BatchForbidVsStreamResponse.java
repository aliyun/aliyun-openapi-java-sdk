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

package com.aliyuncs.vs.model.v20181212;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vs.transform.v20181212.BatchForbidVsStreamResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BatchForbidVsStreamResponse extends AcsResponse {

	private String requestId;

	private List<ForbidResultInfo> forbidResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ForbidResultInfo> getForbidResult() {
		return this.forbidResult;
	}

	public void setForbidResult(List<ForbidResultInfo> forbidResult) {
		this.forbidResult = forbidResult;
	}

	public static class ForbidResultInfo {

		private String result;

		private String detail;

		private Integer count;

		private List<String> channels;

		public String getResult() {
			return this.result;
		}

		public void setResult(String result) {
			this.result = result;
		}

		public String getDetail() {
			return this.detail;
		}

		public void setDetail(String detail) {
			this.detail = detail;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public List<String> getChannels() {
			return this.channels;
		}

		public void setChannels(List<String> channels) {
			this.channels = channels;
		}
	}

	@Override
	public BatchForbidVsStreamResponse getInstance(UnmarshallerContext context) {
		return	BatchForbidVsStreamResponseUnmarshaller.unmarshall(this, context);
	}
}
