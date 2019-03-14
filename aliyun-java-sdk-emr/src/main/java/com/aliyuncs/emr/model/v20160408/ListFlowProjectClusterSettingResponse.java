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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListFlowProjectClusterSettingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFlowProjectClusterSettingResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer total;

	private List<ClusterSetting> clusterSettings;

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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<ClusterSetting> getClusterSettings() {
		return this.clusterSettings;
	}

	public void setClusterSettings(List<ClusterSetting> clusterSettings) {
		this.clusterSettings = clusterSettings;
	}

	public static class ClusterSetting {

		private Long gmtCreate;

		private Long gmtModified;

		private String projectId;

		private String clusterId;

		private String clusterName;

		private String defaultUser;

		private String defaultQueue;

		private List<String> userList;

		private List<String> queueList;

		private List<String> hostList;

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public String getDefaultUser() {
			return this.defaultUser;
		}

		public void setDefaultUser(String defaultUser) {
			this.defaultUser = defaultUser;
		}

		public String getDefaultQueue() {
			return this.defaultQueue;
		}

		public void setDefaultQueue(String defaultQueue) {
			this.defaultQueue = defaultQueue;
		}

		public List<String> getUserList() {
			return this.userList;
		}

		public void setUserList(List<String> userList) {
			this.userList = userList;
		}

		public List<String> getQueueList() {
			return this.queueList;
		}

		public void setQueueList(List<String> queueList) {
			this.queueList = queueList;
		}

		public List<String> getHostList() {
			return this.hostList;
		}

		public void setHostList(List<String> hostList) {
			this.hostList = hostList;
		}
	}

	@Override
	public ListFlowProjectClusterSettingResponse getInstance(UnmarshallerContext context) {
		return	ListFlowProjectClusterSettingResponseUnmarshaller.unmarshall(this, context);
	}
}
