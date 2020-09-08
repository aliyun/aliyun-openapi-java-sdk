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

package com.aliyuncs.ahas_openapi.model.v20190901;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ahas_openapi.transform.v20190901.ListActiveAppsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListActiveAppsResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private List<DataItem> data;

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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String namespace;

		private String appName;

		private Integer appType;

		private Long lastHealthPingTime;

		private String ahasAppName;

		private Integer currentLevel;

		private Integer dirtyLevel;

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public Integer getAppType() {
			return this.appType;
		}

		public void setAppType(Integer appType) {
			this.appType = appType;
		}

		public Long getLastHealthPingTime() {
			return this.lastHealthPingTime;
		}

		public void setLastHealthPingTime(Long lastHealthPingTime) {
			this.lastHealthPingTime = lastHealthPingTime;
		}

		public String getAhasAppName() {
			return this.ahasAppName;
		}

		public void setAhasAppName(String ahasAppName) {
			this.ahasAppName = ahasAppName;
		}

		public Integer getCurrentLevel() {
			return this.currentLevel;
		}

		public void setCurrentLevel(Integer currentLevel) {
			this.currentLevel = currentLevel;
		}

		public Integer getDirtyLevel() {
			return this.dirtyLevel;
		}

		public void setDirtyLevel(Integer dirtyLevel) {
			this.dirtyLevel = dirtyLevel;
		}
	}

	@Override
	public ListActiveAppsResponse getInstance(UnmarshallerContext context) {
		return	ListActiveAppsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
