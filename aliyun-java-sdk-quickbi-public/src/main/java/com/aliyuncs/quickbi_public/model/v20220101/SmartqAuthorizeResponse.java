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

package com.aliyuncs.quickbi_public.model.v20220101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quickbi_public.transform.v20220101.SmartqAuthorizeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SmartqAuthorizeResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<Data> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Data> getResult() {
		return this.result;
	}

	public void setResult(List<Data> result) {
		this.result = result;
	}

	public static class Data {

		private String userId;

		private String llmCube;

		private String llmCubeTheme;

		private String detailMessage;

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getLlmCube() {
			return this.llmCube;
		}

		public void setLlmCube(String llmCube) {
			this.llmCube = llmCube;
		}

		public String getLlmCubeTheme() {
			return this.llmCubeTheme;
		}

		public void setLlmCubeTheme(String llmCubeTheme) {
			this.llmCubeTheme = llmCubeTheme;
		}

		public String getDetailMessage() {
			return this.detailMessage;
		}

		public void setDetailMessage(String detailMessage) {
			this.detailMessage = detailMessage;
		}
	}

	@Override
	public SmartqAuthorizeResponse getInstance(UnmarshallerContext context) {
		return	SmartqAuthorizeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
