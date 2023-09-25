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

package com.aliyuncs.dataworks_public.model.v20200518;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.ListRefDISyncTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRefDISyncTasksResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<DISyncTasksItem> dISyncTasks;

		public List<DISyncTasksItem> getDISyncTasks() {
			return this.dISyncTasks;
		}

		public void setDISyncTasks(List<DISyncTasksItem> dISyncTasks) {
			this.dISyncTasks = dISyncTasks;
		}

		public static class DISyncTasksItem {

			private String diSourceDatasource;

			private String taskType;

			private String diDestinationDatasource;

			private String nodeName;

			private Long nodeId;

			public String getDiSourceDatasource() {
				return this.diSourceDatasource;
			}

			public void setDiSourceDatasource(String diSourceDatasource) {
				this.diSourceDatasource = diSourceDatasource;
			}

			public String getTaskType() {
				return this.taskType;
			}

			public void setTaskType(String taskType) {
				this.taskType = taskType;
			}

			public String getDiDestinationDatasource() {
				return this.diDestinationDatasource;
			}

			public void setDiDestinationDatasource(String diDestinationDatasource) {
				this.diDestinationDatasource = diDestinationDatasource;
			}

			public String getNodeName() {
				return this.nodeName;
			}

			public void setNodeName(String nodeName) {
				this.nodeName = nodeName;
			}

			public Long getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(Long nodeId) {
				this.nodeId = nodeId;
			}
		}
	}

	@Override
	public ListRefDISyncTasksResponse getInstance(UnmarshallerContext context) {
		return	ListRefDISyncTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
