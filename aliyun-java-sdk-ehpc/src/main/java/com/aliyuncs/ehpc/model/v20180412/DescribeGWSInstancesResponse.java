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

package com.aliyuncs.ehpc.model.v20180412;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpc.transform.v20180412.DescribeGWSInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGWSInstancesResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private List<InstanceInfo> instances;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<InstanceInfo> getInstances() {
		return this.instances;
	}

	public void setInstances(List<InstanceInfo> instances) {
		this.instances = instances;
	}

	public static class InstanceInfo {

		private String status;

		private String workMode;

		private String expireTime;

		private String createTime;

		private String instanceId;

		private String name;

		private String instanceType;

		private String userName;

		private String clusterId;

		private List<AppInfo> appList;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getWorkMode() {
			return this.workMode;
		}

		public void setWorkMode(String workMode) {
			this.workMode = workMode;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

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

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public List<AppInfo> getAppList() {
			return this.appList;
		}

		public void setAppList(List<AppInfo> appList) {
			this.appList = appList;
		}

		public static class AppInfo {

			private String appName;

			private String appArgs;

			private String appPath;

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public String getAppArgs() {
				return this.appArgs;
			}

			public void setAppArgs(String appArgs) {
				this.appArgs = appArgs;
			}

			public String getAppPath() {
				return this.appPath;
			}

			public void setAppPath(String appPath) {
				this.appPath = appPath;
			}
		}
	}

	@Override
	public DescribeGWSInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeGWSInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
