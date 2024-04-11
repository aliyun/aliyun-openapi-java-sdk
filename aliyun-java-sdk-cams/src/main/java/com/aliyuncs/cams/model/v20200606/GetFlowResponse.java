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

package com.aliyuncs.cams.model.v20200606;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cams.transform.v20200606.GetFlowResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetFlowResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String status;

		private String flowId;

		private String flowName;

		private String jSONVersion;

		private String dataApiVersion;

		private String previewUrl;

		private Long previewUrlExpires;

		private List<String> categories;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getFlowId() {
			return this.flowId;
		}

		public void setFlowId(String flowId) {
			this.flowId = flowId;
		}

		public String getFlowName() {
			return this.flowName;
		}

		public void setFlowName(String flowName) {
			this.flowName = flowName;
		}

		public String getJSONVersion() {
			return this.jSONVersion;
		}

		public void setJSONVersion(String jSONVersion) {
			this.jSONVersion = jSONVersion;
		}

		public String getDataApiVersion() {
			return this.dataApiVersion;
		}

		public void setDataApiVersion(String dataApiVersion) {
			this.dataApiVersion = dataApiVersion;
		}

		public String getPreviewUrl() {
			return this.previewUrl;
		}

		public void setPreviewUrl(String previewUrl) {
			this.previewUrl = previewUrl;
		}

		public Long getPreviewUrlExpires() {
			return this.previewUrlExpires;
		}

		public void setPreviewUrlExpires(Long previewUrlExpires) {
			this.previewUrlExpires = previewUrlExpires;
		}

		public List<String> getCategories() {
			return this.categories;
		}

		public void setCategories(List<String> categories) {
			this.categories = categories;
		}
	}

	@Override
	public GetFlowResponse getInstance(UnmarshallerContext context) {
		return	GetFlowResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
