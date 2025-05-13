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

package com.aliyuncs.schedulerx2.model.v20190430;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.schedulerx2.transform.v20190430.ListGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListGroupsResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<AppGroup> appGroups;

		public List<AppGroup> getAppGroups() {
			return this.appGroups;
		}

		public void setAppGroups(List<AppGroup> appGroups) {
			this.appGroups = appGroups;
		}

		public static class AppGroup {

			private Long appGroupId;

			private String appName;

			private String appKey;

			private String description;

			private String groupId;

			private String xattrs;

			private Integer appVersion;

			private String namespace;

			public Long getAppGroupId() {
				return this.appGroupId;
			}

			public void setAppGroupId(Long appGroupId) {
				this.appGroupId = appGroupId;
			}

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public String getAppKey() {
				return this.appKey;
			}

			public void setAppKey(String appKey) {
				this.appKey = appKey;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getGroupId() {
				return this.groupId;
			}

			public void setGroupId(String groupId) {
				this.groupId = groupId;
			}

			public String getXattrs() {
				return this.xattrs;
			}

			public void setXattrs(String xattrs) {
				this.xattrs = xattrs;
			}

			public Integer getAppVersion() {
				return this.appVersion;
			}

			public void setAppVersion(Integer appVersion) {
				this.appVersion = appVersion;
			}

			public String getNamespace() {
				return this.namespace;
			}

			public void setNamespace(String namespace) {
				this.namespace = namespace;
			}
		}
	}

	@Override
	public ListGroupsResponse getInstance(UnmarshallerContext context) {
		return	ListGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
