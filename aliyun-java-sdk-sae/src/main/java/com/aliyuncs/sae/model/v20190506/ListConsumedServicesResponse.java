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

package com.aliyuncs.sae.model.v20190506;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sae.transform.v20190506.ListConsumedServicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListConsumedServicesResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String traceId;

	private String errorCode;

	private String code;

	private Boolean success;

	private List<ListConsumedServices> data;

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

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<ListConsumedServices> getData() {
		return this.data;
	}

	public void setData(List<ListConsumedServices> data) {
		this.data = data;
	}

	public static class ListConsumedServices {

		private String group2Ip;

		private String type;

		private String appId;

		private String version;

		private String name;

		private List<String> groups;

		private List<String> ips;

		public String getGroup2Ip() {
			return this.group2Ip;
		}

		public void setGroup2Ip(String group2Ip) {
			this.group2Ip = group2Ip;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<String> getGroups() {
			return this.groups;
		}

		public void setGroups(List<String> groups) {
			this.groups = groups;
		}

		public List<String> getIps() {
			return this.ips;
		}

		public void setIps(List<String> ips) {
			this.ips = ips;
		}
	}

	@Override
	public ListConsumedServicesResponse getInstance(UnmarshallerContext context) {
		return	ListConsumedServicesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
