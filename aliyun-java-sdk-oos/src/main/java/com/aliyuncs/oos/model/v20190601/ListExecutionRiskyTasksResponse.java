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

package com.aliyuncs.oos.model.v20190601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oos.transform.v20190601.ListExecutionRiskyTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListExecutionRiskyTasksResponse extends AcsResponse {

	private String requestId;

	private List<RiskyTask> riskyTasks;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RiskyTask> getRiskyTasks() {
		return this.riskyTasks;
	}

	public void setRiskyTasks(List<RiskyTask> riskyTasks) {
		this.riskyTasks = riskyTasks;
	}

	public static class RiskyTask {

		private String service;

		private String aPI;

		private List<String> task;

		private List<String> template;

		public String getService() {
			return this.service;
		}

		public void setService(String service) {
			this.service = service;
		}

		public String getAPI() {
			return this.aPI;
		}

		public void setAPI(String aPI) {
			this.aPI = aPI;
		}

		public List<String> getTask() {
			return this.task;
		}

		public void setTask(List<String> task) {
			this.task = task;
		}

		public List<String> getTemplate() {
			return this.template;
		}

		public void setTemplate(List<String> template) {
			this.template = template;
		}
	}

	@Override
	public ListExecutionRiskyTasksResponse getInstance(UnmarshallerContext context) {
		return	ListExecutionRiskyTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
