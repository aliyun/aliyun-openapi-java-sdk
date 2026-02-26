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

package com.aliyuncs.arms.model.v20190808;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.GetRumDataForPageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRumDataForPageResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String success;

	private String message;

	private String httpStatusCode;

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

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(String httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String total;

		private String page;

		private String pageSize;

		private String authentication;

		private String completion;

		private String preference;

		private List<Map<Object,Object>> items;

		public String getTotal() {
			return this.total;
		}

		public void setTotal(String total) {
			this.total = total;
		}

		public String getPage() {
			return this.page;
		}

		public void setPage(String page) {
			this.page = page;
		}

		public String getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(String pageSize) {
			this.pageSize = pageSize;
		}

		public String getAuthentication() {
			return this.authentication;
		}

		public void setAuthentication(String authentication) {
			this.authentication = authentication;
		}

		public String getCompletion() {
			return this.completion;
		}

		public void setCompletion(String completion) {
			this.completion = completion;
		}

		public String getPreference() {
			return this.preference;
		}

		public void setPreference(String preference) {
			this.preference = preference;
		}

		public List<Map<Object,Object>> getItems() {
			return this.items;
		}

		public void setItems(List<Map<Object,Object>> items) {
			this.items = items;
		}
	}

	@Override
	public GetRumDataForPageResponse getInstance(UnmarshallerContext context) {
		return	GetRumDataForPageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
