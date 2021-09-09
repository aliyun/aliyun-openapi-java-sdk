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

package com.aliyuncs.edas.model.v20170801;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.GetSpringCloudTestMethodResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSpringCloudTestMethodResponse extends AcsResponse {

	private Integer code;

	private String message;

	private Boolean success;

	private Data data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String path;

		private Map<Object,Object> httpHeaders;

		private Map<Object,Object> params;

		private List<String> requestMethods;

		private List<String> urls;

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public Map<Object,Object> getHttpHeaders() {
			return this.httpHeaders;
		}

		public void setHttpHeaders(Map<Object,Object> httpHeaders) {
			this.httpHeaders = httpHeaders;
		}

		public Map<Object,Object> getParams() {
			return this.params;
		}

		public void setParams(Map<Object,Object> params) {
			this.params = params;
		}

		public List<String> getRequestMethods() {
			return this.requestMethods;
		}

		public void setRequestMethods(List<String> requestMethods) {
			this.requestMethods = requestMethods;
		}

		public List<String> getUrls() {
			return this.urls;
		}

		public void setUrls(List<String> urls) {
			this.urls = urls;
		}
	}

	@Override
	public GetSpringCloudTestMethodResponse getInstance(UnmarshallerContext context) {
		return	GetSpringCloudTestMethodResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
