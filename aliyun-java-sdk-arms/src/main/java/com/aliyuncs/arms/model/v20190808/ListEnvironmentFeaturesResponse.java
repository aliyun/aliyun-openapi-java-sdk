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
import com.aliyuncs.arms.transform.v20190808.ListEnvironmentFeaturesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEnvironmentFeaturesResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String message;

	private Boolean success;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Map<Object,Object> config;

		private String description;

		private String environmentId;

		private String language;

		private String latestVersion;

		private String name;

		private String status;

		private String version;

		private String alias;

		private String icon;

		private Boolean managed;

		public Map<Object,Object> getConfig() {
			return this.config;
		}

		public void setConfig(Map<Object,Object> config) {
			this.config = config;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getEnvironmentId() {
			return this.environmentId;
		}

		public void setEnvironmentId(String environmentId) {
			this.environmentId = environmentId;
		}

		public String getLanguage() {
			return this.language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public String getLatestVersion() {
			return this.latestVersion;
		}

		public void setLatestVersion(String latestVersion) {
			this.latestVersion = latestVersion;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getAlias() {
			return this.alias;
		}

		public void setAlias(String alias) {
			this.alias = alias;
		}

		public String getIcon() {
			return this.icon;
		}

		public void setIcon(String icon) {
			this.icon = icon;
		}

		public Boolean getManaged() {
			return this.managed;
		}

		public void setManaged(Boolean managed) {
			this.managed = managed;
		}
	}

	@Override
	public ListEnvironmentFeaturesResponse getInstance(UnmarshallerContext context) {
		return	ListEnvironmentFeaturesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
