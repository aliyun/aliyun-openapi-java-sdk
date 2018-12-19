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
import com.aliyuncs.edas.transform.v20170801.ListConsumedServicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListConsumedServicesResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private List<ListConsumedServices> consumedServicesList;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ListConsumedServices> getConsumedServicesList() {
		return this.consumedServicesList;
	}

	public void setConsumedServicesList(List<ListConsumedServices> consumedServicesList) {
		this.consumedServicesList = consumedServicesList;
	}

	public static class ListConsumedServices {

		private String appId;

		private Boolean dockerApplication;

		private String group2Ip;

		private String name;

		private String type;

		private String version;

		private List<String> groups;

		private List<String> ips;

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public Boolean getDockerApplication() {
			return this.dockerApplication;
		}

		public void setDockerApplication(Boolean dockerApplication) {
			this.dockerApplication = dockerApplication;
		}

		public String getGroup2Ip() {
			return this.group2Ip;
		}

		public void setGroup2Ip(String group2Ip) {
			this.group2Ip = group2Ip;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
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
}
