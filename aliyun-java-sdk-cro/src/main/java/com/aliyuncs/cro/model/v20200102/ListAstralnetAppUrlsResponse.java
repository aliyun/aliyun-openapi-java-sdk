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

package com.aliyuncs.cro.model.v20200102;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cro.transform.v20200102.ListAstralnetAppUrlsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAstralnetAppUrlsResponse extends AcsResponse {

	private Integer code;

	private Boolean success;

	private String message;

	private String requestId;

	private Data data;

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

		private Integer total;

		private List<Data1> item;

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public List<Data1> getItem() {
			return this.item;
		}

		public void setItem(List<Data1> item) {
			this.item = item;
		}

		public static class Data1 {

			private String appName;

			private String responseBody;

			private String methodProfile;

			private String filePath;

			private String host;

			private String path;

			private String method;

			private String _class;

			private String urlPath;

			private String parameters;

			private String contentType;

			private String urlSuffixes;

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public String getResponseBody() {
				return this.responseBody;
			}

			public void setResponseBody(String responseBody) {
				this.responseBody = responseBody;
			}

			public String getMethodProfile() {
				return this.methodProfile;
			}

			public void setMethodProfile(String methodProfile) {
				this.methodProfile = methodProfile;
			}

			public String getFilePath() {
				return this.filePath;
			}

			public void setFilePath(String filePath) {
				this.filePath = filePath;
			}

			public String getHost() {
				return this.host;
			}

			public void setHost(String host) {
				this.host = host;
			}

			public String getPath() {
				return this.path;
			}

			public void setPath(String path) {
				this.path = path;
			}

			public String getBizMethod() {
				return this.method;
			}

			public void setBizMethod(String method) {
				this.method = method;
			}

			public String get_Class() {
				return this._class;
			}

			public void set_Class(String _class) {
				this._class = _class;
			}

			public String getUrlPath() {
				return this.urlPath;
			}

			public void setUrlPath(String urlPath) {
				this.urlPath = urlPath;
			}

			public String getParameters() {
				return this.parameters;
			}

			public void setParameters(String parameters) {
				this.parameters = parameters;
			}

			public String getContentType() {
				return this.contentType;
			}

			public void setContentType(String contentType) {
				this.contentType = contentType;
			}

			public String getUrlSuffixes() {
				return this.urlSuffixes;
			}

			public void setUrlSuffixes(String urlSuffixes) {
				this.urlSuffixes = urlSuffixes;
			}
		}
	}

	@Override
	public ListAstralnetAppUrlsResponse getInstance(UnmarshallerContext context) {
		return	ListAstralnetAppUrlsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
