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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.ListRemoteADBDataSourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRemoteADBDataSourcesResponse extends AcsResponse {

	private String requestId;

	private Integer taskId;

	private List<RemoteDataSources> dataSourceItems;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTaskId() {
		return this.taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	public List<RemoteDataSources> getDataSourceItems() {
		return this.dataSourceItems;
	}

	public void setDataSourceItems(List<RemoteDataSources> dataSourceItems) {
		this.dataSourceItems = dataSourceItems;
	}

	public static class RemoteDataSources {

		private Long id;

		private String dataSourceName;

		private String localInstanceName;

		private String localDatabase;

		private String remoteInstanceName;

		private String remoteDatabase;

		private String userName;

		private String managerUserName;

		private String status;

		private String description;

		private String regionId;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getDataSourceName() {
			return this.dataSourceName;
		}

		public void setDataSourceName(String dataSourceName) {
			this.dataSourceName = dataSourceName;
		}

		public String getLocalInstanceName() {
			return this.localInstanceName;
		}

		public void setLocalInstanceName(String localInstanceName) {
			this.localInstanceName = localInstanceName;
		}

		public String getLocalDatabase() {
			return this.localDatabase;
		}

		public void setLocalDatabase(String localDatabase) {
			this.localDatabase = localDatabase;
		}

		public String getRemoteInstanceName() {
			return this.remoteInstanceName;
		}

		public void setRemoteInstanceName(String remoteInstanceName) {
			this.remoteInstanceName = remoteInstanceName;
		}

		public String getRemoteDatabase() {
			return this.remoteDatabase;
		}

		public void setRemoteDatabase(String remoteDatabase) {
			this.remoteDatabase = remoteDatabase;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getManagerUserName() {
			return this.managerUserName;
		}

		public void setManagerUserName(String managerUserName) {
			this.managerUserName = managerUserName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
	}

	@Override
	public ListRemoteADBDataSourcesResponse getInstance(UnmarshallerContext context) {
		return	ListRemoteADBDataSourcesResponseUnmarshaller.unmarshall(this, context);
	}
}
