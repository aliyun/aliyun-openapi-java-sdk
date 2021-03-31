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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.GetGrayAppGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetGrayAppGroupResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String message;

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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String appId;

		private String appName;

		private String regionId;

		private String regionName;

		private List<GroupListItem> groupList;

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getRegionName() {
			return this.regionName;
		}

		public void setRegionName(String regionName) {
			this.regionName = regionName;
		}

		public List<GroupListItem> getGroupList() {
			return this.groupList;
		}

		public void setGroupList(List<GroupListItem> groupList) {
			this.groupList = groupList;
		}

		public static class GroupListItem {

			private String id;

			private String groupName;

			private String packageVersion;

			private Integer instances;

			private String clusterId;

			private String dpathPointcutName;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getGroupName() {
				return this.groupName;
			}

			public void setGroupName(String groupName) {
				this.groupName = groupName;
			}

			public String getPackageVersion() {
				return this.packageVersion;
			}

			public void setPackageVersion(String packageVersion) {
				this.packageVersion = packageVersion;
			}

			public Integer getInstances() {
				return this.instances;
			}

			public void setInstances(Integer instances) {
				this.instances = instances;
			}

			public String getClusterId() {
				return this.clusterId;
			}

			public void setClusterId(String clusterId) {
				this.clusterId = clusterId;
			}

			public String getDpathPointcutName() {
				return this.dpathPointcutName;
			}

			public void setDpathPointcutName(String dpathPointcutName) {
				this.dpathPointcutName = dpathPointcutName;
			}
		}
	}

	@Override
	public GetGrayAppGroupResponse getInstance(UnmarshallerContext context) {
		return	GetGrayAppGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
