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
import com.aliyuncs.edas.transform.v20170801.GetIstioTestMethodResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetIstioTestMethodResponse extends AcsResponse {

	private String message;

	private String requestId;

	private Integer httpStatusCode;

	private Integer code;

	private Boolean success;

	private Data data;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
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

		private Map<Object,Object> httpHeaders;

		private Map<Object,Object> params;

		private String path;

		private List<String> urls;

		private List<String> requestMethods;

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

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public List<String> getUrls() {
			return this.urls;
		}

		public void setUrls(List<String> urls) {
			this.urls = urls;
		}

		public List<String> getRequestMethods() {
			return this.requestMethods;
		}

		public void setRequestMethods(List<String> requestMethods) {
			this.requestMethods = requestMethods;
		}
	}

	@Override
	public GetIstioTestMethodResponse getInstance(UnmarshallerContext context) {
		return	GetIstioTestMethodResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
