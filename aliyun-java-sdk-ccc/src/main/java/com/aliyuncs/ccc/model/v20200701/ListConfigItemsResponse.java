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

package com.aliyuncs.ccc.model.v20200701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20200701.ListConfigItemsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListConfigItemsResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private List<ConfigItem> data;

	private List<String> params;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public List<ConfigItem> getData() {
		return this.data;
	}

	public void setData(List<ConfigItem> data) {
		this.data = data;
	}

	public List<String> getParams() {
		return this.params;
	}

	public void setParams(List<String> params) {
		this.params = params;
	}

	public static class ConfigItem {

		private String instanceId;

		private String name;

		private String objectId;

		private String objectType;

		private String value;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getObjectId() {
			return this.objectId;
		}

		public void setObjectId(String objectId) {
			this.objectId = objectId;
		}

		public String getObjectType() {
			return this.objectType;
		}

		public void setObjectType(String objectType) {
			this.objectType = objectType;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public ListConfigItemsResponse getInstance(UnmarshallerContext context) {
		return	ListConfigItemsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
