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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class BatchCreateIntantSiteMonitorRequest extends RpcAcsRequest<BatchCreateIntantSiteMonitorResponse> {
	   

	private List<TaskList> taskLists;
	public BatchCreateIntantSiteMonitorRequest() {
		super("Cms", "2019-01-01", "BatchCreateIntantSiteMonitor", "cms");
		setMethod(MethodType.POST);
	}

	public List<TaskList> getTaskLists() {
		return this.taskLists;
	}

	public void setTaskLists(List<TaskList> taskLists) {
		this.taskLists = taskLists;	
		if (taskLists != null) {
			for (int depth1 = 0; depth1 < taskLists.size(); depth1++) {
				putQueryParameter("TaskList." + (depth1 + 1) + ".OptionsJson" , taskLists.get(depth1).getOptionsJson());
				putQueryParameter("TaskList." + (depth1 + 1) + ".Address" , taskLists.get(depth1).getAddress());
				putQueryParameter("TaskList." + (depth1 + 1) + ".TaskType" , taskLists.get(depth1).getTaskType());
				putQueryParameter("TaskList." + (depth1 + 1) + ".TaskName" , taskLists.get(depth1).getTaskName());
				putQueryParameter("TaskList." + (depth1 + 1) + ".IspCities" , taskLists.get(depth1).getIspCities());
			}
		}	
	}

	public static class TaskList {

		private String optionsJson;

		private String address;

		private String taskType;

		private String taskName;

		private String ispCities;

		public String getOptionsJson() {
			return this.optionsJson;
		}

		public void setOptionsJson(String optionsJson) {
			this.optionsJson = optionsJson;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public String getTaskName() {
			return this.taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}

		public String getIspCities() {
			return this.ispCities;
		}

		public void setIspCities(String ispCities) {
			this.ispCities = ispCities;
		}
	}

	@Override
	public Class<BatchCreateIntantSiteMonitorResponse> getResponseClass() {
		return BatchCreateIntantSiteMonitorResponse.class;
	}

}
