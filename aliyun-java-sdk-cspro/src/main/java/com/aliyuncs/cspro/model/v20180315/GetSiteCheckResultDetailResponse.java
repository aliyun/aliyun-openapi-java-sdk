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

package com.aliyuncs.cspro.model.v20180315;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cspro.transform.v20180315.GetSiteCheckResultDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSiteCheckResultDetailResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private String requestId;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

		private Long resultId;

		private String keywords;

		private String content;

		private List<String> urls;

		public Long getResultId() {
			return this.resultId;
		}

		public void setResultId(Long resultId) {
			this.resultId = resultId;
		}

		public String getKeywords() {
			return this.keywords;
		}

		public void setKeywords(String keywords) {
			this.keywords = keywords;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public List<String> getUrls() {
			return this.urls;
		}

		public void setUrls(List<String> urls) {
			this.urls = urls;
		}
	}

	@Override
	public GetSiteCheckResultDetailResponse getInstance(UnmarshallerContext context) {
		return	GetSiteCheckResultDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
